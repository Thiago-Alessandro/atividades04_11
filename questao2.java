package atividade04_11;

import java.util.Scanner;

public class questao2 {

	public static void main(String[] args) {
		
		int quantiaPares = 0, quantiaImpares = 0;
		int[]numero= new int[6], pares = new int[6], impares= new int[6];
		
		Scanner teclado = new Scanner(System.in);
		
		for (int c = 0;c < numero.length; c++) {
			System.out.print("Insira um numero inteiro: ");
			numero[c]= teclado.nextInt();
			if (numero[c] % 2 == 0) {
				pares[quantiaPares] = numero[c];
				quantiaPares++;
			}
			else {
				impares[quantiaImpares] = numero[c];
				quantiaImpares++;
			}
		}
		
		System.out.print("\nA quantia de numeros pares é: " + quantiaPares + " sendo eles: ");
		for(int c = 0;c < quantiaPares;c++) {
			System.out.print(pares[c] + " ");
		}
		
		System.out.print("\n\nA quantia de numeros impares é: " + quantiaImpares + " sendo eles: ");
		for(int c = 0;c < quantiaImpares;c++) {
			System.out.print(impares[c] + " ");
		}
	}

}
