package ClaseScanner;

import java.util.*;
public class Ejemplo5 {
	public static void main(String args[]) {
		
	
		String texto="Tomates;3;1,5;Patatas;5;3,5;Pimientos;5;0,95";
		Scanner lector = new Scanner(texto);
		
		lector.useDelimiter(";");
		while (lector.hasNext()){
			
			String producto = lector.next();
			int cantidad = lector.nextInt();
			float precio = lector.nextFloat();
			float total = cantidad*precio;
			System.out.println(cantidad + " kg de " + producto + " a " +
					precio + "€ = " + total);
			
			/*En este ejemplo, la cadena contiene datos de ventas y hay que ir leyendo bloques de tres
elementos formatos por producto (String), cantidad (int) y precio (float).*/
		}
		lector.close();
		}
		/*IMPORTANTE: nextInt(), nextFloat(), nextDouble(), etc. podrían provocar una excepción
de tipo InputMismatchException si el elemento leído no tiene el formato correcto para
poder ser convertido al tipo numérico que corresponda.*/
   }
