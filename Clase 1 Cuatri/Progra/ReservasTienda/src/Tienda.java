

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.swing.RowFilter.Entry;


/**
 * Clase que representa una tienda que oferta una serie de productos.
 * La clase gestiona el stock de cada producto y las reservas que los clientes
 * pueden realizar cuando el stock actual disponible de un producto no es 
 * suficiente para suplir su demanda. 
 * 
 * @author 
 * @version 
 *
 */
public class Tienda {

	// Stock de productos vendidos por la tienda
	public Map<Integer, Producto> productos = new TreeMap<Integer, Producto>();
	
	// Clientes de la tienda
	private ArrayList<Cliente> clientes = new ArrayList<Cliente>();

	/**
	 * Excepcion utilizada para indicar que un cliente ya esta
	 * registrado en la tienda
	 */
	@SuppressWarnings("serial")
	public class ClienteYaExiste extends RuntimeException {}
	/**
	 * Excepcion utilizada para indicar que un cliente no esta
	 * registrado en la tienda
	 */
	@SuppressWarnings("serial")
	public class ClienteNoExiste extends RuntimeException {}
	/**
	 * Excepcion utilizada para indicar que un producto no es ofertado
	 * por la tienda
	 */
	@SuppressWarnings("serial")
	public class ProductoNoExiste extends RuntimeException {}	
	
	/**
	 * Anhade un nuevo producto a la tienda.
	 * @param producto Producto.
	 * @return Identificador del producto.
	 */
	public int anhadeProducto(Producto producto) {
		productos.put(producto.getId(), producto); //
		return producto.getId();
	}

	/**
	 * Registra un nuevo cliente en la tienda.
	 * @param cliente Nuevo cliente.
	 * @throws ClienteYaExiste si ya existe un cliente con ese DNI.
	 */
	public void anhadeCliente(Cliente cliente) 
			throws ClienteYaExiste {
		if (buscaCliente(cliente.getDni()) != null) { 
			throw new ClienteYaExiste();
		}

		clientes.add(cliente);  
	}
	
	/**
	 * Busca un cliente en la lista de clientes de la tienda.
	 * @param cliente cliente que se desea buscar.
	 * @return true si lo ha encontrado o false en caso contrario
	 */
	public Cliente buscaCliente(String dni) throws ClienteNoExiste {
		
		for(Cliente cl: clientes) {
			if(cl.getDni().equals(dni)) {
				return cl;
			}
		}

		return null;
	}

	/**
	 * Actualiza el stock de un producto.
	 * @param idProducto Identificador del producto cuyo stock se actualiza.
	 * @param cantidad Numero de unidades en que se actualiza el stock.
	 * @return Lista de reservas del producto que se han suplido con el
	 * nuevo stock.
	 * @throws ProductoNoExiste Cuando idProducto no corresponde a ningun
	 * producto de la tienda.
	 */
	public List<Reserva> actualizaStock(int idProducto, int cantidad) throws ProductoNoExiste {
		Producto p = productos.get(idProducto); //
		
		if (p==null)
			throw new ProductoNoExiste();	
		List<Reserva> reservas = p.actualizaStock(cantidad); // O(numero de reservas cubiertas con el nuevo stock)	
		return reservas;
	}

	/**
	 * Realiza una venta de un producto.
	 * @param idProducto Identificador del producto cuyo stock se actualiza.
	 * @param dniCliente DNI del cliente que realiza la compra.
	 * @param cantidad Numero de unidades en que se actualiza el stock
	 * @return true si se ha realizado la venta (habia stock suficiente).
	 * 	       false si se ha generado una reserva (no habia stock suficiente).
	 * @throws ClienteNoExiste Cuando dniCliente no corresponde a ningun
	 * cliente registrado.
	 * @throws ProductoNoExiste Cuando idProducto no corresponde a ningun
	 * producto de la tienda.
	 */
	public boolean nuevaVenta(int idProducto, String dniCliente, int cantidad) 
			throws ClienteNoExiste, ProductoNoExiste {

		Producto p = productos.get(idProducto); // 
		if (p==null)
			throw new ProductoNoExiste();

		Cliente c = buscaCliente(dniCliente); // 
		if (c==null)
			throw new ClienteNoExiste();

		if (p.getUnidadesStock()>= cantidad) {
			// Realiza la venta
			p.actualizaStock(-cantidad);
			return true;
		} else {
			// Anhade reserva
			Reserva res = new ReservaEnTienda(cantidad, c);
			p.anhadeReserva(res); 
			return false;
		}	
	}
	
	/**
	 * Retorna una lista con aquellos productos que tienen reservas pendientes.
	 * @return Lista de productos con reservas.
	 */
	public List<Producto> productosConReserva() {
		List<Producto> prods = new LinkedList<Producto>();
		for (Producto p:productos.values()) {
			if (p.reservasPendientes()) {
				prods.add(p);
			}
		}
		return prods;
	}
	
	/**
	 * La tienda recibe una lista de productos provenientes de su proveedor.
	 * @return Lista de productos añadidos a la tienda
	 */
	public List<Producto> recibeProductos(Proveedor p){
		List<Producto> recibidos = new ArrayList<Producto>();
		recibidos = p.enviarProductos();
		
		for(Producto prod: recibidos){
			productos.put(prod.getId(), prod);
			
		}
		
		return recibidos;
	}
	
	/*
	 * Aplica una rebaja del 10% al producto indicado en la oferta
	 * @param Oferta o
	 * @parqam int codigoProducto 
	 */
	public void anadirOferta(Oferta o, int codigoProducto) {
		Producto p = productos.get(codigoProducto);
		o.seleccionarOferta(p);
				
	}
	
	/*
	 * Muestra el listado de todos los productos ofrecidos por la tienda
	 * @return String listadoProductos
	 */
	public String mostrarProductos() {
		Iterator<Map.Entry<Integer,Producto>> it = productos.entrySet().iterator();
		String listadoProductos = "";
		
		while(it.hasNext()) {
			
			Map.Entry<Integer,Producto> entrada = it.next();
			listadoProductos = listadoProductos + "Código: " +entrada.getKey() + " Producto: " + entrada.getValue().getDescripcion() + 
					" Unidades: " + entrada.getValue().getUnidadesStock() + " Precio: " + entrada.getValue().getPrecioUnidad() + "\n";
			
			
		}
		return listadoProductos;			
	}
	
}
