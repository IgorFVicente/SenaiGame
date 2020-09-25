package jokenpo;

public class Placar {
	private int jogador1 = 0;
	private int jogador2 = 0;
	
	public int getJogador1() {
		return jogador1;
	}
	
	public void addJogador1() {
		this.jogador1 = jogador1 + 1;
	}
	
	public int getJogador2() {
		return jogador2;
	}
	
	public void addJogador2() {
		this.jogador2 = jogador2 + 1;
	}
	
	@Override
	public String toString() {
		return "\nPlacar:\njogador: " + jogador1 + " X computador: " + jogador2;
	}
}
