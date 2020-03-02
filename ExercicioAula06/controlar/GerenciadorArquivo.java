package controlar;
     /**
      * Instituto Federal de Educação, Ciência e Tecnológica da Paraíba
      * Licenciatura em Computação
      * Programação Orientada a Objetos II
      * Professor: Diego Ernesto Rosa Pessoa
      * Tutor: Danilo Rangel Arruda Leite
      * Aluno: Jonas Nunes Porpino
     */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

import modelo.Pessoas;


public class GerenciadorArquivo {
	private List<Pessoas> cadastro = new ArrayList<Pessoas>();
	
	
	
	
	public void lerArquivo() throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("CadastroDePesooas.txt"); 
        ObjectInputStream objInputStream = new ObjectInputStream(fileInputStream);
        this.cadastro = (List<Pessoas>)objInputStream.readObject(); 
	}
	
	public void escreverArquivo() throws FileNotFoundException, IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("CadastroDePesooas.txt");
        ObjectOutputStream objOutputStream = new ObjectOutputStream(fileOutputStream);
        objOutputStream.writeObject(this.cadastro);
	}
	
	public List<Pessoas> listarPessoas() {
        try {
            this.lerArquivo();
        } catch (IOException ex) {
            Logger.getLogger(Gerenciador.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Gerenciador.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cadastro;
    }
    public Optional<Pessoas> recuperarPessoa(String codigo) {
        Optional<Pessoas> pessoaSelecionado = Optional.empty();
        try {
            this.lerArquivo();
            pessoaSelecionado = cadastro.stream().filter( (pesssoa) -> pesssoa.getCodigo().equals(codigo) ).findFirst();
        } catch (IOException ex) {
            Logger.getLogger(Gerenciador.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Gerenciador.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pessoaSelecionado;
    }
    public void criarPessoa(Pessoas pessoa){
        cadastro.add(pessoa);
        try {
            this.escreverArquivo();
        } catch (IOException ex) {
            Logger.getLogger(Gerenciador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void atualizarPessoa(Pessoas pessoa) {
        if (this.recuperarPessoa(pessoa.getCodigo()).isPresent()) {
            cadastro.remove(pessoa);
        } 
        cadastro.add(pessoa);
        try {
            this.escreverArquivo(); 
        } catch (IOException ex) {
            Logger.getLogger(Gerenciador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void removerPessoa(Pessoas pessoa) {
        cadastro.remove(pessoa);
        try {
            this.escreverArquivo();
        } catch (IOException ex) {
            Logger.getLogger(Gerenciador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


}