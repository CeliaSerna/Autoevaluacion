package com.cursoceat.main;

import java.util.Scanner;

public class NumeroNWhile {
	
static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Escriba un número ");
		double num = entrada.nextDouble();
	    int i =0;
		while (num > i) {
			i++;
			System.out.print(i + " ");
			
		}
	
	
	}

}
