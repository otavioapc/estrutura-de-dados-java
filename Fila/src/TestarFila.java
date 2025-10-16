
public class TestarFila {
	
	public static void main(String[] args) {
		
		Fila fila = new Fila();
		int elemento;
		
		fila.enfileirar(9);
		fila.enfileirar(10);
		fila.enfileirar(11);
		fila.enfileirar(12);		

		fila.imprimirFila();
		
		fila.desenfileirar();
		
		fila.imprimirFila();
		
		
		
	}

}
