

import java.util.Scanner;

public class a {

	public static void main(String[]args) throws InvalidException {
		int x;
		Scanner revisar = new Scanner(System.in);
		do{
			System.out.println("Introduzca un numero entero(maximo de 999)");
			x=revisar.nextInt();
		}while(x<=0);

		if(x>999) {

			throw new InvalidException();

		}

		for (int i=1; i<=x; i++){
			if(x%i==0){
				System.out.println(i);
			}


		}











	}
	




}
