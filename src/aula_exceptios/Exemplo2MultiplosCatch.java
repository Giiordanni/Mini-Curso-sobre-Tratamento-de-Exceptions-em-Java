package aula_exceptios;

public class Exemplo2MultiplosCatch {

	public static void main(String[] args) {
		
		
		int[] numerador = {4,8,16,32,64,128, 9, 6};
		int[] denominador = {2,4,0,8,0};
		
		for(int i = 0; i<numerador.length; i++) {
			
			try {
				System.out.println(numerador[i] + "/" + denominador[i] + " = " + (numerador[i]/denominador[i]));
			}
			catch(ArithmeticException e){
				System.out.println("erro ao dividir por zero");
			}
			
			catch(IndexOutOfBoundsException e) {
				System.out.println("Ocorreu um erro");
			}
		}
		
	}

}	
	
	
	
	
	
	
	/*
	 * try {
				System.out.println(numerador[i] + "/" + denominador[i] + " = " + (numerador[i]/denominador[i]));
			}catch(ArithmeticException excecao1) {
				System.out.println("Erro ao dividir por zero");
			}catch(ArrayIndexOutOfBoundsException excecao2) {
				System.out.println("Posição do array inválida");
			}
	 * */


