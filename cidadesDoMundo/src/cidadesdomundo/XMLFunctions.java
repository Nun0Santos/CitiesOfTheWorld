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
                return null;
            }
            
            Element pai = new Element("cidades");
            Attribute nome = new Attribute("nome",cidad.getNome());
            pai.setAttribute(nome);
            
            Element filho = new Element("pais").addContent(cidad.getNome());
            pai.addContent(filho);
            
            filho = new Element("capital").addContent(cidad.getCapital());
            pai.addContent(filho);
            
            filho = new Element("linkBandeiraPais").addContent(cidad.getLinkBandeiraPais());
            pai.addContent(filho);
            
            filho = new Element("linguaOficial").addContent(cidad.getLinguaOficial());
            pai.addContent(filho);
            
            filho = new Element("linkBandeiraCidade").addContent(cidad.getLinkBandeiraCidade());
            pai.addContent(filho);
            
            filho = new Element("linkMonumentos").addContent(cidad.getLinkMonumentos());
            pai.addContent(filho);
            
            filho = new Element("areaCidade").addContent(Double.toString(cidad.getAreaCidade()));
            pai.addContent(filho);
            
            filho = new Element("nHabitantes").addContent(Double.toString(cidad.getnHabitantes()));
            pai.addContent(filho);
            
            filho = new Element("densidadePopulacional").addContent(Double.toString(cidad.getDensidadePopulacional()));
            pai.addContent(filho);
            
            filho = new Element("codigoPostal").addContent(cidad.getCodigoPostal());
            pai.addContent(filho);
            
            filho = new Element("presidente").addContent(cidad.getPresidente());
            pai.addContent(filho);
            
            filho = new Element("latitude").addContent(Double.toString(cidad.getLatitude()));
            pai.addContent(filho);
            
            filho = new Element("longitude").addContent(Double.toString(cidad.getLongitude()));
            pai.addContent(filho);
            
            filho = new Element("altitude").addContent(Double.toString(cidad.getAltitude()));
            pai.addContent(filho);
            
            filho = new Element("clima").addContent((cidad.getClima()));
            pai.addContent(filho);
            
            filho = new Element("fusoHorario").addContent((cidad.getFusoHorario()));
            pai.addContent(filho);
            
            filho = new Element("website").addContent((cidad.getWebsite()));
            pai.addContent(filho);
            
            filho = new Element("cidadesGeminadas").addContent((cidad.getCidadesGeminadas()));
            pai.addContent(filho);
        
            return doc;        
           
        };
}
