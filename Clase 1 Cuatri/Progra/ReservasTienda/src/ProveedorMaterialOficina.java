import java.util.ArrayList;

/**
 * Proveedor de la tienda que envía productos de oficina
 * @author
 *
 */
public class ProveedorMaterialOficina implements Proveedor {
	
	Tienda tienda;
	@Override
	public ArrayList<Producto> enviarProductos() {
		Producto boligrafo = new Producto("Bolígrafo",10,1);
		Producto folios = new Producto("Paquete Folios",2,12.00);
		Producto zapatos = new Producto("Zapatos",2,35.00);
		Producto abrigo = new Producto("Abrigo",2,50.00);
		
		ArrayList<Producto>envio = new ArrayList<Producto>();
		envio.add(boligrafo);
		envio.add(folios);
		envio.add(zapatos);
		envio.add(abrigo);
		
		return envio;
	}

}
