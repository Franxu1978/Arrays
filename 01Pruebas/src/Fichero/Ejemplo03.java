package Fichero;
import java.io.File;
import java.io.IOException;

public class Ejemplo03 {
	public static void main(String[] args) throws IOException {
		
		File fich = new File("C:\\Users\\USUARIO\\eclipse-workspace-AccesoDatos\\01Pruebas\\prueba02.txt");
		boolean ok = fich.delete();  // borramos el fichero
		if(ok) {
			System.out.println("El fichero se ha borrado");
		}else {
			System.out.println("El fichero no ha podido borrarse");
		}
		
		

}
}
