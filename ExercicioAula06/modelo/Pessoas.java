package modelo;
     /**
      * Instituto Federal de Educação, Ciência e Tecnológica da Paraíba
      * Licenciatura em Computação
      * Programação Orientada a Objetos II
      * Professor: Diego Ernesto Rosa Pessoa
      * Tutor: Danilo Rangel Arruda Leite
      * Aluno: Jonas Nunes Porpino
     */

import controlar.Gerenciador;

public class Pessoas extends Gerenciador {
	private String codigo;
    private String nome;
	private String email;
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
    }

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
    }

	public String getEmail() {
		return email;
    }
    public void setEmail(String email) {
		this.email = email;
    }
	public void put(String codigo, Pessoas pessoa) {
	}
	public void remove(String codigo, Pessoas pessoa) {
	}
}