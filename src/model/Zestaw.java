package model;

import java.util.ArrayList;
import java.util.List;

public class Zestaw {
	
	private String nazwa;

	public String getNazwa() {
		return nazwa;
	}

	private List<Skladnik> listaSkladnikow = new ArrayList<>();

	public List<Skladnik> getListaSkladnikow() {
		return listaSkladnikow;
	}

	public void addSkladnik(Skladnik skladnik) {
		listaSkladnikow.add(skladnik);
	}

	public void removeSkladnik(Skladnik skladnik) {
		listaSkladnikow.remove(skladnik);
	}

}
