<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">
        <html>
            <body>
                <h2>Article Detail</h2>
                <xsl:for-each select="xml/feed/item">
                    <p>Title: <xsl:value-of select="title"/></p>
                    <p>Published: <xsl:value-of select="published"/></p>
                    <p>Content: <xsl:value-of select="content"/></p>
                </xsl:for-each>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>