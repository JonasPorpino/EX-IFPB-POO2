package modelo;
 /**
      * Instituto Federal de Educação, Ciência e Tecnológica da Paraíba
      * Licenciatura em Computação
      * Programação Orientada a Objetos II
      * Professor: Diego Ernesto Rosa Pessoa
      * Tutor: Danilo Rangel Arruda Leite
      * Aluno: Jonas Nunes Porpino
     */
public class Produtos {
	private String codigo;
	private String descricao;
	private String preco;
	private String validade;
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String nCoigo) {
		this.codigo = nCoigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getPreco() {
		return preco;
	}
	public void setPreco(String preco) {
		this.preco = preco;
	}
	public String getValidade() {
		return validade;
	}
	public void setValidade(String validade) {
		this.validade = validade;
	}
	
	
}