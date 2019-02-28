/*Otro sistema para controlar cuándo hemos llegado a final de fichero es mediante
 * el método available() de la clase FileInputStream, que devuelve un número entero
 * con el número de bytes pendientes de lectura.*/

import java.io.*;

public class Principal2 {
	public static void main(String args[]) throws IOException  {
		int bytesEnBuffer;
		
		// Abrimos fichero agenda.dat para lectura
		FileInputStream file;
		ObjectInputStream buffer;
		try {
			file = new FileInputStream("C:\\Users\\USUARIO\\eclipse-workspace-AccesoDatos\\agenda.dat");
			buffer = new ObjectInputStream(file);
			bytesEnBuffer = file.available();
		} catch (IOException e) {
			System.out.println("No se ha podido abrir la agenda de contactos");
			System.out.println(e.getMessage());
			return;
		}	
		
		// Leemos la lista de contactos
		System.out.println("Bytes por leer: " + bytesEnBuffer);
		Contacto c;
		while (bytesEnBuffer>0) {
			try {
				c = (Contacto) buffer.readObject();
				System.out.println(c);
			} catch (IOException e2) {
				System.out.println("Error al leer los contactos de la agenda");
				System.out.println(e2.getMessage());
			} catch (ClassNotFoundException e3) {
				System.out.println("La clase Contacto no está cargada en memoria");
				System.out.println(e3.getMessage());
			}
			bytesEnBuffer = file.available();
			System.out.println("Bytes pendientes en buffer: " + bytesEnBuffer);
		}
	
		// Cerramos el fichero
		try {
			buffer.close();
			file.close();
		} catch (IOException e) {
			System.out.println("Error al cerrar el fichero");
			System.out.println(e.getMessage());
		}
		
	}
}
