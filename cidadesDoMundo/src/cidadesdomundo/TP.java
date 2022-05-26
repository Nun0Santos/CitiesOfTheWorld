/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cidadesdomundo;

import java.io.IOException;
import java.util.ArrayList;
import org.jdom2.Document;

/**
 *
 * @author User
 */
public class TP {
    
    public static void main(String[] args) throws IOException {
        String lista= "Porto, Portugal";
        String [] campos=lista.split(", ");
       
        
     
        String linkPais = Wrappers.encontrarLinkDBCityPais(campos[1]);
        System.out.println("link cidade " + linkPais);
        
       /*Cidade x = Wrappers.criaCidade(campos[0],campos[1],linkPais);
        
        
        Document doc = XMLJDomFunctions.lerDocumentoXML("cidades.xml");
        doc = XMLFunctions.adicionaCidade(x,doc);
        
        
        XMLJDomFunctions.escreverDocumentoParaFicheiro(doc, "cidades.xml");*/

  
  
        
        
        
         
         //Cidade x = XMLFunctions.adicionaCidade(camppos[1], doc);
        //Document doc = XMLJDomFunctions.lerDocumentoXML("pais.xml");
        
        
         /*String geminadas = Wrappers.procuraCidadesGeminadas(cidade);
         System.out.println("Cidades geminadas " + geminadas);*/
         
         /*String web = Wrappers.procuraWebsite(cidade);
         System.out.println("Website " + web);*/
        
        
        /*String cidadeWiki = Wrappers.Wikipedia(campos[0]);
        System.out.println("link cidadeWiki " + cidadeWiki);
        
        String pres = Wrappers.procuraPresidente(cidadeWiki);
        System.out.println("Presidente " + pres);*/
        
        /*double den = Wrappers.procuraDensidadePopulacional(cidade);
        System.out.println("Densidade pop " + den);*/
        
        
       
        
        /*Double habi = Wrappers.procuraNumeroHabitantes(cidade);
        System.out.println("Habitantes " + habi);*/
        
        /*String clima = Wrappers.procuraClima(cidade);
        System.out.println("Clima " + clima);*/
        
        /*String longi = Wrappers.procuraLongitude(cidade);
        System.out.println("Longitude " + longi);*/
        
        /*String lat = Wrappers.procuraLatitude(cidade);
        System.out.println("Latitude " + lat);*/
        
        /*Double area = Wrappers.procuraArea(cidade);
        System.out.println("Area " + area);*/
        
        //Cidade x = XMLFunctions.adicionaCidade(campos[0]);
        
         /*String fuso = Wrappers.procuraFUSO(cidade);
         System.out.println("FUSO " + fuso);*/
        
        
         /*String bandeira = Wrappers.procuraBandeiraPais(cidade);
         System.out.println("Bandeira " + bandeira);*/  
         
         /*String bandeiraC = Wrappers.procuraBandeiraCidade(cidadeWiki);
         System.out.println("Bandeira " + bandeiraC);*/
         
        /*double alt = Wrappers.procuraAltitude(cidade); //funciona
        System.out.println("Altitude " + alt);*/


        
        

        
    }
}
