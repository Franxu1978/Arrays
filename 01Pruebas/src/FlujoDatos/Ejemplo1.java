package FlujoDatos;

import java.io.*;
public class Ejemplo1 {
	
	public static void main(String[] args) {
		
	
	// Abrimos fichero para la escritura
	
	FileWriter file;
	try {
		file = new FileWriter("C:\\Users\\USUARIO\\eclipse-workspace-AccesoDatos\\01Pruebas\\Peliculas.txt");
		/*Al construir un objeto de la clase FileWriter estamos abriendo el fichero peliculas.txt,
			dej�ndolo preparado para escritura.*/
		
		/*No solo abre el fichero si no que lo crea fisicamente. Sobreescribe el anterior 
		 * Si el ficheero no existe lo crea pero si existe lo abre para a�adir.
		 * 
		 * A�adiriamos en el constructor el valor true.
		 * 
		 * file = new FileWriter("C:\\cine\\peliculas.txt", true);
		 * */
		
	}catch (IOException e) {
		System.out.println("No puede abrirse el fichero");
		System.out.println(e.getMessage());
		return;
	}
	
	
	// Abri buffer y escribir tres lineas.
	
	BufferedWriter buffer = new BufferedWriter(file);
	/*Las operaciones de escritura las realizaremos a trav�s del objeto buffer de la clase
	BufferedWriter, que nos proporciona m�todos para la escritura eficiente. El constructor
	de la clase BufferedWriter requiere un objeto FileWriter.*/
	
	try {
		buffer.write("El se�or de los anillos, la comunidad del anillo");
		/*El m�todo write(String texto) de la clase BufferedWriter escribe texto en el fichero.*/
		buffer.newLine();
		/*El m�todo newLine() de la clase BufferedWriter escribe un retorno de carro en el fichero.*/
		buffer.write("El se�or de los anillos, las dos torres");
		buffer.newLine();
		buffer.write("El se�or de los anillos, el retorno del rey");
		buffer.newLine();
		
	} catch (Exception e) {
		System.out.println("Error al escribir el fichero");
		System.out.println(e.getMessage());
	}
	
	// Cerrar el buffer y el fichero
	
	try {
		buffer.close();
		file.close();
		/*cerrar los objetos BufferedWriter y FileWriter.*/
		
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("Error al cerrar el fichero");
		System.out.println(e.getMessage());
	}
	/*aunque el fichero peliculas.txt no exist�a previamente, el constructor de
		la clase FileWriter lo ha creado.*/

   }
}
