package IIIestagio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class DesafioPiramide {
	
	public static void main(String[] args) {
	
		int tamanho, tamanhoInterno, tamanhoImpressao, tamanhoRandon;
		Integer numeroRandom;
		
		List<Integer> numeros = new ArrayList<>();
		List<List<Integer>> listaDaPiramide = new ArrayList<>();
		List<Integer> listaDeMenores = new ArrayList<>();
		Scanner piramide = new Scanner(System.in);
		
		System.out.println("Ingressar o tamanho da piramide:");
		
		tamanho = piramide.nextInt();
		tamanhoRandon = tamanho;
		tamanhoInterno = tamanho;
		tamanhoImpressao = tamanho;
		
		 while (tamanho != 0) {
			 
			 numeros = new ArrayList<>();
			 while (numeros.size() != tamanhoInterno) {
				 numeroRandom = new Integer((int) (1 + (Math.random() * (tamanhoRandon - 1)))); 
				 numeros.add(numeroRandom);
			 }
			 tamanhoInterno--;
			 listaDeMenores.add(Collections.min(numeros));
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
		System.out.println("Os menores valores são: "+listaDeMenores);
		
		Stream<Integer> stream = listaDeMenores.stream();
		DoubleStream doubleStream = stream.mapToDouble(Integer::doubleValue);
		System.out.println("A soma dos menores valores é: "+doubleStream.sum());
		
	}
		
}
