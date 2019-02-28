package Ejemplo1;

import java.io.*;

public class Principal {

	
	public static void main(String[] args) {
		// hemos creado un objeto de la clase Alumno llamado alu1 y le hemos añadido
		// cuatro calificaciones.

		Alumno alu1 = new Alumno("Pedro",25);
		alu1.calificar("Matematicas", 50);
		alu1.calificar("Ingles", 90);
		alu1.calificar("Informática", 95);
		alu1.calificar("Lengua", 60);
		
		// Abrir fichero para escritura
		FileOutputStream file;
		ObjectOutputStream buffer;
		
		
		
		
		try {
			file = new FileOutputStream("C:\\Users\\USUARIO\\eclipse-workspace-AccesoDatos\\02Pruebas GrabarArchivo\\src\\Ejemplo1\\alumno.dat");
			buffer = new ObjectOutputStream (file);
			/*Después hemos construido un objeto de la clase FileOutputStream (iniciador) dejando el
			 * archivo alumno.dat abierto para escritura. El fichero será creado en cada ejecución,
			 * sobrescribiendo la versión anterior si existe.*/
			
			/*También podemos abrir el archivo para añadir sin eliminar los datos anteriores;
			 *  en ese caso tendríamos que establecer a true el segundo argumento:
			 *  file = new FileOutputStream("J:\\alumno.dat", true); */
			
			/*Ya abierto el fichero, creamos un objeto ObjectOutputStream que nos servirá
			 *como filtro para mejorar el proceso de escritura.*/
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Nene, el archivo no se a habierto");
			System.out.println(e.getMessage());
			return;
		}
		
		//guardamos el objeto en el archivo.dat
		
		try {
			buffer.writeObject(alu1);
			System.out.println("Enga chaval, que lo he grabado en el archivo .dat");
			/*El método writeObject() de la clase ObjectOutputStream es el que nos permite
			  grabar el objeto en disco. */
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Esto hace aguas, no he podido guardar el archivo");
			System.out.println(e.getMessage());
		}
		try {
			buffer.close();
			file.close();
		} catch (IOException e) {
			System.out.println("No he podido 'Chapar' o el bufer o el file");
			e.printStackTrace();
		}
		/*Por último, igual que en todas las operaciones de entrada / salida,
		  hay que terminar cerrando los flujos de datos, liberando así el fichero.*/
		
	}

}
