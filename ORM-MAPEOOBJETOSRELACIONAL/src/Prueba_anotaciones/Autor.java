package Prueba_anotaciones;
import java.lang.annotation.*;

/*La anotación @Retention(RetentionPolicy.RUNTIME) permite que la anotación
 *@Autor esté disponible en tiempo de ejecución.*/

	@Retention(RetentionPolicy.RUNTIME)
	public @interface Autor {
		String nombre() default "Francisco";
		String direccion() default "C/Fanzara n4";

	}

