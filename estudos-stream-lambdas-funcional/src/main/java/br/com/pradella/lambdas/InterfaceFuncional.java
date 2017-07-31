package br.com.pradella.lambdas;

public class InterfaceFuncional {
	
	interface num{
		double getValue();
	}
	
	interface ValorNum{
		boolean vNum(int n);
	}
	
	public static void main(String[] args) {
		System.out.println("=====  Interfaces Funcionais 1 =====");

		// expressao lambda utilizada como constante
		num n = () -> 10.00;
		System.out.println(n.getValue());
		
		
		
		
		System.out.println("=====  Interfaces Funcionais 2 =====");
		// utlizacao da classe math + estrutura lambda
		num n2 = () -> Math.random() * 100;
		System.out.println(n2.getValue());
		
		ValorNum isPar = (int i) -> (i % 2) == 0; 
		
		System.out.println(isPar.vNum(90));
		System.out.println(isPar.vNum(91));
		
	}

	
	
}
