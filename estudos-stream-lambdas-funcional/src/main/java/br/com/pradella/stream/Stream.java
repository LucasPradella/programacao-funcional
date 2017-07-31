package br.com.pradella.stream;

import java.util.Arrays;
import java.util.List;

public class Stream {

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
		
		
	}

}
