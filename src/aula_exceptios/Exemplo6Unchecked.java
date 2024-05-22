package aula_exceptios;

public class Exemplo6Unchecked {

	public static void main(String[] args) {
	
		System.out.println(divisao(8,0));
		System.out.println("Código finalizado"); // n tratamos, então n será executado essa última linha. Chame a função dentro dos blocos Try e catch.
		

	}
	
	/**
	 * @param numerador
	 * @param denominador nao pode ser 0
	 * @throws IllegalArgumentException caso denominador seja 0
	 * 
	 * */
	static int divisao(int numerador, int denominador) {	
		try {
			return numerador / denominador;
		}catch(ArithmeticException e) {
			System.out.println("Erro");
		}
		return 0;
	}
	
	
	
	/*
	 * Podde usar dessa forma tbm
	 * if(denominador == 0) {
			throw new ArithmeticException("Argumento inválido");
		}
		return numerador/denominador;*/

}
