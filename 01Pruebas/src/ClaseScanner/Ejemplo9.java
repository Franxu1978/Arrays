package ClaseScanner;
import java.util.*;
import java.io.*;

public class Ejemplo9 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File fichero = new File("C:\\Users\\USUARIO\\eclipse-workspace-AccesoDatos\\01Pruebas\\Peliculas.txt");
		if (!fichero.exists()) { // Si no existe el fichero
			System.out.println("El fichero no existe");
			return;
		}
		Scanner lector = new Scanner(fichero);
		while (lector.hasNext()) {
			String linea = lector.nextLine();
			System.out.println(linea);
		}
		lector.close();
		/*Ejecutamos sucesivas veces el método nextLine() mientras se cumpla la condición
lector.hasNext(), es decir, mientras sigan quedando líneas por leer.*/
	}
}


