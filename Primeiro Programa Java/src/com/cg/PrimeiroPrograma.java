package com.cg;

public class PrimeiroPrograma {

	private static Gato gato;

	public static void main(String[] args) {
		
		setGato(new Gato());
		
		
		/*int a = 4;
		int b = 5;
		
		System.out.println("Hello World!" + (a+b));*/
		

	}

	public static Gato getGato() {
		return gato;
	}

	public static void setGato(Gato gato) {
		PrimeiroPrograma.gato = gato;
		
		System.out.println(gato);
	}

}
