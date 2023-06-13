import junit.framework.TestCase;
import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.Map;

import org.junit.Test;

public class TestReservasTienda{

	Tienda tienda = new Tienda();
	@Test
	public void anadirProducto() {
		
		Producto producto = new Producto("Cuaderno",5,5.00);
		tienda.anhadeProducto(producto);
		
		//Comprueba que el producto ha sido añadido 
		assertTrue(tienda.productos.containsKey(producto.getId()));
	}
	@Test
	public void anadirCliente() {

		ClientePremium cliente = new ClientePremium("Iñaki","12345678A",0.15);
		tienda.anhadeCliente(cliente);
		
		//Comrpueba que el cliente ha sido añadido
		assertTrue(tienda.buscaCliente(cliente.getDni()) == cliente);
	}
	
	@Test
	public void mostrarProductos() {
		
		//Productos que se desean añadir
		Producto producto1 = new Producto("Producto1",1,5.00);
		Producto producto2 = new Producto("Producto2",2,5.00);
		Producto producto3 = new Producto("Producto3",3,5.00);
		Producto producto4 = new Producto("Producto4",4,5.00);
		
		//Productos añadidos a la tienda
		tienda.anhadeProducto(producto1);
		tienda.anhadeProducto(producto2);
		tienda.anhadeProducto(producto3);
		tienda.anhadeProducto(producto4);
		
		//Listado de productos que debería mostrar
		String listadoCorrecto = "Código: " +producto1.getId() + " Producto: " + producto1.getDescripcion() + 
				" Unidades: " + producto1.getUnidadesStock() + " Precio: " + producto1.getPrecioUnidad() + "\n" + 
				"Código: " +producto2.getId() + " Producto: " + producto2.getDescripcion() + 
				" Unidades: " + producto2.getUnidadesStock() + " Precio: " + producto2.getPrecioUnidad() + "\n" +
				"Código: " +producto3.getId() + " Producto: " + producto3.getDescripcion() + 
				" Unidades: " + producto3.getUnidadesStock() + " Precio: " + producto3.getPrecioUnidad() + "\n"+
				"Código: " +producto4.getId() + " Producto: " + producto4.getDescripcion() + 
				" Unidades: " + producto4.getUnidadesStock() + " Precio: " + producto4.getPrecioUnidad() + "\n";
		
		//Comrpueba que el listado de productos es correcto
		assertTrue(tienda.mostrarProductos().equals(listadoCorrecto));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
