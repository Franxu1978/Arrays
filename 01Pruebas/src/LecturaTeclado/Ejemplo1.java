package LecturaTeclado;
import java.io.*;
public class Ejemplo1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		InputStreamReader teclado = new InputStreamReader(System.in);
		BufferedReader lectorTeclado = new BufferedReader (teclado);

		String nombre;
		System.out.print("Escribe aqu� tu nombre: ");
		nombre = lectorTeclado.readLine();
		System.out.println("Hola "+nombre+", �c�mo te va?");
		lectorTeclado.close();
		teclado.close();
		

 }
}
