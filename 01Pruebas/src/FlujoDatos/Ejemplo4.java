package FlujoDatos;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class Ejemplo4 {


	public static void main(String args[]) {
		// Abrir fichero para escritura
		FileOutputStream file;
		BufferedOutputStream buffer;
		try {
			file = new FileOutputStream("C:\\Users\\USUARIO\\eclipse-workspace-AccesoDatos\\01Pruebas\\Prueba4.txt");
			buffer = new BufferedOutputStream(file);
		} catch (IOException e) {
			System.out.println("No se ha podido abrir el fichero");
			System.out.println(e.getMessage());
			return;
		}
		String texto = "Este programa es como el anterior, caracter a caracter pero incorpora un BUFFER";
		// Escribir el texto en el fichero carácter a carácter.
		try {
			for (int i=0; i<texto.length(); i++) {
				buffer.write(texto.charAt(i));
			}
		} catch (IOException e) {
			System.out.println("Error al escribir en el fichero");
			System.out.println(e.getMessage());
		}
		// Cerrar el fichero
		try {
			buffer.close();
			file.close();
		} catch (IOException e) {
			System.out.println("Error al cerrar el fichero");
			System.out.println(e.getMessage());
		}
	}
}

