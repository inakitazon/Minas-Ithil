package com.progra.ex2;

import javax.swing.JOptionPane;

public class Main {
		public static void addAppointment(String[]args) {
			
			String textodia=JOptionPane.showInputDialog("Dime el dia");
	        int x=Integer.parseInt(textodia);	
	        String textomes=JOptionPane.showInputDialog("Dime el mes");
	        int y=Integer.parseInt(textomes);
	        String textoaño=JOptionPane.showInputDialog("Dime el año");
	        int z=Integer.parseInt(textoaño);
	        
		

		
		}
		
		public static void listAppointments(String[]args) {
			String fecha1=JOptionPane.showInputDialog("Dime el dia");
	        int x=Integer.parseInt(fecha1);	
	        String fecha2=JOptionPane.showInputDialog("Dime el mes");
	        int y=Integer.parseInt(fecha2);
	        String fecha3=JOptionPane.showInputDialog("Dime el año");
	        int z=Integer.parseInt(fecha3);
		    
		}	
	}
	



