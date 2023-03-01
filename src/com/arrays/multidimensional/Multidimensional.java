package com.arrays.multidimensional;

public class Multidimensional {

	public static void main(String[] args) {
		int [][] matriz = {{15,23,34,41},
						   {52,36,1,85},
						   {96,5,11,12},
						   {13,14,15,16}};
		int menorNumero = matriz[0][0];
		int posi =0, posj = 0;
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				if(matriz[i][j] < menorNumero) {
					menorNumero = matriz[i][j];
					posi = i;
					posj = j;
				}
			}
		}
		
		System.out.print("Menor numero: " + menorNumero);
		System.out.print("\nPosição i: " + posi);
		System.out.print("\nPosição j: " + posj);
		
		
	}

}
