package LecturaBinario;

public class Producto {
	
	private String nombre;
	private float precio;
	private float unidadesEnExistencia;
	
	public Producto(String nombre, float precio, float unidadesEnExistencia) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.unidadesEnExistencia = unidadesEnExistencia;
	}

	public String getNombre() {
		return nombre;
	}

	public float getPrecio() {
		return precio;
	}

	public float getUnidadesEnExistencia() {
		return unidadesEnExistencia;
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precio=" + precio + ", unidadesEnExistencia=" + unidadesEnExistencia
				+ "]";
	}
	
	
	
	
	
	

}
