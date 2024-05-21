package exceptions;

public class Exemplo1Inicio {

	public static void main(String[] args) {
		
		int numerador = 8;
		int denominador = 0;

		System.out.println("Antes da exceção");
		System.out.println("Resultado da divisão: " + (numerador / denominador));
		System.out.println("Após o tratamento da exceção");
		
		

	}

}






/*
 * System.out.println("Antes da exceção");
		try {
			System.out.println("Resultado da divisão: " + (numerador / denominador));
		}catch (ArithmeticException e) {
			System.out.println("Erro ao dividir por zero");	
		}
		
		System.out.println("Após o tratamento da exceção");
		*/