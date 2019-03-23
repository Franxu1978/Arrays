package Prueba_anotaciones;
import Prueba_anotaciones.Autor;

public class Principal {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		
/*Creamos un objeto de la clase Coche y despu�s mostramos su estado 
 * invocando al m�todo toString() con esta l�nea: System.out.println(miCoche);*/
	
		/*toString() es el m�todo al que se invoca por defecto cuando no se
		 *especifica el m�todo a ejecutar.*/
		
		Coche miCoche = new Coche("Peugeot", "307");
		System.out.println(miCoche);


		// Accediendo a los datos de la anotaci�n del m�todo.

		Autor a1 = miCoche.getClass().getMethod("acelerar").getAnnotation(Autor.class);
		System.out.println("Nombre Autor " + a1.nombre());
		System.out.println("Direccion Autor " + a1.direccion());
		
	/*La expresi�n miCoche.getClass() devuelve un objeto de tipo Class que provee informaci�n
	 * sobre la clase a la que pertenece el objeto. De esta forma, estamos tambi�n obteniendo
	 * informaci�n sobre el m�todo acelerar() usando la expresi�n getMethod("acelerar").
	 * Concretamente, estamos accediendo a los datos de la anotaci�n.*/	
		

		// Accediendo a los datos de la anotaci�n de la clase.
		Autor a2 = miCoche.getClass().getAnnotation(Autor.class);
		/*Aqu� estamos accediendo a los datos de la anotaci�n de la clase.*/
		System.out.println("Nombre autor: " + a2.nombre());
		System.out.println("Direcci�n autor: " + a2.direccion());

	}

}
