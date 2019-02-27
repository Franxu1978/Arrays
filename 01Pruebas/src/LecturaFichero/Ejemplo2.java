package LecturaFichero;

import java.io.FileInputStream;

public class Ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Abrimos el fichero para escritura
		
		FileInputStream file;
		try {
			file = new FileInputStream("C:\\Users\\USUARIO\\eclipse-workspace-AccesoDatos\\01Pruebas\\Prueba3.txt");
			//Con esta línea abrimos el fichero para lectura.
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
			//Esta sentencia lee el próximo carácter en orden secuencial y devuelve un número entero
			//con el código Unicode asociado al carácter.
			
			while(caracter !=-1) {
				System.out.println((char)caracter);
				caracter = file.read();
				/* Cuando llega al final de fichero devuelve -1,
				esa es la razón por la que usamos una estructura while cuya condición es que la variable
				caracter sea distinta de -1. A la hora de mostrar el carácter en pantalla hacemos
				conversión a tipo char para que se vayan mostrando los caracteres y no los códigos.*/
								
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
