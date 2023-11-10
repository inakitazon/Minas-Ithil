import java.util.Scanner;


public class buscaMinas {
	
	// DECLARACIÓN VARIABLES
	
	static int[] alumnosI = new int[5];
	
	static int[] alumnosJ = new int[5];
	
	static int alumnosA = 0;
	
	static int alumnosC = 0;
	
	static int seguir = 0;
	
	static int filaElegida;
	
	static int columnaElegida;

	static Scanner entrada = new Scanner(System.in);
	
	static String[][] tablero = new String[6][8];
	
	// MAIN
	
	public static void main(String[] args) {
		
		int encontrado;
		
		rellenarTablero();
		
		
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
				
				if(filaElegida == alumnosI[i] && columnaElegida == alumnosJ[i]) {
					
					encontrado = 1;
					
				}
				
			}
			
			
			
			if(alumnosC==48) {
				
				seguir = 1;
				
				break;
				
			}
			
			
		}while(alumnosC<48);

		
		
	}

	
		
		
	

	// Metodos
	
	public static void mostrarTablero() {
		
		System.out.println("===========================================================\n");
		
		System.out.println("	1	2	3	4	5	6	7       8\n");
		
		for(int i=0;i<6;i++) {
			
			System.out.print((i+1)+"\t");
			
			for(int j=0;j<8;j++) {
			
			System.out.print(tablero[i][j]+"\t");
			
			
			}
			
		System.out.println("\n");
			
		}
		
		System.out.println("===========================================================\n");
		
		System.out.println("Alumnos: "+alumnosA);
		
		
	}

	public static void rellenarTablero() {
		
		for(int i=0;i<6;i++) {
		
			for(int j=0;j<8;j++) {
				
			tablero[i][j] = "-";
			
			}
			
		
		}
			
			
		
	}
	{
	
	if(alumnosA==48) {
		System.out.println("Aula al completo");
	}
	
	
}
}


