package controle;

import java.util.ArrayList;


public class Gerenciador {
	 /**
      * Instituto Federal de Educação, Ciência e Tecnológica da Paraíba
      * Licenciatura em Computação
      * Programação Orientada a Objetos II
      * Professor: Diego Ernesto Rosa Pessoa
      * Tutor: Danilo Rangel Arruda Leite
      * Aluno: Jonas Nunes Porpino
     */
	
	public ArrayList<String> produtos = new ArrayList<String>();
	
	public void gerarCodigo(int codigo) {
		produtos.add(Integer.toString(codigo));
	}
	
	public void gerarDescricao(String descricao) {
		produtos.add(descricao);
	}
	
	public void gerarPreco(int preco) {
		produtos.add(Float.toString(preco));
	}
	
	public void gerarValidade(String validade) {
		produtos.add(validade);
	}

}