/*
 * Copyright (c) 2007 David Crawshaw <david@zentus.com>
 * 
 * Permission to use, copy, modify, and/or distribute this software for any
 * purpose with or without fee is hereby granted, provided that the above
 * copyright notice and this permission notice appear in all copies.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL WARRANTIES
 * WITH REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED WARRANTIES OF
 * MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR
 * ANY SPECIAL, DIRECT, INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES
 * WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS, WHETHER IN AN
 * ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF
 * OR IN CONNECTION WITH THE USE OR PERFORMANCE OF THIS SOFTWARE.
 */
package org.sqlite;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.sql.ResultSet;
import java.sql.SQLException;

class SyncStmt extends Stmt
{
    SyncRS rs;

    SyncStmt(Conn c) throws SQLException {
        super(c);
        cleanUpSuperRS();
        rs = new SyncRS(this);
    }

    static Field superRSField;
    static {
        try {
            superRSField = Stmt.class.getDeclaredField("rs");
            superRSField.setAccessible(true);
            Field modifiersField = Field.class.getDeclaredField("modifiers");
            modifiersField.setAccessible(true);
            modifiersField.setInt(superRSField, superRSField.getModifiers() & ~Modifier.FINAL);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    protected void cleanUpSuperRS() throws SQLException {
        ReferenceQueue<RS> queue = new ReferenceQueue<RS>();
        PhantomReference<RS> ref = new PhantomReference<RS>(super.rs, queue);
        try {
            superRSField.set(this, null);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        boolean finalized = false;
        while (!finalized) {
            System.gc();
            try {
                finalized = (queue.remove(10) == ref);
            } catch (InterruptedException e) {}
        }
    }

    /** Calls sqlite3_step() and sets up results. Expects a clean stmt. */
    protected boolean exec() throws SQLException {
        if (sql == null)
            throw new SQLException("SQLiteJDBC internal error: sql==null");
        if (rs.isOpen())
            throw new SQLException("SQLite JDBC internal error: rs.isOpen() on exec.");

        boolean rc = false;
        try {
            rc = db.execute(this, null);
        }
        finally {
            resultsWaiting = rc;
        }

        return db.column_count(pointer) != 0;
    }

    protected boolean exec(String sql) throws SQLException {
        if (sql == null)
            throw new SQLException("SQLiteJDBC internal error: sql==null");
        if (rs.isOpen())
            throw new SQLException("SQLite JDBC internal error: rs.isOpen() on exec.");

        boolean rc = false;
        try {
            rc = db.execute(sql);
        }
        finally {
            resultsWaiting = rc;
        }

        return db.column_count(pointer) != 0;
    }

    // PUBLIC INTERFACE /////////////////////////////////////////////

    public void close() throws SQLException {
        if (pointer == 0)
            return;
        rs.close();
        batch = null;
        batchPos = 0;
        int resp = db.finalize(this);
        if (resp != SQLITE_OK && resp != SQLITE_MISUSE)
            db.throwex();
    }

    public ResultSet getResultSet() throws SQLException {
        checkOpen();
        if (rs.isOpen())
            throw new SQLException("ResultSet already requested");
        if (db.column_count(pointer) == 0)
            throw new SQLException("no ResultSet available");
        if (rs.colsMeta == null)
            rs.colsMeta = db.column_names(pointer);
        rs.cols = rs.colsMeta;

        rs.open = resultsWaiting;
        resultsWaiting = false;
        return rs;
    }

    /*
     * This function has a complex behaviour best understood by carefully
     * reading the JavaDoc for getMoreResults() and considering the test
     * StatementTest.execute().
     */
    public int getUpdateCount() throws SQLException {
        if (pointer != 0 && !rs.isOpen() && !resultsWaiting && db.column_count(pointer) == 0)
            return db.changes();
        return -1;
    }

    public void cancel() throws SQLException {
        rs.checkOpen();
        db.interrupt();
    }

    // TODO: write test
    public int getMaxRows() throws SQLException {
        //checkOpen();
        return rs.maxRows;
    }

    public void setMaxRows(int max) throws SQLException {
        //checkOpen();
        if (max < 0)
            throw new SQLException("max row count must be >= 0");
        rs.maxRows = max;
    }

    public int getFetchSize() throws SQLException {
        return rs.getFetchSize();
    }

    public void setFetchSize(int r) throws SQLException {
        rs.setFetchSize(r);
    }

    public int getFetchDirection() throws SQLException {
        return rs.getFetchDirection();
    }

    public void setFetchDirection(int d) throws SQLException {
        rs.setFetchDirection(d);
    }

    @Override
    public <T> T unwrap(Class<T> iface) throws SQLException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean isWrapperFor(Class<?> iface) throws SQLException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean isClosed() throws SQLException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException();
    }

    @Override
    public void setPoolable(boolean poolable) throws SQLException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean isPoolable() throws SQLException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException();
    }

    @Override
    public void closeOnCompletion() throws SQLException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean isCloseOnCompletion() throws SQLException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException();
    }
}
