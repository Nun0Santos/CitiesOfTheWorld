/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cidadesdomundo;

import java.util.List;
import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;

/**
 *
 * @author User
 */
public class XMLFunctions {
        public static Document adicionaCidade(Cidade cidad, Document doc){
            Element raiz;
            
            if(doc == null){
                raiz = new Element("cidades");
                doc = new Document(raiz);
            }
            else{
                raiz = doc.getRootElement();
                //return null;
            
            
            Element pai = new Element("cidade");
            
            
            Attribute nome = new Attribute("nome",cidad.getNome());
            pai.setAttribute(nome);
            
            nome = new Attribute("pais",cidad.getPais());
            pai.setAttribute(nome);
            
            nome = new Attribute("capital",cidad.getCapital());
            pai.setAttribute(nome);
            
            
            Element administracao = new Element("Administração");
            
            
            Element filho = new Element("codigoPostal").addContent(cidad.getCodigoPostal());
            administracao.addContent(filho);
            
            filho = new Element("presidente").addContent(cidad.getPresidente());
            administracao.addContent(filho);
            
            pai.addContent(administracao);

            
            
            Element dados = new Element("Dados");
            
            
            filho = new Element("website").addContent((cidad.getWebsite()));
            dados.addContent(filho);
                
            filho = new Element("linguaOficial").addContent(cidad.getLinguaOficial());
            dados.addContent(filho);
    
            
            filho = new Element("fusoHorario").addContent((cidad.getFusoHorario()));
            dados.addContent(filho);
            
          
            filho = new Element("cidadesGeminadas").addContent((cidad.getCidadesGeminadas()));
            dados.addContent(filho);
            
            pai.addContent(dados);
             
             

            Element links = new Element("links");
            
            
            filho = new Element("linkBandeiraPais").addContent(cidad.getLinkBandeiraPais());
            links.addContent(filho);
            
            filho = new Element("linkBandeiraCidade").addContent(cidad.getLinkBandeiraCidade());
            links.addContent(filho);
            
            filho = new Element("linkMonumentos").addContent(cidad.getLinkMonumentos());
            links.addContent(filho);
            
            pai.addContent(links);
            
            
            
            
            Element geografia = new Element("Geografia");
            
            filho = new Element("latitude").addContent(Double.toString(cidad.getLatitude()));
            geografia.addContent(filho);
            
            filho = new Element("longitude").addContent(Double.toString(cidad.getLongitude()));
            geografia.addContent(filho);
            
            filho = new Element("areaCidade").addContent(Double.toString(cidad.getAreaCidade()));
            geografia.addContent(filho);
            
            filho = new Element("altitude").addContent(Double.toString(cidad.getAltitude()));
            geografia.addContent(filho);
            
            filho = new Element("clima").addContent((cidad.getClima()));
            geografia.addContent(filho);
            
            pai.addContent(geografia);
            
            
            
            Element demografia = new Element("Demografia");
            
            filho = new Element("nHabitantes").addContent(Double.toString(cidad.getnHabitantes()));
            demografia.addContent(filho);
            
            filho = new Element("densidadePopulacional").addContent(Double.toString(cidad.getDensidadePopulacional()));
            demografia.addContent(filho);
            
            pai.addContent(demografia);
            
    
            raiz.addContent(pai);
            }
            return doc;        
           
        };
        public static Document eliminaCidade(String procura, Document doc){
            Element raiz;
       
            if(doc == null){
                System.out.println("Ficheiro XML não existe!\n");
            }
            raiz = doc.getRootElement();
            List todasCidades = raiz.getChildren("cidade");
            boolean found = false;

            for(int i=0; i<todasCidades.size(); ++i){
                Element cidade = (Element)todasCidades.get(i); //Obtem a cidade  i da lista
                if(cidade.getAttributeValue("nome").equals(procura)){
                     cidade.getParent().removeContent(cidade);
                     System.out.println("Cidade eliminada com sucesso!");
                     found = true;
                 }
             }
            if(!found){
                System.out.println("A cidade " + procura + " nao foi encontrado");
                return null;
            }  
       return doc;
        
        
        }
}
