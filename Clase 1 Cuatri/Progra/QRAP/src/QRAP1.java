
import java.util.Scanner;

public class QRAP1 {


	static int numAlumnoEntran;

	static int alumnosTotales = 48;

	static Scanner entrada = new Scanner(System.in);

	//static String alumnos;

	static int alumnosEnClase = 0;

	static String[][] aula  = new String[6][8];

	// MAIN

	public static void main(String[] args) {

		rellenarAula();
		mostrarAula();

		do {

			System.out.println("Alumnos que entran o salen del Aula: ");
			int aux = entrada.nextInt();

			if (aux > 0 ) {
				ocuparButacas(aux);

			}
			else if(aux < 0) {
				vaciarButacas(aux);
			}

			mostrarAula();


		}while(alumnosEnClase<48);

		System.out.println();
		System.out.println("+==============+");

		System.out.println(" CLASE AL COMPLETO ");

		System.out.println("+==============+");







	}

	private static void mostrarAula() {

		System.out.println("+==========================================================+");

		System.out.println(" Alumnos en clase: "+alumnosEnClase);

		System.out.println("+==========================================================+");

		for(int i=0;i<aula.length;i++) {

			for(int j=0;j<aula[0].length;j++) {


				System.out.print(aula[i][j]+"\t");



			}

			System.out.println("\n");

		}

		System.out.println("+==========================================================+");

		//System.out.println("Ingresa los alumnos que llegan o se van: ");

		//alumnos = entrada.next();

	}

	private static void rellenarAula() {

		for(int i=0;i<6;i++) {

			for(int j=0;j<8;j++) {

				aula[i][j] = " .";

			}


		}

	}

	public static void ocuparButacas(int butacas) {

		int anadidos = 0;

		//Recorre el aula desde el principio hasta el final
		//hasta que encuentra la primera silla vacia
		for (int f=0; f<6; f++) {
			for (int c=0; c<8; c++) {

				String silla = aula[f][c];

				if (anadidos == butacas) {
					break;
				}

				if (silla.equalsIgnoreCase(" .")) {
					aula[f][c]=" X";
					alumnosEnClase++;
					anadidos++;
				} 
			}	
		}

	}

	public static void vaciarButacas(int butacas) {

		int eliminados = 0;

		//Recorre el aula desde el final hacia el principio
		//hasta que encuentra la última silla ocupada
		for (int f=5; f>=0; f--) {
			for (int c=7; c>=0; c--) {
				String silla = aula[f][c];
				if (eliminados == (butacas*-1)) {
					break;
				}

				if (silla.equalsIgnoreCase(" X")) {
					aula[f][c]=" .";
					alumnosEnClase--;
					eliminados++;

				} 
			}	
		}

	}


}

