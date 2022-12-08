package abstractClasses;

public class Main {

	public static void main(String[] args) {
		// oyunda puan hesapla kadın erkek ve cocuk ıın ayrı olacaksa
		//1. ya classlarda gamedeki hesapla oveerride edılebilir.
		//2. yada aabstract methodla cozeriz.
		// yni methoun imzası abstract olark yazılır ve kadında erkekde ccukda ezılmek zorunda bırakılır

		// bu nesnesnin içi woman ile doldulurdu.
		// polymorphism burrada yeni özellik eklemek istediğimzde direk class ekleyerek extend yaparak mımarıyı bozmadan ılerleyebılırız.
		GameCalculator gameCalculator= new WomanGamenCalculator();
	}

}
