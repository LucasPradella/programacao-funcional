package br.com.pradella.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;



public class Stream {

	private static void filtro(List<String> lista, Predicate<String> condicao) {
		for (String  s : lista) 
			if (condicao.test(s)) 
				System.out.println(s);
		
	}
	
	
	
	public static void main(String[] args) {
		
		
		List<String> lista1 = Arrays.asList("Santa Catarina","Parana","São Paulo","Rio de Janeiro","Brasilia","Ceara" );
		

		System.out.println("======SEM STREAM======");
		for (String s : lista1) {
			System.out.println(s);
		}

		
		System.out.println("======COM STREAM======");
		lista1.forEach(x->System.out.println(x));
		
		//metodo reference
		System.out.println("---------------");
		lista1.forEach(System.out::println);
		
		
		System.out.println("======PREDICATE======");
		
		
		System.out.println("Estados que inicia com a letra S");
		filtro(lista1, (s) -> s.startsWith("S") );
		
		System.out.println("------------------------------");
		System.out.println("Estados que termina com a letra a");
		filtro(lista1, (s) -> s.endsWith("a") );
		
		
		System.out.println("------------------------------");
		System.out.println("Imprimir toda a lista");
		filtro(lista1, (s) -> true);
		
		System.out.println("------------------------------");
		System.out.println("Nao imprimir toda a lista");
		filtro(lista1, (s) -> false);
		
		
		System.out.println("------------------------------");
		System.out.println("Imprimir nomes com mais de 10 caracteres");
		filtro(lista1, (s) -> s.length()>10);
		
		
	}

}
