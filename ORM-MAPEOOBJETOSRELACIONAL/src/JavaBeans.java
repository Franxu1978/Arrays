import java.io.*;
import java.time.*;

////////////////////////////////////////////////////////////////////////////
/*cumple con la especificación JavaBeans porque es serializable, tiene un constructor
 * sin argumentos y sus métodos son privados y accesibles mediante métodos get/set,
 * generados cumpliendo la nomenclatura estándar.*/
////////////////////////////////////////////////////////////////////////////

public class JavaBeans implements Serializable {

	/*Para ser JavaBeans tiene que implementar seralizable*/
	private static final long serialVersionUID = 3811864998152735623L;
	
	private LocalDateTime fechaHora;
	private String emisor; // nombre de la persona que llamo
	private String motivo;// motivo de la llamada
	
	public JavaBeans() {
		this.fechaHora = LocalDateTime.now();
		
	}

	public LocalDateTime getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(LocalDateTime fechaHora) {
		this.fechaHora = fechaHora;
	}

	public String getEmisor() {
		return emisor;
	}

	public void setEmisor(String emisor) {
		this.emisor = emisor;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	@Override
	public String toString() {
		 return this.emisor + " llamo el " + this.fechaHora + " para " + this.motivo;
	}
	
	

}
