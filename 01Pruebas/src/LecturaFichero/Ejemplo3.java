package LecturaFichero;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Ejemplo3 {
	public static void main(String[] args) {
		
	
	// Abrir fichero para escritura
	FileInputStream file;
	BufferedInputStream buffer;
	try {
		file = new FileInputStream("C:\\cine\\peliculas.txt");
		buffer = new BufferedInputStream(file); // programa funciona
		//exactamente igual que el anterior, pero incorpora un filtro.
		
	} catch (IOException e1) {
		System.out.println("No se ha podido abrir el fichero");
		System.out.println(e1.getMessage());
		return;
	}
	// Leer contenido del fichero carácter a carácter
	int caracter;
	try {
		caracter = buffer.read();
		// Lee un byte y devuelve -1 si es final de fichero
		while (caracter!=-1) {
			System.out.print((char)caracter);
			caracter = buffer.read();
		}
	} catch (IOException e) {
		System.out.println("Error al leer el fichero");
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
