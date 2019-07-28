package com.lf2a.Java_Examples.socket.envio_objeto;

import java.io.Serializable;

class Test implements Serializable {
	private static final long serialVersionUID = 1L;
	String nome;
	int idade;
	double peso;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
}
