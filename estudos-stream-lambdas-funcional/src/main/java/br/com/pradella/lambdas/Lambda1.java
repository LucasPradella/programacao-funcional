package br.com.pradella.lambdas;

public class Lambda1 {
	
	public static void main(String[] args) {
		System.out.println("===== TESTE ESTRUTURA LAMBDA =====");
		
		// implementacao da classe anonima Runnable
		Runnable r1 =  new Runnable() {
			@Override
			public void run() {
				System.out.println("Estudos Expressao Lambda 1 ");
				
			}
		};
		
		
		Runnable r2 = () -> System.out.println("Estudos Expressao Lambda 2 ");
		
/*	
 * estrutura
 * 
 * 	Runnable r2; 
		r2 = () //Lista de argumentos
				-> // seta 
				System.out.println("Estudos Expressao Lambda 2 "); //corpo, bloco de execuçao 
				*/
				
		
		r1.run();
		r2.run();
		
		
	}

	
	
}
