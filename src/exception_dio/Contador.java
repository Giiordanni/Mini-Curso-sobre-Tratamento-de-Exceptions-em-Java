package exception_dio;

import java.util.Scanner;
public class Contador {

	public static void main(String[] args) {
		
		/* O sistema recebe dois parâmetros via terminal que representarão dois números inteiros.
		 * Com estes dois números você deverá obter a quantidade de interações (for) e realizar a impressão no console  dos números incrementados
		 * exemplo: P1 = 12 e P2 = 30. 
		 *   print(30 - 12 = 18);
		 *   print(1, 2, 3, ... , 18);
		 *
		 **/ 


		Scanner leitor = new Scanner(System.in);
		System.out.print("Digite o primeiro parâmetro: ");
		int parametroUm = leitor.nextInt();
		System.out.print("Digite o segundo parâmetro: ");
		int parametroDois = leitor.nextInt();
		
		try {
			contar(parametroUm, parametroDois);
		}catch(ParametrosInvalidosException exception) {
			exception.printStackTrace();
		}
	}
	
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		if(parametroUm > parametroDois) {
			throw new ParametrosInvalidosException();
		}
		
		int contagem = parametroDois - parametroUm;
		System.out.printf("O número de ocorrências baseado nas entradas vai ser %d - %d = %d\n",parametroDois, parametroUm, contagem);
		for (int i = 0; i<contagem;i++) {
			System.out.print((i+1) + " ");
		}
	}

}