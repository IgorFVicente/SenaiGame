package jokenpo;

import java.util.Random;

public class Jogador {
	private String[] jogadas = {"Pedra", "Papel", "Tesoura"};
	private String jogada;
	
	public Jogador(int jogada) {
		this.jogada = jogadas[jogada];
	}

	public String getJogada() {
		return jogada;
	}
	
	public void setJogada(int jogada) {
		this.jogada = jogadas[jogada];
	}
	
	public void setJogadaAleatoria() {
		int rnd = new Random().nextInt(2);
		this.jogada = this.jogadas[rnd];
	}
	
	public String jogar(Jogador adversario) {
		String resultado;
		if (this.jogada == adversario.jogada) {
			resultado = "Empate";
		}
		else if (this.jogada == "Pedra" & adversario.jogada == "Tesoura") {
			resultado = "Vitória do jogador!";
		}
		else if (this.jogada == "Papel" & adversario.jogada == "Pedra") {
			resultado = "Vitória do jogador!";
		}
		else if (this.jogada == "Tesoura" & adversario.jogada == "Papel") {
			resultado = "Vitória do jogador!";
		}
		else {
			resultado = "Vitória do computador :(";
		}
		return "Você jogou " + this.jogada + " e o computador jogou " + adversario.jogada + ".\nResultado = " + resultado;
	}
}
