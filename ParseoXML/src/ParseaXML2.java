import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.xml.sax.InputSource;
//Francisco Alanzaves
public class ParseaXML2  {
public static ArrayList<Pregunta> parsear(String xml) throws IOException,JDOMException{
		
		ArrayList<Pregunta> lista=new ArrayList<Pregunta>();
		// ArrayList de Pregunta
		SAXBuilder constructor=new SAXBuilder(); // Objeto de tipo SaxBuilder
		
			InputSource entrada = new InputSource(new ByteArrayInputStream(xml.getBytes()));
			//Esta clase permite que una aplicación SAX encapsule información sobre una fuente de entrada en un solo objeto 
			Document documento_xml=constructor.build(entrada);
			Element raiz=documento_xml.getRootElement();
			// representación de un documento XML. Obtenemos el Elementnodo raíz del documento .
			List<Element> preguntas=raiz.getChildren();
			//obtener los componentes secundarios dentro de la raiz.
			
			for (Element element : preguntas) {
				Element ele_enunciado = element.getChild("enunciado");
				//devuelve el primer elemento secundario dentro de este elemento con el nombre local dado.
				String enunciado = ele_enunciado.getValue();
				//contenido completo de todos de nodo de texto de este elemento
				
				Element ele_respuesta = element.getChild("respuesta");
				String respuesta = ele_respuesta.getValue();
				
				Element ele_tipo = element.getChild("tipo");
				String tipo = ele_tipo.getValue();
				
				Pregunta pregunta = new Pregunta(tipo,enunciado,respuesta);
				lista.add(pregunta);
				// objeto con sus parametros y lo añadimos a pregunta.
			} 
		
		return lista;
	}
		
}	


