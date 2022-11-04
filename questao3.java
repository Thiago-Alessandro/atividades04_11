package atividade04_11;

import java.util.Scanner;
import java.util.Random;

public class questao3 {

	public static void main(String[] args) {
		
		double[] temperaturas = new double[121];
		double temperaturaMedia = 0, menorTemperatura = 0, maiorTemperatura = 0, somaTemperaturas = 0;
		
		Random temperaturaDia = new Random();
		
		for (int contador = 0;contador < temperaturas.length;contador++) {
			temperaturas[contador] = temperaturaDia.nextInt(40);
			
			if (temperaturas[contador] < 15) {
				contador--;
			}
			
			if (temperaturas[contador] < menorTemperatura || contador == 0) {
				menorTemperatura = temperaturas[contador];
			}
			if (temperaturas[contador] > maiorTemperatura || contador == 0) {
				maiorTemperatura = temperaturas[contador];
			}
			
			somaTemperaturas += temperaturas[contador];
		}
		temperaturaMedia = somaTemperaturas/temperaturas.length;
		
		System.out.print("\nA média das temperaturas é: " + temperaturaMedia + "°C");
		
		System.out.print("\n\nA temperatura mais alta registrada é de: " + maiorTemperatura + "°C");
		System.out.print("\nA temperatura mais baixa registrada é de: " + menorTemperatura + "°C");
	}

}
//(26) + 15 fellipe e gabriel