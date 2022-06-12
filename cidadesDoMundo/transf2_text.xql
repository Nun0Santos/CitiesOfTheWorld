xquery version "1.0";



<queryResult>

{
	for $x in doc("C:/Users/User/Desktop/GitHub/CitiesOfTheWorld/cidadesDoMundo/cidades.xml")//cidade
	let $v := doc("C:/Users/User/Desktop/GitHub/CitiesOfTheWorld/cidadesDoMundo/valor.xml")/valor/text()	
	where  $x/@pais = $v
	return ("&#10;","Cidade --",data($x/@nome)
)
			
}
</queryResult>
