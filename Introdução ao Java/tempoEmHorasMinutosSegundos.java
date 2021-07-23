/* Faça um sistema que leia o tempo de duração de um evento em uma fábrica
expressa em segundos e mostre-o expresso em horas, minutos e segundos.*/

package br.com.generation.introjava;

import java.util.Scanner;

public class tempoEmHorasMinutosSegundos {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int duracaoSegundosTotal, duracaoHoras, duracaoMinutos, duracaoSegundos;
		
		System.out.println("Informa a duraÃ§Ã£o do evento em segundos: ");
		duracaoSegundosTotal = input.nextInt();
		
		duracaoHoras = duracaoSegundosTotal / 3600;
		duracaoMinutos = (duracaoSegundosTotal%3600) / 60;
		duracaoSegundos = (duracaoSegundosTotal%3600) % 60;
		
		System.out.println("A duraÃ§Ã£o do evento foi de " + duracaoHoras + " Horas, " + duracaoMinutos + " Minutos e " + duracaoSegundos + " Segundos." );
		
		

	}

}
