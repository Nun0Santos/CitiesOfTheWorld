/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cidadesdomundo;

import java.io.IOException;
import org.jdom2.Document;

/**
 *
 * @author User
 */
public class TP {
    
    public static void main(String[] args) throws IOException {
        String lista= "Lisboa, Portugal";
        String [] campos=lista.split(", ");
        
        //Cidade x = XMLFunctions.adicionaCidade(camppos[1], doc);
        //Document doc = XMLJDomFunctions.lerDocumentoXML("pais.xml");
        
        //String cidade = Wrappers.procuraPais(campos[1]);
        
        String cidade = Wrappers.encontrarLinkDBCityPais(campos[1]);
        System.out.println("link cidade " + cidade);
        
        
         /*String geminadas = Wrappers.procuraCidadesGeminadas(cidade);
         System.out.println("Cidades geminadas " + geminadas);*/
         
         /*String web = Wrappers.procuraWebsite(cidade);
         System.out.println("Website " + web);*/
        
        
        /*String cidadeWiki = Wrappers.Wikipedia(campos[0]);
        System.out.println("link cidadeWiki " + cidadeWiki);*/
        
        /*String pres = Wrappers.procuraPresidente(cidadeWiki);
        System.out.println("Presidente " + pres);*/
        
        /*double den = Wrappers.procuraDensidadePopulacional(cidade);
        System.out.println("Densidade pop " + den);*/
        
        
        /*String cp = Wrappers.procuraCP(cidade);
        System.out.println("cp " + cp);*/
        
        
        Double habi = Wrappers.procuraNumeroHabitantes(cidade);
        System.out.println("Habitantes " + habi);
        
        /*String clima = Wrappers.procuraClima(cidade);
        System.out.println("Clima " + clima);*/
        
        /*String longi = Wrappers.procuraLongitude(cidade);
        System.out.println("Longitude " + longi);*/
        
        /*String lat = Wrappers.procuraLatitude(cidade);
        System.out.println("Latitude " + lat);*/
        
        /*Double area = Wrappers.procuraArea(cidade);
        System.out.println("Area " + area);*/
        
        
  
        
        
        
        /*String alt = Wrappers.procuraAltitude(cidade); //funciona
        System.out.println("Altitude " + alt);*/


        
        

        
    }
}
