xquery version "1.0";

(: Generated with EditiX XML Editor (http://www.editix.com) at Sun Jun 12 11:57:36 BST 2022 :)


<html>
    <body>

        <h1>Bandeiras de Países</h1>
        <table style="width: 69%;" border="1" cellspacing="0" cellpadding="0" width="200" align="center">
            <tr>
                <th>País</th>
                <th>Bandeira</th>
            </tr>
        {
            for $x in distinct-values(doc("C:/Users/User/Desktop/GitHub/CitiesOfTheWorld/cidadesDoMundo/cidades.xml")//cidade/@pais)
            let $bandeira := distinct-values(doc("C:/Users/User/Desktop/GitHub/CitiesOfTheWorld/cidadesDoMundo/cidades.xml")//cidade[@pais = $x]/links/linkBandeiraPais/text())
            return <tr>
                <td>
                    {$x}
                </td>
                <td>
 				 <img src="{$bandeira}"/>
                </td>
            </tr>
        }
        </table>

    </body>
</html>
