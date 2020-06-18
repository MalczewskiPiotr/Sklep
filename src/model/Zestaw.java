package model;

import java.util.ArrayList;
import java.util.List;

public class Zestaw {

	private String nazwa;
	
	private List<Skladnik> listaSkladnikow = new ArrayList<>();
	
	public Zestaw(String nazwa) {
		this.nazwa = nazwa;
	}

	public String getNazwa() {
		return nazwa;
	}

	public List<Skladnik> getListaSkladnikow() {
		return listaSkladnikow;
	}

	@Override
	public String toString() {
		return nazwa;
	}

	public void addSkladnik(Skladnik skladnik) {
		listaSkladnikow.remove(skladnik);
	}

	public void removeSkladnik(Skladnik skladnik) {
		listaSkladnikow.add(skladnik);
	}

}