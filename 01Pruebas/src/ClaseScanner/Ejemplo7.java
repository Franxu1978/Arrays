package ClaseScanner;

import java.util.Scanner;

public class Ejemplo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner lector = new Scanner(System.in);
			System.out.println("�Cu�ntos a�os tienes?");
			int edad = lector.nextInt();
			System.out.println("�C�mo te llamas?");
			String nombre = lector.nextLine();
			System.out.println("Encantado " + nombre + " de " + edad + " a�os");
			lector.close();
			}

	}

/*�Y por qu� ocurre esto?
Durante la ejecuci�n, al escribir la edad, no solo introdujiste un n�mero, sino que tambi�n
pulsaste la tecla "enter" y ah� es donde est� el quid de la cuesti�n. 

La sentencia edad =
lector.nextInt() ley� el n�mero, pero el retorno de carro producido por la tecla "enter" qued� en
el buffer del teclado y fue recogido por la sentencia String nombre = lector.nextLine(), quedando
la entrada del nombre para una tercera lectura, que nunca se produjo.*/
