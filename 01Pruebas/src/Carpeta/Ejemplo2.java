package Carpeta;

import java.io.*;
public class Ejemplo2 {

	public static void main(String[] args) {
		
		File carp = new File ("C:\\Windows");
		if(carp.exists()) {
			System.out.println("Existe la carpeta");
			System.out.println("Tiene permisos de escritura?" + carp.canWrite());
			
			String [] contenido = carp.list();
			for(String nombre : contenido) {
				File f = new File(carp.getPath(),nombre);
				if(f.isDirectory()) {
					System.out.println(nombre + ",  " + "carpeta ");
				}else {
					System.out.println(nombre + ", " + " fichero, " + f.length() + " bytes");
				}
			}
			
		}
		else {
			System.out.println("No existe la carpeta.");
		}

	}

}
