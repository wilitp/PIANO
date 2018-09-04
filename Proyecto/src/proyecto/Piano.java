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
import javax.swing.JOptionPane;

/**
 *
 * @author Edu y wilitp
 */
public class Piano extends javax.swing.JFrame {

    Synthesizer synth;
    MidiChannel[] mc;

    public Piano() throws MidiUnavailableException {
        initComponents();
        synth = MidiSystem.getSynthesizer();
        synth.open();
        mc = synth.getChannels();
        Instrument[] instr = synth.getDefaultSoundbank().getInstruments();
        synth.loadInstrument(instr[10]);
        JButton[] botones = {C, Cs, D, Ds, E, F, Fs, G, Gs, A, Bb, B, C1, Cs1, D2, Ds1, E3};
        InputCheck c1 = new InputCheck(botones, mc, 0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Cs = new javax.swing.JButton();
        Ds = new javax.swing.JButton();
        Ds1 = new javax.swing.JButton();
        Gs = new javax.swing.JButton();
        Fs = new javax.swing.JButton();
        Bb = new javax.swing.JButton();
        Cs1 = new javax.swing.JButton();
        D = new javax.swing.JButton();
        E = new javax.swing.JButton();
        F = new javax.swing.JButton();
        G = new javax.swing.JButton();
        C = new javax.swing.JButton();
        A = new javax.swing.JButton();
        B = new javax.swing.JButton();
        C1 = new javax.swing.JButton();
        D2 = new javax.swing.JButton();
        E3 = new javax.swing.JButton();
        JLabelError = new javax.swing.JLabel();
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
        Cs.setBounds(40, 60, 60, 190);

        Ds.setBackground(java.awt.Color.black);
        Ds.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Ds.setForeground(new java.awt.Color(255, 255, 255));
        Ds.setText("D#");
        Ds.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Ds.setFocusable(false);
        Ds.setSelected(true);
        Ds.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(Ds);
        Ds.setBounds(110, 60, 60, 190);

        Ds1.setBackground(java.awt.Color.black);
        Ds1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Ds1.setForeground(new java.awt.Color(255, 255, 255));
        Ds1.setText("D#1");
        Ds1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Ds1.setFocusable(false);
        Ds1.setSelected(true);
        Ds1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(Ds1);
        Ds1.setBounds(590, 60, 60, 186);

        Gs.setBackground(java.awt.Color.black);
        Gs.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Gs.setForeground(new java.awt.Color(255, 255, 255));
        Gs.setText("G#");
        Gs.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Gs.setFocusable(false);
        Gs.setSelected(true);
        Gs.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(Gs);
        Gs.setBounds(320, 60, 60, 190);

        Fs.setBackground(java.awt.Color.black);
        Fs.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Fs.setForeground(new java.awt.Color(255, 255, 255));
        Fs.setText("F#");
        Fs.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Fs.setFocusable(false);
        Fs.setSelected(true);
        Fs.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(Fs);
        Fs.setBounds(250, 60, 60, 190);

        Bb.setBackground(java.awt.Color.black);
        Bb.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Bb.setForeground(new java.awt.Color(255, 255, 255));
        Bb.setText("Bb");
        Bb.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Bb.setFocusable(false);
        Bb.setSelected(true);
        Bb.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(Bb);
        Bb.setBounds(390, 60, 60, 190);

        Cs1.setBackground(java.awt.Color.black);
        Cs1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Cs1.setForeground(new java.awt.Color(255, 255, 255));
        Cs1.setText("C#1");
        Cs1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Cs1.setFocusable(false);
        Cs1.setSelected(true);
        Cs1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(Cs1);
        Cs1.setBounds(520, 60, 60, 186);

        D.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        D.setText("D");
        D.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        D.setFocusable(false);
        D.setSelected(true);
        D.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(D);
        D.setBounds(80, 210, 60, 249);

        E.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        E.setText("E");
        E.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        E.setFocusable(false);
        E.setSelected(true);
        E.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(E);
        E.setBounds(150, 210, 60, 249);

        F.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        F.setText("F");
        F.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        F.setFocusable(false);
        F.setSelected(true);
        F.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(F);
        F.setBounds(210, 210, 60, 249);

        G.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        G.setText("G");
        G.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        G.setFocusable(false);
        G.setSelected(true);
        G.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(G);
        G.setBounds(280, 210, 60, 249);

        C.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        C.setText("C");
        C.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        C.setSelected(true);
        C.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(C);
        C.setBounds(10, 210, 60, 249);

        A.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        A.setText("A");
        A.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        A.setFocusable(false);
        A.setSelected(true);
        A.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(A);
        A.setBounds(350, 210, 60, 249);

        B.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        B.setText("B");
        B.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        B.setFocusable(false);
        B.setSelected(true);
        B.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(B);
        B.setBounds(420, 210, 60, 249);

        C1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        C1.setText("C1");
        C1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        C1.setFocusable(false);
        C1.setSelected(true);
        C1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(C1);
        C1.setBounds(490, 210, 60, 249);

        D2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        D2.setText("D2");
        D2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        D2.setFocusable(false);
        D2.setSelected(true);
        D2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(D2);
        D2.setBounds(560, 210, 60, 249);

        E3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        E3.setText("E3");
        E3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        E3.setFocusable(false);
        E3.setSelected(true);
        E3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(E3);
        E3.setBounds(630, 210, 60, 249);

        JLabelError.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        JLabelError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabelError.setText("Piano ");
        getContentPane().add(JLabelError);
        JLabelError.setBounds(140, 10, 430, 40);

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
            Logger.getLogger(Piano.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_AtrasActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton A;
    private javax.swing.JButton Atras;
    private javax.swing.JButton B;
    private javax.swing.JButton Bb;
    private javax.swing.JButton C;
    private javax.swing.JButton C1;
    private javax.swing.JButton Cs;
    private javax.swing.JButton Cs1;
    private javax.swing.JButton D;
    private javax.swing.JButton D2;
    private javax.swing.JButton Ds;
    private javax.swing.JButton Ds1;
    private javax.swing.JButton E;
    private javax.swing.JButton E3;
    private javax.swing.JButton F;
    private javax.swing.JButton Fs;
    private javax.swing.JButton G;
    private javax.swing.JButton Gs;
    private javax.swing.JLabel JLabelError;
    private javax.swing.ButtonGroup buttonGroup1;
    // End of variables declaration//GEN-END:variables

}
