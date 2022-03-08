package com.example.phrasemaker;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MakePhrase {
    private JPanel panel;
    private JLabel welcomeLabel;
    private JButton phraseGenerate;
    private JLabel outputLabel;

    String[] wordListOne = {"outgoing", "hot-to-trot", "double-down", "t-shirt sized", "agile", "helicopter view", "circle back", "bleeding edge" };
    String[] wordListTwo = {"value-added", "engaged", "aligned", "unleashed", "ramped-up", "sparkled", "majestic", "deep-dive" };
    String[] wordListThree = {"idea", "thought-path", "wheel-house", "pot-of-gold", "money-maker", "craft", "ninja", "low-hanging fruit" };

    int listOneLength = wordListOne.length;
    int listTwoLength = wordListTwo.length;
    int listThreeLength = wordListThree.length;

    int randWord1 = (int) (Math.random() * listOneLength);
    int randWord2 = (int) (Math.random() * listTwoLength);
    int randWord3 = (int) (Math.random() * listThreeLength);

    public static void main(String[] args) {
        JFrame frame = new JFrame("Make a silly phrase");
        frame.setContentPane(new MakePhrase().panel);
        frame.setLocation(new Point(500, 300));
        frame.setSize(new Dimension(800, 800));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public MakePhrase() {
        phraseGenerate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String phrase = wordListOne[randWord1] + " " + wordListTwo[randWord2] + " " + wordListThree[randWord3];
                outputLabel.setText("What we need is a " + phrase);
            }
        });
    }
}
