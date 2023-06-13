
/**
 * Clase que representa un cliente registrado en la tienda.
 * Por cada cliente se almacena solo su nombre y dni (que lo identifica).
 * 
 * @author 
 * @version 
 *
 */
public class ClientePremium extends Cliente {

	private double descuento;
	
	/**
	 * Constructor de la clase Cliente.
	 * @param nombre Nombre del cliente.
	 * @param dni DNI del cliente.
	 */
	public ClientePremium(String nombre, String dni, double descuento) {
		super(nombre,dni);
		this.descuento = descuento;
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

	@Override 
	public double getDescuento() {
		return descuento;
	}
	
	public void setDescuento(double desc) {
		this.descuento = desc;
	}



}
