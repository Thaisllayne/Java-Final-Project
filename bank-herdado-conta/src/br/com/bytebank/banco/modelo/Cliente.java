package br.com.bytebank.banco.modelo;

/**
 * Classe que representa um cliente no Bytebank;
 * 
 * @author thais
 * 
 * @version 0.1
 *
 */

public class Cliente {

	private String cpf;
	private String profissao;
	private String nome;
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}