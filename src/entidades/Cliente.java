package entidades;

public class Cliente {
	
	private int id;
	private String nombre;

	public Cliente(){
		this(0,""); 
	}

	public Cliente(int id, String nombre){
		super(); 
		setId(id);
		setNombre(nombre);
	}
	
	public int getId(){
		return this.id;  
	}
	
	public void setId(int id){
		this.id = id;  
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return 
				"Cliente [ Id()=" + getId() + 
				", Nombre()=" + getNombre() + 
				"]";
	}
}//fin class entidades.Cliente
