package Carpeta;

import java.io.*;



public class Ejemplo1 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		File carp = new File ("C:\\Users\\USUARIO\\eclipse-workspace-AccesoDatos\\01Carpeta");
		
		if(carp.exists()) {
			System.out.println("La carpeta existe");
			
			System.out.println("Tiene permisos de escritura ? " + carp.canWrite()); 
			// El método canWrite() devuelve true si la carpeta tiene permisos de escritura
			
			String[] contenido = carp.list();
			//El método list() devuelve un array de objetos String con los nombre de los
			//archivos o subcarpetas contenidos en la carpeta que representa el objeto carp
			
			//Ese String lo guadamos en la variable contenido
			
			System.out.println("Archivos o carpetas que contiene : " + contenido.length);
			
			// La propiedad length contiene el numero de elementos, que sera el contenido
			// de la carpeta (carp.list())
			
			for(String nombre :contenido) {
				System.out.println(nombre);
				//estructura for each para recorrer los elementos del array y
				//así mostrar en pantalla los nombres de los archivos y carpetas.
				}
		
		}else
			System.out.println("No existe la carpeta");

	}

}
