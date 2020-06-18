package model;

public class Skladnik {

	private String nazwa;

	private char cena;
	
	private int kodKreskowy;

	public Skladnik(String nazwa, char cena, int kodKreskowy) {
		this.nazwa = nazwa;
		this.cena = cena;
		this.kodKreskowy = kodKreskowy;
	}

	public String getNazwa() {
		return nazwa;
	}

	public char getCena() {
		return cena;
		
	}

	public int getKodKreskowy() {
		return kodKreskowy;
	
	}

}
