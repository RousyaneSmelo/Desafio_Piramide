package IIIestagio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class DesafioPiramide {
	
	public static void main(String[] args) {
	
		int tamanho, tamanhoInterno, tamanhoImpressao;
		Integer numeroRandom;
		Random rand = new Random();
		List<Integer> numeros = new ArrayList<>();
		List<List<Integer>> listaDaPiramide = new ArrayList<>();
		Scanner piramide = new Scanner(System.in);
		
		System.out.println("Ingressar o tamanho da piramide:");
		
		tamanho = piramide.nextInt();
		tamanhoInterno = tamanho;
		tamanhoImpressao = tamanho;
		
		 while (tamanho != 0) {
			 
			 numeros = new ArrayList<>();
			 while (numeros.size() != tamanhoInterno) {
				 numeroRandom = new Integer(rand.nextInt(tamanhoInterno)); 
				 numeros.add(numeroRandom);
			 }
			 tamanhoInterno--;
			 listaDaPiramide.add(numeros);
			 
			 --tamanho;
	     }
	
		 System.out.println("-----------------------------------------"+"\n"+"\n");
		 System.out.println("--- PIRAMIDE ---");
		 while(tamanhoImpressao != 0) {
			 
			 System.out.println(listaDaPiramide.get(tamanhoImpressao-1)+"\n");
			 tamanhoImpressao--;
		 }
		 
		System.out.println("-----------------------------------------"+"\n"+"\n");
		Collections.reverse(listaDaPiramide);
		System.out.println(listaDaPiramide);
	}
		
}
