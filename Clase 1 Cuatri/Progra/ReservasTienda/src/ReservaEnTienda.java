
public class ReservaEnTienda extends Reserva{


	/**
	 * Constructor de la reserva.
	 * @param unidades unidades reservadas.
	 * @param cliente cliente que realiza la reserva.
	 */
	public ReservaEnTienda(int unidades, Cliente cliente) {
		super(unidades,cliente);
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
}
