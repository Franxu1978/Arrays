// Francisco Alanzaves
public class Pregunta {

	String tipo, pregunta,respuesta; // Strings 

	public Pregunta(String tipo, String pregunta, String respuesta) {
		// constructor
		super();
		this.tipo = tipo;
		this.pregunta = pregunta;
		this.respuesta = respuesta;
	}
	
	// Getter y Setters
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getPregunta() {
		return pregunta;
	}

	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}

	public String getRespuesta() {
		return respuesta;
	}

	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}
	

	@Override   // sobreescritura de toString.
	public String toString() {
		return "Pregunta [tipo=" + tipo + ", pregunta=" + pregunta + ", respuesta=" + respuesta + "]";
	}
	
	
}

