
/**
 * Clase que representa un cliente registrado en la tienda.
 * Por cada cliente se almacena solo su nombre y dni (que lo identifica).
 * 
 * @author 
 * @version 
 *
 */
public class ClienteNormal extends Cliente {

	
	/**
	 * Constructor de la clase Cliente.
	 * @param nombre Nombre del cliente.
	 * @param dni DNI del cliente.
	 */
	public ClienteNormal(String nombre, String dni) {
		super(nombre,dni);
	}

	/**
	 * Retorna el nombre del cliente.
	 * @return Nombre del cliente.
	 */
	public String getNombre() {
		return super.getNombre();
	}

	/**
	 * Retorna el dni del cliente.
	 * @return DNI del cliente.
	 */
	public String getDni() {
		return super.getDni();
	}
	



}
