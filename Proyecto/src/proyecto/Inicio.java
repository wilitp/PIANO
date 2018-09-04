/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import javax.sound.midi.MidiUnavailableException;
import javax.swing.JOptionPane;

/**
 *
 * @author deipola
 */
public class Inicio {

    public static void main(String args[]) throws MidiUnavailableException {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Piano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        selector();

    }
    public static void selector() throws MidiUnavailableException{
        int seleccion = JOptionPane.showOptionDialog(null, "Seleccione un registro",
                "Piano", JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE, null,// null para icono por defecto.
                new Object[]{"Medio", "Bajo"}, "Medio");
        if (seleccion == 1) {
            Piano1 pianito = new Piano1();
            /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                    pianito.setVisible(true);
                }
            });
        }
        if (seleccion == 0) {
            Piano pianito = new Piano();
            /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                    pianito.setVisible(true);
                }
            });
        }
    }
}
