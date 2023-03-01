package com.arrays.inversa;

import java.util.*;
public class Inversa {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] numeros = new int[5];
		
		for(int i = 0; i < numeros.length; i++) {			
			System.out.println("Número: ");
			numeros[i] = sc.nextInt();
		}
		
		for(int j = numeros.length - 1; j >= 0; j--) {
			System.out.println("Numero: " + numeros[j]);
		}
		
	}
}
