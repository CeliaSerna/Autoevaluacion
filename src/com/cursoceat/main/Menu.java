package com.cursoceat.main;

import java.util.Scanner;

public class Menu {

static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcion;
		
		do{
		System.out.println("*** MENÚ ***");
		System.out.println("1. Alta");
		System.out.println("2. Baja");
		System.out.println("3. Modificación");
		System.out.println("4. Eliminación");
		System.out.println("5. Mostrar");
		System.out.println("6. Salir");
		
		opcion = entrada.nextInt();

		switch(opcion) {
		case 1-> alta(opcion);
		case 2-> baja(opcion);
		case 3-> modificar(opcion);
		case 4-> eliminar(opcion);
		case 5-> mostrar(opcion);
		case 6-> System.out.println("Hasta luego");
		default -> System.err.println("Opción no válida");
	
		}
		
		}while (opcion !=6);
		
	}
static void alta(int opcion) {
	System.out.println("Ha seleccionado la opción "+ opcion + ": Alta");
}
static void baja(int opcion) {
	System.out.println("Ha seleccionado la opción "+ opcion + ": Baja");
}
static void modificar(int opcion) {
	System.out.println("Ha seleccionado la opción "+ opcion + ": Modificación");
}
static void eliminar(int opcion) {
	System.out.println("Ha seleccionado la opción "+ opcion + ": Eliminación");
}
static void mostrar(int opcion) {
	System.out.println("Ha seleccionado la opción "+ opcion + ": Mostrar");
}


}
