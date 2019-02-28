

import java.io.*;
public class Calificacion implements Serializable {
	
	
	private static final long serialVersionUID = 8290051850359753291L;
	
	private String asignatura;
	private int nota;

	public Calificacion(String asignatura, int nota) {
		this.asignatura = asignatura;
		this.nota=nota;
		
	}

	@Override
	public String toString() {
		return "Calificacion [asignatura=" + asignatura + ", nota=" + nota + "]";
	}
	
	

}
