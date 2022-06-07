<?xml version="1.0" encoding="UTF-8" ?>

<!-- New XSLT document created with EditiX XML Editor (http://www.editix.com) at Tue May 31 12:26:25 BST 2022 -->

<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

	<xsl:output method="text" indent="yes"/>
	
	<xsl:template match="cidades">
	
	<xsl:text>Listagem de Cidades:</xsl:text>
		<xsl:apply-templates select ="cidade">
			<xsl:sort select="@nome"/>
		</xsl:apply-templates>
	</xsl:template>
	
	<xsl:template match = "cidade">
		<xsl:text>&#x9;</xsl:text>
		<xsl:value-of select ="@nome"/>
		<xsl:text>&#xa;</xsl:text>
	</xsl:template>
</xsl:stylesheet>


