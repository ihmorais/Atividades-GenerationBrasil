/* Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste
aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5,
respectivamente.*/

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
		
		System.out.println("A mÃ©dia do aluno Ã© de: " + media);
	}

}