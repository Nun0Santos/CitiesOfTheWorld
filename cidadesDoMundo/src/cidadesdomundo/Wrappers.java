/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cidadesdomundo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author User
 */
public class Wrappers {
    
       public static String DBCity(String pesquisa) throws FileNotFoundException, IOException {
        String link = "https://pt.db-city.com/";
        String DBCity;
        HttpRequestFunctions.httpRequest1(link, pesquisa, "pais.html");
        String ER = "https://pt.db-city.com/[0-9]+";
        Pattern p = Pattern.compile(ER);
        Matcher m;
        Scanner input = new Scanner(new FileInputStream("pais.html"));
        while (input.hasNextLine()) {
            String linha = input.nextLine();
            m = p.matcher(linha);
            if (m.find()) {
                input.close();
                DBCity = m.group();
                HttpRequestFunctions.httpRequest1(DBCity, "", "pais.html");
                return DBCity;
            }
        }
        input.close();
        return null;
    }
        
    public static String Wikipedia(String pesquisa) throws FileNotFoundException, IOException {        
        String link = "https://pt.wikipedia.org/wiki/Wikip%C3%A9dia:P%C3%A1gina_principal";
        HttpRequestFunctions.httpRequest2(link, pesquisa, "cidades.html");
            return null;   
    }
   
    public static String procuraNomeCidade() throws IOException {
        String er = "data-href=\"https://dwpt1kkww6vki.cloudfront.net/img/drapeau/120/2.png\" class=\"async\" alt=\"([a-ZA-Z]+)";
        Pattern p = Pattern.compile(er);
        Scanner fich = new Scanner(new FileInputStream("cidades.html"));
        while (fich.hasNextLine()) {
            String linha = fich.nextLine();
            Matcher m = p.matcher(linha);
            if (m.find()) {
                fich.close();
                return m.group(1);
            }
        }
        fich.close();
        return null;

    } 
 
    public static String procuraPais() throws FileNotFoundException{
        String aux = "";      
        String er2 = "<span class=\".* nationality\">([^<]+)</span>";
        Pattern p2 = Pattern.compile(er2);
        Scanner fich = new Scanner(new FileInputStream("filmes.html"));
        while (fich.hasNextLine()) {
            String linha2 = fich.nextLine();
            Matcher m2 = p2.matcher(linha2);
            if (m2.find()) {
                aux = aux + m2.group(1) + "\t";
            }
        }
        if (aux.isEmpty()) {
            fich.close();
            return null;
        }
        fich.close();
        return aux;         
    }
 
     public static int procuraNumeroHabitantes() throws FileNotFoundException{     
        String er = "<span class=\"what light\">Ano de produção</span>";
        String er2 = "<span class=\"that\">([0-9]+)</span>";
        Pattern p = Pattern.compile(er);
        Pattern p2 = Pattern.compile(er2);
        Scanner fich = new Scanner(new FileInputStream("filmes.html"));
        while (fich.hasNextLine()) {
            String linha = fich.nextLine();
            Matcher m1 = p.matcher(linha);
            if (m1.find()) {
                linha = fich.nextLine();
                Matcher m2 = p2.matcher(linha);
                if (m2.find()) {
                    fich.close();
                    return Integer.parseInt(m2.group(1));
                }
            }
        }
        fich.close();
        return -1;
    }

    public static int procuraClima() throws FileNotFoundException{      
        String er = "<td style=\"vertical-align: top; text-align: left; text-align:left;\">";
        String er2 = "<a href=\"/wiki/Portugal\" title=\"Portugal\"></a>([^<]+)";
        String er3 = "</td>";
        Pattern p = Pattern.compile(er);
        Pattern p2 = Pattern.compile(er2);
        Pattern p3 = Pattern.compile(er3);
        Scanner fich = new Scanner(new FileInputStream("filmes.html"));
        while (fich.hasNextLine()) {
            String linha = fich.nextLine();
            Matcher m1 = p.matcher(linha);
            if (m1.find()) {
                linha = fich.nextLine();
                Matcher m2 = p2.matcher(linha);
                if (m2.find()) {
                    linha = fich.nextLine();
                    Matcher m3 = p3.matcher(linha);
                    if (m3.find()) {
                        fich.close();
                        return Integer.parseInt(m3.group(1));
                    }
                }
            }
        }
        return -1;           
    }
    
    public static String procuraCapitais() throws FileNotFoundException{
        String aux = "";      
        String er2 = "<span class=\".* nationality\">([^<]+)</span>";
        Pattern p2 = Pattern.compile(er2);
        Scanner fich = new Scanner(new FileInputStream("filmes.html"));
        while (fich.hasNextLine()) {
            String linha2 = fich.nextLine();
            Matcher m2 = p2.matcher(linha2);
            if (m2.find()) {
                aux = aux + m2.group(1) + "\t";
            }
        }
        if (aux.isEmpty()) {
            fich.close();
            return null;
        }
        fich.close();
        return aux;         
    }
}
