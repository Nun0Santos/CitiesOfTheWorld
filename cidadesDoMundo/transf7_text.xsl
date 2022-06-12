<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:output method="text"/>
	
	<xsl:template match ="cidades">
		<Cidades>
			<xsl:apply-templates select="cidade">
				<xsl:sort select="@nome"/>
			</xsl:apply-templates>
		</Cidades>
	</xsl:template>
	
	<xsl:template match="cidade">
		<cidade pais="{@nome}"><xsl:value-of select="@pais"/></cidade>
	</xsl:template>
	
</xsl:stylesheet>

