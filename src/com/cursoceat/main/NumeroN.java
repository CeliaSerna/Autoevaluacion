package com.cursoceat.main;

import java.util.Scanner;

public class NumeroN {

	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.out.println("Escriba un número ");
	double num = entrada.nextDouble();
		
	for(int i=1; i<=num; i++) {
	System.out.print(i + " ");
	}
	}

}
