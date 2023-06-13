package com.progra.ex3;

import java.util.Scanner;

public class Main {

	public static void main(String[]args) throws Exception {
		int x;
		Scanner revisar = new Scanner(System.in);
		do{
		System.out.println("Introduzca un numero entero(maximo de 999)");
		x=revisar.nextInt();
		}while(x<=0);

		for (int i=1; i<=x; i++){
		    if(x%i==0){
		    System.out.println(i);
		    }
		    if(x>999) {
				
				throw InputMaxValueException();
			}
		
		}
	
	

		
	
	
	
}

	private static Exception InputMaxValueException() {
		return null;
	}


}
