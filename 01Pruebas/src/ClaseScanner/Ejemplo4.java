package ClaseScanner;

import java.util.*;
public class Ejemplo4 {
	public static void main(String args[]) {
		String texto="80;25;48;56;38;46";
		/*En este ejemplo, la cadena contiene cantidades numéricas enteras separadas por punto y coma.*/
		Scanner sc = new Scanner(texto);
		
		sc.useDelimiter(";");
		
		while (sc.hasNext()){
			int num = sc.nextInt();
			
			System.out.println(num);
		}
		sc.close();
		}
}
