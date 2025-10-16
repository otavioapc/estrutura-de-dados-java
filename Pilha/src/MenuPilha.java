import java.util.Scanner;

public class MenuPilha {
	
	private Scanner mahomes;
	private Pilha p;
	
	public void opcoes() {
		
		System.out.println("Menu Pilha");
		System.out.println("1 - Push");
		System.out.println("2 - Pop");
		System.out.println("3 - Nº de elementos");
		System.out.println("4 - Sair");
		System.out.println();
				
		
	}
	
	public void menu() {
		
		int op, elemento;
		
		do {
			
			opcoes();
			System.out.println("Escolha uma opção:");
			op = Integer.parseInt(mahomes.nextLine());
			
			switch(op) {
			
			case 1:
				System.out.println("Insira o elemento:");
				elemento = Integer.parseInt(mahomes.nextLine());
				p.push(elemento);
				break;
			case 2:
				
			
			}
			
			
		}while(op != 3);
		
	}
	

}
