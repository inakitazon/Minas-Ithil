import java.util.ArrayList;

/**
 * Proveedor de la tienda que envía productos de ropa
 * @author
 *
 */
public class ProveedorRopa implements Proveedor {
	
	Tienda tienda;

	@Override
	public ArrayList<Producto> enviarProductos() {
		Producto pantalon = new Producto("Pantalón",2,15.00);
		Producto camisa = new Producto("Camisa",2,12.00);
		Producto zapatos = new Producto("Zapatos",2,35.00);
		Producto abrigo = new Producto("Abrigo",2,50.00);
		
		ArrayList<Producto>envio = new ArrayList<Producto>();
		envio.add(pantalon);
		envio.add(camisa);
		envio.add(zapatos);
		envio.add(abrigo);
		
		return envio;
	}

}
