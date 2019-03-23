
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.Scanner;

public class Principal {
	static Scanner lector;

	public static void main(String[] args) throws Exception {
		lector = new Scanner(System.in);
		Coches coche = new Coches();
		int opc = 0;
		File fichero = new File("Concesionario.dat");
		if (fichero.exists())
			coche = leerFichero();
		
		while (opc != 6) {
			mostrarMenu();
			opc = lector.nextInt();
			lector.nextLine();// Para recoger el retorno de carro.
			switch (opc) {
			case 1:
				nuevoCoche(coche);
				break;
			case 2:
				borrarCoche(coche);
				break;
			case 3:
				consultarCoche(coche);
				break;
			case 4:
				listadoCoches(coche);
				break;

			case 5:
				exportarCoches(coche);
				break;
			
			}
		}
		crearFichero(coche);
		lector.close();
	}

	public static void mostrarMenu() {
		System.out.println("                   COCHES MATRICULADOS");

		System.out.println("---------------------------------------");

		System.out.println("1. Añadir nuevo coche");

		System.out.println("2. Borrar coche");

		System.out.println("3. Consultar coche");

		System.out.println("4. Listado de coches");

		System.out.println("5. Exportar coches a archivo de texto");

		System.out.println("6. Terminar programa");

		System.out.println("---------------------------------------");

		System.out.println("¿Qué opción eliges?");
	}

	public static void nuevoCoche(Coches coches) {
		System.out.println("Matricula: ");
		String matricula = lector.nextLine();
		System.out.println("Marca: ");
		String marca = lector.nextLine();
		System.out.println("Modelo: ");
		String modelo = lector.nextLine();
		System.out.println("Color: ");
		String color= lector.nextLine();
		
		coches.getCoches().add(new Coche(matricula,marca,modelo,color));
		System.out.println("El coche ha sido añadido con éxito");
	}

	

	public static void borrarCoche(Coches coches) {
		int i = 0;
		System.out.println("Maticula buscada: ");
		String matricula = lector.nextLine();
		while(i< coches.getCoches().size() && !coches.getCoches().get(i).equals(matricula)) {
			i++;
		}

		if (i == coches.getCoches().size()) {
			System.out.println("No encontrado");
		} else {
			System.out.println(coches.getCoches().get(i) + " SERÁ ELIMINADO");
			coches.getCoches().remove(i);
		}
	}

	public static void consultarCoche(Coches coches) {
		int i = 0;
		System.out.println("Maticula buscada: ");
		String matricula = lector.nextLine();
		while(i< coches.getCoches().size() && !coches.getCoches().get(i).equals(matricula)) {
			i++;
		}

		if (i == coches.getCoches().size()) {
			System.out.println("No encontrado");
		} else {
			System.out.println("Matricula " + matricula + ": " + coches.getCoches().get(i));
		}
	}

	public static void listadoCoches(Coches coches) {
		for (Coche c : coches.getCoches()) {
			System.out.println(c);
		}
	}

	public static void crearFichero(Coches coches) throws Exception {
		FileOutputStream file = new FileOutputStream("Concesionario.dat",true);
		ObjectOutputStream buffer = new ObjectOutputStream(file);
		buffer.writeObject(coches);
		buffer.close();
		file.close();
	}

	// Falta sacar el archivo a texto.
	public static Coches leerFichero() throws Exception {
		FileInputStream file = new FileInputStream("Concesionario.dat");
		ObjectInputStream buffer = new ObjectInputStream(file);
		Coches listado = (Coches) buffer.readObject();
		buffer.close();
		file.close();
		return listado;
		
		
		/*FileInputStream file;
		ObjectInputStream buffer;

		try {
			file = new FileInputStream("Concesionario.txt");
			buffer = new ObjectInputStream(file);

		} catch (Exception e) {
			System.out.println("No se ha podido abrir la lista de coches");
			System.out.println(e.getMessage());
			return;
		}
		boolean eof = false;
		Coche c;
		while (!eof) {
			try {
				c = (Coche) buffer.readObject();
				System.out.println(c);
			} catch (EOFException e1) {
				eof = true;
			} catch (IOException e2) {
				System.out.println("Error al leer los coches de la lista");
				System.out.println(e2.getMessage());
			} catch (ClassNotFoundException e3) {
				System.out.println("La clase Coche no está cargada en memoria");
				System.out.println(e3.getMessage());
			}
			try {
				buffer.close();
				file.close();
			} catch (IOException e) {
				System.out.println("Error al cerrar el fichero");
				System.out.println(e.getMessage());
			}*/
		
		
		
		
		
	}
	public static void exportarCoches(Coches coche) throws IOException {
		
		// para poder leerlo tenemos que pasarlo a texto, pq si no el archivo sale raro.
		
		FileWriter file = new FileWriter("Concesionario.txt");
		BufferedWriter buffer = new BufferedWriter(file);
		for(Coche c : coche.getCoches()) {
		buffer.write(c.toString()); // Esto lo escribe una cadena
		}
		buffer.close();
		file.close();
		
	}

	
}