package abstractClasses;

// bu bizm temel hesaplama classımız
// abstract sınıflardan nesne türetilemez.
public abstract class GameCalculator {
	public abstract void hesapla() ;
	
	
	// Final tanımlayarak bu  methodun kadın erkek ve cocuk için aynı olacak.
	// bu methos override edilemicek.
	public final void gameOver() {
		System.out.println("Oyun Bitti");
		
	}

}
