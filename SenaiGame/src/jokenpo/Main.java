package jokenpo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int resposta = 1;
		Scanner scanner = new Scanner(System.in);
		Placar placar = new Placar();
		while (resposta == 1) {
			int jogada = 0;
			System.out.println("Por favor, escolha a sua jogada:\n[0] Pedra\n[1] Papel\n[2] Tesoura");
			do {
				if (jogada != 0) {
					System.out.println("Valor inválido. Tente novamente.");
				}
				while (!scanner.hasNextInt()) {
					System.out.println("Valor inválido. Tente novamente.");
					scanner.next();
				}
				jogada = scanner.nextInt();
			} while (jogada < 0 | jogada > 3);
			
			Jogador jogador = new Jogador(jogada);
			Jogador computador = new Jogador(jogada);
			
			computador.setJogadaAleatoria();

			String resultado = jogador.jogar(computador);
			if (resultado == "empate") {
				System.out.println("Você jogou " + jogador.getJogada() + " e o computador jogou " + computador.getJogada() + "\nResultado = empate");
			}
			else if (resultado == "jogador") {
				System.out.println("Você jogou " + jogador.getJogada() + " e o computador jogou " + computador.getJogada() + "\nResultado = Vitória do Jogador!");
				placar.addJogador1();
			}
			else {
				System.out.println("Você jogou " + jogador.getJogada() + " e o computador jogou " + computador.getJogada() + "\nResultado = Vitória do Computador :(");
				placar.addJogador2();
			}
			System.out.println(placar);
			System.out.println("\nVocê quer jogar novamente?\n[0] Não [1] Sim\n");
			if (!scanner.hasNextInt()) {
				resposta = 0;
			}
			else {
				resposta = scanner.nextInt();
			}
		}
		System.out.println("\nJogo finalizado!");
		scanner.close();
	}

}
