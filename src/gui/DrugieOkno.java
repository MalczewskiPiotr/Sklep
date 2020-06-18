package gui;


import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DrugieOkno extends JPanel {
    JFrame ramkaGlowna;
    JTextField input;

    class AkcjaNaPrzycisku implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("hjfgfg");
        }

    }

    class AkcjaNaEtykiecie implements MouseListener{

        @Override
        public void mouseClicked(MouseEvent e) {
            System.out.println("jestem klikniety");
        }

        @Override
        public void mousePressed(MouseEvent e) {
            System.out.println("jestem przyciśniety");
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            System.out.println("Zwolniłem klikniecie mysz");
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            System.out.println("Najechałem na dany element");
        }

        @Override
        public void mouseExited(MouseEvent e) {
            System.out.println("Zjechałem z danego elemetnu");

        }

    }

    class AkcjaNaTextField implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            JFrame window = new JFrame("Moje drugie GUI");

            window.setSize(200,200);
            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//			window.setResizable(false);
            window.setVisible(true);

            ramkaGlowna.setVisible(false);
            ramkaGlowna.dispose();
        }
    }

    public DrugieOkno(JFrame ramka) {
        this.ramkaGlowna = ramka;

        setLayout(null);

        JButton klawisz = new JButton("Zaloguj");

//			klawisz.addActionListener(e -> System.out.println("nic"));

        klawisz.addActionListener(new AkcjaNaTextField());

        klawisz.setBounds(100, 50, 100, 50);
        add(klawisz);

        JLabel etykieta = new JLabel("etykieta");

        etykieta.addMouseListener(new AkcjaNaEtykiecie());
        input = new JTextField();

        etykieta.setBounds(300, 50, 100, 20);
        add(etykieta);

        input.setBounds(300,300, 100, 30);
        add(input);

    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(500, 500);
    }

}