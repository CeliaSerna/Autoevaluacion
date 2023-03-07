package com.cursoceat.main;

import java.util.Scanner;

public class EuroDolar {
	
static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double cambio = 1.45349;
		
		System.out.println("CAMBIAR DE EURO A DÓLAR CANADIENSE");
		System.out.println("Escriba la cantidad de euros que quiere convertir");
		double euros = entrada.nextDouble();
		
		double dolarCa = cambio* euros;
		//casting
		//String resultado =Double.toString(dolarCa) ;	
		System.out.print( euros +"€ son " );
		System.out.printf("%.3f", dolarCa);
		System.out.print(" $CAD");
		
		
	
		
	}

}
