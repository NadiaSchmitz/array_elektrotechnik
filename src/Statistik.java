
public class Statistik {

	
	public int[] spannweite, haufigste_5;
	public double mittlere_abweichung;
	
	public Statistik() {
		
	}
	
	public void getMinimum(int[] kernwerte) {
		int i, minimum;
		minimum = kernwerte[0];
		for (i = 0; i < kernwerte.length; i++) {
			if (kernwerte[i] < minimum) {
				minimum = kernwerte[i];
			}
		}
		System.out.println("Minimum: " + minimum);
	}
	
	public void getMaximum(int[] kernwerte) {
		int i, maximum;
		maximum = kernwerte[0];
		for (i = 0; i < kernwerte.length; i++) {
			if (kernwerte[i] > maximum) {
				maximum = kernwerte[i];
			}
		}
		System.out.println("Maximum: " + maximum);
	}
	
	public void getMedian(int[] kernwerte) {
		int i, median_index, median;
		bubblesort(kernwerte);
		median_index = kernwerte.length / 2 + 1;
		median = kernwerte[median_index];
		for (i = 0; i < kernwerte.length; i++) {
			System.out.print(kernwerte[i] + " ");
		}
		System.out.println();
		System.out.println("Median: " + median);
	}
	
	public void bubblesort(int[] kernwerte) {
		int i = 0, j, check;
		boolean sort = false;
		
		while (!sort) {
			sort = true;
			for (j = 0; j < kernwerte.length - 1; j++) {
				
				if (kernwerte[j] > kernwerte[j + 1]) {
					sort = false;
					check = kernwerte[j];
					kernwerte[j] = kernwerte[j+1];
					kernwerte[j + 1] = check;
				}
			}
			
			i++;
		}
	}
	
	public void getSpannweite(int[] kernwerte) {
		int i, minimum, maximum, spannweite;
		minimum = kernwerte[0];
		for (i = 0; i < kernwerte.length; i++) {
			if (kernwerte[i] < minimum) {
				minimum = kernwerte[i];
			}
		}
		
		maximum = kernwerte[0];
		for (i = 0; i < kernwerte.length; i++) {
			if (kernwerte[i] > maximum) {
				maximum = kernwerte[i];
			}
		}
		
		spannweite = maximum - minimum;
		System.out.println();
		System.out.println("Spannweite: " + spannweite);
	}
	
	public void getMittlereAbweichung(int[] kernwerte) {
		int i, sum_1, sum_2, mittelwert = 0, mittlere_abweichung = 0;
		sum_1 = 0;
		sum_2 = 0;
		for (i = 0; i < kernwerte.length; i++) {
			sum_1 = sum_1 + kernwerte[i];
			mittelwert = sum_1 / kernwerte.length;
		}
		
		for (i = 0; i < kernwerte.length; i++) {
			sum_2 = sum_2 + Math.abs(kernwerte[i] - mittelwert);
			mittlere_abweichung = sum_2 / kernwerte.length;
		}
		
		System.out.println();
		System.out.println("Mittlere Abweichung: " + mittlere_abweichung);
	}
	
	public void getTopFive(int[] kernwerte) {
		
		
		int[] counter = new int[19];
		int[] top = new int[5];

	       for (int i = 0; i < kernwerte.length; i++) {
	    	   for (int j = 0; j < kernwerte.length; j++) {

	    		   if (kernwerte[i] == kernwerte[j]) {
	    			   counter[i]++;
	    		   }
		           
		       }
	    	   //System.out.println(kernwerte[i] + " " + counter[i]);
	           
	       }
	       int maximum = 0, index_maximum = 0, n = 0;
	       
    	   for (int m = 0; m < counter.length; m++) {
    		   if (counter[m] > maximum) {
    			   maximum = counter[m];
    			   index_maximum = m;
    		   }
    	   }
    	   System.out.println("1 Wert, der am häufigsten vorkommen: " + kernwerte[index_maximum]);   
	}
	
}
