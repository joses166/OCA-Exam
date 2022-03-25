public class Exercicio_2_3 {

	public static void main(String[] args) {
		
		// fishingSession.setSession("active");
		int piecesOfBait = 5;
		piecesOfBait = 0; // A raposa roubou toda a isca
		
		while (piecesOfBait != 0) {
			// catsForFish();
			/* Verifica se a isca está disponível */
			// if (fishingSession.isBaitAvailable() == false) {
				/* Coloca uma isca no anzol */
				// fishingSession.setBaitAvailable(true);
				piecesOfBait--;
			// }
			System.out.println("Passou");
		}
		
	}
	
}
