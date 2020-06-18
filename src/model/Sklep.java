package model;

import java.util.ArrayList;
import java.util.List;

public class Sklep {

	private String nazwa;

	private List<Zestaw> listaZestawow = new ArrayList<>();

	public Sklep(String nazwa) {
		this.nazwa = nazwa;
	}

	public String getNazwa() {
		return nazwa;
	}

	public List<Zestaw> getListaZestawow() {
		return listaZestawow;
	}

	public void addZestaw(Zestaw zestaw) {
		listaZestawow.add(zestaw);
	}

	public void removeZestaw(Zestaw zestaw) {
		listaZestawow.remove(zestaw);
	}

}
