package atividades_exemplos;


public class LoginException extends Exception {
	
	LoginException(){
		super("Login inválido!");
	}
	
	
	LoginException(String messagem){
		super(messagem);
	}
	

}
