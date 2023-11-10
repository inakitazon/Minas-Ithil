
/**
 * Clase que representa un cliente registrado en la tienda.
 * Por cada cliente se almacena solo su nombre y dni (que lo identifica).
 * 
 * @author 
 * @version 
 *
 */
public abstract class Cliente {

	private final String nombre;
	private final String dni;
	
	/**
	 * Constructor de la clase Cliente.
	 * @param nombre Nombre del cliente.
	 * @param dni DNI del cliente.
	 */
	public Cliente(String nombre, String dni) {
		super();
		this.nombre = nombre;
		this.dni = dni; 
	}

	/**
	 * Retorna el nombre del cliente.
	 * @return Nombre del cliente.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Retorna el dni del cliente.
	 * @return DNI del cliente.
	 */
	public String getDni() {
		return dni;
	}
	
	public double getDescuento() {
		return 0.0;
	}


}
