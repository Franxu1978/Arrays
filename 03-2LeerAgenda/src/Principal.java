import java.io.*;

// import java.io.EOFException; esta excepcion esta dentro de Java.io

public class Principal {

	//En esta ocasión hay varios objetos de la clase Contacto para leer dentro del fichero,
	//con lo cual necesitarás iterar, es decir, utilizar un bucle para leer sucesivas
	//veces mientras no sea final de fichero. 

	//¿Como saber cuando se ha llegado al final del fichero? con la excepcion EOFException.

	public static void main(String[] args) {

		// Abrimos fichero agenda.dat para lectura
		// Abrimos fichero agenda.dat para lectura
				FileInputStream file;
				ObjectInputStream buffer;
				try {
					file = new FileInputStream("C:\\Users\\USUARIO\\eclipse-workspace-AccesoDatos\\agenda.dat");
					buffer = new ObjectInputStream(file);
				} catch (IOException e) {
					System.out.println("No se ha podido abrir la agenda de contactos");
					System.out.println(e.getMessage());
					return;
				}	
				
				// Leemos la lista de contactos
				boolean eof = false;
				Contacto c;
				while (!eof) {
					try {
						c = (Contacto) buffer.readObject();
						System.out.println(c);
					} catch (EOFException e1) {
						eof = true;
					} catch (IOException e2) {
						System.out.println("Error al leer los contactos de la agenda");
						System.out.println(e2.getMessage());
					} catch (ClassNotFoundException e3) {
						System.out.println("La clase Contacto no está cargada en memoria");
						System.out.println(e3.getMessage());
					}
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

