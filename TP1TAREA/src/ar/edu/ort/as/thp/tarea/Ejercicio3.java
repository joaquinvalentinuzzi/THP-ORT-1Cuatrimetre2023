package ar.edu.ort.as.thp.tarea;

/*3. Realizá un programa que permita ingresar un número entero. Debe mostrarse el número 
ingresado: 
a. Multiplicado por 5. 
b. Dividido por 2.
*/

import java.util.Scanner;

public class Ejercicio3 {

	static final Scanner input = new Scanner(System.in);
	static final int MULTIPLICADO = 5;
	static final int DIVIDIDO = 2;
	
	public static void main(String[] args) {
	
		int num;
		double resultMult, resultDiv;
		
		System.out.println("ingrese un numero entero");
		num = Integer.parseInt(input.nextLine());
		
		resultMult = num * MULTIPLICADO;
		
		resultDiv = num / DIVIDIDO;
		
		System.out.println("El valor multiplicado es de :" + resultMult + "y el valor divido es de :" + resultDiv);
		
		
		input.close();

	}

}
