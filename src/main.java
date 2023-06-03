public class main{
	public static void main(String[] args) {
		Spielfeld GameOfLife = new Spielfeld(10, 10); // Breite, Höhe
		
		for(int i=0; i < 10; i++) {
			System.out.println("Zug" + i);
			GameOfLife.dump();
			System.out.println();
			GameOfLife.zug();
		}
	}
}
