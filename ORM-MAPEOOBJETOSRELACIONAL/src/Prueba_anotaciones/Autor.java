package Prueba_anotaciones;
import java.lang.annotation.*;

/*La anotaci�n @Retention(RetentionPolicy.RUNTIME) permite que la anotaci�n
 *@Autor est� disponible en tiempo de ejecuci�n.*/

	@Retention(RetentionPolicy.RUNTIME)
	public @interface Autor {
		String nombre() default "Francisco";
		String direccion() default "C/Fanzara n4";

	}

