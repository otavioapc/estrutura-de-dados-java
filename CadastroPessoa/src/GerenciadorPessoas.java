import java.util.ArrayList;

public class GerenciadorPessoas {

	// Atributos

	// ArrayList <tipoDaLista> nomeLista;

	private ArrayList<Pessoa> pessoas;
	private int id;

	// Construtor

	public GerenciadorPessoas() {
		id = 1;
		pessoas = new ArrayList<Pessoa>();
	}

	// Métodos

	public void cadastrarPessoa(Pessoa pessoa) {

		pessoa.setId(id);
		id++;
		pessoas.add(pessoa);

	}

	public void imprimirPessoa() {

		// Percorrer ArrayList (Lista)
		// for(Criar um objeto "cópia" : indicar a lista que ele deve acessar){}

		System.out.println("******Pessoas Cadastradas******");

		for (Pessoa pessoaAtual : pessoas) {

			System.out.println("ID:" + pessoaAtual.getId());
			System.out.println("Nome: " + pessoaAtual.getNome());
			System.out.println("CPF: " + pessoaAtual.getCpf());
			System.out.println("Idade: " + pessoaAtual.getIdade());
			System.out.println("Sexo: " + pessoaAtual.getSexo());
			System.out.println();

		}

	}

	public void pesquisarPessoa(String nome) {

		boolean encontrou = false;

		for (Pessoa pessoaAtual : pessoas) {
			if (pessoaAtual.getNome().equals(nome)) {
				System.out.println("ID:" + pessoaAtual.getId());
				System.out.println("Nome: " + pessoaAtual.getNome());
				System.out.println("CPF: " + pessoaAtual.getCpf());
				System.out.println("Idade: " + pessoaAtual.getIdade());
				System.out.println("Sexo: " + pessoaAtual.getSexo());
				System.out.println();
				encontrou = true;
			}

		}

		if (!encontrou) {
			System.out.println("Pessoa não cadastrada!");
		}

	}

	public void pesquisarPessoaId(int id) {

		boolean encontrou = false;

		for (Pessoa pessoaAtual : pessoas) {
			if (pessoaAtual.getId() == id) {
				System.out.println("ID:" + pessoaAtual.getId());
				System.out.println("Nome: " + pessoaAtual.getNome());
				System.out.println("CPF: " + pessoaAtual.getCpf());
				System.out.println("Idade: " + pessoaAtual.getIdade());
				System.out.println("Sexo: " + pessoaAtual.getSexo());
				System.out.println();
				encontrou = true;
			}
		}

		if (!encontrou) {
			System.out.println("Pessoa não cadastrada!");
		}

	}

	public boolean removerPessoaId(int id) {

		return pessoas.removeIf(pessoa -> pessoa.getId() == id);

	}

	public void ordenarPessoas() {

		int i, j;
		Pessoa copia;

		for (i = 1; i < pessoas.size(); i++) {

			copia = pessoas.get(i);
			j = i - 1;

			while (j >= 0 && pessoas.get(j).getNome().compareTo(copia.getNome()) > 0) {

			}

		}

	}

}
