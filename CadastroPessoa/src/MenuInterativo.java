import java.util.Scanner;

public class MenuInterativo {

	private GerenciadorPessoas gerenciador;
	private Scanner mahomes;

	public MenuInterativo() {
		gerenciador = new GerenciadorPessoas();
		mahomes = new Scanner(System.in);

	}

	public void menu() {

		System.out.println("********MENU********");
		System.out.println("1 - Cadastrar Pessoa");
		System.out.println("2 - Imprimir");
		System.out.println("3 - Pesquisar");
		System.out.println("4 - Remover");
		System.out.println("5 - Sair");
		System.out.println();
	}

	public void selecionarOpcao() {

		int op, formaP, id;

		do {
			menu();
			System.out.println("Selecione a opção:");
			op = Integer.parseInt(mahomes.nextLine());

			switch (op) {

			case 1:
				cadastraPessoa(mahomes);
				break;
			case 2:
				gerenciador.imprimirPessoa();
				break;
			case 3:
				System.out.println("Como você deseja pesquisar?");
				System.out.println("1 - Nome");
				System.out.println("2 - Id");
				formaP = Integer.parseInt(mahomes.nextLine());
				if (formaP == 1) {
					System.out.println("Informe o nome:");
					String nome = mahomes.nextLine();
					gerenciador.pesquisarPessoa(nome);
				}
				if (formaP == 2) {
					System.out.println("Informe o Id:");
					id = Integer.parseInt(mahomes.nextLine());
					gerenciador.pesquisarPessoaId(id);
				}

				break;
			case 4:
				removerPessoa();
				break;
			case 5:
				break;
			default:
				System.out.println("Opção Inválida!");

			}
		} while (op != 4);

	}

	public void cadastraPessoa(Scanner mahomes) {

		Pessoa pessoa = new Pessoa();

		System.out.println("Informe o nome:");
		String nome = mahomes.nextLine();
		System.out.println("Informe o CPF:");
		String cpf = mahomes.nextLine();
		System.out.println("Informe a idade:");
		int idade = Integer.parseInt(mahomes.nextLine());
		System.out.println("Informe o sexo:");
		char sexo = mahomes.nextLine().toCharArray()[0];

		pessoa.setNome(nome);
		pessoa.setCpf(cpf);
		pessoa.setIdade(idade);
		pessoa.setSexo(sexo);

		gerenciador.cadastrarPessoa(pessoa);

	}

	public void removerPessoa() {

		System.out.println("Informe o id:");
		int id = Integer.parseInt(mahomes.nextLine());

		if (gerenciador.removerPessoaId(id)) {
			System.out.println("Cadastro Removido!");
		} else {
			System.out.println("Cadastro não encontrado!");
		}

	}
}
