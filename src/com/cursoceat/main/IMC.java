package com.cursoceat.main;

import java.util.Scanner;

public class IMC {

static Scanner entrada = new Scanner(System.in);
//Scanner.useLocale

public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("CÁLCULO DEL IMC ");
		System.out.println("Escriba su peso en kilos");
		double peso = entrada.nextDouble();
		System.out.println("Escriba su altura en metros " );
		double altura = entrada.nextDouble();
	
		double imc = peso/Math.pow(altura, 2);
		

        if (imc < 18.5 ) {
        	System.out.println("Su IMC es "+imc+ ". Tiene un peso bajo");
        }else if(imc >=18.5 && imc <=24.9) {
        	System.out.println("Su IMC es "+imc+". Tiene un peso normal ");
        }else if(imc >= 25 && imc <= 29.9) {
        	System.out.println("Su IMC es "+imc+ ". Tiene sobrepeso ");
        }else {
        	System.out.println("Su IMC es "+imc+ ". Tiene obesidad ");
        }
}

}
