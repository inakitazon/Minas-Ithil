
public class Truck extends Vehiculo{
	private Remolque remolque;

	public Truck(String matricula) {
		super(matricula);
		this.remolque = null;
	}
	
	public void ponRemolque(Remolque rem) {
		this.remolque = rem;
	}
	
	public void quitarRemolque() {
		this.remolque = null;
	}
	
	@Override
	public void accelerate(double vel) throws TooFastException {
		if(this.remolque != null && super.velocity > 100.0) {
			throw new TooFastException();
		}
		super.velocity += vel;
		
	}
	
	
	@Override
	public void muestraDatros() {
		if(this.remolque == null){
			System.out.println("Matrícula: " + super.licensePlate + ". Velocidad: " + super.velocity);
		} else {
			System.out.println("Matrícula: " + super.licensePlate + ". Velocidad: " + super.velocity + ". Remolque: " + this.remolque.getPeso());
		}
	}
	
	
	

}
