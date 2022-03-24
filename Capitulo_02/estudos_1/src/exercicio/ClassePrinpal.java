package exercicio;

public class ClassePrinpal {

	public static void main(String[] args) {
		Boolean wrapperBoolean = new Boolean("true");
		System.out.println(wrapperBoolean.booleanValue());
		System.out.println(wrapperBoolean);
		
		// if
		if ( wrapperBoolean ) {
			System.out.println("Passou!");
		}
		
		// if then
		if ( wrapperBoolean ) {
			System.out.println("Passou!");
		} else if ( !wrapperBoolean ) {
			System.out.println("Não passou!");
		}
		
		// if then else
		if ( wrapperBoolean ) {
			System.out.println("Passou!");
		} else if ( !wrapperBoolean ) {
			System.out.println("Não passou!");
		} else {
			System.out.println("Padrão");
		}
		
		if ( wrapperBoolean ) {
			System.out.println("Passou!");
		} else {
			System.out.println("Padrão");
		}
		
		// operador ternário
		String resultado = (wrapperBoolean) ? "ABC" : "BBB";
		System.out.println(resultado);
		
		// switch
		int a = 5;
		switch (a) {
			case 1:
				System.out.println("Passou!");
				break;
			case 2:
				System.out.println("Não Passou!");
				break;
			default:
				System.out.println("Não foi!");
				break;
		}
		
		
		// teste básico:
		boolean varBool = true;
		
		if (varBool) System.out.println("Olá mundo");
		else System.out.println("Tchau mundo");
		
		if (varBool = false) System.out.println("Olá mundo");
		else System.out.println("Tchau mundo");
		
		if (varBool == false) System.out.println("Olá mundo");
		else System.out.println("Tchau mundo");
		
		
	}

}
