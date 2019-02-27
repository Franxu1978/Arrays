package EscrituraBinario;

import java.io.*;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Creamos 3 objetos productos
		Producto p1 = new Producto("Manzanas Royal Gala",2.50f,7f);
		Producto p2 = new Producto("Dátiles de la tía Julita",3.25f,12f);
		Producto p3 = new Producto("Mandarinas Clementinas",2.20f,25f);
		/*creamos tres objetos de la clase Producto con los datos que posteriormente guardaremos
		  en el fichero almacen.dat*/
		
		
		
		FileOutputStream fichero;
		DataOutputStream escritor;
		
		// Apertura del fichero Almacen.dat
		
		try {
			//Hemos creado un objeto de la clase FileOutputStream
			fichero = new FileOutputStream("Almacen.dat",true);
			/*La construcción del objeto FileOutputStream, que actúa como flujo de datos iniciador, nos ha
dejado el archivo almacen.dat abierto para escritura. Con el segundo argumento asignado a true
logramos que, si el fichero ya existe, agregue los nuevos datos sin sobrescribir lo anterior.*/
			
			//Hemos creado un objeto DataOutputStream.
			escritor = new DataOutputStream(fichero);
			/*Construimos el objeto DataOutputStream (filtro) pasando como argumento el nuevo objeto
FileOutputStream para proporcionar un sistema eficiente que permite guardar en disco datos de
tipo elemental. En nuestro caso guardaremos un texto en formato UTF y dos valores tipo float.*/
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("No se ha podido abrir el fichero Almacen.dat");
			System.out.println(e.getMessage());
			return;
		}
		// Escribir datos en el fichero almacen.dat
		try {
			//Escribimos registros con ayuda del objeto DataOutputStream (buffer)
			escritor.writeUTF(p1.getNombre());
			escritor.writeFloat(p1.getPrecio());
			escritor.writeFloat(p1.getUnidadesEnExistencia());
			
			escritor.writeUTF(p2.getNombre());
			escritor.writeFloat(p2.getPrecio());
			escritor.writeFloat(p2.getUnidadesEnExistencia());
			
			escritor.writeUTF(p3.getNombre());
			escritor.writeFloat(p3.getPrecio());
			escritor.writeFloat(p3.getUnidadesEnExistencia());
		} catch (IOException e) {
			System.out.println("Ha ocurrido un error al escribir datos en el fichero");
			System.out.println(e.getMessage());
		}
		
		try {
			
			/*Cerramos los dos flujos de datos (filtro e iniciador) cerrando de esta forma el fichero.*/
			escritor.close();
			fichero.close();
		} catch (IOException e) {
			System.out.println("Ha ocurrido un error al cerrar el fichero");
			System.out.println(e.getMessage());
		}


	}
	
	/*DataOutputStream proporciona un buffer que permite escribir datos de
tipo primitivo en un fichero (int, float, double, etc.) para lo cual utilizamos los siguientes
métodos:*/
	
	/*• writeBoolean(boolean valor): escribe un valor de tipo boolean en el fichero.
• writeByte(byte valor): escribe un valor de tipo byte en el fichero.
• writeBytes(String cadena): escribe cada uno de los bytes que forman parte de la
cadena especificada en el argumento.
• writeChar(int valor): escribe el carácter asociado al código pasado como argumento.
• writeChars(String cadena): escribe cada uno de los caracteres de la cadena.
• writeDouble(double valor): escribe un valor de tipo double.
• writeFloat(float valor): escribe un valor de tipo float.
• writeInt(int valor): escribe un valor de tipo int.
• writeLong(long valor): escribe un valor de tipo long.
• writeShort(int valor): escribe el valor del argumento y lo almacena como un short.
• writeUTF(String cadena): escribe la cadena en formato UTF.*/

}
