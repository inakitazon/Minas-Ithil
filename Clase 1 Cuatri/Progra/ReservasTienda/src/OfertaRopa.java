/**
 * Interfaz de ofertas de la tienda en productos de ropa
 * @author
 *
 */

public class OfertaRopa implements Oferta{
	Tienda tienda;
	@Override
	public Producto seleccionarOferta(Producto p) {
		
		
		p.setPrecioUnidad(p.getPrecioUnidad()-(p.getPrecioUnidad()*0.1));
			
		return p;
		
	}

}
