
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JavaBeans Llamada1 = new JavaBeans(); // Creamos el objeto Llamada1
		Llamada1.setEmisor("Francisco Alanzaves"); // introducimos con setEmisor el emisor
		Llamada1.setMotivo("Aprender Java");// introducimos con setMotivo el motivo de llamar.
		
		System.out.println(Llamada1); // Invoca al método toString();

	}

}
