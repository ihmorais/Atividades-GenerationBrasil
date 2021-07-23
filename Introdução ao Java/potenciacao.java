/* Escreva um sistema que leia três números inteiros e positivos (A, B, C) e
calcule a seguinte expressão:
D = R+S/2
R = (A+B)²
S = (B+C)² 
*/

package br.com.generation.introjava;

import java.util.Scanner;

public class potenciacao {

	public static void main(String[] args) {
		double A,B,C,S,R,D;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira o 1Âº nÃºmero: ");
		A = input.nextInt();
		
		System.out.println("Insira o 2Âº nÃºmero: ");
		B = input.nextInt();
		
		System.out.println("Insira o 3Âº nÃºmero: ");
		C = input.nextInt();
		
		R = Math.pow(A+B, 2.0);
		S = Math.pow(B+C, 2.0);
		D = (R + S) / 2;
		
		System.out.println("A expressÃ£o resulta em: " + D);
	}

}
