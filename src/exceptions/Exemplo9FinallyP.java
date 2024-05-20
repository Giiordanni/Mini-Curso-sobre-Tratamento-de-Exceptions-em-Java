package exceptions;

public class Exemplo9FinallyP {
	public static void main(String []args) {
	
		
		int[] numeros = {2, 4, 6, 8, 10, 16, 18};
		int[] denominador = {1, 3, 0, 2, 0};
		
		for(int i = 0; i<numeros.length; i++) {
			try {
				System.out.println(numeros[i] + "/" + denominador[i] + "=" + numeros[i]/denominador[i]);
			}catch(ArithmeticException e) {
				System.out.println("Erro ao dividir por 0");
				System.exit(0);
				
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Posiçao do array inválida");
				System.exit(0);
				
			}finally {
				System.out.println("Essa linha é impressa após o try e o catch");
				System.out.println();
			}
		}
		

	}
	

}
