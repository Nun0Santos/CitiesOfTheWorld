xquery version "1.0";



<queryResult>

{
	for $x in doc("C:/Users/User/Desktop/GitHub/CitiesOfTheWorld/cidadesDoMundo/cidades.xml")//cidade
	let $v := number(doc("C:/Users/User/Desktop/GitHub/CitiesOfTheWorld/cidadesDoMundo/valor.xml")/valor/text())	
	where  $x/@pais = $v
	return $x/@nome
			
}
</queryResult>
