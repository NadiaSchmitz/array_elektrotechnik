import Prog1Tools.IOTools;

public class Main {

	public static void main(String[] args) {
		
		int i, bericht;
		int[] kernwerte = new int[19];
		
		for (i = 0; i < kernwerte.length; i++) {
			kernwerte[i] = (int) Math.round(Math.random()*10);
			System.out.print(kernwerte[i] + " ");
		}
		
		Statistik my_statistik = new Statistik();
		
		System.out.println();
		System.out.println();
		System.out.println("Unser Statistikbüro verfügt sich über viele wertvolle Informationen. ");
		System.out.println("Vergügbare Berichte:");
		System.out.println("1 - Minimum");
		System.out.println("2 - Maximum");
		System.out.println("3 - Median");
		System.out.println("4 - Spannweite");
		System.out.println("5 - Mittlere Abweichung");
		System.out.println("6 - 1 Wert, der am häufigsten vorkommen");
		System.out.println();
		
		bericht = IOTools.readInteger("Suchen Sie den Bericht, den Sie benötigen: ");
		System.out.println();
		System.out.println("Bericht #" + bericht);
		
		if (bericht == 1) {
			my_statistik.getMinimum(kernwerte);
		} else if (bericht == 2) {
			my_statistik.getMaximum(kernwerte);
		} else if (bericht == 3) {
			my_statistik.getMedian(kernwerte);
		} else if (bericht == 4) {
			my_statistik.getSpannweite(kernwerte);
		} else if (bericht == 5) {
			my_statistik.getMittlereAbweichung(kernwerte);
		} else if (bericht == 6) {
			my_statistik.getTopFive(kernwerte);
		} else {
			System.out.println("Falsche Eingabe.");
		}
	}

}
