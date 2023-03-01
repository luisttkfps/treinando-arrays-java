package com.arrays.consoantes;

import java.util.*;

public class consoantes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String [] consoantes = {"N", "A", "N", "D", "O", "S"};
		String consoantesLidas= "";
		int contaConsoantes = 0;
		
		for(int i = 0; i < consoantes.length; i++) {
			if(!(consoantes[i].equalsIgnoreCase("A") ||
			   consoantes[i].equalsIgnoreCase("E") ||
			   consoantes[i].equalsIgnoreCase("I") ||
			   consoantes[i].equalsIgnoreCase("O") ||
			   consoantes[i].equalsIgnoreCase("U")) ) {
			
				++contaConsoantes;
				
				if(consoantesLidas.length() == 0)
					consoantesLidas = consoantes[i];
				else
					consoantesLidas += "," + consoantes[i];
			
			}
		}
		
		System.out.println("Quantidade de consoantes: " + contaConsoantes);
		System.out.println("Consoantes: " + consoantesLidas);
		
	}

}
