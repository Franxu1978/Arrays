package ClaseScanner;

import java.util.Scanner;

public class Ejemplo6 {
	public static void main(String args[]) {
		String nombre;
		Scanner lector = new Scanner (System.in);
		System.out.println("�C�mo te llamas?");
		nombre = lector.nextLine();
		System.out.println("Encantado " + nombre);
		lector.close();
	}
}
