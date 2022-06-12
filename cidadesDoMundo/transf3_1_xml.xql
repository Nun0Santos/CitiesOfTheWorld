xquery version "1.0";



<queryResult>

{
	for $x in doc("C:/Users/User/Desktop/GitHub/CitiesOfTheWorld/cidadesDoMundo/cidades.xml")//cidade 
	order by number($x/Demografia/nHabitantes) descending
	return $x
			
}
</queryResult>

