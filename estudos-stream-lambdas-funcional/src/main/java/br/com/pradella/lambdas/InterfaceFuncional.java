package br.com.pradella.lambdas;

public class InterfaceFuncional {
	
	interface num{
		double getValue();
	}
	
	interface ValorNum{
		boolean vNum(int n);
	}
	
	
	interface ValorNum2{
		boolean vNum(int n,int n2);
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
		
		
		// implementacao
		ValorNum isPar = (int i) -> (i % 2) == 0; 
		
		
		// verifica se esse valor é par
		System.out.println(isPar.vNum(90));
		System.out.println(isPar.vNum(91));
		
		
		System.out.println("=====  Interfaces Funcionais 3 =====");
		
		ValorNum2 isDiv = (i, x) -> (i%x) == 0;

		
		// a divisão de valor 1,2 retorna um inteiro
		System.out.println(isDiv.vNum(10, 2));
		System.out.println(isDiv.vNum(10, 3));
		
		
		
		ValorNum2 espressao=(x, y) ->{
			int w = x + y;
			return w > 1000;
		};
		
		
		// verifica de a soma dos valores são maiores que 1000
		System.out.println(espressao.vNum(10, 10000));
		System.out.println(espressao.vNum(10, 10));
		
	}

	
	
}
