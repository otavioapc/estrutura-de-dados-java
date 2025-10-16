
public class ListaExemplo {
	
	//Atributos
	
	private No inicio;
	private int n;
	
	//Construtor
	
	public ListaExemplo() {
		inicio = null;
		n = 0;
	}
	
	//Métodos
	
	public int size() {
		return n;
		
	}
	
	public void add(int elemento) {
		
		No novo = new No(elemento);
		
		if(inicio == null) {
			inicio = novo;
			
		}
		else {
			
			int i;
			No atual = inicio;
			
			for(i = 0; i < n -1; i++) {
				atual = atual.proximo;
			}
			atual.proximo = novo;
			
		}
		n++;		
	}
	
	public void listar() {
		
		int i;
		No atual = inicio;
		
		for(i = 0; i < n; i++) {
			System.out.print(atual.elemento+" ");
			atual = atual.proximo;
		}
		
		System.out.println();
				
	}
	

}
