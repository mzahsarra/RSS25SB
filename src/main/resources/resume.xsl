<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">
        <html>
            <body>
                <h2>Articles List</h2>
                <table border="1">
                    <tr>
                        <th>ID</th>
                        <th>Date</th>
                        <th>GUID</th>
                    </tr>
                    <xsl:for-each select="xml/feed/item">
                        <tr>
                            <td><xsl:value-of select="@id"/></td>
                            <td><xsl:value-of select="pubDate"/></td>
                            <td><a href="{guid}"><xsl:value-of select="guid"/></a></td>
                        </tr>
                    </xsl:for-each>
                </table>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>