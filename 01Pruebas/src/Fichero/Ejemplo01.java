package Fichero;

import java.io.File;

public class Ejemplo01 {
	public static void main(String[] args)  {
		
	
	File fich = new File("C:\\Users\\USUARIO\\eclipse-workspace-AccesoDatos\\01Pruebas");
	if(fich.exists()) {
		System.out.println("El fichero existe.");
		System.out.println("El fichero ocupa " + fich.length());
		System.out.println("El nombre del fichero es : " + fich.getName()); 
		System.out.println("La ruta es : " + fich.getPath());
		System.out.println("Es un fichero oculto : " + fich.isHidden());
		System.out.println("Esta permitida la escritura : " + fich.canWrite());
		System.out.println("Esta permitida la lectura : " + fich.canRead());
		System.out.println("Es un fichero " + fich.isFile());
		System.out.println("Es un Directorio " + fich.isDirectory());
		
	}else {
		System.out.println("El fichero no existe.");
	}
  }
}
