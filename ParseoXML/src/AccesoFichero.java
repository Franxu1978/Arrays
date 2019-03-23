import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

//Francisco Alanzaves
public class AccesoFichero {

	private static String ruta="F:/preguntas.xml"; // Ruta al fichero xml
	private static String coma=","; // String con una coma.
	public static String leerFichero()   {
		// TODO Auto-generated method stub

		String resultado="";
		String linea="";
		FileReader fr = null;
		try {
			fr = new FileReader(ruta);
			// FileReader lee caracteres del fichero metido en String ruta. 
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		BufferedReader br=new BufferedReader(fr);
		// mejora la velocidad de transmisión en la lectura del fichero
		try {
			linea=br.readLine();
			resultado=linea;


		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		while(linea!=null) // mientras la linea sea distinta de null..
		{

			try {
				linea=br.readLine();
				if( linea!= null) 
					resultado+=linea;
				// vamops añadiendo la linea al resultado.

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}



		return resultado;
	}
	public static void grabarPreguntas(ArrayList<Pregunta> pregunta) {
		try {
			String rutacsv = "F:/preguntas.csv"; 
			FileWriter fw=new FileWriter(rutacsv);
			// FileWriter Permite escribir caracteres en un fichero
			// En este caso va a ser un archivo .csv en mi unidad F.
			for (Pregunta p : pregunta) {
				String aux= p.getTipo()+coma+p.getPregunta()+coma+p.getRespuesta();
				fw.write(aux);
				// Bucle para que salga todo el contenido del fichero.

				fw.write(System.lineSeparator());
				// separador de lineas en documento.
			}
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
