package game_of_life;

import java.awt.Color;
import java.awt.Graphics;

/* 
 * Werte für den Array 
 * Tot = 0;
 * lebend = 1;
 * wird sterben = 2;
 * wird geboren = 3;
 */

 class Spielfeld {
	private int zug;
	int hoehe;
	int breite;
	private int[][] spielfeld;
	
	//Konstruktor
	public Spielfeld(int breite , int hoehe) 
	{
		this.hoehe = hoehe;
		this.breite = breite;
		setZug(0);
		spielfeld = new int[this.breite][this.hoehe];
		fuellen();
	}
	
	public void fuellen() // befüllt jede Zelle mit 0 oder 1 (Zufall)
	{
		for(int i = 0;i < this.breite;i++)
		{
			for(int j = 0; j < this.hoehe; j++)
			{
				this.spielfeld[i][j] = (int) Math.round(Math.random());
			}
		}
	}
	
	
	// zählt alle Zellen in der Umgebung die Leben (1 oder 2)
	private int zaehleLebendeZellen(int x, int y) 
	{
		
		// Schleife um Kasten abzugehen
		// x|x|x
		// x|x|x
		// x|x|x
		// Subtrahiert die Mitte 
		// x|x|x
		// x|0|x
		// x|x|x
		
		
		int value = 0;
		for(int i=-1;i<2;i++)
		{
			for(int j=-1;j<2;j++)
			{
				try{
					if(spielfeld[(x+i)][(y+j)] == 1 || spielfeld[(x+i)][(y+j)] == 2) 
					{
						value++;
					}
				}
				catch(ArrayIndexOutOfBoundsException e) {
					
				}

			}
		}
		if(spielfeld[(x)][(y)] == 1 || spielfeld[(x)][(y)] == 2)
		{
			value--;
		}
	
	    return value;
	}
	
	// führt eine Runde aus.
	public void zug()
	{
		for(int i = 0;i < this.breite;i++)
		{
			for(int j = 0; j < this.hoehe; j++)
			{
				// Spielregeln die Values (Hardcoded) Möglichkeit für Statische
				if(zaehleLebendeZellen(i, j) == 3)
				{
					belebeZelle(i, j);
				}
				else if (zaehleLebendeZellen(i, j) < 2 || zaehleLebendeZellen(i, j) > 3)
				{
					toeteZelle(i, j);
				}

			}
		}
	
		// setzt die Values auf 1 und 0 für neuen Zug
		for(int i = 0;i < this.breite;i++)
		{
			for(int j = 0; j < this.hoehe; j++)
			{
				if(spielfeld[(i)][(j)] == 2 || spielfeld[(i)][(j)] == 0)
				{
					spielfeld[(i)][(j)] = 0;
				}
				else
				{
					spielfeld[(i)][(j)] = 1;
				}

			}
		}
		setZug(getZug() + 1);
	}
	
	
	// Setzt zellen Wert auf 3 Falls sie nicht schon lebt
	private void belebeZelle(int x, int y)
	{
		if(spielfeld[(x)][(y)] != 1)
			{
				spielfeld[(x)][(y)] = 3;
			}
	}
	// Setzt Zelleninhalt auf 2 Falls sie nicht bereits tot ist
	private void toeteZelle(int x, int y)
	{
		if(spielfeld[(x)][(y)] != 0)
		{
			spielfeld[(x)][(y)] = 2;
		}
	}
	
	//gibt array aus
	public void dump() {
		for(int i=0; i < this.hoehe; i++) {
			for(int j=0; j < this.breite; j++) {
				System.out.print((this.spielfeld[j][i])!=0 ? "X" : " " + " ");
			}
			System.out.println();
		}
	}
	
	//gibt array grafisch aus
		public void dump(Graphics g) {
			for(int i=0; i < this.hoehe; i++) {
				for(int j=0; j < this.breite; j++) {
					if(this.spielfeld[j][i]!=0) {
						g.setColor(Color.green);
					}
					else {
						g.setColor(Color.red);
					}
					g.fillRect(10+j*5, 30+i*5, 5, 5);	// ("abstand nach links" + j * "breite eines kreises", "abstand nach oben" + i * "hoehe eines kreises", breite, hoehe)
				}
			}
		}

		/**
		 * @return the zug
		 */
		public int getZug() {
			return zug;
		}

		/**
		 * @param zug the zug to set
		 */
		public void setZug(int zug) {
			this.zug = zug;
		}
}
