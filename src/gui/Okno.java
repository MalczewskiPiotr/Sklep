package gui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Okno {

    public static void main(String[] args) {

        JFrame window = new JFrame("Okno");

        JPanel panel = new JPanel();

        JButton button = new JButton("Nowe okno");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame window2 = new JFrame("Drugie okno");

                window2.setSize(400, 400);
                window2.setLocation(200, 200);
                window2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                window2.setVisible(true);

                window.setVisible(false);
                window.dispose();
            }
        });


        panel.add(button);
        window.setSize(400, 400);
        window.add(panel);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }

}