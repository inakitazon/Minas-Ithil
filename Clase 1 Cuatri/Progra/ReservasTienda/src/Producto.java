
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Clase que representa un producto ofertado por la tienda.
 * Todo producto se identifica por un codigo numerico que se asigna
 * automaticamente en su creacion.
 * Un producto puede tener una serie de reservas, de manera, que cuando
 * se actualice el stock del producto, sea utilizado para suplir dichas 
 * reservas (en orden de antiguedad).
 * 
 * @author 
 * @version 
 *
 */
public class Producto {

	private final int id;
	private final String descripcion;
	private int unidadesStock = 0;
	private double precioUnidad;

	// para generar un codigo diferente para cada producto
	private static int contadorProductos = 0;

	// cola con las reservas para el producto
	private Queue<Reserva> reservas = new LinkedList<Reserva>();

	/**
	 * Constructor del producto. Asigna un identificador unico
	 * a cada producto.
	 * @param descripcion descripcion del producto.
	 * @param stockInicial numero de unidades disponibles del producto.
	 */
	public Producto(String descripcion, int stockInicial, double precioUnidad) {
		this.unidadesStock = stockInicial;
		this.descripcion = descripcion;
		this.precioUnidad = precioUnidad;
		id = generaCodigoProducto();
		
	}
	/**
	 * 
	 * @return
	 */
	public double getPrecioUnidad() {
		return precioUnidad;
	}
	
	

	public void setPrecioUnidad(double precioUnidad) {
		this.precioUnidad = precioUnidad;
	}
	/**
	 * Simula la generacion de un codigo diferente para cada producto.
	 * @return codigo generado.
	 */
	private static int generaCodigoProducto() {
		contadorProductos++;
		return contadorProductos;
	}

	/**
	 * Retorna el identificador del producto.
	 * @return identificador del producto.
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * Retorna la descripcion del producto.
	 * @return descripcion del producto.
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * Retorna el numero de unidades disponibles del producto.
	 * @return numero de unidades disponibles del producto.
	 */
	public int getUnidadesStock() {
		return unidadesStock;
	}

	
	/**
	 * Actualiza el stock del producto en la cantidad indicada, 
	 * que puede ser negativa o positiva.
	 * @param cantidad numero de unidades que se anhaden/eliminan.
	 * @return lista de reservas cubiertas con el nuevo stock.
	 */
	public List<Reserva> actualizaStock(int cantidad) {
		unidadesStock = unidadesStock + cantidad;

		List<Reserva> reservasCubiertas = new LinkedList<Reserva>();
		if (reservas.size() > 0) {
			while (reservas.size() != 0 && reservas.peek().getUnidades() <= unidadesStock) {
				Reserva r = reservas.poll();
				reservasCubiertas.add(r);
				unidadesStock -= r.getUnidades();
			}
		}
		return reservasCubiertas;
	}

	/** 
	 * Almacena una nueva reserva para el producto.
	 * @param r reserva a almacenar.
	 */
	public void anhadeReserva(Reserva r) {
		reservas.add(r);
	}
	
	/**
	 * Indica si el producto tiene alguna reserva pendiente de cubrir.
	 * @return verdadero si el producto tiene alguna reserva pendiente de cubrir.
	 */
	public boolean reservasPendientes() {
		return (reservas.size()>0);
	}
	
	/**
	 * Retorna el total de unidades reservadas.
	 * @return numero total de unidades del producto reservadas.
	 */
	public int unidadesReservadas() {
		int contador = 0;
		for (Reserva r:reservas) {
			contador = contador+ r.getUnidades();
		}
		return contador;
	}
	
	/**
	 * 
	 */
	public Reserva buscarReserva(int unidades, Cliente cliente) {
		
		for (Reserva r:reservas) {
			if(r.getUnidades() == unidades && r.getCliente() == cliente) {
				return r;
			}
					
		}
		return null;
	}
}
