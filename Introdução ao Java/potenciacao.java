package br.com.generation.introjava;

import java.util.Scanner;

public class potenciacao {

	public static void main(String[] args) {
		double A,B,C,S,R,D;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira o 1º número: ");
		A = input.nextInt();
		
		System.out.println("Insira o 2º número: ");
		B = input.nextInt();
		
		System.out.println("Insira o 3º número: ");
		C = input.nextInt();
		
		R = Math.pow(A+B, 2.0);
		S = Math.pow(B+C, 2.0);
		D = (R + S) / 2;
		
		System.out.println("A expressão resulta em: " + D);
	}

}
