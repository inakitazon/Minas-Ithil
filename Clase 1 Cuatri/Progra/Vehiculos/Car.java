
public class Car extends Vehiculo{
	private int doors;

	public Car(String matricula, int puertas) {
		super(matricula);
		this.doors = puertas;
		
	}

	@Override
	public void accelerate(double vel) {
		this.velocity += vel;
	}
	
	@Override
	public void muestraDatros() {
		// TODO Auto-generated method stub
		System.out.println("Matrícula: " + super.licensePlate + ". Velocidad: " + super.velocity + " km/h. Num Puertas: " + this.doors);
	}
	
	
	

}
