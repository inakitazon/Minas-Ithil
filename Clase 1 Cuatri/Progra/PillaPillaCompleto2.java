import java.util.Scanner;

public class PillaPillaCompleto2 {
public static void main(String[] args){

Scanner entrada = new Scanner(System.in);
    
String[][] mapa = new String [10][10];

int x;
int y;
int xInicioIA = (int) (Math.random()*7+1);
int yInicioIA = (int) (Math.random()*7+1);
int xActualIA;
int yActualIA;
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

// Pintamos la IA en su posición inicial.



if(xInicioIA == x){

xInicioIA = xInicioIA+1;


}


        
if(yInicioIA == y){

yInicioIA = yInicioIA+1;


}


mapa[xInicioIA][yInicioIA] = "X";


// Esta seccion es para bucle de movimiento e impresión del mapa.
// Hacemos un bucle infinito para elegir el movimiento y volver a printar el mapa

String tecla;

// Establezco el turno y la posicion en la que se encuentran
    
    System.out.println("El jugador se encuentra en la posicion ["+(x+1)+"]["+(y+1)+"]\n");
    System.out.println("La IA se encuentra en la posicion ["+(xInicioIA+1)+"]["+(yInicioIA+1)+"]\n");
    

   
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
    
        System.out.println("La IA no se puede mover mas\n"); 
    
    }else{
    
    mapa[xActualIA][yActualIA] = ".";
    int r1 = (int) (Math.random()*3)-1;
    int r2 = (int) (Math.random()*3)-1;
    System.out.println(r1);
    System.out.println(r2);
    xActualIA = xActualIA + r1;
    yActualIA = yActualIA + r2;
    mapa[xActualIA][yActualIA] = "X";
    
    }

    
// Muestro el mapa
    
    System.out.println("El jugador se encuentra en la posicion ["+(x+1)+"]["+(y+1)+"]\n");
    System.out.println("La IA se encuentra en la posicion ["+(xActualIA+1)+"]["+(yActualIA+1)+"]\n");
    
    System.out.println("                              TURNO "+turnos);
    System.out.println("--------------------------------------------------------------------------"); 
    
    
for(int i=0;i<=9;i++){
    for(int j=0;j<=9;j++){
    
        
        System.out.print(mapa[i][j]+"\t");
    
    
    }

    System.out.println("\n");

}
    System.out.println("--------------------------------------------------------------------------");
}while( ((x!=xActualIA) || (y!=yActualIA)) );


    System.out.println("\nHas pillado a la IA despues de "+turnos+" turnos\n");
    
    



}
}
