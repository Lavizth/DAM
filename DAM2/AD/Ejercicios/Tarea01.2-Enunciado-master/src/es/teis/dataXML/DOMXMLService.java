/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.teis.dataXML;

import es.teis.data.exceptions.LecturaException;
import es.teis.model.Partido;
import java.io.File;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author a14Deividdd
 */
public class DOMXMLService implements IXMLService{

    @Override
    public ArrayList<Partido> leerPartidos(String ruta, float umbral) throws LecturaException {
        ArrayList<Partido> partido = new ArrayList<>();
        long id;
        String nombre;
        int votos;
        float porcentaje;
        Partido p = null;
        
        try {
            File file = new File(ruta);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.newDocument();
        
            NodeList listaPartidos = doc.getElementsByTagName(PARTIDO_TAG);
            
            for(int i = 0; i<listaPartidos.getLength(); i++){
                Node n = listaPartidos.item(i);
                Element e = (Element) n;
                
                id = Long.parseLong(e.getAttribute(PARTIDO_ATT_ID));
                nombre = String.valueOf(e.getElementsByTagName(PARTIDO_NOMBRE_TAG).item(0).getTextContent());
                nombre = e.getElementsByTagName(PARTIDO_NOMBRE_TAG).item(0).getTextContent();
                votos = Integer.parseInt(e.getElementsByTagName(PARTIDO_VOTOS_NUM_TAG).item(0).getTextContent());
                porcentaje = Float.parseFloat(e.getElementsByTagName(PARTIDO_VOTOS_PORC_TAG).item(0).getTextContent());
                
                p = new Partido(id, nombre, votos, porcentaje);
                partido.add(p);
            }
            
        } catch (Exception e) {
            throw new LecturaException(e.getStackTrace().toString(), ruta);
        }
        
        return partido;
    }

}
