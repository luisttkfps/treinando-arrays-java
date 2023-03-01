package com.arrays.sucessor;

import java.util.*;
public class Sucessor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		int cont = 0;
		
		int numeros[] = new int[20];
		
		while(cont < numeros.length) {
			numeros[cont] = rand.nextInt(100);
			cont++;
		}
		
		System.out.print("Numeros Aleatórios: ");
		for(int numero : numeros) {

			System.out.print(numero + " ");
		}
		
		System.out.print("\nSucessores dos Numeros Aleatórios: ");
		for(int numero : numeros) {

			System.out.print((numero + 1) + " ");
		}
		
	}

}
