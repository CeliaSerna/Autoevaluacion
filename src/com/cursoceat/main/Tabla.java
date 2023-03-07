package com.cursoceat.main;

import java.util.Arrays;

import java.util.Scanner;

public class Tabla {
	
static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int t []= new int [0];
		
		for(int i =0; i<10; i++) {
		System.out.println("Escriba un número entero");
		t= Arrays.copyOf(t, t.length + 1);
		t[t.length-1]= entrada.nextInt();
		}
	System.out.println(Arrays.toString(t));
	
	}

}
