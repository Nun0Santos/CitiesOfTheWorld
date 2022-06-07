<?xml version="1.0" encoding="UTF-8"?>

<!-- New XSLT document created with EditiX XML Editor (http://www.editix.com) at Tue May 31 00:44:37 BST 2022 -->

<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

	<xsl:output method="html"/>
	
	<xsl:template match="cidades">
	<html>
		<body>
			<h1>Listagem de fotos</h1>
			<table border ="1">
				<tr><th>Bandeira</th><th>Cidade</th></tr>
				<xsl:apply-templates select ="cidade">
					<xsl:sort select ="@nome"/>
				</xsl:apply-templates>
			</table>
		<xsl:apply-templates/>
		</body>
	</html>
	</xsl:template>
	
	
	<xsl:template match="links">
		<tr>
			<td><img src="{linkMonumentos}" width="100"/></td>
			<td><xsl:value-of select="//cidade/@nome"/></td>
		</tr>
	</xsl:template>

	

</xsl:stylesheet>


