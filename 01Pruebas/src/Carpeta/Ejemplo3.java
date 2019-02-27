package Carpeta;
import java.io.*;

public class Ejemplo3 {
	public static void main(String[] args) {
		
		File carp = new File("C:\\Users\\USUARIO\\eclipse-workspace-AccesoDatos\\01Carpeta");
		boolean ok = carp.mkdir();
		/*El método mkdir() crea la carpeta representada por el objeto File si no existe.
		 *Devuelve true si la carpeta se ha podido crear con éxito y false de lo contrario.*/
		if(ok) {
			System.out.println("La carpeta se ha creado");
		}else
			System.out.println("La carpeta no ha podido crearse");
		
	
}
}
