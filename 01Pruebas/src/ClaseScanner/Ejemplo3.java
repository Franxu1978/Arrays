package ClaseScanner;

import java.util.Scanner;

public class Ejemplo3 {
	public static void main(String args[]) {
		String texto="Rosa L�pez;Miguel de la Parra;Carmen Ruiz;Francisco L�pez;Rosa Morales";
		
		Scanner lector = new Scanner(texto);
		lector.useDelimiter(";");
		/*Con la sentencia lector.useDelimiter(";"); hemos establecido el delimitador utilizado para
fragmentar la cadena, de modo que habr� cuatro fragmentos para leer.*/
		
		while (lector.hasNext()){
			System.out.println(lector.next());
		}
		lector.close();
	}
}
