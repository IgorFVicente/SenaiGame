package jokenpo;

import java.util.Random;

public class Jogador {
	private String[] jogadas = {"Pedra", "Papel", "Tesoura"};
	private String jogada;
	private String vencedor;
	
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
	
	public String getVencedor() {
		return vencedor;
	}

	public void setVencedor(String vencedor) {
		this.vencedor = vencedor;
	}

	public String jogar(Jogador adversario) {
		if (this.jogada == adversario.jogada) {
			vencedor = "empate";
		}
		else if (this.jogada == "Pedra" & adversario.jogada == "Tesoura") {
			vencedor = "jogador";
		}
		else if (this.jogada == "Papel" & adversario.jogada == "Pedra") {
			vencedor = "jogador";
		}
		else if (this.jogada == "Tesoura" & adversario.jogada == "Papel") {
			vencedor = "jogador";
		}
		else {
			vencedor = "computador";
		}
		return vencedor;
	}
}
