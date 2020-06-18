package model;

public class Skladnik {

	private String nazwa;

	private double cena;

	private int kodKreskowy;

	public Skladnik(String nazwa, double cena, int kodKreskowy) {
		this.nazwa = nazwa;
		this.cena = cena;
		this.kodKreskowy = kodKreskowy;
	}

	public String getNazwa() {
		return nazwa;
	}

	public double getCena() {
		return cena;
	}

	public int getKodKreskowy() {
		return kodKreskowy;
	}

}
