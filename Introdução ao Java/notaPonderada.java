package br.com.generation.introjava;

import java.util.Scanner;

public class notaPonderada {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int nota1, nota2, nota3, media;
		
		System.out.println("Digite a primeira nota: ");
		nota1 = input.nextInt();
		
		System.out.println("Digite a segunda nota: ");
		nota2 = input.nextInt();
		
		System.out.println("Digite a terceira nota: ");
		nota3 = input.nextInt();
		
		media = ((nota1*2) + (nota2*3) + (nota3*5)) / 10;
		
		System.out.println("A média do aluno é de: " + media);
	}

}