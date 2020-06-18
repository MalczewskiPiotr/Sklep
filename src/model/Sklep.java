package model;

import java.util.ArrayList;
import java.util.List;

public class Sklep {
	
	private String nazwa;

	public String getNazwa() {
		return nazwa;
	}
	
	private List<Zestaw> listaZestawow = new ArrayList<>();

	public List<Zestaw> getListaZestawow() {
		return listaZestawow;
	}

	public void setListaZestawow(List<Zestaw> listaZestawow) {
		this.listaZestawow = listaZestawow;
	}
	
	
	
	
}
