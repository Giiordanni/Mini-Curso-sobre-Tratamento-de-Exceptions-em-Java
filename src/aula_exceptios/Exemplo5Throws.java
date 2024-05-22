package aula_exceptios;

public class Exemplo5Throws {

	public static void main(String[] args) {
	
		// Pegar uma exceção do tipo ArithmeticException
		try{
			lancar();
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}
		
		

	}
	
	static void lancar() throws ArithmeticException{
		int a = 8;
		int b = 0;
		if (b == 0) {
			throw new ArithmeticException("Error");
		}
		System.out.println(a/b);
	}

}

