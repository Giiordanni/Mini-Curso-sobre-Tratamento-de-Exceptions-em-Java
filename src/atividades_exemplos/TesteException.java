package atividades_exemplos;

import java.util.Scanner;

public class TesteException {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		// Nome e senha cadaastrados no sistema
		String usuario = "Giordanni";
		String senha = "123";
		
		// TODO: Inicialize um bloco try-catch para capturar exceções:
		// TODO: Chame o método fazendoLogin, passando o nome e a senha já cadasstrado no sitema:
		// TODO: Capture a exceção do tipo LoginException, que pode ser lançada pelo método fazendoLogin:
		// Aqui é impresso uma mensagem de erro, mostrando a mensagem associada à exceção:
		            System.out.println("Erro: " + e.getMessage()); 
					e.printStackTrace();
		         finally {
		            teclado.close();
		        }
	}
	static void fazendoLogin(String UsuarioDB, String senhaDB, Scanner teclado) throws LoginException{
		// TODO: Leia a entrada do usuário como uma string representando nome e senha:
		// TODO: Verifique se o nome e a senha digitada corresponde a um usuário existente
		if (!UsuarioDB.equals(NomeUsuario) || !senhaDB.equals(SenhaUsuario)) {
			// TODO: Implemente uma exceção do tipo IllegalArgumentException, caso o número de conta não tenha 8 dígitos:
		}		
		// Imprime que o número de conta é válido:
		System.out.println("Login Existente. Bem vindo!");
	}
}
            

