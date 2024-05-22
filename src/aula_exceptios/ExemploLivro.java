package aula_exceptios;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ExemploLivro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	
		boolean continuarloop = true;
		do {
			try {
				System.out.print("Informe o numerador: ");
				int numerador = sc.nextInt();
				System.out.print("Informe o denominador: ");
				int denominador = sc.nextInt();
	
				int resultado = divisao(numerador, denominador);
				System.out.printf("O resultado da divisão é: %d", resultado);
				
				continuarloop = false;
			}catch(InputMismatchException ex){
				ex.printStackTrace();
				System.out.println("Entrada inválida. Informe um número");
			}catch(ArithmeticException e){
				e.printStackTrace();
				System.out.println("Divisão por zero não é permitido");
			}finally {
				sc.nextLine(); //  descarta entrada paera o usuário tentar novamente
			}
			
		}while(continuarloop);
		
		
	}
	
	public static int divisao(int numerador, int denominador) throws ArithmeticException{
		return numerador / denominador;
	}

}
