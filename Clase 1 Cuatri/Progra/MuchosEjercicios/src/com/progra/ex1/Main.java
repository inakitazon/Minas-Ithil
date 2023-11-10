package com.progra.ex1;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) throws Exception {
		
		 String textox=JOptionPane.showInputDialog("Dime un numero entrero");
         int x=Integer.parseInt(textox);	
         String textoy=JOptionPane.showInputDialog("Dime otro numero entrero");
         int y=Integer.parseInt(textoy);
         
         int div = x/y;
         int Hello;
         
         System.out.println("Primer numero: "+x);
         System.out.println("Segundo numero: "+y);
         System.out.println("Resultado: "+div);
         
         
     		if(y==0) {
     			throw  ArithmeticException();}
     	
     			
     		}

     		
     		
     		
     		   
     		
	public static Exception ArithmeticException() {
		
		return null;
	}
	

		
	
	
	
	
	
         
         
         
         
	
}
	
	
	
	





	
	

