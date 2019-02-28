package Ejemplo1;
import java.io.Serializable;
import java.util.ArrayList;

public class Alumno implements Serializable {
	/*Si una clase implementa la interfaz Serializable, los objetos que pertenecen
	 * a dicha clase podrán ser grabados en disco y recuperados las veces que sea 
	 * necesario, incluso en distintos programas.*/
	
	private static final long serialVersionUID = 1742837368213302555L;
	
	private String nombre;
	private int edad;
	private ArrayList<Calificacion> calificaciones;
	
	public Alumno(String nombre,int edad) {
		this.nombre = nombre;
		this.edad = edad;
		this.calificaciones= new ArrayList<Calificacion>();
	}
	
	public void calificar(String asignatura, int nota) {
		this.calificaciones.add(new Calificacion(asignatura,nota));
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public ArrayList<Calificacion> getCalificaciones(){
		return calificaciones;
	}


}
