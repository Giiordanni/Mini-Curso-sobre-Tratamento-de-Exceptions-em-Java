package exception_dio;

public class ParametrosInvalidosException extends Exception{

	ParametrosInvalidosException() {
		super("Parâmetros inválidos");
	}
	
	ParametrosInvalidosException(String message){
		super(message);
	}

}