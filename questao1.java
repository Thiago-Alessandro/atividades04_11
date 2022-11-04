package atividade04_11;

import java.util.Scanner;

public class questao1 {

	public static void main(String[] args) {
		
		double[] totalVendas = new double[10], valorReceber = new double[10],percentualComissao = new double[10];
		double maiorValor = 0, menorValor = 0, totalVendasVendedores = 0;
		int c = 0, c2 = 0;
		
		String [] vendedor = new String [10];
		
		String nomeMaiorValorReceber = new String();
		String nomeMenorValorReceber = new String();
		
		Scanner teclado = new Scanner(System.in);
		
		for (;c < vendedor.length;c++) {
			
			System.out.print("Insira o seu nome: ");
			vendedor[c] = teclado.next();
			
			System.out.println("Insira o total de suas vendas: R$");
			totalVendas[c] = teclado.nextDouble();
			
			System.out.print("Insira o seu percentual de comissão sobre as vendas: ");
			percentualComissao[c] = teclado.nextDouble();
			
			valorReceber[c] = totalVendas[c] * percentualComissao[c]/100;
			
			totalVendasVendedores += valorReceber[c];
			
			 if (valorReceber[c] > maiorValor || c == 0) {
				 maiorValor = valorReceber[c];
				 nomeMaiorValorReceber = vendedor[c];
			 }
			 if (valorReceber[c] < menorValor || c == 0) {
				 menorValor = valorReceber[c];
				 nomeMenorValorReceber = vendedor[c];
			 }
		}
		for (;c2 < vendedor.length;c2++) {
		System.out.print("\n\nO(a) vendedor(a) " + vendedor[c2] + " receberá R$" + valorReceber[0] );
		
		System.out.print("\n\nO maior valor a receber é: R$" + maiorValor + " do vendedor " + nomeMaiorValorReceber);
		System.out.print("\nO menor valor a receber é: R$" + menorValor + " do vendedor " + nomeMenorValorReceber);
		}
	}

}
