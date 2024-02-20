package de.thephoenixpixel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class Panel extends JFrame {
    private JPanel panel;
    private JTextField maxZahlField;
    private JTextField stepZahlField;
    private JButton berechnenButton;

    private JTextPane outputField;
    public Panel() {
        setContentPane(panel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setTitle("Primzaheln Rechner");
        setSize(300, 350);


        berechnenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!checkInput()) {
                    return;
                }

                int maxZahl = Integer.parseInt(maxZahlField.getText());
                int stepZahl = Integer.parseInt(stepZahlField.getText());

                List<Integer> primes = Main.caculatePrimes(maxZahl);

                printPrimes(primes, stepZahl);

            }
        });
    }

    public void printPrimes(List<Integer> primes, int steps) {
        StringBuilder stringBuilder = new StringBuilder();

        int i = 0;
        while (i < primes.size()) {
            stringBuilder.append(primes.get(i)).append(" ");
            i = i + steps;
        }
        outputField.setText(stringBuilder.toString());
    }

    public boolean checkInput() {
        try {
            Integer.parseInt(maxZahlField.getText());
        } catch (NumberFormatException e) {
            outputField.setText("Bitte gebe nur ganze Zahlen an");
            e.printStackTrace();
            return false;
        }

        try {
            Integer.parseInt(stepZahlField.getText());
        } catch (NumberFormatException e) {
            outputField.setText("Bitte gebe nur ganze Zahlen an");
            e.printStackTrace();
            return false;
        }
        return true;
    }

}
