package LecturaFichero;

import java.io.FileInputStream;

public class Ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Abrimos el fichero para escritura
		
		FileInputStream file;
		try {
			file = new FileInputStream("C:\\Users\\USUARIO\\eclipse-workspace-AccesoDatos\\01Pruebas\\Prueba3.txt");
			//Con esta l�nea abrimos el fichero para lectura.
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("No se ha podido abrir el fichero");
			System.out.println(e.getMessage());
			return;
		}
		
		// Leer el fichero caracter a caracter.
		
		int caracter;
		
		try {
			caracter = file.read(); // // Lee un byte y devuelve -1 si es final de fichero
			//Esta sentencia lee el pr�ximo car�cter en orden secuencial y devuelve un n�mero entero
			//con el c�digo Unicode asociado al car�cter.
			
			while(caracter !=-1) {
				System.out.println((char)caracter);
				caracter = file.read();
				/* Cuando llega al final de fichero devuelve -1,
				esa es la raz�n por la que usamos una estructura while cuya condici�n es que la variable
				caracter sea distinta de -1. A la hora de mostrar el car�cter en pantalla hacemos
				conversi�n a tipo char para que se vayan mostrando los caracteres y no los c�digos.*/
								
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al leer el fichero");
			System.out.println(e.getMessage());
		}
		
		// cerrar el fichero
		
		try {
			file.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al cerrar el fichero");
			System.out.println(e.getMessage());
		}
		
	}

}
