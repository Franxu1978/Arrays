package Prueba_anotaciones;
import Prueba_anotaciones.Autor;

public class Principal {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		
/*Creamos un objeto de la clase Coche y después mostramos su estado 
 * invocando al método toString() con esta línea: System.out.println(miCoche);*/
	
		/*toString() es el método al que se invoca por defecto cuando no se
		 *especifica el método a ejecutar.*/
		
		Coche miCoche = new Coche("Peugeot", "307");
		System.out.println(miCoche);


		// Accediendo a los datos de la anotación del método.

		Autor a1 = miCoche.getClass().getMethod("acelerar").getAnnotation(Autor.class);
		System.out.println("Nombre Autor " + a1.nombre());
		System.out.println("Direccion Autor " + a1.direccion());
		
	/*La expresión miCoche.getClass() devuelve un objeto de tipo Class que provee información
	 * sobre la clase a la que pertenece el objeto. De esta forma, estamos también obteniendo
	 * información sobre el método acelerar() usando la expresión getMethod("acelerar").
	 * Concretamente, estamos accediendo a los datos de la anotación.*/	
		

		// Accediendo a los datos de la anotación de la clase.
		Autor a2 = miCoche.getClass().getAnnotation(Autor.class);
		/*Aquí estamos accediendo a los datos de la anotación de la clase.*/
		System.out.println("Nombre autor: " + a2.nombre());
		System.out.println("Dirección autor: " + a2.direccion());

	}

}
