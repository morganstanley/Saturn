<?xml version="1.0" encoding="ISO-8859-1"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:d="http://www.ms.com/qaTools/diffSet/2012">
  <xsl:output omit-xml-declaration="yes" indent="yes"/>
  <xsl:template match="/">
    <html>
      <head>
        <title>XmlValidate Results</title>
        <link rel="stylesheet" type="text/css" href="treeValidate.css" title="Style"/>
      </head>
      <body>
        <h2 style="font-family: Tahoma, sans serif;">XML Validation results</h2>
        <font style="font-family: Tahoma, sans serif; font-size: 10px;">
          Left: <xsl:value-of select="//@left"/>, 
          Right: <xsl:value-of select="//@right"/>, 
          In Left: <xsl:value-of select="//@inLeft"/>, 
          In Right: <xsl:value-of select="//@inRight"/>, 
          Identical: <xsl:value-of select="//@identical"/>,
          Different: <xsl:value-of select="//@different"/>,
          Explained: <xsl:value-of select="//@explained"/>,
          Validated Pass: <xsl:value-of select="//@validatedPass"/>,
          Validated Fail: <xsl:value-of select="//@validatedFail"/>
        </font>
        <div class="results">
          <table>
            <tr>
              <th scope="col">Document</th>
              <th scope="col">Status</th>
              <th scope="col">Path</th>
              <th scope="col">Expected Value</th>
              <th scope="col">Actual Value</th>
            </tr>
            <xsl:for-each select="//d:Rows">
              <xsl:sort select="@status" />
              <xsl:variable name="documentPosition" select="position()" />
              <xsl:variable name="keyTitle">Keys: <xsl:if test="count(d:LeftKeyValues) > 0">
                  <xsl:for-each select="d:LeftKeyColumns">
                    <xsl:variable name="colPosition" select="position()" />
                    <xsl:value-of select="text()" />: <xsl:value-of select="../d:LeftKeyValues[$colPosition]" />;
                  </xsl:for-each>
                </xsl:if>
                <xsl:if test="count(d:LeftKeyValues) = 0 and count(d:RightKeyValues) > 0">
                  <xsl:for-each select="d:RightKeyColumns">
                    <xsl:variable name="colPosition" select="position()" />
                    <xsl:value-of select="text()" />: <xsl:value-of select="../d:RightKeyValues[$colPosition]" />;
                  </xsl:for-each>
                </xsl:if>
              </xsl:variable>
              <xsl:if test="@status = 'I'">
                <tr><td colspan="5" align="center"><xsl:attribute name="style">background-color: #C3FDB8;</xsl:attribute><xsl:attribute name="title"><xsl:value-of select="$keyTitle"/></xsl:attribute>Document is identical according to the configuration</td></tr>
              </xsl:if>
              <xsl:if test="@status = 'IL'">
                <tr><td colspan="5" align="center"><xsl:attribute name="style">background-color: #A0CFEC;</xsl:attribute><xsl:attribute name="title"><xsl:value-of select="$keyTitle"/></xsl:attribute>Document is In Left</td></tr>
              </xsl:if>
              <xsl:if test="@status = 'IR'">
                <tr><td colspan="5" align="center"><xsl:attribute name="style">background-color: #806D7E;</xsl:attribute><xsl:attribute name="title"><xsl:value-of select="$keyTitle"/></xsl:attribute>Document is In Right</td></tr>
              </xsl:if>
              <xsl:for-each select="d:DiffDetails">
                <xsl:sort select="@xsi:type" />
                <xsl:sort select="@status" />
                  <tr>
                    <xsl:choose>
                      <xsl:when test="@status = 'D'">
                        <xsl:attribute name="style">background-color: pink;</xsl:attribute>
                      </xsl:when>
                      <xsl:when test="@status = 'I'">
                        <xsl:attribute name="style">background-color: #C3FDB8;</xsl:attribute>
                      </xsl:when>
                      <xsl:when test="@status = 'IL'">
                        <xsl:attribute name="style">background-color: #A0CFEC;</xsl:attribute>
                      </xsl:when>
                      <xsl:when test="@status = 'IR'">
                        <xsl:attribute name="style">background-color: #806D7E;</xsl:attribute>
                      </xsl:when>
                      <xsl:when test="@status = 'VP' and @result = 'true'">
                        <xsl:attribute name="style">background-color: #C3FDB8;</xsl:attribute>
                      </xsl:when>
                      <xsl:when test="@status = 'VF' and @result = 'false'">
                        <xsl:attribute name="style">background-color: pink;</xsl:attribute>
                      </xsl:when>
                    </xsl:choose>
                    <td>
                      <xsl:attribute name="title"><xsl:value-of select="$keyTitle"/></xsl:attribute>
                      <xsl:value-of select="$documentPosition" />
                    </td>
                    <td>
                      <xsl:choose>
                        <xsl:when test="@status = 'D'">
                          Different
                        </xsl:when>
                        <xsl:when test="@status = 'I'">
                          Identical
                        </xsl:when>
                        <xsl:when test="@status = 'IL'">
                          In Left
                        </xsl:when>
                        <xsl:when test="@status = 'IR'">
                          In Right
                        </xsl:when>
                        <xsl:when test="@status = 'VP'">
                          Validation Passed
                        </xsl:when>
                        <xsl:when test="@status = 'VF'">
                          Validation Failed 
                        </xsl:when>
                      </xsl:choose>
                    </td>
                    <td title="WTF">
                      <xsl:attribute name="title"><xsl:if test="@leftPath">Expected Path: <xsl:value-of select="@leftPath" />, </xsl:if>Actual Path: <xsl:value-of select="@rightPath" /></xsl:attribute>
                      <xsl:choose>
                        <xsl:when test="@alias">
                          <xsl:value-of select="@alias"/>
                        </xsl:when>
                        <xsl:when test="@rightPath">
                          <xsl:value-of select="@rightPath"/>
                        </xsl:when>
                        <xsl:otherwise>
                          <xsl:value-of select="@leftPath"/>
                        </xsl:otherwise>
                      </xsl:choose>
                    </td>
                    <xsl:choose>
                      <xsl:when test="@xsi:type = 'd:CompareTreeDiff'">
                        <td><xsl:value-of select="@expectedNode"/></td>
                        <td><xsl:value-of select="@actualNode"/></td>
                      </xsl:when>
                      <xsl:otherwise>
                        <td><xsl:value-of select="@name"/></td>
                        <td><xsl:value-of select="@value"/></td>
                      </xsl:otherwise>
                    </xsl:choose>
                  </tr>
              </xsl:for-each>
              <tr>
                <td colspan="5">
                <a href="javascript:">
                  <xsl:attribute name="onClick">
                    document.getElementById('docs_<xsl:value-of select="$documentPosition" />').style.display=(document.getElementById('docs_<xsl:value-of select="$documentPosition" />').style.display== 'block')?'none':'block';
                  </xsl:attribute>
                  Show Documents #<xsl:value-of select="$documentPosition" /> ...</a>
                </td>
              </tr>
              <tr>
                <td style="border-width: 5px; border-bottom: solid; border-color: light-gray;" colspan="5">
                  <div style="display: none;">
                    <xsl:attribute name="id">docs_<xsl:value-of select="$documentPosition" /></xsl:attribute>
                    <table>
                      <tr>
                        <th scope="col">Expected</th>
                        <th scope="col">Actual</th>
                      </tr>
                      <tr>
                        <td style="font-family: Courier New, monospace; text-align:left; vertical-align: top;"><xsl:value-of select="d:LeftRow"/></td>
                        <td style="font-family: Courier New, monospace; text-align:left; vertical-align: top;"><xsl:value-of select="d:RightRow"/></td>
                      </tr>
                    </table>
                  </div>
                </td>
              </tr>
            </xsl:for-each>
          </table>
        </div>
      </body>
    </html>
  </xsl:template>
</xsl:stylesheet> 
