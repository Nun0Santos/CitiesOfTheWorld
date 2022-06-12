xquery version "1.0";



<html>
     <body>
<h1>Listagem de imagens</h1>

{




	for $x in doc("C:/Users/User/Desktop/GitHub/CitiesOfTheWorld/cidadesDoMundo/cidades.xml")//cidade
	let $v := doc("C:/Users/User/Desktop/GitHub/CitiesOfTheWorld/cidadesDoMundo/cidade.xml")/cidade/text()	
	let $lista := $x/
links/linkMonumentos/link
	where  contains($x/@nome,$v)
	return for $k in $lista
		return 
			<td><img src="{$k}" width="200"/></td>
		
}
     </body>
</html>
