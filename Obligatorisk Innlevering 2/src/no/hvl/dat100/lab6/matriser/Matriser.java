package no.hvl.dat100.lab6.matriser;

public class Matriser {
	
	
    // a)
	public static void skrivUt(int[][] matrise) {
		
		for(int i = 0; i < matrise.length; i++) {
			for(int j = 0; j < matrise[i].length; j++) 
				System.out.print(matrise[i][j] + " ");
			
		}
		System.out.println();
        //throw new UnsupportedOperationException("skrivUt ikke implementert");
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		
		String mat = "";
		
		for(int i = 0; i < matrise.length; i++) {
			for(int j = 0; j < matrise[i].length; j++) 
			mat += matrise[i][j] + " ";
			mat+= "\n";
			}
		
		return mat;
		//throw new UnsupportedOperationException("tilStreng ikke implementert");
		
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		int nymatrise [][] = new int [matrise.length][matrise[0].length];
		
		for(int i = 0; i < matrise.length; i++) 
			for(int j = 0; j < matrise[i].length; j++)
				nymatrise[i][j] = matrise [i][j]*tall;
		
		return nymatrise;
		
		
		//throw new UnsupportedOperationException("skaler ikke implementert");
	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		
		boolean erLik = false;
		
		int rad1, rad2, kol1, kol2;
		
		rad1 = a.length;
		kol1 = a[0].length;
		
		rad2 = b.length;
		kol2 = b[0].length;
		
		if(rad1 == rad2 && kol1 == kol2) {
			for(int i = 0; i < rad1; i++) {
				for(int j = 0; j < kol1; j++) {
					if(a[i][j] == b[i][j]) {
						erLik = true;
					}
					
				}
			}
		}else {
			erLik = false;
		}

		
		
		return erLik;
		//throw new UnsupportedOperationException("erLik ikke implementert");
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {
		
		int [][] speiletMatrise = new int [matrise.length][matrise[0].length];
		
		
		for(int i = 0; i < matrise.length; i++) {
			for(int j = 0; j < matrise[i].length; j++) {
				speiletMatrise[i][j] = matrise [j][i];
				
			}
		}	
		//throw new UnsupportedOperationException("speile ikke implementert");
		return speiletMatrise;
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {
		
		int [][] multiplisert = new int [a[0].length][b.length];
		
		if (a.length == b[0].length) {
			for(int i = 0; i < a.length; i++) {
				for(int j = 0; j < b[0].length; j++) {
					for (int k = 0; k < a[0].length; k ++) {
						multiplisert[i][j] += a[i][k] * b[k][j];
					}
				}
			}
		}
		
		//throw new UnsupportedOperationException("multipliser ikke implementert");
		return multiplisert;
	}
}