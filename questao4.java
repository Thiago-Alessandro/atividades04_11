package atividade04_11;

import java.util.Scanner;

public class questao4 {

	public static void main(String[] args) {
		
		int quantidadeNomes, escolha = 0, numeroNome = 0;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Quantos nomes você quer colocar?\n");
		quantidadeNomes = teclado.nextInt();
		
		String[] nomes = new String[quantidadeNomes];
		
		for (int inicializador = 0;escolha != 0 || inicializador == 0;inicializador++) {
			
			System.out.println("\n\tMENU1\n1 - Cadastrar nome\n2 - Pesquisar nome\n3 - Listar todos os nomes\n0 - Sair do programa\n");
			escolha= teclado.nextInt();
			
			switch(escolha) {
			case 1:
				
				for (int contador = 0;contador < nomes.length;contador++) {
					
				System.out.print("\nInisira o novo nome: ");
				nomes[contador] = teclado.next();
				}
				break;
				
			case 2:
				
				System.out.print("\nInsira o número do nome: ");
				numeroNome = teclado.nextInt();
				System.out.print("\n\n" + numeroNome + " - " + nomes[numeroNome]);
				
				break;
				
			case 3:
				
				for (int contador = 0;contador < nomes.length;contador++) {
					System.out.print("\n\n" + contador + " - " + nomes[contador]);
				}
			}
		}
	}

}
