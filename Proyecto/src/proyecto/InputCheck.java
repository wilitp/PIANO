/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JRadioButton;

/**
 *
 * @author deipola
 */
public class InputCheck extends Thread {

    private final JButton check;
    private final JRadioButton panel;
    private final int nose;

    InputCheck(JRadioButton p, JButton c, int nose) {
        this.check = c;       
        this.panel = p;
        this.nose = nose;

    }

    @Override
    public void run() {
        System.out.println("p");
        panel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                System.out.println("b");
                if (ke.getKeyCode() == nose) {
                    check.doClick();
                    System.out.println("Pepe");
                }
            }

        }
        );

    }
}
