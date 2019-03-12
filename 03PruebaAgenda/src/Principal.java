
import java.io.*;

public class Principal {

	public static void main(String[] args) {
		
		// Abrimos el fichero para lectura
		
		FileOutputStream file;
		ObjectOutputStream buffer;
		
		try {
			file = new FileOutputStream("C:\\Users\\USUARIO\\eclipse-workspace-AccesoDatos\\agenda.dat", true);
			buffer = new ObjectOutputStream(file);
		} catch (IOException e) {
			System.out.println("El archivo no se ha podido abrir");
			System.out.println(e.getMessage());
			return;
		}
		
		//Creamos tres contactos
		Contacto c1 = new Contacto("Fran","670691680");
		Contacto c2 = new Contacto("Conchi","680968567");
		Contacto c3 = new Contacto("J.Luis","639685346");
		Contacto c4 = new Contacto("Bea","647236549");
		Contacto c5 = new Contacto("J.Antonio","680695865");
		
		// Guardamos los archivos en la agenda.
		try {
			buffer.writeObject(c1);
			buffer.writeObject(c2);
			buffer.writeObject(c3);
			buffer.writeObject(c4);
			buffer.writeObject(c5);
			
		} catch (IOException e) {
			System.out.println("No se ha podido meter los contactos");
			System.out.println(e.getMessage());
		}
		
		// Cerramos el fichero
		
		try {
			file.close();
			buffer.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("No se ha podido cerrar el fichero o el buffer");
			System.out.println(e.getMessage());
		}
		System.out.println("Operacion realizada con exito");

	}

}
