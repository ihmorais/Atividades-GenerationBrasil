/* Fa�a um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
expressa em anos, meses e dias.*/

package br.com.generation.introjava;

import java.util.Scanner;

public class idadeEmAnosMesesDias {
	
	public static void main(String[] args) {
		int idadeDiasTotal, idadeAnos, idadeMeses, idadeDias;	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe sua idade em dias: ");
		idadeDiasTotal = input.nextInt();
		
		idadeAnos = idadeDiasTotal/365;
		idadeMeses = (idadeDiasTotal%365)/30;
		idadeDias = (idadeDiasTotal%365) % 30;
		
		System.out.println("Você tem " + idadeAnos + " Anos, " + idadeMeses +  " Meses e " + idadeDias + " Dias.");
	}
	
	
	

}
