package ClaseScanner;

import java.util.Scanner;

public class Ejemplo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner lector = new Scanner(System.in);
			System.out.println("¿Cuántos años tienes?");
			int edad = lector.nextInt();
			System.out.println("¿Cómo te llamas?");
			String nombre = lector.nextLine();
			System.out.println("Encantado " + nombre + " de " + edad + " años");
			lector.close();
			}

	}

/*¿Y por qué ocurre esto?
Durante la ejecución, al escribir la edad, no solo introdujiste un número, sino que también
pulsaste la tecla "enter" y ahí es donde está el quid de la cuestión. 

La sentencia edad =
lector.nextInt() leyó el número, pero el retorno de carro producido por la tecla "enter" quedó en
el buffer del teclado y fue recogido por la sentencia String nombre = lector.nextLine(), quedando
la entrada del nombre para una tercera lectura, que nunca se produjo.*/
