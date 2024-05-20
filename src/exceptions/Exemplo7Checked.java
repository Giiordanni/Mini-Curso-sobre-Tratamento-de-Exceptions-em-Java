package exceptions;

public class Exemplo7Checked {

	public static void main(String[] args) {
	
		System.out.println(FormatadordeCPF("11913744400"));
	}
	
	static String FormatadordeCPF(String cpf){	
		if(cpf.length() != 11) {
			// lançar uma exceção da classe excception
		}
		return "119.137.444-00";
	}


}




/*
 * try {
			System.out.println(FormatadordeCPF("11913744400"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		// É obrigatório colocar o try e o catch por ser um exceção do tipo checked!
 * */



/*
 * static String FormatadordeCPF(String cpf) throws Exception{	
		if(cpf.length() != 11) {
			throw new Exception();
		}
		return "119.137.444-00";
	}
 * */
