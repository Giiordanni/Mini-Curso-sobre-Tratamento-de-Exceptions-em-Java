package atividades_exemplos;

import java.util.Scanner;

public class TesteExceptionResposta {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String usuarioDB = "Giordanni";
		String senhaDB = "123";
		
		try {
			fazendoLogin(teclado, usuarioDB, senhaDB);
		} catch (LoginException e) {
			System.out.println("Erro: " + e.getMessage());
			e.printStackTrace();
		}finally {
			teclado.close();
		}
		
	}
	
	private static void fazendoLogin(Scanner teclado, String usuarioDB, String senhaDB) throws LoginException{
		System.out.print("Nome: ");
		String nomeUsuario = teclado.nextLine();
		System.out.print("Senha: ");
		String senhaUsuario = teclado.nextLine();
		
		if(!usuarioDB.equals(nomeUsuario) || !senhaDB.equals(senhaUsuario)) {
		//	throw new LoginException();
		 	throw new LoginException("Email ou senha inválidos");

		}
		System.out.println("Login Existente. Bem vindo!");
	}

}
