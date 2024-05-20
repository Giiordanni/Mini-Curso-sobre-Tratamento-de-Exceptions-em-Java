package exceptions;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Exemplo8Finaly {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		try {
			// instrução
		}catch(ArithmeticException excecao1) {
			System.out.println("Erro ao dividir por zero");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Posição do array inválida");
		}finally {
			// instrução de liberação de recursos
			System.out.println("Acontece independetemente da exception\n");
			scanner.close();
		}
		
		
	}


}


/*
	int[] numerador = {4,8,16,32,64,128};
	int[] denominador = {2,0,4,8,0};	
*	
*	for(int i=0; i<numerador.length; i++) {
			try {
				System.out.println(numerador[i] + "/" + denominador[i] + " = " + (numerador[i]/denominador[i]));
				// instrução
				}catch(ArithmeticException excecao1) {
					System.out.println("Erro ao dividir por zero");
				}catch(ArrayIndexOutOfBoundsException e){
					System.out.println("Posição do array inválida");
				}finally {
					// instrução de liberação de recursos
					System.out.println("Acontece independetemente da exception\n");
					scanner.close();
				}
		}
*
*/





/*
 * System.out.print("Insira o primeiro valor: ");
			double numero1 = scanner.nextDouble();
			System.out.print("Insira o segundi valor: ");
			double numero2 =  scanner.nextDouble(); //  Isso não gera uma exceção de ArithmeticException, pois não é considerado um erro aritmético em Java, mas sim uma operação válida de ponto flutuante.
			if(numero2 == 0) {
				throw new ArithmeticException();
			}
			System.out.printf("%.2f\n", numero1/numero2);
 * 
 * */
 