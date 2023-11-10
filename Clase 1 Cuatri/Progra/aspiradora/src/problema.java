import java.util.Scanner;


public class problema {
	
	// DECLARACIÓN VARIABLES
	
	static int[] minasI = new int[5];
	
	static int[] minasJ = new int[5];
	
	static int explosionesMina = 0;
	
	static int aciertos = 0;
	
	static int ganar = 0;
	
	static int filaElegida;
	
	static int columnaElegida;

	static Scanner entrada = new Scanner(System.in);
	
	static String[][] tablero = new String[5][7];
	
	// MAIN
	
	public static void main(String[] args) {
		
		int encontrado;
		
		rellenarTablero();
		
		generarMinas();
		
		do {
			
			encontrado = 0;
			
			mostrarTablero();
			
			System.out.println("Ingrese la fila: ");
			
			filaElegida = entrada.nextInt();
			
			System.out.println("Ingrese la columna: ");
			
			columnaElegida = entrada.nextInt();	
			
			filaElegida--;
			columnaElegida--;
			
			for(int i=0;i<5;i++) {
				
				if(filaElegida == minasI[i] && columnaElegida == minasJ[i]) {
					
					encontrado = 1;
					
				}
				
			}
			
			if(encontrado==1) {
				
				tablero[filaElegida][columnaElegida] = "X";
				
				explosionesMina++;
				
				System.out.println("Has encontrado una mina.");
				
			}else if(encontrado==0) {
				
				tablero[filaElegida][columnaElegida] = "O";
				
				System.out.println("Bien!, en esta posición no hay mina.");
				
				aciertos++;
				
			}
			
			if(aciertos==30) {
				
				ganar = 1;
				
				break;
				
			}
			
			
		}while(explosionesMina<3);

		if(ganar==1) {
			
			System.out.println("Has ganado!");
			
		}else {
			
			System.out.println("Has perdido :(");
			
		}
		
	}

	public static void generarMinas() {
		
		int minaRandomI;
		int minaRandomJ;
		
		for(int i=0;i<5;i++) {
			
			
			minaRandomI = (int) Math.round(Math.random()*4);
			
			minaRandomJ = (int) Math.round(Math.random()*6);
			
			// COMPROBAR QUE NO EXISTA UNA MINA EN ESA POSICIÓN SINO GENERAR OTRA
			
			minasI[i] = minaRandomI;
			
			minasJ[i] = minaRandomJ;
			
			
		}
		
		
	}

	// MÉTODOS
	
	public static void mostrarTablero() {
		
		System.out.println("===========================================================\n");
		
		System.out.println("	1	2	3	4	5	6	7\n");
		
		for(int i=0;i<5;i++) {
			
			System.out.print((i+1)+"\t");
			
			for(int j=0;j<7;j++) {
			
			System.out.print(tablero[i][j]+"\t");
			
			
			}
			
		System.out.println("\n");
			
		}
		
		System.out.println("===========================================================\n");
		
		System.out.println("Explosiones: "+explosionesMina);
		
		
	}

	public static void rellenarTablero() {
		
		for(int i=0;i<5;i++) {
		
			for(int j=0;j<7;j++) {
				
			tablero[i][j] = "-";
			
			}
			
		
		}
			
			
		
	}
	
	
}
