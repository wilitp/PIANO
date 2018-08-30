/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import static java.awt.event.KeyEvent.*;
import javax.sound.midi.MidiChannel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

/**
 *
 * @author deipola
 */
public class InputCheck extends Thread {

    private final JButton check;
    private final int canal;
    MidiChannel[] mc;
    JButton[] botones;
    boolean a = false;
    boolean b = false;
    boolean c = false;
    boolean d = false;
    boolean e = false;
    boolean f = false;
    boolean g = false;
    boolean h = false;
    boolean i = false;
    boolean j = false;
    boolean k = false;
    boolean l = false;
    boolean m = false;
    boolean n = false;
    boolean o = false;
    boolean p = false;
    boolean q = false;

    InputCheck(JButton[] c, MidiChannel[] mc, int canal) {
        this.check = c[0];
        this.canal = canal;
        this.mc = mc;
        this.botones = c;
        start();
    }

    @Override
    public void run() {
        System.out.println("p");
        check.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                System.out.println("b");
                if ((ke.getKeyCode() == 65) & (a == false)) {
                    a = true;
                    mc[canal].noteOn(48, 700);
                    botones[0].getModel().setArmed(true);
                    botones[0].getModel().setPressed(true);
                }
                if ((ke.getKeyCode() == 87) & (b == false)) {
                    b = true;
                    mc[canal].noteOn(49, 700);
                    botones[1].getModel().setArmed(true);
                    botones[1].getModel().setPressed(true);
                }
                if ((ke.getKeyCode() == 83) & (c == false)) {
                    c = true;
                    mc[canal].noteOn(50, 700);
                    botones[2].getModel().setArmed(true);
                    botones[2].getModel().setPressed(true);
                }
                if ((ke.getKeyCode() == 69) & (d == false)) {
                    d = true;
                    mc[canal].noteOn(51, 700);
                    botones[3].getModel().setArmed(true);
                    botones[3].getModel().setPressed(true);
                }
                if ((ke.getKeyCode() == 68) & (e == false)) {
                    e = true;
                    mc[canal].noteOn(52, 700);
                    botones[4].getModel().setArmed(true);
                    botones[4].getModel().setPressed(true);
                }
                if ((ke.getKeyCode() == VK_F) & (f == false)) {
                    f = true;
                    mc[canal].noteOn(53, 700);
                    botones[5].getModel().setArmed(true);
                    botones[5].getModel().setPressed(true);
                }
                if ((ke.getKeyCode() == VK_T) & (g == false)) {
                    g = true;
                    mc[canal].noteOn(54, 700);
                    botones[6].getModel().setArmed(true);
                    botones[6].getModel().setPressed(true);
                }
                if ((ke.getKeyCode() == VK_G) & (h == false)) {
                    h = true;
                    mc[canal].noteOn(55, 700);
                    botones[7].getModel().setArmed(true);
                    botones[7].getModel().setPressed(true);
                }
                if ((ke.getKeyCode() == VK_Y) & (i == false)) {
                    i = true;
                    mc[canal].noteOn(56, 700);
                    botones[8].getModel().setArmed(true);
                    botones[8].getModel().setPressed(true);
                }
                if ((ke.getKeyCode() == VK_H) & (j == false)) {
                    j = true;
                    mc[canal].noteOn(57, 700);
                    botones[9].getModel().setArmed(true);
                    botones[9].getModel().setPressed(true);
                }
                if ((ke.getKeyCode() == VK_U) & (k == false)) {
                    k = true;
                    mc[canal].noteOn(58, 700);
                    botones[10].getModel().setArmed(true);
                    botones[10].getModel().setPressed(true);
                }
                if ((ke.getKeyCode() == VK_J) & (l == false)) {
                    l = true;
                    mc[canal].noteOn(59, 700);
                    botones[11].getModel().setArmed(true);
                    botones[11].getModel().setPressed(true);
                }
                if ((ke.getKeyCode() == VK_K) & (m == false)) {
                    m = true;
                    mc[canal].noteOn(60, 700);
                    botones[12].getModel().setArmed(true);
                    botones[12].getModel().setPressed(true);
                }
                if ((ke.getKeyCode() == VK_O) & (n == false)) {
                    n = true;
                    mc[canal].noteOn(61, 700);
                    botones[13].getModel().setArmed(true);
                    botones[13].getModel().setPressed(true);
                }
                if ((ke.getKeyCode() == VK_L) & (o == false)) {
                    o = true;
                    mc[canal].noteOn(62, 700);
                    botones[14].getModel().setArmed(true);
                    botones[14].getModel().setPressed(true);
                }
                if ((ke.getKeyCode() == VK_P) & (p == false)) {
                    p = true;
                    mc[canal].noteOn(63, 700);
                    botones[15].getModel().setArmed(true);
                    botones[15].getModel().setPressed(true);
                }
                if ((ke.getKeyCode() == 0) & (q == false)) {
                    q = true;
                    mc[canal].noteOn(64, 700);
                    botones[16].getModel().setArmed(true);
                    botones[16].getModel().setPressed(true);
                }
            }

        }
        );
        check.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent ke) {
                System.out.println("b");
                if (ke.getKeyCode() == 65) {
                    a = false;
                    mc[canal].noteOff(48, 600);
                    botones[0].getModel().setArmed(false);
                    botones[0].getModel().setPressed(false);
                }
                if (ke.getKeyCode() == 87) {
                    b = false;
                    mc[canal].noteOff(49, 600);
                    botones[1].getModel().setArmed(false);
                    botones[1].getModel().setPressed(false);
                }
                if (ke.getKeyCode() == 83) {
                    c = false;
                    mc[canal].noteOff(50, 600);
                    botones[2].getModel().setArmed(false);
                    botones[2].getModel().setPressed(false);
                }
                if (ke.getKeyCode() == 69) {
                    d = false;
                    mc[canal].noteOff(51, 600);
                    botones[3].getModel().setArmed(false);
                    botones[3].getModel().setPressed(false);
                }
                if (ke.getKeyCode() == 68) {
                    e = false;
                    mc[canal].noteOff(52, 600);
                    botones[4].getModel().setArmed(false);
                    botones[4].getModel().setPressed(false);
                }
                if (ke.getKeyCode() == VK_F) {
                    f = false;
                    mc[canal].noteOff(53, 600);
                    botones[5].getModel().setArmed(false);
                    botones[5].getModel().setPressed(false);
                }
                if (ke.getKeyCode() == VK_T) {
                    g = false;
                    mc[canal].noteOff(54, 600);
                    botones[6].getModel().setArmed(false);
                    botones[6].getModel().setPressed(false);
                }
                if (ke.getKeyCode() == VK_G) {
                    h = false;
                    mc[canal].noteOff(55, 600);
                    botones[7].getModel().setArmed(false);
                    botones[7].getModel().setPressed(false);
                }
                if (ke.getKeyCode() == VK_Y) {
                    i = false;
                    mc[canal].noteOff(56, 600);
                    botones[8].getModel().setArmed(false);
                    botones[8].getModel().setPressed(false);
                }
                if (ke.getKeyCode() == VK_H) {
                    j = false;
                    mc[canal].noteOff(57, 600);
                    botones[9].getModel().setArmed(false);
                    botones[9].getModel().setPressed(false);
                }
                if (ke.getKeyCode() == VK_U) {
                    k = false;
                    mc[canal].noteOff(58, 600);
                    botones[10].getModel().setArmed(false);
                    botones[10].getModel().setPressed(false);
                }
                if (ke.getKeyCode() == VK_J) {
                    l = false;
                    mc[canal].noteOff(59, 600);
                    botones[11].getModel().setArmed(false);
                    botones[11].getModel().setPressed(false);
                }
                if (ke.getKeyCode() == VK_K) {
                    m = false;
                    mc[canal].noteOff(60, 600);
                    botones[12].getModel().setArmed(false);
                    botones[12].getModel().setPressed(false);
                }
                if (ke.getKeyCode() == VK_O) {
                    n = false;
                    mc[canal].noteOff(61, 600);
                    botones[13].getModel().setArmed(false);
                    botones[13].getModel().setPressed(false);
                }
                if (ke.getKeyCode() == VK_L) {
                    o = false;
                    mc[canal].noteOff(62, 600);
                    botones[14].getModel().setArmed(false);
                    botones[14].getModel().setPressed(false);
                }
                if (ke.getKeyCode() == VK_P) {
                    p = false;
                    mc[canal].noteOff(63, 600);
                    botones[15].getModel().setArmed(false);
                    botones[15].getModel().setPressed(false);
                }
                if (ke.getKeyCode() == 0) {
                    q = false;
                    mc[canal].noteOff(64, 600);
                    botones[16].getModel().setArmed(false);
                    botones[16].getModel().setPressed(false);
                }
            }

        }
        );

    }
}
