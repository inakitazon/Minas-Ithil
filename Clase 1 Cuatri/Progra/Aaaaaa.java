import java.util.Scanner;

public class PillaPillaConMasIACompleto100 {
public static void main(String[] args){

Scanner entrada = new Scanner(System.in);
    
String[][] mapa = new String [10][10];

// x = Filas de la matriz y = Columnas de la matriz

int x;
int y;
int xInicioIA = (int) (Math.random()*7+1);
int yInicioIA = (int) (Math.random()*7+1);
int xActualIA;
int yActualIA;
int xInicioIA2 = (int) (Math.random()*7+1);  //Doy un Random de 1 a 8 para que nunca caiga en muro (Posiciones 0,9 del mapa)
int yInicioIA2 = (int) (Math.random()*7+1);
int xActualIA2;
int yActualIA2;
int turnos = 1;

// Rellenamos el Array

for(int i=0;i<=9;i++){ 
    for(int j=0;j<=9;j++){ 
        
        if(i==0 || i==9 || j==0 || j==9){
        
          mapa[i][j] = "[]";   
        
        }else {
        
           mapa[i][j] = ".";
        
        }
       
    }
  
}

// Creamos el personaje

int random1 = (int) (Math.random()*2+4); // Esto genera un numero entre 4 y 5
int random2 = (int) (Math.random()*2+4); // Esto genera un numero entre 4 y 5

mapa[random1][random2] = "O";

x = random1;
y = random2;

// Pintamos las IA`s en su posición inicial.


if(xInicioIA == x){

xInicioIA = xInicioIA+1;

}
        
if(yInicioIA == y){

yInicioIA = yInicioIA+1;

}

mapa[xInicioIA][yInicioIA] = "X";

if(xInicioIA2 == x){

xInicioIA2 = xInicioIA2+1;

}
        
if(yInicioIA2 == y){

yInicioIA2 = yInicioIA2+1;

}

mapa[xInicioIA2][yInicioIA2] = "([X])";


// Esta seccion es para bucle de movimiento e impresión del mapa.
// Hacemos un bucle infinito para elegir el movimiento y volver a printar el mapa

String tecla;

// Establezco el turno y la posicion en la que se encuentran
    
    System.out.println("El jugador se encuentra en la posicion ["+(x+1)+"]["+(y+1)+"]\n");
    System.out.println("La IA se encuentra en la posicion ["+(xInicioIA+1)+"]["+(yInicioIA+1)+"]\n");
    System.out.println("La IA 2 se encuentra en la posicion ["+(xInicioIA2+1)+"]["+(yInicioIA2+1)+"]\n");

   
    System.out.println("                              TURNO "+turnos);
    System.out.println("--------------------------------------------------------------------------");
  
    // Imprimo el mapa una vez manualmente, el resto lo imprimo en el bucle do una vez por vuelta.

for(int i=0;i<=9;i++){
    for(int j=0;j<=9;j++){
    
        
        System.out.print(mapa[i][j]+"\t");
    
    
    }

    System.out.println("\n");

}
    System.out.println("--------------------------------------------------------------------------");
    
    xActualIA = xInicioIA;
    yActualIA = yInicioIA;
    xActualIA2 = xInicioIA2;
    yActualIA2 = yInicioIA2;
    
    
do{

    turnos = turnos + 1;
    
    System.out.print("Donde quieres moverte?: ");

    tecla = entrada.next();
    
    if(tecla.equalsIgnoreCase("a")){
    
    
        System.out.println("\n");
        
        if(y<=1){
        
            System.out.println("no te puedes mover mas");
        
        }else{
            
            
        mapa[x][y] = ".";
        mapa[x][y-1] = "O";
        y = y-1;
        
        
        }  
    
    }
    
    if(tecla.equalsIgnoreCase("d")){
    
    
        System.out.println("\n");
        
        if(y>=8){
        
        System.out.println("no te puedes mover mas");
        
        }else{
            
            
        mapa[x][y] = ".";
        mapa[x][y+1] = "O";
        y = y+1;
        
        
        }  
    

    
    }
    
    if(tecla.equalsIgnoreCase("w")){
        
        System.out.println("\n");

        if(x<=1){
        
        System.out.println("no te puedes mover mas");
        
        }else{
            
            
        mapa[x][y] = ".";
        mapa[x-1][y] = "O";
        x = x-1;
        
        
        }  
        
        }  

    
    
    
    
    if(tecla.equalsIgnoreCase("s")){
    
    
        System.out.println("\n");
    
        if(x>=8){
        
        System.out.println("no te puedes mover mas");
        
        }else{
            
            
        mapa[x][y] = ".";
        mapa[x+1][y] = "O";
        x = x+1;
        
        
        }
        
        
    }
    
    
    //Movimiento de la IA
    
    if(xActualIA<=1 || yActualIA<=1 || xActualIA>=8 || yActualIA>=8){
		
		// Forma para hacer que si esta a la derecha se mueva del muro 1 vez a la izquierda
		
		if(yActualIA==8){
			
			mapa[xActualIA][yActualIA] = ".";
			
			yActualIA = yActualIA - 1;
			
			mapa[xActualIA][yActualIA] = "X";
		}
		
		// Forma para hacer que si esta a la izquierda se mueva del muro 1 vez a la derecha
		
		if(yActualIA==1){
			
			mapa[xActualIA][yActualIA] = ".";
			
			yActualIA = yActualIA + 1;
			
			mapa[xActualIA][yActualIA] = "X";
			
		}
		
		// Forma para hacer que si esta arriba se mueva del muro 1 vez hacia abajo
		
		if(xActualIA==1){
			
			mapa[xActualIA][yActualIA] = ".";
			
			xActualIA = xActualIA + 1;
			
			mapa[xActualIA][yActualIA] = "X";
			
		}
		
		// Forma para hacer que si esta abajo se mueva del muro 1 vez hacia arriba
		
		if(xActualIA==8){
			
			mapa[xActualIA][yActualIA] = ".";
			
			xActualIA = xActualIA - 1;
			
			mapa[xActualIA][yActualIA] = "X";
			
		}
		
    }else{
    
    mapa[xActualIA][yActualIA] = ".";
    int r1 = (int) (Math.random()*3)-1;
    int r2 = (int) (Math.random()*3)-1;
    xActualIA = xActualIA + r1;
    yActualIA = yActualIA + r2;
    mapa[xActualIA][yActualIA] = "X";
    
    }
    
            
    if(xActualIA2<=1 || yActualIA2<=1 || xActualIA2>=8 || yActualIA2>=8) {
    
    	if(yActualIA2==8){
			
			mapa[xActualIA2][yActualIA2] = ".";
			
			yActualIA2 = yActualIA2 - 1;
			
			mapa[xActualIA2][yActualIA2] = "([X])";
			
		}
		
		// Forma para hacer que si esta a la izquierda se mueva del muro 1 vez a la derecha
		
		if(yActualIA2==1){
			
			mapa[xActualIA2][yActualIA2] = ".";
			
			yActualIA2 = yActualIA2 + 1;
			
			mapa[xActualIA2][yActualIA2] = "([X])";
			
		}
		
		// Forma para hacer que si esta arriba se mueva del muro 1 vez hacia abajo
		
		if(xActualIA2==1){
			
			mapa[xActualIA2][yActualIA2] = ".";
			
			xActualIA2 = xActualIA2 + 1;
			
			mapa[xActualIA2][yActualIA2] = "([X])";
			
		}
		
		// Forma para hacer que si esta abajo se mueva del muro 1 vez hacia arriba
		
		if(xActualIA2==8){
			
			mapa[xActualIA2][yActualIA2] = ".";
			
			xActualIA2 = xActualIA2 - 1;
			
			mapa[xActualIA2][yActualIA2] = "([X])";
			
		}
	
    }else{
    
    mapa[xActualIA2][yActualIA2]  = ".";
    int r3 = (int) (Math.random()*3)-1;
    int r4 = (int) (Math.random()*3)-1;
    xActualIA2 = xActualIA2 + r3;
    yActualIA2 = yActualIA2 + r4;
    mapa[xActualIA2][yActualIA2] = "([X])";
    
    
    
    
    
    
    
    
    
    }
    
    
// Muestro el mapa
    
    System.out.println("El jugador se encuentra en la posicion ["+(x+1)+"]["+(y+1)+"]\n");
    System.out.println("La IA se encuentra en la posicion ["+(xActualIA+1)+"]["+(yActualIA+1)+"]\n");
    System.out.println("La IA 2 se encuentra en la posicion ["+(xActualIA2+1)+"]["+(yActualIA2+1)+"]\n");
    
    System.out.println("                              TURNO "+turnos);
    System.out.println("--------------------------------------------------------------------------"); 
    
    
for(int i=0;i<=9;i++){
    for(int j=0;j<=9;j++){
    
        
        System.out.print(mapa[i][j]+"\t");
    
    
    }

    System.out.println("\n");

}
    System.out.println("--------------------------------------------------------------------------");
}while(  (x!=xActualIA || y!=yActualIA) && (x!=xActualIA2 || y!=yActualIA2) );


    System.out.println("\nHas pillado a la IA despues de "+turnos+" turnos!\n");
    
    



}
}