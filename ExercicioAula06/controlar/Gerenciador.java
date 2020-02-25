package controlar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import modelo.Pessoas;

public class Gerenciador {

	private Map<String, Pessoas> pessoa = new HashMap<String, Pessoas>();
	
	public List<Pessoas> listarPessoas() {
		return new ArrayList<Pessoas>(pessoa.values());
	}

	public Pessoas recuperarPessoas(String codigo){
		return pessoa.get(codigo);
	}

	public void criarPessoa(Pessoas pessoa){
		pessoa.put(pessoa.getCodigo(), pessoa);

	}
	
	public void atualizarPessoa(Pessoas pessoa){
		pessoa.put(pessoa.getCodigo(), pessoa);
	}

	public void removerPessoa(Pessoas pessoa){
		pessoa.remove(pessoa.getCodigo(), pessoa);
	}
	

}
