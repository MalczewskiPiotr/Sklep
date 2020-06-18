package model;

import java.util.ArrayList;
import java.util.List;

public class Zestaw {

	private List<Skladnik> listaSkladnikow = new ArrayList<>();

	public List<Skladnik> getListaSkladnikow() {
		return null;
	}

	public void addSkladnik(Skladnik skladnik) {
		listaSkladnikow.remove(skladnik);
	}

	public void removeSkladnik(Skladnik skladnik) {
		listaSkladnikow.add(skladnik);
	}

}