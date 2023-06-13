import java.util.Scanner;

public class Codigo_1 {

	public static void main(String[] args){

		Scanner entrada = new Scanner(System.in);

		String[][] mapa = new String [4][4];

		// x = Filas de la matriz y = Columnas de la matriz

		int x;
		int y;
		int turnos = 1;

		// Rellenamos el Array

		for(int i=0;i<=3;i++){ 
			for(int j=0;j<=3;j++){ 

				if(i==0 || i==3 || j==0 || j==3){

					mapa[i][j] = " ";   

				}else {

					mapa[i][j] = " ";

				}

			}

		}


		int random1 = (int) (Math.random()*2+4); 
		int random2 = (int) (Math.random()*2+4); 
		mapa[random1][random2] = "C";

		x = random1;
		y = random2;


		String tecla;


		System.out.println("                              Carrera ");
		System.out.println("---+-----------+---------+---------+---------+---------+-----------+");
		System.out.println("---| 0.........1.........2.........3.........4.........5.........6 |");
		System.out.println("---| 0123456789012345678901234567890123456789012345678901234567890 |");


		for(int i=0;i<=3;i++){
			for(int j=0;j<=3;j++){


				System.out.print(mapa[i][j]+"\t");


			}

			System.out.println("\n");

		}
		System.out.println("---+-----------+---------+---------+---------+---------+-----------+");
		System.out.println("Turno: " +turnos);


		do{

			turnos = turnos + 1;

			System.out.print("¿A que agujero quieres ir?--> ");

			tecla = entrada.next();

			if(tecla.equalsIgnoreCase("1")){


				System.out.println("\n");

				if(y<=1){

					System.out.println("!Tu camello se sale de la pista!");

				}else{


					mapa[x][y] = "";
					mapa[x][y+1] = ";--;'";
					y = y+1;


				}  

			}

			if(tecla.equalsIgnoreCase("2")){


				System.out.println("\n");

				if(y>=8){

					System.out.println("!Tu camello se sale de la pista!");

				}else{


					mapa[x][y] = " ";
					mapa[x][y+1] = ";--;'";
					y = y+1;


				}  



			}

			if(tecla.equalsIgnoreCase("3")){

				System.out.println("\n");

				if(x<=1){

					System.out.println("!Tu camello se sale de la pista!");

				}else{


					mapa[x][y] = " ";
					mapa[x][y+1] = ";--;'";
					x = y+1;


				}  

			}  





			if(tecla.equalsIgnoreCase("4")){


				System.out.println("\n");

				if(x>=8){

					System.out.println("!Tu camello se sale de la pista!");

				}else{


					mapa[x][y] = " ";
					mapa[x][y+1] = ";--;'";
					x = y+1;


				}


			}


			


				
			


			}


			System.out.println("                              CARRERA ");
			System.out.println("---+-----------+---------+---------+---------+---------+-----------+");
			System.out.println("---| 0.........1.........2.........3.........4.........5.........6 |");
			System.out.println("---| 0123456789012345678901234567890123456789012345678901234567890 |");



			for(int i=0;i<=9;i++){
				for(int j=0;j<=9;j++){


					System.out.print(mapa[i][j]+"\t");


				}

				System.out.println("\n");

			}
			System.out.println("---+-----------+---------+---------+---------+---------+-----------+");
			System.out.println("Turno: "+turnos);
			


		





	}
}

	
	
	

