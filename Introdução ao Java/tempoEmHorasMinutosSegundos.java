package br.com.generation.introjava;

import java.util.Scanner;

public class tempoEmHorasMinutosSegundos {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int duracaoSegundosTotal, duracaoHoras, duracaoMinutos, duracaoSegundos;
		
		System.out.println("Informa a duração do evento em segundos: ");
		duracaoSegundosTotal = input.nextInt();
		
		duracaoHoras = duracaoSegundosTotal / 3600;
		duracaoMinutos = (duracaoSegundosTotal%3600) / 60;
		duracaoSegundos = (duracaoSegundosTotal%3600) % 60;
		
		System.out.println("A duração do evento foi de " + duracaoHoras + " Horas, " + duracaoMinutos + " Minutos e " + duracaoSegundos + " Segundos." );
		
		

	}

}
