package gui;

import java.awt.Dimension;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JPanel;

import model.Sklep;
import model.Zestaw;

public class MyPanel extends JPanel {

	private static final long serialVersionUID = 8717326915094262538L;

	private JList<Zestaw> listaZestawow;

	public MyPanel(Sklep sklep) {
		DefaultListModel<Zestaw> dlm = new DefaultListModel<>();
		List<Zestaw> list = sklep.getListaZestawow();
		dlm.addAll(list);
		listaZestawow = new JList<>(dlm);
		add(listaZestawow);
		listaZestawow.addListSelectionListener(listener -> {
			System.out.println(listaZestawow.getSelectedIndex());
//			wystarczy tutaj umieœciæ kod otweiraj¹cy nowe okno
		});
	}

	@Override
	public Dimension getPreferredSize() {
		return new Dimension(600, 400);
	}

}
