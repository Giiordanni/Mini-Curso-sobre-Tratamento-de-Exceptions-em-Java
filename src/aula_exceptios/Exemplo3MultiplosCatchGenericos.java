package aula_exceptios;

public class Exemplo3MultiplosCatchGenericos {

	public static void main(String[] args) {
		
		int[] numerador = {4,8,16,32,64,128,9};
		int[] denominador = {2,4,0,8,0};
		
		for(int i = 0; i<numerador.length; i++) {
			try {
				System.out.println(numerador[i] + "/" + denominador[i] + " = " + (numerador[i]/denominador[i]));
			}catch(ArithmeticException excecao1) {
				System.out.println("Erro ao dividir por zero");
			}catch(Throwable excecao2) { // não é boa prática por n saber o erro exato
				System.out.println("Ocorreu um erro");
			}
		}


	}

}
