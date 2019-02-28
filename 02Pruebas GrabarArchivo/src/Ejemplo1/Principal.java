package Ejemplo1;

import java.io.*;

public class Principal {

	
	public static void main(String[] args) {
		// hemos creado un objeto de la clase Alumno llamado alu1 y le hemos a�adido
		// cuatro calificaciones.

		Alumno alu1 = new Alumno("Pedro",25);
		alu1.calificar("Matematicas", 50);
		alu1.calificar("Ingles", 90);
		alu1.calificar("Inform�tica", 95);
		alu1.calificar("Lengua", 60);
		
		// Abrir fichero para escritura
		FileOutputStream file;
		ObjectOutputStream buffer;
		
		
		
		
		try {
			file = new FileOutputStream("C:\\Users\\USUARIO\\eclipse-workspace-AccesoDatos\\02Pruebas GrabarArchivo\\src\\Ejemplo1\\alumno.dat");
			buffer = new ObjectOutputStream (file);
			/*Despu�s hemos construido un objeto de la clase FileOutputStream (iniciador) dejando el
			 * archivo alumno.dat abierto para escritura. El fichero ser� creado en cada ejecuci�n,
			 * sobrescribiendo la versi�n anterior si existe.*/
			
			/*Tambi�n podemos abrir el archivo para a�adir sin eliminar los datos anteriores;
			 *  en ese caso tendr�amos que establecer a true el segundo argumento:
			 *  file = new FileOutputStream("J:\\alumno.dat", true); */
			
			/*Ya abierto el fichero, creamos un objeto ObjectOutputStream que nos servir�
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
			/*El m�todo writeObject() de la clase ObjectOutputStream es el que nos permite
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
		/*Por �ltimo, igual que en todas las operaciones de entrada / salida,
		  hay que terminar cerrando los flujos de datos, liberando as� el fichero.*/
		
	}

}
