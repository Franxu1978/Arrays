import java.io.IOException;
import java.util.ArrayList;

import org.jdom2.JDOMException;

// Francisco Alanzaves
public class ClasePrincipal {
	public static void main(String[] args) throws IOException, JDOMException {
		String xml=AccesoFichero.leerFichero(); 
		//Clase AccesoFichero con el  metodo LeerFichero.
		ArrayList<Pregunta> preguntas=ParseaXML2.parsear(xml);
		// ArrayList de preguntas
		EntradaSalida.mostrarPreguntas(preguntas);
		// Clase entrada salida, con el metodo mostrarPreguntas
		AccesoFichero.grabarPreguntas(preguntas);
		//Metodo grabarPreguntas en la clase AccesoFichero
		
	
	}
}
