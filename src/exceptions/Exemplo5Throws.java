package exceptions;

public class Exemplo5Throws {

	public static void main(String[] args) {
	
		// Pegar uma exceção do tipo NullPointerException
		lancar();
		

	}
	
	static void lancar(){
		String nome = null;
		if (nome == null) {
		    throw new NullPointerException("Erro. Nome nulo");
		}
		System.out.println(nome);
	}

}





/*
 * Para pegar o printStackTrace
 * try{
		lancar();
	}catch(NullPointerException e) {
		e.printStackTrace();
		System.out.println(e.getMessage());	
	}
 * */
