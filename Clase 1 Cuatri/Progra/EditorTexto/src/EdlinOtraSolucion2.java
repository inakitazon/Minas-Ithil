import java.util.Scanner;


public class EdlinOtraSolucion2 {
	
	static String opcionElegida;
	
	static Scanner entrada = new Scanner (System.in);
	
	static int lineaActiva = 0;
	
	static String[] documento = {
			
			"Editor de Texto.",
			"----------------",
			"Utiliza las opciones de la barra inferior.",
			"",
			"",
			"",
			"",
			"",
			"",
			""
	};
	
	public static void main(String[] args) {
		
	// Hacemos un bucle para imprimir el documento.
		
		do{
			
			imprimeDocumento();	
			imprimeOpciones();
			opcionElegida = entrada.next();
			
			if(opcionElegida.equalsIgnoreCase("L")) {
				
				System.out.print("Elige la nueva línea activa: ");
				
				
				int lineaElegida = entrada.nextInt();
				
				lineaActiva = lineaElegida;
				
				
			}
			
			else if(opcionElegida.equalsIgnoreCase("E")) {
				
				System.out.print("Edita la línea a tu gusto: ");
				
				String textoAEscribir = entrada.next();
				
				documento[lineaActiva] = textoAEscribir;
				
				
			}
			
			else if(opcionElegida.equalsIgnoreCase("B")) {
				
				documento[lineaActiva] = "";
				
			}
			
			else if(opcionElegida.equalsIgnoreCase("I")) {
				
				System.out.println("Elige la primera línea a intercambiar");
				
				int lineaIntercambiar1 = entrada.nextInt();
				
				System.out.println("Elige la segunda línea a intercambiar");
				
				int lineaIntercambiar2 = entrada.nextInt();	
				
				String temporal = documento[lineaIntercambiar1];
				
				documento[lineaIntercambiar1] = documento[lineaIntercambiar2];
				
				documento[lineaIntercambiar2] = temporal;
				
				
				
			}
			
		}while(!opcionElegida.equalsIgnoreCase("S"));			
		
		
	}

	public static void imprimeOpciones() {
		
		
		System.out.println("Opciones: [L]:Linea activa / [E]: Editar / [B]:Borrar / [I]:Intercambiar / [S]:Salir");
		System.out.print("Introduce una opción: ");
		
	}

	// Imprimimos el documento para que se muestre por pantalla
	
	public static void imprimeDocumento() {
		
		System.out.println();
		
		for(int i=0;i<documento.length;i++) {
			
			if(lineaActiva == i) {
				
				System.out.println(i+"> | "+documento[i]); 
				
			}else {
				
				System.out.println(i+"  | "+documento[i]); 
				
			}
		
		}
		
		System.out.println();
		
	}

	
	
	
}
