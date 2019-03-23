import java.util.ArrayList;


//Francisco Alanzaves
public class EntradaSalida {


	public static void mostrarPreguntas(ArrayList<Pregunta> preguntas) {
		for (Pregunta p : preguntas) {
			System.out.println(p.getTipo()+ " " +p.getPregunta()+ " " +
					p.getRespuesta());
			// Bucle que va a leer dentro de preguntas, el tipo, la pregunta
			// y su repuesta.
		}
		
	}

	
}