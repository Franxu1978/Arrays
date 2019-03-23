
import java.io.Serializable;
import java.util.ArrayList;

public class Coches implements Serializable {
	private static final long serialVersionUID = 1324774912528254307L;
	private  ArrayList<Coche> coches = new ArrayList<Coche>();

	public Coches() {
		this.coches = new ArrayList<Coche>();
	}

	public ArrayList<Coche> getCoches() {
		return  coches;
	}
	
	
}	