package cidadesdomundo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Nuno
 *
 */
public class Wrappers {

    public static String encontrarLinkDBCityPais(String pais, String cidade) throws FileNotFoundException, IOException { //encontra cidade de um pais
        HttpRequestFunctions.httpRequest1("https://pt.db-city.com/", pais, "pais.txt");
        try ( Scanner ler = new Scanner(new FileInputStream("pais.txt"))) {
            String er1 = "<a href=\"([^\"]+)\" title=\"" + cidade + "\">";
            String er2 = "<h2 id=\"bigcity\">Cidades importantes <span class=\"reshid\">" + pais + "</span></h2>";
            String er3 = "<table class=\"td25 otd\"><tr><td><a href=\"(/" + pais + "--[^-]+--" + cidade + ")\" title=\"" + cidade + "\">";
            String er4 = "<td><a href=\"/Portugal--" + cidade + "--" + cidade + "\" title=\"" + cidade + "\">(" + cidade + ")</a></td>";

            Pattern p1 = Pattern.compile(er1);
            Pattern p2 = Pattern.compile(er2);
            Pattern p3 = Pattern.compile(er3);
            Pattern p4 = Pattern.compile(er4);

            Matcher m1;
            Matcher m2;
            Matcher m3;
            Matcher m4;
            /*while (ler.hasNextLine()) {
                String linha = ler.nextLine();
                m1 = p1.matcher(linha);
                m2 = p2.matcher(linha);
                m3 = p3.matcher(linha);
                m4 = p4.matcher(linha);
                if (m1.find()) {
                    while (m1.find()) {
                        ler.close();
                        return "https://pt.db-city.com" + m1.group(1);
                    }
                } else {
                    if (m2.find()) {
                        while (m2.find()) {
                            ler.close();
                            return "https://pt.db-city.com" + m1.group(1);
                        }
                    } else {
                        if (m3.find()) {
                            while (m3.find()) {
                                ler.close();
                                return "https://pt.db-city.com" + m3.group(1);
                            }
                        }
                        else{
                          if (m4.find()) {
                            while (m4.find()) {
                                 ler.close();
                                return "https://pt.db-city.com" + m4.group(1);
                            }
                          }
                        
                        }
                    }
                }
            }*/
            p1 = Pattern.compile(er1);
            p2 = Pattern.compile(er2);
            p3 = Pattern.compile(er3);
            Matcher m;
            while (ler.hasNextLine()) {
                String linha = ler.nextLine();
                m2 = p2.matcher(linha);
                if (m2.find()) {
                    //System.out.println(linha);
                    m = p3.matcher(linha);
                    while (m.find()) {
                        ler.close();
                        return "https://pt.db-city.com" + m.group(1);
                    }
                } else {
                    m3 = p1.matcher(linha);
                    if (m3.find()) {
                        //System.out.println(linha);
                        m = p1.matcher(linha);
                        while (m.find()) {
                            ler.close();
                            return "https://pt.db-city.com" + m.group(1);
                        }
                    }
                }
            }
        }
        return "Link da cidade não encontrado";

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

    public static double procuraNumeroHabitantes(String link) throws FileNotFoundException, IOException {
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
                return Double.parseDouble(m.group(1).replace(".", ""));
            }
        }
        input.close();
        return -1;

    }

    ;

    public static String procuraClima(String link) throws FileNotFoundException, IOException {
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
    }

    ;
    
    public static String procuraCapitais(String pais, String cidade) throws FileNotFoundException, IOException {
        HttpRequestFunctions.httpRequest1("https://pt.db-city.com/", pais, "cidade2.txt");
        String ER = "<a href=\"/País--Capital\" title=\"Capitale pays_[^a-z]+\">Capital</a> <span class=\"reshid\">[^0-9]+</span></th><td><a href=\"/[^0-9]+--[^0-9]+--[^0-9]+\" title=\"[^0-9]+\">([^0-9]+)</a>";
        String ER2 = "<a href=\"/País--Capital\" title=\"Capitale pays_[^a-z]+\">Capital</a> <span class=\"reshid\">[^0-9]+</span></th><td><a href=\"/[^0-9]+--[^0-9]+--[^0-9]+--[^0-9]+\" title=\"[^0-9]+\">([^0-9]+)</a>";
        Pattern p = Pattern.compile(ER);
        Pattern p2 = Pattern.compile(ER2);
        Matcher m;
        Matcher m2;
        Scanner input = new Scanner(new FileInputStream("cidade2.txt"));
        while (input.hasNextLine()) {
            String linha = input.nextLine();
            m = p.matcher(linha);
            m2 = p.matcher(linha);
            if (m.find() || m2.find()) {
                input.close();
                if (m.group(1).equals(cidade)) {
                    return "true";
                }
            }
        }
        input.close();
        return "false";
    }

    ;
    
    public static double procuraAltitude(String link) throws IOException {
        HttpRequestFunctions.httpRequest1(link, "", "cidade2.txt");
        String ER = "<th>Altitude [^0-9]+</th><td>([0-9]+) m</td>";
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
    }

    ;
    
    public static double procuraLongitude(String link) throws IOException {
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
                return Double.parseDouble(m.group(1));
            }
        }
        input.close();
        return -1;
    }

    public static double procuraLatitude(String link) throws IOException {
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
                return Double.parseDouble(m.group(1));
            }
        }
        input.close();
        return -1;
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
                return "UTC  " + m.group(1);
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
                return Double.parseDouble(m.group(1).replace(",", "."));
            }
        }
        input.close();
        return -1;
    }

    public static String procuraPresidente(String link) throws IOException { // Wiki
        HttpRequestFunctions.httpRequest1(link, "", "cidade2.txt");
        String ER = "<tr><th>Presidente da Câmara [A-Za-z]+</th><td>([^0-9]+)</td></tr>";
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
                return Double.parseDouble(m.group(1).replace(".", "").replace(",", "."));
            }
        }
        input.close();
        return -1;
    }

    public static ArrayList<String> procuraCidadesGeminadas(String link) throws IOException {
        int count = 0;
        ArrayList<String> procuraCidadesGeminadas = new ArrayList<String>();
        HttpRequestFunctions.httpRequest1(link, "", "cidade2.txt");
        String ER = "<td><a href=\"[^\"]+\"><img src=\"[^\"]+\" alt=\"[^\"]+\" class=\"img_drp\" /></a> <a href=\"[^\"]+\" title=\"[^\"]+\">([^\"]+)</a>";
        Pattern p = Pattern.compile(ER);
        Matcher m;
        Scanner input = new Scanner(new FileInputStream("cidade2.txt"));
        while (input.hasNextLine()) {
            String linha = input.nextLine();
            m = p.matcher(linha);
            while (m.find()) {
                if (count < 5) {
                    procuraCidadesGeminadas.add(m.group(1));
                    count++;
                } else {
                    return procuraCidadesGeminadas;
                }
            }
        }
        input.close();
        return procuraCidadesGeminadas;
    }

    public static String procuraWebsite(String link) throws IOException { // Wiki
        System.out.println(link);
        HttpRequestFunctions.httpRequest1(link, "", "cidade2.txt");
        String ER = "<a class=\"url\" href=\"([^0-9]+)\" rel=\"nofollow noreferrer noopener\" target=\"_blank\" title=\"Sítio Web [^0-9]+\">[^0-9]+ <span class=\"fa fa-external-link\"></span></a>";
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
        String ER = "<a href=\"/[^0-9]+\" title=\"Bandeira [^0-9]+\"><img src=\"([^\"]+)\" alt=\"Bandeira [^0-9]+\" /></a>";
        Pattern p = Pattern.compile(ER);
        Matcher m;
        Scanner input = new Scanner(new FileInputStream("cidade2.txt"));
        while (input.hasNextLine()) {
            String linha = input.nextLine();
            m = p.matcher(linha);
            if (m.find()) {
                input.close();
                return "https:" + m.group(1);
            }
        }
        input.close();
        return null;
    }

    public static String procuraBandeiraCidade(String cidade) throws IOException {
        HttpRequestFunctions.httpRequest1("https://pt.wikipedia.org/wiki/", cidade, "cidade2.txt");
        String ER = "title=\"[^0-9]+\"><img alt=\"[^0-9]+\" src=\"([^\"]+)\" decoding=\"async\"";
        Pattern p = Pattern.compile(ER);
        Matcher m;
        Scanner input = new Scanner(new FileInputStream("cidade2.txt"));
        while (input.hasNextLine()) {
            String linha = input.nextLine();
            m = p.matcher(linha);
            if (m.find()) {
                input.close();
                return "https:" + m.group(1);
            }
        }
        input.close();
        return null;
    }

    public static String procuraLinguaOficial(String pais) throws IOException {
        HttpRequestFunctions.httpRequest1("https://pt.db-city.com/", pais, "cidade2.txt");
        String ER = "<tr><th>Língua oficial</th><td>([^0-9]+)<br />[^0-9]+</td></tr>";
        String ER2 = "<tr><th>Língua oficial</th><td>([^0-9]+)</td></tr>";
        Pattern p = Pattern.compile(ER);
        Pattern p2 = Pattern.compile(ER2);
        Matcher m;
        Matcher m2;
        Scanner input = new Scanner(new FileInputStream("cidade2.txt"));
        while (input.hasNextLine()) {
            String linha = input.nextLine();
            m = p.matcher(linha);
            m2 = p2.matcher(linha);
            if (m.find()) {
                input.close();
                return m.group(1);
            }
            if (m2.find()) {
                input.close();
                return m2.group(1);
            }
        }
        input.close();
        return "null";
    }

    public static ArrayList<String> procuraMonumentos(String cidade) throws IOException { // Wiki //arratlist
        ArrayList<String> listaImagens = new ArrayList<String>();
        HttpRequestFunctions.httpRequest1("https://pt.wikipedia.org/wiki/", cidade, "cidade.txt");
        Scanner ler = new Scanner(new FileInputStream("cidade.txt"));
        Scanner ler2 = new Scanner(new FileInputStream("cidade.txt"));
        String er2 = "<a href=\"[^\"]+.jpg\" class=\"image\"><img alt[^!]+ src=\"([^\"]+)\" decoding";
        String er4 = "<div class=\"floatnone\"><a href=\"[^\"]+.jpg\" class=\"image\" title=\"[^\"]+\"><img alt=\"[^\"]+\" src=\"([^\"]+)\" decoding";
        Pattern p = Pattern.compile(er4);
        Matcher m;
        int count = 0;

        while (ler.hasNextLine()) {
            String linha = ler.nextLine();
            m = p.matcher(linha);
            if (m.find()) { // Cidades que têm uma class = "floatnone"
                listaImagens.add("https:" + m.group(1));
                return listaImagens;
            }
        }
        p = Pattern.compile(er2);
        while (ler2.hasNextLine()) {
            String linha = ler2.nextLine();
            m = p.matcher(linha);
            while (m.find()) {
                if (count < 3) {
                    listaImagens.add("https:" + m.group(1));
                    count++;
                } else {
                    return listaImagens;
                }
            }
        }
        ler.close();
        System.out.println("Erro na listagem de imagens de " + cidade + ".");
        return listaImagens;
    }

    public static Cidade criaCidade(String cidade, String pais, String linkCidade) throws IOException {

        String capital = Wrappers.procuraCapitais(pais, cidade);
        String linkBandeiraPais = Wrappers.procuraBandeiraPais(linkCidade);
        String linguaOficial = Wrappers.procuraLinguaOficial(pais);
        String linkBandeiraCidade = Wrappers.procuraBandeiraCidade(cidade);
        ArrayList linkMonumentos = Wrappers.procuraMonumentos(cidade);
        Double areaCidade = Wrappers.procuraArea(linkCidade);
        Double nHabitantes = Wrappers.procuraNumeroHabitantes(linkCidade);
        Double densidadePopulacional = Wrappers.procuraDensidadePopulacional(linkCidade);
        String codigoPostal = Wrappers.procuraCP(linkCidade);
        String presidente = Wrappers.procuraPresidente(linkCidade);
        Double latitude = Wrappers.procuraLatitude(linkCidade);
        Double longitude = Wrappers.procuraLongitude(linkCidade);
        Double altitude = Wrappers.procuraAltitude(linkCidade);
        String clima = Wrappers.procuraClima(linkCidade);
        String fusoHorario = Wrappers.procuraFUSO(linkCidade);
        String website = Wrappers.procuraWebsite(linkCidade);
        ArrayList cidadesGeminadas = Wrappers.procuraCidadesGeminadas(linkCidade);

        Cidade c = new Cidade(cidade, pais, capital, linkBandeiraPais, linguaOficial, linkBandeiraCidade, linkMonumentos, areaCidade, nHabitantes, densidadePopulacional, codigoPostal, presidente, latitude, longitude, altitude, clima, fusoHorario, website, cidadesGeminadas);
        return c;
    }
}
