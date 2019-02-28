
import java.io.*;

public class Principal {

	public static void main(String[] args) {
		
		
		// Abrir fichero para lectura
		
		//hemos utilizado los flujos de lectura FileInputStream (iniciador) y ObjectInputStream (filtro).
		FileInputStream file;
		ObjectInputStream buffer;
		
		
		try {
			file=new FileInputStream("C:\\Users\\USUARIO\\eclipse-workspace-AccesoDatos\\02Pruebas GrabarArchivo\\src\\Ejemplo1\\alumno.dat");
			buffer= new ObjectInputStream(file);
			
		} catch (Exception e) {
			System.out.println("Error al abrir el archivo");
			System.out.println(e.getMessage());
			return;
		}
		
		// leer el objeto guardado
		try {
			Alumno alu1 = (Alumno) buffer.readObject();
			System.out.println("Nombre del alumno" + alu1.getNombre());
			System.out.println("Edad del alumno" +  alu1.getEdad());
			// Corremos el Array List de Calificaciones para saber sus notas, con un for each.
			
			for (Calificacion c : alu1.getCalificaciones()) {
				System.out.println(c);
			}
			
			/*Con la sentencia
				Alumno alu1 = (Alumno) buffer.readObject();
				hemos leído el objeto, pero hemos tenido que convertirlo a tipo Alumno,
				ya que el método readObject() devuelve un genérico Object.*/
			
		} catch (Exception e) {
			System.out.println("No se ha podido leer el alumno");
			System.out.println(e.getMessage());
		}
		
		// Cerrar el fichero
		
		try {
			buffer.close();
			file.close();
			
		} catch (Exception e) {
			System.out.println("No se ha podido cerrar el archivo");
			System.out.println(e.getMessage());
		}

	}

}
