package br.com.generation.introjava;

import java.util.Scanner;
public class idadeEmDias {

	public static void main(String[] args) {
		int idadeAnos, idadeMeses, idadeDias, idadeDiasTotal = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe sua idade em anos: ");
		idadeAnos = input.nextInt();
		
		System.out.println("Agora em meses: ");
		idadeMeses = input.nextInt();
		
		System.out.println("E por fim, em dias: ");
		idadeDias = input.nextInt();
		
		idadeDiasTotal = (idadeAnos*365) + (idadeMeses*30) + idadeDias;
		
		System.out.println("A sua idade em dias é de: " + idadeDiasTotal);
	}

}
