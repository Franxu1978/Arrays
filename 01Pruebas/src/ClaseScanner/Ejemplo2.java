package ClaseScanner;
//Leer un String l�nea a l�nea
import java.util.*;
public class Ejemplo2 {
	
	public static void main(String[] args) {
		String texto="Capitan America \nHulk \nIron man \nSpiderman";
				
		Scanner sc = new Scanner(texto);
		
		while(sc.hasNext()) {
			System.out.println(sc.nextLine());
			/*El m�todo nextLine() lee una l�nea completa sin fragmentarla. En la cadena texto hemos
colocado tres veces el car�cter de escape "\n" para insertar retornos de carro, generando as�
cuatro l�neas.*/
		}
		sc.close();
		
	}

}
