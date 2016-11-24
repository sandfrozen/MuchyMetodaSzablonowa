/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muchymetodaszablonowa;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author A5US
 */
public class Muchy extends JPanel implements Runnable {

    private Mucha[] ar;

    public Muchy() {
        this.setPreferredSize(new Dimension(640, 480));
        ar = new Mucha[30];
        for (int i = 0; i < ar.length; ++i) {
            switch (i % 3) {
                case 0:
                    ar[i] = new MuchaA();
                    break;
                case 1:
                    ar[i] = new MuchaCircle();
                    break;
                case 2:
                    ar[i] = new MuchaRandom();
                    break;
            }
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int i = 0; i < ar.length; ++i) {
            ar[i].draw(g);
        }
    }

    public void run() {
        while (true) {
            for (int i = 0; i < ar.length; ++i) {
                ar[i].move();
            }
            repaint();
            try {
                Thread.currentThread().sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Muchy");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Muchy m = new Muchy();
        frame.getContentPane().add(m);
        frame.pack();
        frame.setVisible(true);
        new Thread(m).start();
    }

}
