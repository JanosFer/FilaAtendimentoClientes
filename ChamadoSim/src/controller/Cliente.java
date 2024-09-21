package controller;

public class Cliente {
	private int senha;
	private String nome;
	
	public String toString() {
		return "Cliente [senha = "+senha+", nome = "+nome+"]";
	}
	
	public void setSenha(int senha) { 
		this.senha = senha;
	}
	
	public int getSenha() {
		return senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
