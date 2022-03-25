public class InstrucoesRotuladas {

	public static void main(String[] args) {
		methodWithBreakLabel();
		methodWithContinueLabel();
	}
	
	private static void methodWithBreakLabel() {
		int contador = 0;
		myBreakLabel:
		while (true) {
			while (true) {
				if ( contador == 10 ) break;
				contador++;
				System.out.println("Contador: " + contador);
				break myBreakLabel; // acaba com a instrução rotulada completa
			}
		}
		System.out.println("Done methodWithBreakLabel()");
	}
	
	private static void methodWithContinueLabel() {
		int contador = 0;
		myBreakLabel:
		while (true) {
			while (true) {
				if ( contador == 10 ) break;
				contador++;
				System.out.println("Contador: " + contador);
				continue myBreakLabel; // pula para a proxima, mas continua na instrução rotulada
			}
		}
	}
	
}
