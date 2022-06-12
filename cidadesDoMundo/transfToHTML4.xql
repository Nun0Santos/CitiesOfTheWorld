xquery version "1.0";



<html><body>


<h1>Listagem de imagens</h1>

<table border = "1">

	for $x in doc("C:/Users/User/Desktop/GitHub/CitiesOfTheWorld/cidadesDoMundo/cidades.xml")//cidade
	let $v := doc("C:/Users/User/Desktop/GitHub/CitiesOfTheWorld/cidadesDoMundo/cidade.xml")/cidade/text()	
	where  $x/@nome = $v
	return ("&#10;",data($x/links/linkMonumentos/link)

			
</table>
</body></html>
