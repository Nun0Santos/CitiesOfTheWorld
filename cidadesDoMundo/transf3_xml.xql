xquery version "1.0";


<queryResult>

{
	for $x in doc("C:/Users/User/Desktop/GitHub/CitiesOfTheWorld/cidadesDoMundo/cidades.xml")//cidade
	where
	order by $x/Demografia/nHabitantes descending
	return $x/@nome
			
}
</queryResult>

