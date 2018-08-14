/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.awt.event.KeyEvent;
import java.io.*;
import java.net.URL;
import sun.audio.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Edu
 */
public class Piano extends javax.swing.JFrame {
    String a;
   
    public Piano() {
        initComponents();
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
        JRadioDrum = new javax.swing.JRadioButton();
        JRadioPiano = new javax.swing.JRadioButton();
        JLabelError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(705, 550));
        setPreferredSize(new java.awt.Dimension(705, 550));
        setResizable(false);
        setSize(new java.awt.Dimension(705, 550));
        getContentPane().setLayout(null);

        Cs.setBackground(java.awt.Color.black);
        Cs.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Cs.setForeground(new java.awt.Color(255, 255, 255));
        Cs.setText("C#");
        Cs.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Cs.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Cs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CsActionPerformed(evt);
            }
        });
        Cs.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CsKeyPressed(evt);
            }
        });
        getContentPane().add(Cs);
        Cs.setBounds(40, 60, 60, 190);

        Ds.setBackground(java.awt.Color.black);
        Ds.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Ds.setForeground(new java.awt.Color(255, 255, 255));
        Ds.setText("D#");
        Ds.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Ds.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Ds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DsActionPerformed(evt);
            }
        });
        getContentPane().add(Ds);
        Ds.setBounds(110, 60, 60, 190);

        Ds1.setBackground(java.awt.Color.black);
        Ds1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Ds1.setForeground(new java.awt.Color(255, 255, 255));
        Ds1.setText("D#1");
        Ds1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Ds1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Ds1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ds1ActionPerformed(evt);
            }
        });
        getContentPane().add(Ds1);
        Ds1.setBounds(590, 60, 60, 186);

        Gs.setBackground(java.awt.Color.black);
        Gs.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Gs.setForeground(new java.awt.Color(255, 255, 255));
        Gs.setText("G#");
        Gs.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Gs.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Gs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GsActionPerformed(evt);
            }
        });
        getContentPane().add(Gs);
        Gs.setBounds(320, 60, 60, 190);

        Fs.setBackground(java.awt.Color.black);
        Fs.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Fs.setForeground(new java.awt.Color(255, 255, 255));
        Fs.setText("F#");
        Fs.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Fs.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Fs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FsActionPerformed(evt);
            }
        });
        getContentPane().add(Fs);
        Fs.setBounds(250, 60, 60, 190);

        Bb.setBackground(java.awt.Color.black);
        Bb.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Bb.setForeground(new java.awt.Color(255, 255, 255));
        Bb.setText("Bb");
        Bb.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Bb.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Bb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BbActionPerformed(evt);
            }
        });
        getContentPane().add(Bb);
        Bb.setBounds(390, 60, 60, 190);

        Cs1.setBackground(java.awt.Color.black);
        Cs1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Cs1.setForeground(new java.awt.Color(255, 255, 255));
        Cs1.setText("C#1");
        Cs1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Cs1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Cs1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cs1ActionPerformed(evt);
            }
        });
        getContentPane().add(Cs1);
        Cs1.setBounds(520, 60, 60, 186);

        D.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        D.setText("D");
        D.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        D.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DActionPerformed(evt);
            }
        });
        D.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                DKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                DKeyTyped(evt);
            }
        });
        getContentPane().add(D);
        D.setBounds(80, 210, 60, 249);

        E.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        E.setText("E");
        E.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        E.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EActionPerformed(evt);
            }
        });
        E.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                EKeyPressed(evt);
            }
        });
        getContentPane().add(E);
        E.setBounds(150, 210, 60, 249);

        F.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        F.setText("F");
        F.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        F.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        F.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FActionPerformed(evt);
            }
        });
        getContentPane().add(F);
        F.setBounds(210, 210, 60, 249);

        G.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        G.setText("G");
        G.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        G.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        G.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GActionPerformed(evt);
            }
        });
        getContentPane().add(G);
        G.setBounds(280, 210, 60, 249);

        C.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        C.setText("C");
        C.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        C.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CActionPerformed(evt);
            }
        });
        C.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CKeyTyped(evt);
            }
        });
        getContentPane().add(C);
        C.setBounds(10, 210, 60, 249);

        A.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        A.setText("A");
        A.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        A.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AActionPerformed(evt);
            }
        });
        getContentPane().add(A);
        A.setBounds(350, 210, 60, 249);

        B.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        B.setText("B");
        B.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        B.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BActionPerformed(evt);
            }
        });
        getContentPane().add(B);
        B.setBounds(420, 210, 60, 249);

        C1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        C1.setText("C1");
        C1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        C1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1ActionPerformed(evt);
            }
        });
        getContentPane().add(C1);
        C1.setBounds(490, 210, 60, 249);

        D2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        D2.setText("D2");
        D2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        D2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        D2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D2ActionPerformed(evt);
            }
        });
        getContentPane().add(D2);
        D2.setBounds(560, 210, 60, 249);

        E3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        E3.setText("E3");
        E3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        E3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        E3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E3ActionPerformed(evt);
            }
        });
        getContentPane().add(E3);
        E3.setBounds(630, 210, 60, 249);

        buttonGroup1.add(JRadioDrum);
        JRadioDrum.setText("Drums");
        getContentPane().add(JRadioDrum);
        JRadioDrum.setBounds(590, 20, 107, 25);

        buttonGroup1.add(JRadioPiano);
        JRadioPiano.setSelected(true);
        JRadioPiano.setText("Piano");
        getContentPane().add(JRadioPiano);
        JRadioPiano.setBounds(40, 20, 59, 25);

        JLabelError.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        JLabelError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabelError.setText("Piano - Drums");
        getContentPane().add(JLabelError);
        JLabelError.setBounds(140, 10, 430, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GsActionPerformed
            if (JRadioPiano.isSelected()){         
                
                repNota1("/proyecto/notas/G_s.wav");
            }
            if (JRadioDrum.isSelected()){         
                
                repNota1("/proyecto/notas/Gq_Drum.wav");
            }
    }//GEN-LAST:event_GsActionPerformed

    private void BbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BbActionPerformed
            if (JRadioPiano.isSelected()){         
                
                repNota1("/proyecto/notas/Bb.wav");
            }
            if (JRadioDrum.isSelected()){         
                
                repNota1("/proyecto/notas/Bb_Drum.wav");
            }
    }//GEN-LAST:event_BbActionPerformed

    private void CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CActionPerformed
            if (JRadioPiano.isSelected()){         
                
                repNota1("/proyecto/notas/C.wav");
            }
            if (JRadioDrum.isSelected()){         
                
                repNota1("/proyecto/notas/C_Drum.wav");
            }
    }//GEN-LAST:event_CActionPerformed

    private void CKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CKeyPressed

    }//GEN-LAST:event_CKeyPressed
    
    private void DKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DKeyPressed
        
    }//GEN-LAST:event_DKeyPressed

    private void DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DActionPerformed
            if (JRadioPiano.isSelected()){         
                a = "/proyecto/notas/D.wav";
                repNota1(a);
            }
            if (JRadioDrum.isSelected()){         
                a = "/proyecto/notas/D_Drum.wav";
                repNota1(a);
            }
    }//GEN-LAST:event_DActionPerformed

    private void EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EActionPerformed
            if (JRadioPiano.isSelected()){         
                repNota1("/proyecto/notas/E.wav");
            }
            if (JRadioDrum.isSelected()){        
                repNota1("/proyecto/notas/E_Drum.wav");
            }
    }//GEN-LAST:event_EActionPerformed

    private void FActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FActionPerformed
            if (JRadioPiano.isSelected()){         
                
                repNota1("/proyecto/notas/F.wav");
            }
            if (JRadioDrum.isSelected()){         
                
                repNota1("/proyecto/notas/F_Drum.wav");
            }
    }//GEN-LAST:event_FActionPerformed

    private void CKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CKeyTyped
 
    }//GEN-LAST:event_CKeyTyped

    private void DKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DKeyTyped

    }//GEN-LAST:event_DKeyTyped

    private void EKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EKeyPressed

    }//GEN-LAST:event_EKeyPressed

    private void GActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GActionPerformed
            if (JRadioPiano.isSelected()){         
                repNota1("/proyecto/notas/G.wav");
            }
            if (JRadioDrum.isSelected()){         
                
                repNota1("/proyecto/notas/G_Drum.wav");
            }
    }//GEN-LAST:event_GActionPerformed

    private void AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AActionPerformed
            if (JRadioPiano.isSelected()){         
                repNota1("/proyecto/notas/A.wav");
            }
            if (JRadioDrum.isSelected()){         
                
                repNota1("/proyecto/notas/A_Drum.wav");
            }
    }//GEN-LAST:event_AActionPerformed

    private void BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BActionPerformed
            if (JRadioPiano.isSelected()){         
               
                repNota1("/proyecto/notas/B.wav");
            }
            if (JRadioDrum.isSelected()){         
                
                repNota1("/proyecto/notas/B_Drum.wav");
            }
    }//GEN-LAST:event_BActionPerformed

    private void C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C1ActionPerformed
             if (JRadioPiano.isSelected()){         
               
                repNota1("/proyecto/notas/C1.wav");
            }
            if (JRadioDrum.isSelected()){         
                
                repNota1("/proyecto/notas/C1_Drum.wav");
            }
    }//GEN-LAST:event_C1ActionPerformed

    private void D2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D2ActionPerformed
            if (JRadioPiano.isSelected()){         
                
                repNota1("/proyecto/notas/D1.wav");
            }
            if (JRadioDrum.isSelected()){         
                
                repNota1("/proyecto/notas/D1_Drum.wav");
            }
    }//GEN-LAST:event_D2ActionPerformed

    private void E3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E3ActionPerformed
            if (JRadioPiano.isSelected()){         
                repNota1("/proyecto/notas/E1.wav");
            }
            if (JRadioDrum.isSelected()){         
               
                repNota1("/proyecto/notas/E1_Drum.wav");
            }
    }//GEN-LAST:event_E3ActionPerformed

    private void CsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CsActionPerformed
            if (JRadioPiano.isSelected()){         
                repNota1("/proyecto/notas/C_s.wav");
            }
            if (JRadioDrum.isSelected()){         
                repNota1("/proyecto/notas/Cq_Drum.wav");
            }
    }//GEN-LAST:event_CsActionPerformed

    private void DsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DsActionPerformed
            if (JRadioPiano.isSelected()){         
                repNota1("/proyecto/notas/D_s.wav");
            }
            if (JRadioDrum.isSelected()){         
               
                repNota1("/proyecto/notas/Dq_Drum.wav");
            }
    }//GEN-LAST:event_DsActionPerformed

    private void FsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FsActionPerformed
            if (JRadioPiano.isSelected()){         
                
                repNota1("/proyecto/notas/F_s.wav");
            }
            if (JRadioDrum.isSelected()){         
                
                repNota1("/proyecto/notas/Fq_Drum.wav");
            }
    }//GEN-LAST:event_FsActionPerformed

    private void Cs1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cs1ActionPerformed
            if (JRadioPiano.isSelected()){         
                
                repNota1("/proyecto/notas/C_s1.wav");
            }
            if (JRadioDrum.isSelected()){         
                
                repNota1("/proyecto/notas/Cq1_Drum.wav");
            }
    }//GEN-LAST:event_Cs1ActionPerformed

    private void Ds1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ds1ActionPerformed
        if (JRadioPiano.isSelected()){         
                
                repNota1("/proyecto/notas/D_s1.wav");
            }
            if (JRadioDrum.isSelected()){         
                
                repNota1("/proyecto/notas/Dq1_Drum.wav");
            }
    }//GEN-LAST:event_Ds1ActionPerformed

    private void CsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CsKeyPressed
        
    }//GEN-LAST:event_CsKeyPressed
    public void repNota1(String a) {
        InputStream iAudio;           
        if(JRadioPiano.isSelected() && JRadioDrum.isSelected()){
            JLabelError.setText("");
            JLabelError.setText("Debe seleccionar solo un instrumento");
        }
        if (JRadioPiano.isSelected() && !JRadioDrum.isSelected()){
            try {
                JLabelError.setText("");
                JLabelError.setText("Piano");
                URL url = new Piano().getResource(a);
                iAudio = new FileInputStream(new File(url.getPath()));
                AudioStream iMusic = new AudioStream(iAudio);
                AudioPlayer.player.start(iMusic);
                }
            catch (IOException e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
        if (JRadioDrum.isSelected() && !JRadioPiano.isSelected()){
            try {
                JLabelError.setText("");
                JLabelError.setText("Drums");
                URL url = new Piano().getResource(a);
                iAudio = new FileInputStream(new File(url.getPath()));;
                AudioStream iMusic = new AudioStream(iAudio);
                AudioPlayer.player.start(iMusic);
                }
            catch (IOException e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }

    public InputStream getResourceAsStream(String name) {
        name = resolveName(name, this.getClass());
        ClassLoader cl = getClass().getClassLoader();
        if (cl == null) {
            return ClassLoader.getSystemResourceAsStream(name); // A system class.
        }
        return cl.getResourceAsStream(name);
    }

    public java.net.URL getResource(String name) {
        name = resolveName(name, this.getClass());
        ClassLoader cl = getClass().getClassLoader();
        if (cl == null) {
            return ClassLoader.getSystemResource(name);  // A system class.
        }
        return cl.getResource(name);
    }
    
    private String resolveName(String name, Object clazz) {
        if (name == null) {
            return name;
        }
        if (!name.startsWith("/")) {
            Class c = clazz.getClass();
            while (c.isArray()) {
                c = c.getComponentType();
            }
            String baseName = c.getName();
            int index = baseName.lastIndexOf('.');
            if (index != -1) {
                name = baseName.substring(0, index).replace('.', '/') + "/" + name;
            }
        } else {
            name = name.substring(1);
        }
        return name;
    }
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Piano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Piano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Piano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Piano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            GrabadorAudio grab = new GrabadorAudio();
            public void run() {
                new Piano().setVisible(true);
                grab.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton A;
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
    private javax.swing.JRadioButton JRadioDrum;
    private javax.swing.JRadioButton JRadioPiano;
    private javax.swing.ButtonGroup buttonGroup1;
    // End of variables declaration//GEN-END:variables
}
