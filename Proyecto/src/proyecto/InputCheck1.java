package proyecto;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import static java.awt.event.KeyEvent.*;
import javax.sound.midi.MidiChannel;
import javax.swing.JButton;

/**
 *
 * @author deipola
 */
public class InputCheck1 extends Thread {

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

    InputCheck1(JButton[] c, MidiChannel[] mc, int canal) {
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
                if ((ke.getKeyCode() == VK_A) & (a == false)) {
                    a = true;
                    mc[canal].noteOn(31, 3200);
                    botones[0].getModel().setArmed(true);
                    botones[0].getModel().setPressed(true);
                }
                if ((ke.getKeyCode() == VK_W) & (b == false)) {
                    b = true;
                    mc[canal].noteOn(32, 1200);
                    botones[1].getModel().setArmed(true);
                    botones[1].getModel().setPressed(true);
                }
                if ((ke.getKeyCode() == VK_S) & (c == false)) {
                    c = true;
                    mc[canal].noteOn(33, 1200);
                    botones[2].getModel().setArmed(true);
                    botones[2].getModel().setPressed(true);
                }
                if ((ke.getKeyCode() == VK_E) & (d == false)) {
                    d = true;
                    mc[canal].noteOn(34, 1200);
                    botones[3].getModel().setArmed(true);
                    botones[3].getModel().setPressed(true);
                }
                if ((ke.getKeyCode() == VK_D) & (e == false)) {
                    e = true;
                    mc[canal].noteOn(35, 1200);
                    botones[4].getModel().setArmed(true);
                    botones[4].getModel().setPressed(true);
                }
                if ((ke.getKeyCode() == VK_F) & (f == false)) {
                    f = true;
                    mc[canal].noteOn(36, 1200);
                    botones[5].getModel().setArmed(true);
                    botones[5].getModel().setPressed(true);
                }
                if ((ke.getKeyCode() == VK_T) & (g == false)) {
                    g = true;
                    mc[canal].noteOn(37, 1200);
                    botones[6].getModel().setArmed(true);
                    botones[6].getModel().setPressed(true);
                }
                if ((ke.getKeyCode() == VK_G) & (h == false)) {
                    h = true;
                    mc[canal].noteOn(38, 1200);
                    botones[7].getModel().setArmed(true);
                    botones[7].getModel().setPressed(true);
                }
                if ((ke.getKeyCode() == VK_Y) & (i == false)) {
                    i = true;
                    mc[canal].noteOn(39, 1200);
                    botones[8].getModel().setArmed(true);
                    botones[8].getModel().setPressed(true);
                }
                if ((ke.getKeyCode() == VK_H) & (j == false)) {
                    j = true;
                    mc[canal].noteOn(40, 1200);
                    botones[9].getModel().setArmed(true);
                    botones[9].getModel().setPressed(true);
                }
                if ((ke.getKeyCode() == VK_J) & (k == false)) {
                    k = true;
                    mc[canal].noteOn(41, 1200);
                    botones[10].getModel().setArmed(true);
                    botones[10].getModel().setPressed(true);
                }
                if ((ke.getKeyCode() == VK_I) & (l == false)) {
                    l = true;
                    mc[canal].noteOn(42, 1200);
                    botones[11].getModel().setArmed(true);
                    botones[11].getModel().setPressed(true);
                }
                if ((ke.getKeyCode() == VK_K) & (m == false)) {
                    m = true;
                    mc[canal].noteOn(43, 1200);
                    botones[12].getModel().setArmed(true);
                    botones[12].getModel().setPressed(true);
                }
                if ((ke.getKeyCode() == VK_O) & (n == false)) {
                    n = true;
                    mc[canal].noteOn(44, 1200);
                    botones[13].getModel().setArmed(true);
                    botones[13].getModel().setPressed(true);
                }
                if ((ke.getKeyCode() == VK_L) & (o == false)) {
                    o = true;
                    mc[canal].noteOn(45, 1200);
                    botones[14].getModel().setArmed(true);
                    botones[14].getModel().setPressed(true);
                }
                if ((ke.getKeyCode() == VK_P) & (p == false)) {
                    p = true;
                    mc[canal].noteOn(46, 1200);
                    botones[15].getModel().setArmed(true);
                    botones[15].getModel().setPressed(true);
                }
                if ((ke.getKeyCode() == 0) & (q == false)) {
                    q = true;
                    mc[canal].noteOn(47, 1200);
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
                if (ke.getKeyCode() == VK_A) {
                    a = false;
                    mc[canal].noteOff(31, 1200);
                    botones[0].getModel().setArmed(false);
                    botones[0].getModel().setPressed(false);
                }
                if (ke.getKeyCode() == VK_W) {
                    b = false;
                    mc[canal].noteOff(32, 1200);
                    botones[1].getModel().setArmed(false);
                    botones[1].getModel().setPressed(false);
                }
                if (ke.getKeyCode() == VK_S) {
                    c = false;
                    mc[canal].noteOff(33, 1200);
                    botones[2].getModel().setArmed(false);
                    botones[2].getModel().setPressed(false);
                }
                if (ke.getKeyCode() == VK_E) {
                    d = false;
                    mc[canal].noteOff(34, 1200);
                    botones[3].getModel().setArmed(false);
                    botones[3].getModel().setPressed(false);
                }
                if (ke.getKeyCode() == VK_D) {
                    e = false;
                    mc[canal].noteOff(35, 1200);
                    botones[4].getModel().setArmed(false);
                    botones[4].getModel().setPressed(false);
                }
                if (ke.getKeyCode() == VK_F) {
                    f = false;
                    mc[canal].noteOff(36, 1200);
                    botones[5].getModel().setArmed(false);
                    botones[5].getModel().setPressed(false);
                }
                if (ke.getKeyCode() == VK_T) {
                    g = false;
                    mc[canal].noteOff(37, 1200);
                    botones[6].getModel().setArmed(false);
                    botones[6].getModel().setPressed(false);
                }
                if (ke.getKeyCode() == VK_G) {
                    h = false;
                    mc[canal].noteOff(38, 1200);
                    botones[7].getModel().setArmed(false);
                    botones[7].getModel().setPressed(false);
                }
                if (ke.getKeyCode() == VK_Y) {
                    i = false;
                    mc[canal].noteOff(39, 1200);
                    botones[8].getModel().setArmed(false);
                    botones[8].getModel().setPressed(false);
                }
                if (ke.getKeyCode() == VK_H) {
                    j = false;
                    mc[canal].noteOff(40, 1200);
                    botones[9].getModel().setArmed(false);
                    botones[9].getModel().setPressed(false);
                }
                if (ke.getKeyCode() == VK_J) {
                    k = false;
                    mc[canal].noteOff(41, 1200);
                    botones[10].getModel().setArmed(false);
                    botones[10].getModel().setPressed(false);
                }
                if (ke.getKeyCode() == VK_I) {
                    l = false;
                    mc[canal].noteOff(42, 1200);
                    botones[11].getModel().setArmed(false);
                    botones[11].getModel().setPressed(false);
                }
                if (ke.getKeyCode() == VK_K) {
                    m = false;
                    mc[canal].noteOff(43, 1200);
                    botones[12].getModel().setArmed(false);
                    botones[12].getModel().setPressed(false);
                }
                if (ke.getKeyCode() == VK_O) {
                    n = false;
                    mc[canal].noteOff(44, 1200);
                    botones[13].getModel().setArmed(false);
                    botones[13].getModel().setPressed(false);
                }
                if (ke.getKeyCode() == VK_L) {
                    o = false;
                    mc[canal].noteOff(45, 1200);
                    botones[14].getModel().setArmed(false);
                    botones[14].getModel().setPressed(false);
                }
                if (ke.getKeyCode() == VK_P) {
                    p = false;
                    mc[canal].noteOff(46, 1200);
                    botones[15].getModel().setArmed(false);
                    botones[15].getModel().setPressed(false);
                }
                if (ke.getKeyCode() == 0) {
                    q = false;
                    mc[canal].noteOff(47, 1200);
                    botones[16].getModel().setArmed(false);
                    botones[16].getModel().setPressed(false);
                }
            }

        }
        );

    }
}