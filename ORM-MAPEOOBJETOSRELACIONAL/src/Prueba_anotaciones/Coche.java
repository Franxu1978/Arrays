package Prueba_anotaciones;
import Prueba_anotaciones.Autor;

public class Coche {
	
	private String marca;
	private String modelo;
	private int velocidad;

	
	public Coche(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
		this.velocidad=0;
		
	}
/*Hemos anotado la nueva clase Coche sin especificar ning�n valor para los atributos
 * nombre y direcci�n, por lo tanto, habr� tomado los valores predeterminados "Francisco" 
 * y "C/ Fanzara".*/

	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public int getVelocidad() {
		return velocidad;
	}


	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	
/*  El m�todo acelerar() ha sido anotado especificando el valor "M� Jose Alanzaves"
 *  para el atributo nombre y "Avda Cortes 12" para el atributo direccion. */
	
	@Autor(nombre="M� Jose Alanzaves", direccion="Avda Cortes 12")
	public void acelerar() {
		this.velocidad = this.velocidad + 50;
	}


	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", modelo=" + modelo + ", velocidad=" + velocidad + "]";
	}
	
	
	
}
