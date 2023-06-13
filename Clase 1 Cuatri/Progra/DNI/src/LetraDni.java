import java.util.*;

import javax.swing.JOptionPane;
public class LetraDni {

     public static void main(String[] args) {
         // Declaramos como constante por lo que dividir
         final int DIVISOR = 23;

         //Insertamos el DNI
         String texto=JOptionPane.showInputDialog("Escribe los numeros de tu DNI:");
         int dni=Integer.parseInt(texto);

         // Sacamos el resto
         int res=dni%DIVISOR;

         // Llamamos al método
         char letra=letraNIF(res);

         // Mostramos el DNI completo
         System.out.println("Tu DNI es " +dni+letra);
     }
     public static char letraNIF(int res) {
         // Definimos el array del char
         char letraNIF[]= {'T','R','W','A','G','M','Y',
                 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
                 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

         // Devolvemos el valor en la posición del array
         return letraNIF[res];
     }
}