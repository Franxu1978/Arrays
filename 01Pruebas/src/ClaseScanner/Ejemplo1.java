package ClaseScanner;
import java.util.*;

public class Ejemplo1 {
// leer un string palabra a palabra
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String texto = "La cripta magica";
		Scanner sc = new Scanner(texto);
		
		while(sc.hasNext()) {
			System.out.println(sc.next());
			/*m�todo lector.next() devuelve el siguiente fragmento de la cadena de manera
secuencial, por esa raz�n lo encerramos dentro de un while con la condici�n lector.hasNext(), ya
que hasNext() devuelve true mientras existan m�s fragmentos.*/
		}
		sc.close();

	}

}
