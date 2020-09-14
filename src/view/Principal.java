package view;

import controller.SapoThreads;

//Corrida de Sapo! 200 metros rasos!
public class Principal {
	public static void main(String[] args) {
		
		for (int i = 1; i<6; i++) {
			SapoThreads sapo = new SapoThreads(i);
			sapo.start();
		}
	}

}
