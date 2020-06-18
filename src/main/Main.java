package main;

import model.Skladnik;
import model.Sklep;
import model.Zestaw;

public class Main {

	public static void main(String[] args) {
		Sklep sklep = initSklep();
	}

	private static Sklep initSklep() {
		Skladnik skladnik1 = new Skladnik("Skladnik 1", 10.99, 4864634);
		Skladnik skladnik2 = new Skladnik("Skladnik 2", 5.99, 48641156);
		Skladnik skladnik3 = new Skladnik("Skladnik 3", 0.99, 748964);
		Skladnik skladnik4 = new Skladnik("Skladnik 4", 8.99, 4446845);
		Skladnik skladnik5 = new Skladnik("Skladnik 5", 10.99, 4886468);
		Skladnik skladnik6 = new Skladnik("Skladnik 6", 15.99, 02154120);
		Skladnik skladnik7 = new Skladnik("Skladnik 7", 11.99, 896514897);
		Skladnik skladnik8 = new Skladnik("Skladnik 8", 10.89, 7485486);
		Skladnik skladnik9 = new Skladnik("Skladnik 9", 5.97, 15346851);
		Zestaw zestaw1 = new Zestaw();
		zestaw1.addSkladnik(skladnik4);
		zestaw1.addSkladnik(skladnik9);
		zestaw1.addSkladnik(skladnik8);
		Zestaw zestaw2 = new Zestaw();
		zestaw2.addSkladnik(skladnik7);
		zestaw2.addSkladnik(skladnik4);
		zestaw2.addSkladnik(skladnik2);
		Zestaw zestaw3 = new Zestaw();
		zestaw3.addSkladnik(skladnik6);
		zestaw3.addSkladnik(skladnik5);
		zestaw3.addSkladnik(skladnik3);
		zestaw3.addSkladnik(skladnik1);
		Sklep sklep = new Sklep("Nasz Sklep");
		sklep.addZestaw(zestaw1);
		sklep.addZestaw(zestaw2);
		sklep.addZestaw(zestaw3);
		return sklep;
	}

}
