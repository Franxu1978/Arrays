package Fichero;
import java.io.*;

public class Ejemplo02 {

	public static void main(String[] args) throws IOException {
		
		File fich = new File("C:\\Users\\USUARIO\\eclipse-workspace-AccesoDatos\\01Pruebas\\prueba02.txt");
		boolean ok = fich.createNewFile(); // creamos el fichero
		if(ok) {
			System.out.println("El fichero se ha creado");
		}else {
			System.out.println("El fichero no ha podido crearse.");
		}
		

	}

}
