package LecturaFichero;

import java.io.*;
public class Ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Abrir fichero para lectura
		
		FileReader file;
		
		try {
			file = new FileReader("C:\\Users\\USUARIO\\eclipse-workspace-AccesoDatos\\01Pruebas\\Prueba3.txt");
			//esta sentencia estamos abriendo el fichero Prueba3.txt para lectura. Puede causar una excepcion
		} catch (Exception e) {
			System.out.println("Error al abrir el archivo");
			System.out.println(e.getMessage());
			return;
		}
		// Abrir buffer y escribir tres l�neas
		
		BufferedReader buffer = new BufferedReader(file); // buffer es un nuevo buffer de file.
		String linea = "";
		try {
			linea = buffer.readLine();
			while (linea!=null){
				System.out.println(linea);
				linea=buffer.readLine();
				/*Con esta sentencia estamos leyendo la siguiente l�nea del fichero de manera secuencial
					y guard�ndola en la variable linea. Cuando ya no hay m�s l�neas para leer devuelve null;
					esa es la raz�n por la que necesitamos una estructura while con la condici�n linea!=null.*/
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al leer el archivo");
			System.out.println(e.getMessage());
		}
		
		// cerrar el buffer y el fichero
		
		try {
			buffer.close();
			file.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Erro al cerrar el archivo");
			System.out.println(e.getMessage());
		}

	}

}
