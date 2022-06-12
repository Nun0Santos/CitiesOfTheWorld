xquery version "1.0";


<queryResult>

{
	for $x in doc("C:/Users/User/Desktop/GitHub/CitiesOfTheWorld/cidadesDoMundo/cidadesDescendente.xml")//cidade [position() <= 5]
	return $x
			
}
</queryResult>

