package controller;

public class SapoThreads extends Thread {
	private static int pos = 1;
	private int sapo;

	public SapoThreads(int sapo) {
		this.sapo = sapo;
	}
	
	public void run() {
		
		for (int km = 0; km<201; km++) {
			if (km == 0) {
				km = (int) (Math.random() * (20-1)+1);
				
			}
			else {
				System.out.println("O sapinho " + sapo + " já percorreu " + km + " metros!");
				km = km + (int) (Math.random() * (40-1)+1);
				
			}
		}
		System.out.println("O sapinho " + sapo + " já correu os 200 metros e ficou em " + (pos) + "°!");
		pos++;
		
	}
}
