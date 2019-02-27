package FlujoDatos;

import java.io.*;
public class Ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Abrimos el fichero de escritura.
		FileWriter file = null;
		
		try {
			file = new FileWriter("C:\\Users\\USUARIO\\eclipse-workspace-AccesoDatos\\01Pruebas\\Caracteres.txt");
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("No se puede abrir el fichero");
			System.out.println(e.getMessage()); 
		}
		
		// Abrir mensaje y escribir tres lineas.
		
		BufferedWriter buffer = new BufferedWriter (file);
		try {
			for(int i =0;i<=255;i++) {
				buffer.write(i+" :");
				// Escritura de un String. La operación i+": " genera un String
				buffer.write(i);
				// Escritura del carácter asociado al valor de i.
				buffer.newLine();
				
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al escribir en el fichero");
			System.out.println(e.getMessage());
			
		}
		
		try {
			buffer.close();
			file.close();
			
		} catch (Exception e) {
			System.out.println("Error al cerrar el fichero");
			System.out.println(e.getMessage());
		}
		

	}

}
