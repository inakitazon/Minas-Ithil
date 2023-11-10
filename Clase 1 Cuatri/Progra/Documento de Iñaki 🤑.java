import java.util.Scanner; 
 public class problema{

    public static  void main(String args[]){

      Scanner entrada = new Scanner(System.in); 

      //creacion del mapa
      int[][] superficie = { 
      {0,2,0,0,3,0,4,0},
      {4,3,0,1,0,1,0,1},
      {0,1,1,3,1,0,2,0},
      {1,0,1,0,0,1,0,1},
      {0,4,1,2,1,1,2,4},
      {0,1,0,1,0,0,1,3},
      {0,0,1,0,0,1,3,0}
      };

      boolean limpiar = true;
      boolean automatico = true;
      boolean bolsa=false;
      boolean bateria=false;
      
      int x;
      int y;
      int posminX=0,posminY=0;
      int inicioX=3,inicioY=3;
      int maxX=superficie.length-1;
      int maxY=superficie[0].length-1;
      String movimiento;
      String input;
      int movimientoauto;
      int contador=0;
      int capacidad=0;
      int recarga=0;
      
      


      do{
        //borde arriba
        contador=contador+1;
        if(contador==200){limpiar=false;}

        
        System.out.println("Pulsar q para salir del modo automatico || Pulsar a-w-s-d");
        System.out.print("+");
        for(int w=0;w<maxY;w=w+1) {System.out.print("---");}System.out.print("+");
          
          //superficie
         for(x=0;x<superficie.length;x=x+1){
            System.out.println("");
              for(y=0;y<superficie[x].length;y=y+1){

              if ((x == inicioX) && (y == inicioY)) { System.out.print("(O)");}
                else{ if (superficie[x][y]==0){System.out.print(" . ");}
                else if (superficie[x][y]==1){System.out.print("[ ]");}
                else if (superficie[x][y]==2){System.out.print("|#|");}
                else if (superficie[x][y]==3){System.out.print("~~~");}
                else if (superficie[x][y]==4){System.out.print("***");}
                 }
                 }
                }

         //Borde abajo
        System.out.println("");
        System.out.print("+");
        for(int z=0;z<maxY;z=z+1) {System.out.print("---");}System.out.println("+");
			System.out.print("Movimientos: "+contador);
			System.out.println(" || Puedes utilizar F para abandonar");
			System.out.println("Fila ["+inicioX+"] Columna ["+inicioY+"] / Bolsa ["+capacidad+"]");
			movimiento=entrada.nextLine();
			System.out.println("");
         
        
         
          if(automatico){ movimientoauto=(int)(Math.random()*4+1);
                   
                  if(movimientoauto==1 &&(inicioX>posminX)){inicioX=inicioX-1;}
                  else if(movimientoauto==2 &&(inicioX<maxX)){inicioX=inicioX+1;}
                  else if(movimientoauto==3 &&(inicioY>posminY)){inicioY=inicioY-1;}
                  else if(movimientoauto==4 &&(inicioY<maxY)){inicioY=inicioY+1;}
              }else{ 
                if(movimiento.equalsIgnoreCase("w")&&(inicioX>posminX)){inicioX=inicioX-1;}
                else if(movimiento.equalsIgnoreCase("s")&&(inicioX<maxX)){inicioX=inicioX+1;}
                else if(movimiento.equalsIgnoreCase("a")&&(inicioY>posminY)){inicioY=inicioY-1;}
                else if(movimiento.equalsIgnoreCase("d")&&(inicioY<maxY)){inicioY=inicioY+1;}
                    }
                     
                  
                    //limpiar
              if(superficie[inicioX][inicioY]!=0){capacidad=capacidad+1;superficie[inicioX][inicioY]=superficie[inicioX][inicioY]-1;}
           

              if(movimiento.equalsIgnoreCase("f")){limpiar=false;}
          
                  //poner y quitar automatico
              if(movimiento.equalsIgnoreCase("q")){automatico=false;}else if (movimiento.equalsIgnoreCase("p")){automatico=true;}
            
                //bolsa
              if (capacidad==16) {bolsa=true;

               do{ System.out.println("Para vaciar la bolsa pulsa B");
                  input= entrada.nextLine();
                  if(input.equalsIgnoreCase("b")){capacidad=0;bolsa=false;}
                
                }while(bolsa);
               }


      }while(limpiar);
      System.out.println("Se apago la bateria!");



     
   }
 }