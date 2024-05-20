package exception_dio;
import java.util.Scanner;

public class VerificadorNumeroConta {
	public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in); 
	String numeroConta;
	boolean continuar = false;
	
	do {
		System.out.print("Para entrar na sua conta informe o número (8 dígitos): ");
		
	 try {
		 numeroConta = scanner.next();
		 continuar = verificarNumeroConta(numeroConta);
		  
	 }catch(IllegalArgumentException e) {
		 System.out.println("Erro: " + e.getMessage());
	 }
	}while(continuar == false);
	              
 }
	
	
	    private static boolean verificarNumeroConta(String numeroConta) throws IllegalArgumentException{ 
	    	if (numeroConta.length() == 8 ) {
	    		System.out.println("Número da conta válido!");
	    		 return true;
	    	}
	    	else {
	    		throw new IllegalArgumentException("Numero de conta invalido. Digite exatamente 8 digitos.");
	    	}
	   }
}