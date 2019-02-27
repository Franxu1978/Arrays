package ClaseScanner;
//Leer un String línea a línea
import java.util.*;
public class Ejemplo2 {
	
	public static void main(String[] args) {
		String texto="Capitan America \nHulk \nIron man \nSpiderman";
				
		Scanner sc = new Scanner(texto);
		
		while(sc.hasNext()) {
			System.out.println(sc.nextLine());
			/*El método nextLine() lee una línea completa sin fragmentarla. En la cadena texto hemos
colocado tres veces el carácter de escape "\n" para insertar retornos de carro, generando así
cuatro líneas.*/
		}
		sc.close();
		
	}

}
