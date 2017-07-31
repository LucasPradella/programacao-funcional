package br.com.pradella;

public class InterfaceFuncional {
	
	interface num{
		double getValue();
	}
	
	public static void main(String[] args) {
		System.out.println("=====  Interfaces Funcionais =====");

		num n = () -> 10.00;
		System.out.println(n.getValue());
	}

	
	
}
