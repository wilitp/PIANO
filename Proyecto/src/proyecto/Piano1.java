/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.midi.Instrument;
import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Synthesizer;
import javax.swing.JButton;

/**
 *
 * @author Edu y wilitp
 */
public class Piano1 extends javax.swing.JFrame {

    Synthesizer synth;
    MidiChannel[] mc;

    public Piano1() throws MidiUnavailableException {
        initComponents();
        synth = MidiSystem.getSynthesizer();
        synth.open();
        mc = synth.getChannels();
        Instrument[] instr = synth.getDefaultSoundbank().getInstruments();
        synth.loadInstrument(instr[10]);
        JButton[] botones = {G, Gs, A, Bb, B, C, Cs, D, Ds, E, F, Fs, G2, Gs2, A2, Bb2, B2};
        InputCheck1 c1 = new InputCheck1(botones, mc, 0);
        InputCheck1 c2 = new InputCheck1(botones, mc, 1);
        InputCheck1 c3 = new InputCheck1(botones, mc, 2);
        InputCheck1 c4 = new InputCheck1(botones, mc, 3);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Cs = new javax.swing.JButton();
        Ds = new javax.swing.JButton();
        Gs2 = new javax.swing.JButton();
        Fs = new javax.swing.JButton();
        Bb2 = new javax.swing.JButton();
        D = new javax.swing.JButton();
        E = new javax.swing.JButton();
        F = new javax.swing.JButton();
        G2 = new javax.swing.JButton();
        C = new javax.swing.JButton();
        A2 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        JLabelError = new javax.swing.JLabel();
        Gs = new javax.swing.JButton();
        Bb = new javax.swing.JButton();
        G = new javax.swing.JButton();
        A = new javax.swing.JButton();
        B = new javax.swing.JButton();
        Atras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(705, 550));
        setResizable(false);
        setSize(new java.awt.Dimension(705, 550));
        getContentPane().setLayout(null);

        Cs.setBackground(java.awt.Color.black);
        Cs.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Cs.setForeground(new java.awt.Color(255, 255, 255));
        Cs.setText("C#");
        Cs.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Cs.setFocusable(false);
        Cs.setSelected(true);
        Cs.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(Cs);
        Cs.setBounds(250, 70, 60, 190);

        Ds.setBackground(java.awt.Color.black);
        Ds.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Ds.setForeground(new java.awt.Color(255, 255, 255));
        Ds.setText("D#");
        Ds.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Ds.setFocusable(false);
        Ds.setSelected(true);
        Ds.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(Ds);
        Ds.setBounds(320, 70, 60, 190);

        Gs2.setBackground(java.awt.Color.black);
        Gs2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Gs2.setForeground(new java.awt.Color(255, 255, 255));
        Gs2.setText("G#");
        Gs2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Gs2.setFocusable(false);
        Gs2.setSelected(true);
        Gs2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(Gs2);
        Gs2.setBounds(530, 70, 60, 190);

        Fs.setBackground(java.awt.Color.black);
        Fs.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Fs.setForeground(new java.awt.Color(255, 255, 255));
        Fs.setText("F#");
        Fs.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Fs.setFocusable(false);
        Fs.setSelected(true);
        Fs.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(Fs);
        Fs.setBounds(460, 70, 60, 190);

        Bb2.setBackground(java.awt.Color.black);
        Bb2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Bb2.setForeground(new java.awt.Color(255, 255, 255));
        Bb2.setText("Bb");
        Bb2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Bb2.setFocusable(false);
        Bb2.setSelected(true);
        Bb2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(Bb2);
        Bb2.setBounds(600, 70, 60, 190);

        D.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        D.setText("D");
        D.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        D.setFocusable(false);
        D.setSelected(true);
        D.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(D);
        D.setBounds(290, 220, 60, 249);

        E.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        E.setText("E");
        E.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        E.setFocusable(false);
        E.setSelected(true);
        E.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(E);
        E.setBounds(360, 220, 60, 249);

        F.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        F.setText("F");
        F.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        F.setFocusable(false);
        F.setSelected(true);
        F.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(F);
        F.setBounds(420, 220, 60, 249);

        G2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        G2.setText("G");
        G2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        G2.setFocusable(false);
        G2.setSelected(true);
        G2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(G2);
        G2.setBounds(490, 220, 60, 249);

        C.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        C.setText("C");
        C.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        C.setFocusable(false);
        C.setSelected(true);
        C.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(C);
        C.setBounds(220, 220, 60, 249);

        A2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        A2.setText("A");
        A2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        A2.setFocusable(false);
        A2.setSelected(true);
        A2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(A2);
        A2.setBounds(560, 220, 60, 249);

        B2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        B2.setText("B");
        B2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        B2.setFocusable(false);
        B2.setSelected(true);
        B2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(B2);
        B2.setBounds(630, 220, 60, 249);

        JLabelError.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        JLabelError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabelError.setText("Piano ");
        getContentPane().add(JLabelError);
        JLabelError.setBounds(140, 10, 430, 40);

        Gs.setBackground(java.awt.Color.black);
        Gs.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Gs.setForeground(new java.awt.Color(255, 255, 255));
        Gs.setText("G#");
        Gs.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Gs.setFocusable(false);
        Gs.setSelected(true);
        Gs.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(Gs);
        Gs.setBounds(60, 70, 60, 190);

        Bb.setBackground(java.awt.Color.black);
        Bb.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Bb.setForeground(new java.awt.Color(255, 255, 255));
        Bb.setText("Bb");
        Bb.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Bb.setFocusable(false);
        Bb.setSelected(true);
        Bb.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(Bb);
        Bb.setBounds(130, 70, 60, 190);

        G.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        G.setText("G");
        G.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        G.setSelected(true);
        G.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(G);
        G.setBounds(20, 220, 60, 249);

        A.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        A.setText("A");
        A.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        A.setFocusable(false);
        A.setSelected(true);
        A.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(A);
        A.setBounds(90, 220, 60, 249);

        B.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        B.setText("B");
        B.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        B.setFocusable(false);
        B.setSelected(true);
        B.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(B);
        B.setBounds(160, 220, 60, 249);

        Atras.setText("Atrás");
        Atras.setFocusable(false);
        Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasActionPerformed(evt);
            }
        });
        getContentPane().add(Atras);
        Atras.setBounds(20, 10, 140, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasActionPerformed
        this.dispose();
        try {
            Inicio.selector();
        } catch (MidiUnavailableException ex) {
            Logger.getLogger(Piano1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_AtrasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton A;
    private javax.swing.JButton A2;
    private javax.swing.JButton Atras;
    private javax.swing.JButton B;
    private javax.swing.JButton B2;
    private javax.swing.JButton Bb;
    private javax.swing.JButton Bb2;
    private javax.swing.JButton C;
    private javax.swing.JButton Cs;
    private javax.swing.JButton D;
    private javax.swing.JButton Ds;
    private javax.swing.JButton E;
    private javax.swing.JButton F;
    private javax.swing.JButton Fs;
    private javax.swing.JButton G;
    private javax.swing.JButton G2;
    private javax.swing.JButton Gs;
    private javax.swing.JButton Gs2;
    private javax.swing.JLabel JLabelError;
    private javax.swing.ButtonGroup buttonGroup1;
    // End of variables declaration//GEN-END:variables

}
