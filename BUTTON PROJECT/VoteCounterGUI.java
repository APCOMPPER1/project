//*********************************************************
// VoteCounterGUI.java  
//
// Demonstrates a graphical user interface and event listeners to
// tally votes for two candidates, Joe and Sue.
// Modified by Robert Gammelgaard 10/25/2012
//*********************************************************

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Graphics;

public class VoteCounterGUI {
    private int WIDTH = 300;
    private int HEIGHT = 300;
    private int votesForJoe;
    private int votesForSue;
    private JFrame frame;
    private JPanel panel;
    private JButton joe;
    private JLabel labelJoe;
    private JButton sue;
    private JLabel labelSue;
    private Graphics page;


    //----------------------------------------------
    // Constructor: Sets up the GUI.
    //----------------------------------------------
    public VoteCounterGUI() {
        votesForJoe = 0;
        votesForSue = 0;
        frame = new JFrame("Vote Counter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        joe = new JButton("Vote for Joe");
        sue = new JButton("Vote for Sue");
        joe.addActionListener(new JoeButtonListener());
        sue.addActionListener(new SueButtonListener());
        labelJoe = new JLabel("Votes for Joe: " + votesForJoe);
        labelSue = new JLabel("Votes for Sue: " + votesForSue);
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        panel.setBackground(Color.cyan);
        panel.add(joe);
        panel.add(labelJoe);
        panel.add(sue);
        panel.add(labelSue);
        frame.getContentPane().add(panel);
    }

    //-----------------------------------------------------------------
    //  Displays the primary application frame.
    //-----------------------------------------------------------------
    public void display() {
        frame.pack();
        frame.setVisible(true);
        page = panel.getGraphics();
    }

    //***************************************************
    // Represents a listener for button push (action) events
    //***************************************************
    private class JoeButtonListener implements ActionListener {
        //----------------------------------------------
        // Updates the counter and label when Vote for Joe
        // button is pushed
        //----------------------------------------------
        public void actionPerformed(ActionEvent event) {

            votesForJoe++;
            labelJoe.setText("Votes for Joe: " + votesForJoe);

            update();
        }
    }

    private class SueButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            votesForSue++;
            labelSue.setText("Votes For Sue: " + votesForSue);

            update();
        }
    }

    public void update() {
        page.setColor(Color.RED);
        page.fillArc(100, 100, 100, 100, 90, (int) (votesForJoe * 360.0 / (votesForJoe + votesForSue)));
        page.setColor(Color.BLUE);
        page.fillArc(100, 100, 100, 100, 90, -1 * (int) (votesForSue * 360.0 / (votesForJoe + votesForSue)));
    }
}