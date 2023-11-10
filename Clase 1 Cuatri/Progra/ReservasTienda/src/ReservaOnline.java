
public class ReservaOnline extends Reserva{
	private String direccion;
	private double gastosEnvio;
	
	/**
	 * Constructor de la reserva.
	 * @param unidades unidades reservadas.
	 * @param cliente cliente que realiza la reserva.
	 */
	public ReservaOnline(int unidades, Cliente cliente,String direccion, double gastosEnvio) {
		super(unidades,cliente);
		this.direccion = direccion;
		this.gastosEnvio = gastosEnvio;
	}
	
	/**
	 * Retorna el numero de unidades reservadas.
	 * @return numero de unidades reservadas.
	 */
	public int getUnidades() {
		return super.getUnidades();
	}

	/**
	 * Retorna el cliente que ha realizado la reserva.
	 * @return cliente que ha realizado la reserva.
	 */
	public Cliente getCliente() {
		return super.getCliente();
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public double getGastosEnvio() {
		return gastosEnvio;
	}

	public void setGastosEnvio(double gastosEnvio) {
		this.gastosEnvio = gastosEnvio;
	}
	
	
	
	

}
