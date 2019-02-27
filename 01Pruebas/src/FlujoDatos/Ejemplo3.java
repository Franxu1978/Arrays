package FlujoDatos;

import java.io.*;
// escribir en ficheros de texto con un flujo de datos en formato binario
public class Ejemplo3 {
	public static void main(String[] args) {
		

	// Abrir fichero para escritura
	FileOutputStream file;
	
	try {
		file = new FileOutputStream("C:\\Users\\USUARIO\\eclipse-workspace-AccesoDatos\\01Pruebas\\Prueba3.txt");
		
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("No se ha podido abrir el fichero");
		System.out.println(e.getMessage());
		return;
		
	}
	
	String texto = "Esto es una prueba para escribir texto en binario";
	
	// Escribir el texto en el fichero carácter a carácter.
	
	try {
		for (int i=0;i<texto.length();i++) {
			file.write(texto.charAt(i));
		}
		
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("Error al escribir el mensaje");
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
