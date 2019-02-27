package Carpeta;
import java.io.*;

public class Ejemplo4 {
	public static void main(String[] args) {
		
		File carp = new File("C:\\Users\\USUARIO\\eclipse-workspace-AccesoDatos\\01Carpeta");
		
		boolean ok = carp.delete();
		/*El método delete() elimina la carpeta. Devuelve true si la carpeta se ha eliminado con éxito y
		false de lo contrario. El método delete() no permite eliminar una carpeta que tenga algo dentro,
		es decir, no puede contener ningún archivo ni subcarpeta.*/
		
		if(ok) {
			System.out.println("La carpeta se ha borrado");
		}else
			System.out.println("La carpeta no ha podido borrarse");
			
		 
	}
	

}
