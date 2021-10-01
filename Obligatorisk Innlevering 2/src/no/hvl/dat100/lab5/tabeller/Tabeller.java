package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		System.out.print("[ ");
		for (int i = 0; i < tabell.length; i++) {
			System.out.print(tabell[i] + " ");
		}
		System.out.println("]");
		//throw new UnsupportedOperationException("skrivUt ikke implementert");

	}

	// b)
	public static String tilStreng(int[] tabell) {
		
		String tabellTxt = "[";
		
		for (int i = 0; i < tabell.length; i++) {
			tabellTxt += tabell[i];
			if (i != tabell.length-1) {
				tabellTxt += ",";
			}
		}
		
		tabellTxt += "]";
		
		return tabellTxt;
		//throw new UnsupportedOperationException("tilStreng ikke implementert");
		
	}

	// c)
	public static int summer(int[] tabell) {
		
		int sum = 0;
		int teller = 0;
		
		for (int i = 0; i < tabell.length; i++) {
			sum += tabell[i];
		}
		/*
		while(teller != tabell.length) {
			sum += tabell[teller];
			teller++;
		}
		
		for (int verdi : tabell) {
			sum += verdi;
		}
		*/
		return sum;
		//throw new UnsupportedOperationException("summer ikke implementert");
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		
		boolean finnes = false;
		int teller = 0;
		
		while (!finnes && teller < tabell.length) {
			if (tall == tabell[teller]) {
				finnes = true;
			}
			
			teller++;
		}
		return finnes;
		//throw new UnsupportedOperationException("finnesTall ikke implementert");
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		
		int teller = 0;
		int indeks = -1;
		
		while (teller < tabell.length && teller != tall) {
			if (tabell[teller] == tall) {
				indeks =  teller;
				break;
			}
			teller++;
		}
		return indeks;
		//throw new UnsupportedOperationException("posisjonTall ikke implementert");

	}

	// f)
	public static int[] reverser(int[] tabell) {
		int[] reversert = new int [tabell.length];
		int nr = tabell.length;
		
		for (int i = 0; i < tabell.length; i++) {
			reversert[nr - 1] = tabell[i];
			nr -= 1;
		}
		return reversert;
		//throw new UnsupportedOperationException("reverser ikke implementert");
		
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		
		boolean sortert = true;
		
		for (int i = 0; i < tabell.length-1; i++) {
			
			if(tabell[i] > tabell[i+1]) {
				sortert = false;
			}
			
		}
		return sortert;
		
		//throw new UnsupportedOperationException("erSortert ikke implementert");
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		
		int lengde = tabell1.length + tabell2.length;
		int[] nyTabell = new int[lengde];
		int teller = 0;
		
		for (int i = 0; i < nyTabell.length; i++) {
			
			if (i < tabell1.length) {
				nyTabell[i] = tabell1[i];
			}
			else {
				nyTabell[i] = tabell2[teller];
				teller++;
			}
		}
		
		return nyTabell;
		//throw new UnsupportedOperationException("settSammen ikke implementert");
	}
}
