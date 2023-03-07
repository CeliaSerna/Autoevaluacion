package com.cursoceat.main;

public class Cadena {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String mensaje= "Siempre se puede aprender Java";
	
		int numA=0;
		int espacioBlanco=0;
		int numCaracteres= mensaje.length();
		
		//búsqueda de espacio en blanco
		for (int i =0; i< mensaje.length(); i++) {
			if(Character.isSpaceChar(mensaje.charAt(i))==true) {
			espacioBlanco++;

			}
			}
		
		//contador de as
		for (int j = 0; j<mensaje.length();j++) {
		if(mensaje.charAt(j)== 'a') {
		numA++;
		}	
		}
		
		System.out.println("La frase: "+mensaje );
		System.out.println("tiene "+ numCaracteres +" caracteres," );
		System.out.println( espacioBlanco + " espacios en blanco," );
		System.out.println( (numCaracteres-espacioBlanco) + " letras," );
		System.out.println( (espacioBlanco+1) + " palabras y " );
		System.out.println( numA +" as." );
	    
	
	}

}
