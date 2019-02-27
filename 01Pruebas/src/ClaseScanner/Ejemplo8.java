package ClaseScanner;

import java.util.Scanner;

public class Ejemplo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Cuántos años tienes?");
		int edad = sc.nextInt(); // Recibe un int
		
		sc.nextLine(); // Recibe el retorno de carro.
		
		System.out.println("¿Cómo te llamas?");
		String nombre = sc.nextLine(); // Recibe un string
		
		System.out.println("Encantado " + nombre + " de " + edad + " años");
		sc.close();
	}

}
