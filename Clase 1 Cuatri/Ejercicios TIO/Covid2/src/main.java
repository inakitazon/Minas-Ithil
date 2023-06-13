import java.util.Scanner;


public class main {

	static String[][] colegio = new String [13][13];

	static int alumnosAInfectar = 2;

	static int alumnosInfectadosTotales = alumnosAInfectar;

	static int alumnosTotales = colegio.length*colegio[0].length;

	static int alumnosSinInfectar;

	static int dia = 0;

	static Scanner entrada = new Scanner(System.in);

	static String opcion;

	static int alumnosInfectadosHoy;


	public static void main(String[] args) {

		rellenarClase();
		infectarAlumnos(alumnosAInfectar);
		mostrarClase();


		do{

			propagarEnfermedad();
			mostrarClase();



		}while(!opcion.equalsIgnoreCase("N") && alumnosInfectadosTotales<alumnosTotales);

		if(alumnosInfectadosTotales==alumnosTotales) {

			System.out.println("Toda la clase se ha infectado.");

		}else {


			System.out.println("Se ha detenido la propagaci n.");


		}




	}



	private static void propagarEnfermedad() {

		alumnosInfectadosHoy = 0;

		int probabilidad;

		System.out.println("La enfermedad intenta propagarse.");

		for(int i=0;i<colegio.length;i++) {

			for(int j=0;j<colegio[0].length;j++) {

				if(!colegio[i][j].equalsIgnoreCase("'.'")) {


					for(int k=i-1;k<=i+1;k++) {

						for(int l=j-1;l<=j+1;l++) {

							if(l>=0 && k>=0 && l<colegio.length && k<colegio[0].length) {

								if(k!=i && l!=j) {

									if(colegio[k][l].equalsIgnoreCase("'.'")) {
										
										probabilidad = (int) Math.round(Math.random()*100);

										if(probabilidad<15) {

											colegio[k][l] = "[*.*]";

											System.out.println("Alumno infectado - X: "+k+" Y: "+l);

											alumnosInfectadosHoy++;

										}


									}


								}




							} 



						}



					} 


				}

			}



		}

		alumnosInfectadosTotales = alumnosInfectadosTotales + alumnosInfectadosHoy;

	}



	private static void mostrarClase() {

		alumnosSinInfectar = alumnosTotales-alumnosInfectadosTotales;

		dia++;

		System.out.println("\nD a: "+dia+"\n");


		for(int i=0;i<colegio.length;i++) {

			for(int j=0;j<colegio[0].length;j++) {


				System.out.print(colegio[i][j]+"\t");



			}

			System.out.println("\n");

		}

		System.out.println("Alumnos infectados Totales: "+alumnosInfectadosTotales+"	|\tAlumnos totales: "+alumnosTotales+"		|  	Alumnos sin infectar: "+alumnosSinInfectar+"	|	Alumnos infectados hoy: "+alumnosInfectadosHoy);

		System.out.print("Deseas avanzar un d a? (S/N): ");

		opcion = entrada.next();

	}



	private static void infectarAlumnos(int alumnosAInfectarX) {

		int randomFila;
		int randomColumna;


		for(int i=0;i<alumnosAInfectar;i++) {


			randomFila = (int) Math.round(Math.random()*12);
			randomColumna = (int) Math.round(Math.random()*12);

			colegio[randomFila][randomColumna] = "[*.*]";


		}


	}



	private static void rellenarClase() {

		for(int i=0;i<colegio.length;i++) {

			for(int j=0;j<colegio[0].length;j++) {


				colegio[i][j] = "'.'";




			}


		}


	}



}