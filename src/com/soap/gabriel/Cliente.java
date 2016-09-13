package com.soap.gabriel;

import java.util.Random;

public class Cliente {
	private String nome;
	private int codigo;
	
	public Cliente(String nome){
		//i wanted to generate a random number from 0 to 100 for the Client ID
		Random num = new Random();
		this.codigo = num.nextInt(100);
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
}
