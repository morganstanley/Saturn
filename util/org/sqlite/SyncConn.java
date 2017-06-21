package org.sqlite;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

class SyncConn extends Conn {
    public SyncConn(String url, String fileName, Properties prop) throws SQLException {
        super(url, fileName, prop);
    }

    protected void checkCursor(int rst, int rsc, int rsh) throws SQLException {
        if (rst != ResultSet.TYPE_FORWARD_ONLY)
            throw new SQLException("SQLite only supports TYPE_FORWARD_ONLY cursors");
        if (rsc != ResultSet.CONCUR_READ_ONLY)
            throw new SQLException("SQLite only supports CONCUR_READ_ONLY cursors");
        if (rsh != ResultSet.CLOSE_CURSORS_AT_COMMIT)
            throw new SQLException("SQLite only supports closing cursors at commit");
    }

    @Override
    public Statement createStatement(int rst, int rsc, int rsh) throws SQLException {
        checkCursor(rst, rsc, rsh);
        return new SyncStmt(this);
    }

    @Override
    public PreparedStatement prepareStatement(String sql, int rst, int rsc, int rsh) throws SQLException {
        checkCursor(rst, rsc, rsh);
        return new SyncPrepStmt(this, sql);
    }
}
