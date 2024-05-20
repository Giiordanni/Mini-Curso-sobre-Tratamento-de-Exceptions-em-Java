package exceptions;

public class Exemplo4MultiplosCatchSimilares {

	public static void main(String[] args) {

		int[] numerador = {4,8,16,32,64,128};
		int[] denominador = {2,0,4,8,0};
		
		for(int i=0; i<numerador.length; i++) {
			try {
			System.out.println(numerador[i] + "/" + denominador[i] + " = " + (numerador[i]/denominador[i]));
			}catch(ArithmeticException | ArrayIndexOutOfBoundsException excecao1) {
				System.out.println("Aconteceu um erro");
			}
			
		}
	}

}
