package aula_exceptios;

public class Exemplo7Checked {

	public static void main(String[] args) {
	
		try {
			System.out.println(FormatadordeCPF("11913744400"));
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("-----");
			
		}
		
		System.out.println("-----");
	}
	
	
	static String FormatadordeCPF(String cpf) throws Exception{	
		if(cpf.length() != 11) {
			throw new Exception(/*"Posso passsssar umma menssagem aqui"*/);
		}
		return "119.137.444-00";
	}


}





