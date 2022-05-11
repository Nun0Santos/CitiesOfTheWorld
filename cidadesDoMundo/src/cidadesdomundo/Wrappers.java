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
    
       public static String encontrarLinkDBCityPais(String pais) throws FileNotFoundException, IOException { //encontra cidade de um pais
        String link = "https://pt.db-city.com/";
        String DBCity;
        HttpRequestFunctions.httpRequest1(link, pais, "pais.txt"); //pesqusiar pais
        String ER = "<a href=\"/([A-Za-z]+--[A-Za-z]+--[A-Za-z]+)\" title=\"[A-Za-z]+\">([A-Za-z]+)</a>";
        Pattern p = Pattern.compile(ER);
        Matcher m;
        Scanner input = new Scanner(new FileInputStream("pais.txt"));
        while (input.hasNextLine()) {
            String linha = input.nextLine();
            m = p.matcher(linha);
            if (m.find()) {
                input.close();
                DBCity = m.group(1);
                 return "https://pt.db-city.com/" + DBCity;
            }
        }
        input.close();
        return null;
    }
        
    public static String Wikipedia(String cidade) throws FileNotFoundException, IOException {        
        String link = "https://pt.wikipedia.org/wiki/";
        HttpRequestFunctions.httpRequest1(link, cidade, "cidade.txt");
        return "https://pt.wikipedia.org/wiki/" + cidade;   
    }
   
    public static String procuraCP(String link) throws IOException {
        HttpRequestFunctions.httpRequest1(link, "", "cidade2.txt"); 
        String ER = "<th>Código postal [A-Za-z]+</th><td>([0-9]+)</td>";
        Pattern p = Pattern.compile(ER);
        Matcher m;
        Scanner input = new Scanner(new FileInputStream("cidade2.txt"));
        while (input.hasNextLine()) {
            String linha = input.nextLine();
            m = p.matcher(linha);
            if (m.find()) {
                input.close();
                return m.group(1);
            }
        }
        input.close();
        return null;
    }
 
   public static double procuraNumeroHabitantes(String link) throws FileNotFoundException, IOException{     
        HttpRequestFunctions.httpRequest1(link, "", "cidade2.txt"); 
        String ER = "<th>Número de habitantes [A-Za-z]+</th><td>([^A-Z]+) habitantes</td>";
        Pattern p = Pattern.compile(ER);
        Matcher m;
        Scanner input = new Scanner(new FileInputStream("cidade2.txt"));
        while (input.hasNextLine()) {
            String linha = input.nextLine();
            m = p.matcher(linha);
            if (m.find()) {
                input.close();
                return Double.parseDouble(m.group(1).replace(".","")); //Falta tirar o . no final
            }
        }
        input.close();
        return -1;
               
    };

    public static String procuraClima(String link) throws FileNotFoundException, IOException{      
        HttpRequestFunctions.httpRequest1(link, "", "cidade2.txt"); 
        String ER = "<tr><th>Clima [A-Za-z]+</th><td>([^0-9]+)</td></tr>";
        Pattern p = Pattern.compile(ER);
        Matcher m;
        Scanner input = new Scanner(new FileInputStream("cidade2.txt"));
        while (input.hasNextLine()) {
            String linha = input.nextLine();
            m = p.matcher(linha);
            if (m.find()) {
                input.close();
                return m.group(1);
            }
        }
        input.close();
        return null;
    };
    
    public static String procuraCapitais(String link) throws FileNotFoundException{ //wili
       return null;
    };
    
    public static double procuraAltitude(String link) throws IOException{
        HttpRequestFunctions.httpRequest1(link, "", "cidade2.txt"); 
        String ER = "<th>Altitude [A-Za-z]+</th><td>([0-9]+) m</td>";
        Pattern p = Pattern.compile(ER);
        Matcher m;
        Scanner input = new Scanner(new FileInputStream("cidade2.txt"));
        while (input.hasNextLine()) {
            String linha = input.nextLine();
            m = p.matcher(linha);
            if (m.find()) {
                input.close();
                return Double.parseDouble(m.group(1));
            }
        }
        input.close();
        return -1;
    };
    
    public static String procuraLongitude(String link) throws IOException {
        HttpRequestFunctions.httpRequest1(link, "", "cidade2.txt"); 
        String ER = "</b>, Longitude: <b class=\"longitude\">([^A-Za-z]+)</b>";
        Pattern p = Pattern.compile(ER);
        Matcher m;
        Scanner input = new Scanner(new FileInputStream("cidade2.txt"));
        while (input.hasNextLine()) {
            String linha = input.nextLine();
            m = p.matcher(linha);
            if (m.find()) {
                input.close();
                return m.group(1);
            }
        }
        input.close();
        return null;
    }
    
    public static String procuraLatitude(String link) throws IOException {
        HttpRequestFunctions.httpRequest1(link, "", "cidade2.txt"); 
        String ER = "Latitude: <b class=\"latitude\">([^A-Za-z]+)</b>";
        Pattern p = Pattern.compile(ER);
        Matcher m;
        Scanner input = new Scanner(new FileInputStream("cidade2.txt"));
        while (input.hasNextLine()) {
            String linha = input.nextLine();
            m = p.matcher(linha);
            if (m.find()) {
                input.close();
                return m.group(1);
            }
        }
        input.close();
        return null;
    }
    
    public static String procuraFUSO(String link) throws IOException {
        HttpRequestFunctions.httpRequest1(link, "", "cidade2.txt"); 
        String ER = "[A-Za-z]+</abbr> ([^4-9]+)<br /><em>";
        Pattern p = Pattern.compile(ER);
        Matcher m;
        Scanner input = new Scanner(new FileInputStream("cidade2.txt"));
        while (input.hasNextLine()) {
            String linha = input.nextLine();
            m = p.matcher(linha);
            if (m.find()) {
                input.close();
                return m.group(1);
            }
        }
        input.close();
        return null;
    }
    
    public static double procuraArea(String link) throws IOException {
        HttpRequestFunctions.httpRequest1(link, "", "cidade2.txt"); 
        String ER = "<br />([^A-Za-z]+) km²</td>";
        Pattern p = Pattern.compile(ER);
        Matcher m;
        Scanner input = new Scanner(new FileInputStream("cidade2.txt"));
        while (input.hasNextLine()) {
            String linha = input.nextLine();
            m = p.matcher(linha);
            if (m.find()) {
                input.close();
                return Double.parseDouble(m.group(1).replace(",","."));
            }
        }
        input.close();
        return -1;
    }
    
    public static String procuraPresidente(String link) throws IOException { // Wiki
        HttpRequestFunctions.httpRequest1(link, "", "cidade2.txt"); 
        String ER = "<td><a href=\"/wiki/[^0-9]+\" title=\"[A-Za-z\s]+\">([A-Za-z\s]+)</a>";
        Pattern p = Pattern.compile(ER);
        Matcher m;
        Scanner input = new Scanner(new FileInputStream("cidade2.txt"));
        while (input.hasNextLine()) {
            String linha = input.nextLine();
            m = p.matcher(linha);
            if (m.find()) {
                input.close();
                return m.group(1);
            }
        }
        input.close();
        return null;
    }
    
    public static double procuraDensidadePopulacional(String link) throws IOException { // Wiki
        HttpRequestFunctions.httpRequest1(link, "", "cidade2.txt"); 
        String ER = "<th>Densidade populacional [A-Za-z]+</th><td>([^A-Z]+)/km²";
        Pattern p = Pattern.compile(ER);
        Matcher m;
        Scanner input = new Scanner(new FileInputStream("cidade2.txt"));
        while (input.hasNextLine()) {
            String linha = input.nextLine();
            m = p.matcher(linha);
            if (m.find()) {
                input.close();
               return Double.parseDouble(m.group(1).replace(".","").replace(",","."));
            }
        }
        input.close();
        return -1;
    }
    
     public static String procuraCidadesGeminadas(String link) throws IOException { // Wiki
        HttpRequestFunctions.httpRequest1(link, "", "cidade2.txt"); 
        String ER = "";
        Pattern p = Pattern.compile(ER);
        Matcher m;
        Scanner input = new Scanner(new FileInputStream("cidade2.txt"));
        while (input.hasNextLine()) {
            String linha = input.nextLine();
            m = p.matcher(linha);
            if (m.find()) {
                input.close();
                return m.group(1);
            }
        }
        input.close();
        return null;
    }
     
     public static String procuraWebsite(String link) throws IOException { // Wiki
        HttpRequestFunctions.httpRequest1(link, "", "cidade2.txt"); 
        String ER = "</th><td><a class=\"url\" href=\"([^0-9]+)\" rel=\"nofollow noreferrer noopener\" target=\"_blank\"";
        Pattern p = Pattern.compile(ER);
        Matcher m;
        Scanner input = new Scanner(new FileInputStream("cidade2.txt"));
        while (input.hasNextLine()) {
            String linha = input.nextLine();
            m = p.matcher(linha);
            if (m.find()) {
                input.close();
                return m.group(1);
            }
        }
        input.close();
        return null;
    }
     
     public static String procuraBandeiraPais(String link) throws IOException { // Wiki
        HttpRequestFunctions.httpRequest1(link, "", "cidade2.txt"); 
        String ER = "title=\"Bandeira [A-Za-z]+\"><img src=\"([^9]+)\" alt=\"Bandeira [A-Za-z]+\" /></a></div>";
        Pattern p = Pattern.compile(ER);
        Matcher m;
        Scanner input = new Scanner(new FileInputStream("cidade2.txt"));
        while (input.hasNextLine()) {
            String linha = input.nextLine();
            m = p.matcher(linha);
            if (m.find()) {
                input.close();
                return m.group(1);
            }
        }
        input.close();
        return null;
    } 
     
     
     public static String procuraBandeiraCidade(String link) throws IOException { // Wiki
        HttpRequestFunctions.httpRequest1(link, "", "cidade2.txt"); 
        String ER = "<img alt=\"Bandeira de [A-Za-z]+\" src=\"([^9]+)\" decoding=\"async\"";
        Pattern p = Pattern.compile(ER);
        Matcher m;
        Scanner input = new Scanner(new FileInputStream("cidade2.txt"));
        while (input.hasNextLine()) {
            String linha = input.nextLine();
            m = p.matcher(linha);
            if (m.find()) {
                input.close();
                return m.group(1);
            }
        }
        input.close();
        return null;
    } 
     public static Cidade criaCidade(String cidad) throws IOException {
        //String nome = Wrappers.(cidade);
        String pais = Wrappers.encontrarLinkDBCityPais(cidad);
        String capital = Wrappers.procuraCapitais(cidad);
        /*String linkBandeiraPais = Wrappers.obtem_editora(isbn);
        String linguaOficial = Wrappers.obtem_editora(isbn);
        String linkBandeiraCidade = Wrappers.obtem_editora(isbn);
        String linkMonumentos = Wrappers.obtem_editora(isbn);*/
        Double areaCidade = Wrappers.procuraArea(cidad);
        Double nHabitantes = Wrappers.procuraNumeroHabitantes(cidad);
        Double densidadePopulacional = Wrappers.procuraDensidadePopulacional(cidad);
        String codigoPostal = Wrappers.procuraCP(cidad);
        String presidente = Wrappers.procuraPresidente(cidad);
        String latitude = Wrappers.procuraLatitude(cidad);
        String longitude = Wrappers.procuraLongitude(cidad);
        String altitude = Wrappers.procuraAltitude(cidad);
        String clima = Wrappers.procuraClima(cidad);
        String fusoHorario = Wrappers.procuraFUSO(cidad);
        String website = Wrappers.procuraWebsite(cidad);
        String cidadesGeminadas = Wrappers.procuraCidadesGeminadas(cidad);

        Cidade c = new Cidade(nome,pais,capital,linkBandeiraPais,linguaOficial,linkBandeiraCidade,linkMonumentos,areaCidade,nHabitantes,densidadePopulacional,codigoPostal,presidente,latitude,longitude,altitude,clima,fusoHorario,website,cidadesGeminadas);
        return c;
    }

    
    
    
}
