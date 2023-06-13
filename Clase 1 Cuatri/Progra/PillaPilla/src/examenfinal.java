import java.util.Scanner;
public class examenfinal{

    public static  void main(String args[]){

      Scanner entrada = new Scanner(System.in);
	  
	  //creacion del mapa
      int[][] superficie = { 
      {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
      {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
      {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
      {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
      {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
      {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
      {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
	  {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
	  {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1},
	  {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1},
	  {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1},
	  {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1},
	  {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1},
	  {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
	  {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
      };

      boolean juego = true;
      boolean automatico = true;
	  boolean autogallina1 = true;
	  boolean autogallina2 = true;
	  boolean autogallina3 = true;
	  boolean autogallina4 = true;
	  boolean autozorro = true;
	  boolean apariciongallina1 =true;
	  boolean apariciongallina2 =true;
	  boolean apariciongallina3 =true;
	  boolean apariciongallina4 =true;
	  int x;
      int y;
      int posminX=0,posminY=0;
      int inicioX=3,inicioY=3;
	  int gallina1X= 2, gallina1Y=8;
	  int gallina2X= 2, gallina2Y= 9;
	  int gallina3X= 7,gallina3Y= 11;
	  int gallina4X= 9, gallina4Y= 13;
	  int zorroX = 12, zorroY=27;
      int maxX=superficie.length-1;
      int maxY=superficie[0].length-1;
      String movimiento;
      String input;
      int movimientogallina;int movimientozorro;
      int contador=0;
	  int gallinasAtrapadas=0;
      


      do{
        //borde arriba
        contador=contador+1;
        if(contador==200){juego=false;}

        
        System.out.println("|| Pulsar a-w-s-d");
          
          //superficie
         for(x=0;x<superficie.length;x=x+1){
            System.out.println("");
              for(y=0;y<superficie[x].length;y=y+1){

              if ((x == inicioX) && (y == inicioY)) { System.out.print("(O)");}
			  else if ((gallina1X == x)&&(gallina1Y == y)) {System.out.print("^1^");apariciongallina1=true;}
			  else if ((gallina2X == x) && (gallina2Y == y)) {System.out.print("^2^");apariciongallina2=true;}
			  else if ((gallina3X == x) && (gallina3Y == y)) {System.out.print("^3^");apariciongallina3=true;}
			  else if ((gallina4X == x) && (gallina4Y == y)) {System.out.print("^4^");apariciongallina4=true;}
			  else if ((zorroX ==x) && (zorroY == y)) {System.out.print("'^'");}
                else{ if (superficie[x][y]==0){System.out.print(" . ");}
                else if (superficie[x][y]==1){System.out.print("[#]");}
                 }
                 }
                }
				

         //Borde abajo
        System.out.println("");
        System.out.print("+");
        for(int z=0;z<maxY;z=z+1) {System.out.print("---");}System.out.println("+");
			System.out.print("Movimientos: "+contador);
			System.out.println(" || Puedes utilizar F para abandonar");
			System.out.println("Fila ["+inicioX+"] Columna ["+inicioY+"] / GALLINA1: ["+gallina1X+"]["+gallina1Y+"]/ GALLINA2: ["+gallina2X+"]["+gallina2Y+"]/ GALLINA3: ["+gallina3X+"]["+gallina3Y+"]/ GALLINA4: ["+gallina4X+"]["+gallina4Y+"]");
			movimiento=entrada.nextLine();
			System.out.println("");
         
                if(movimiento.equalsIgnoreCase("w")&&(inicioX>posminX) && superficie[inicioX-1][inicioY]%2!=1){inicioX=inicioX-1;}
                else if(movimiento.equalsIgnoreCase("s")&&(inicioX<maxX) && superficie[inicioX+1][inicioY]%2!=1){inicioX=inicioX+1;}
                else if(movimiento.equalsIgnoreCase("a")&&(inicioY>posminY) && superficie[inicioX][inicioY-1]%2!=1){inicioY=inicioY-1;}
                else if(movimiento.equalsIgnoreCase("d")&&(inicioY<maxY) && superficie[inicioX][inicioY+1]%2!=1){inicioY=inicioY+1;}
           

              if(movimiento.equalsIgnoreCase("f")){juego=false;} //acabar el juego

				//movimiento npc
				if(autogallina1){ movimientogallina=(int)(Math.random()*9+1);{autogallina1 = true;}
				if(movimientogallina==1 &&(inicioX>posminX) && superficie[gallina1X-1][gallina1Y]%2!=1){gallina1X=gallina1X-1;}
                  else if(movimientogallina==2 &&(inicioX<maxX) && superficie[gallina1X+1][gallina1Y]%2!=1){gallina1X=gallina1X+1;}
                  else if(movimientogallina==3 &&(inicioY>posminY) && superficie[gallina1X][gallina1Y-1]%2!=1){gallina1Y=gallina1Y-1;}
                  else if(movimientogallina==4 &&(inicioY<maxY) && superficie[gallina1X][gallina1Y+1]%2!=1){gallina1Y=gallina1Y+1;}
				  else if(movimientogallina==5 && superficie[gallina1X-1][gallina1Y+1]%2!=1){gallina1X=gallina1X-1;gallina1Y=gallina1Y+1;}
				  else if(movimientogallina==6 && superficie[gallina1X+1][gallina1Y+1]%2!=1){gallina1X=gallina1X+1;gallina1Y=gallina1Y+1;}
				  else if(movimientogallina==7 && superficie[gallina1X+1][gallina1Y-1]%2!=1){gallina1X=gallina1X+1;gallina1Y=gallina1Y-1;}
				  else if(movimientogallina==8 && superficie[gallina1X-1][gallina1Y-1]%2!=1){gallina1X=gallina1X-1;gallina1Y=gallina1Y-1;}
				  else if(movimientogallina==9 && superficie[gallina1X][gallina1Y]%2!=1){gallina1X=gallina1X;gallina1Y=gallina1Y;}
				}
					
			  if(autogallina2){ movimientogallina=(int)(Math.random()*9+1);{autogallina2 = true;}
				if(movimientogallina==1 &&(inicioX>posminX) && superficie[gallina2X-1][gallina2Y]%2!=1){gallina2X=gallina2X-1;}
                  else if(movimientogallina==2 &&(inicioX<maxX) && superficie[gallina2X+1][gallina2Y]%2!=1){gallina2X=gallina2X+1;}
                  else if(movimientogallina==3 &&(inicioY>posminY) && superficie[gallina2X][gallina2Y-1]%2!=1){gallina2Y=gallina2Y-1;}
                  else if(movimientogallina==4 &&(inicioY<maxY) && superficie[gallina2X][gallina2Y+1]%2!=1){gallina2Y=gallina2Y+1;}
				  else if(movimientogallina==5 && superficie[gallina2X-1][gallina2Y+1]%2!=1){gallina2X=gallina2X-1;gallina2Y=gallina2Y+1;}
				  else if(movimientogallina==6 && superficie[gallina2X+1][gallina2Y+1]%2!=1){gallina2X=gallina2X+1;gallina2Y=gallina2Y+1;}
				  else if(movimientogallina==7 && superficie[gallina2X+1][gallina2Y-1]%2!=1){gallina2X=gallina2X+1;gallina2Y=gallina2Y-1;}
				  else if(movimientogallina==8 && superficie[gallina2X-1][gallina2Y-1]%2!=1){gallina2X=gallina2X-1;gallina2Y=gallina2Y-1;}
				  else if(movimientogallina==9 && superficie[gallina2X][gallina2Y]%2!=1){gallina2X=gallina2X;gallina2Y=gallina2Y;}
				}
			if(autogallina3){ movimientogallina=(int)(Math.random()*9+1);{autogallina3 = true;}
				if(movimientogallina==1 &&(inicioX>posminX) && superficie[gallina3X-1][gallina3Y]%2!=1){gallina3X=gallina3X-1;}
                  else if(movimientogallina==2 &&(inicioX<maxX) && superficie[gallina3X+1][gallina3Y]%2!=1){gallina3X=gallina3X+1;}
                  else if(movimientogallina==3 &&(inicioY>posminY) && superficie[gallina3X][gallina3Y-1]%2!=1){gallina3Y=gallina3Y-1;}
                  else if(movimientogallina==4 &&(inicioY<maxY) && superficie[gallina3X][gallina3Y+1]%2!=1){gallina3Y=gallina3Y+1;}
				  else if(movimientogallina==5 && superficie[gallina3X-1][gallina3Y+1]%2!=1){gallina3X=gallina3X-1;gallina3Y=gallina3Y+1;}
				  else if(movimientogallina==6 && superficie[gallina3X+1][gallina3Y+1]%2!=1){gallina3X=gallina3X+1;gallina3Y=gallina3Y+1;}
				  else if(movimientogallina==7 && superficie[gallina3X+1][gallina3Y-1]%2!=1){gallina3X=gallina3X+1;gallina3Y=gallina3Y-1;}
				  else if(movimientogallina==8 && superficie[gallina3X-1][gallina3Y-1]%2!=1){gallina3X=gallina3X-1;gallina3Y=gallina3Y-1;}
				  else if(movimientogallina==9 && superficie[gallina3X][gallina3Y]%2!=1){gallina3X=gallina3X;gallina3Y=gallina3Y;}
				}
				if(autogallina4){ movimientogallina=(int)(Math.random()*9+1);{autogallina4 = true;}
				if(movimientogallina==1 &&(inicioX>posminX) && superficie[gallina4X-1][gallina4Y]%2!=1){gallina4X=gallina4X-1;}
                  else if(movimientogallina==2 &&(inicioX<maxX) && superficie[gallina4X+1][gallina4Y]%2!=1){gallina4X=gallina4X+1;}
                  else if(movimientogallina==3 &&(inicioY>posminY) && superficie[gallina4X][gallina4Y-1]%2!=1){gallina4Y=gallina4Y-1;}
                  else if(movimientogallina==4 &&(inicioY<maxY) && superficie[gallina4X][gallina4Y+1]%2!=1){gallina4Y=gallina4Y+1;}
				  else if(movimientogallina==5 && superficie[gallina4X-1][gallina4Y+1]%2!=1){gallina4X=gallina4X-1;gallina4Y=gallina4Y+1;}
				  else if(movimientogallina==6 && superficie[gallina4X+1][gallina4Y+1]%2!=1){gallina4X=gallina4X+1;gallina4Y=gallina4Y+1;}
				  else if(movimientogallina==7 && superficie[gallina4X+1][gallina4Y-1]%2!=1){gallina4X=gallina4X+1;gallina4Y=gallina4Y-1;}
				  else if(movimientogallina==8 && superficie[gallina4X-1][gallina4Y-1]%2!=1){gallina4X=gallina4X-1;gallina4Y=gallina4Y-1;}
				  else if(movimientogallina==9 && superficie[gallina4X][gallina4Y]%2!=1){gallina4X=gallina4X;gallina4Y=gallina4Y;}
				}
				if(autozorro){ movimientozorro=(int)(Math.random()*9+1);{autozorro = true;}
				if(movimientozorro==1 &&(inicioX>posminX) && superficie[zorroX-1][zorroY]%2!=1){zorroX=zorroX-1;}
                  else if(movimientozorro==2 &&(inicioX<maxX) && superficie[zorroX+1][zorroY]%2!=1){zorroX=zorroX+1;}
                  else if(movimientozorro==3 &&(inicioY>posminY) && superficie[zorroX][zorroY-1]%2!=1){zorroY=zorroY-1;}
                  else if(movimientozorro==4 &&(inicioY<maxY) && superficie[zorroX][zorroY+1]%2!=1){zorroY=zorroY+1;}
				  else if(movimientozorro==5 && superficie[zorroX-1][zorroY+1]%2!=1){zorroX=zorroX-1;zorroY=zorroY+1;}
				  else if(movimientozorro==6 && superficie[zorroX+1][zorroY+1]%2!=1){zorroX=zorroX+1;zorroY=zorroY+1;}
				  else if(movimientozorro==7 && superficie[zorroX+1][zorroY-1]%2!=1){zorroX=zorroX+1;zorroY=zorroY-1;}
				  else if(movimientozorro==8 && superficie[zorroX-1][zorroY-1]%2!=1){zorroX=zorroX-1;zorroY=zorroY-1;}
				  else if(movimientozorro==9 && superficie[zorroX][zorroY]%2!=1){zorroX=zorroX;zorroY=zorroY;}
				}
				
				
			if (gallina1X == inicioX && gallina1Y == inicioY){gallina1X = 10;gallina1Y = 22;}
			if (gallina2X == inicioX && gallina2Y == inicioY){gallina2X = 11;gallina2Y = 25;}
			if (gallina3X == inicioX && gallina3Y == inicioY){gallina3X = 12;gallina3Y = 24;}
			if (gallina4X == inicioX && gallina4Y == inicioY){gallina4X = 12;gallina4Y = 25;}
			
			if (gallina1X == zorroX && gallina1Y == zorroY){autogallina1=false;}//los zorros no se las comen, las matan y no se pueden mover, PD:tengo gallinas en mi pueblo y lo he comprobado
			if (gallina2X == zorroX && gallina2Y == zorroY){autogallina2=false;}
			if (gallina3X == zorroX && gallina3Y == zorroY){autogallina3=false;}
			if (gallina4X == zorroX && gallina4Y == zorroY){autogallina4=false;}
			
			
			
				
        }while(juego);
      System.out.println("Se acabo el juego!");

	  
    }
}




     
   
 
	  
	
	

	