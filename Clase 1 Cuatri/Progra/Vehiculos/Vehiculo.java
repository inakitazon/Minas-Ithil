
public abstract class Vehiculo {
	public String licensePlate;
	public double velocity;
	
	public Vehiculo(String matricula) {
		super();
		this.licensePlate = matricula;
		this.velocity = 0.0;
		
	}
	
	public abstract void muestraDatros();
	
	public double getVelocity() {
		return velocity;
	}
	public void setVelocity(double velocity) {
		this.velocity = velocity;
	}	
	
	public abstract void accelerate(double vel) throws TooFastException;

}
