package proyecto;

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.TargetDataLine;
import javax.swing.JFileChooser;

public class GrabadorAudio extends javax.swing.JFrame {

    public GrabadorAudio() {
        initComponents();
    }

    private TargetDataLine m_line;
    private AudioFileFormat.Type m_targetType;
    private AudioInputStream m_audioInputStream;
    private File m_outputFile;
    private String ruta = "C:\\Users\\Edu\\Music\\Grabacion.wav";

    private javax.swing.JButton jB_Grabar;
    private javax.swing.JButton jB_Parar;
    private javax.swing.JButton jB_Ruta;
    @SuppressWarnings("unchecked")

    private void initComponents() {
        
        this.setLocation(700, 0);
        this.setResizable(false);
        this.setAlwaysOnTop(true);
        jB_Grabar = new javax.swing.JButton();
        jB_Parar = new javax.swing.JButton();
        jB_Ruta = new javax.swing.JButton();
 
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
 
        jB_Grabar.setText("Grabar");
        jB_Grabar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_GrabarActionPerformed(evt);
            }
        });
 
        jB_Parar.setText("Parar");
        jB_Parar.setEnabled(false);
        jB_Parar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_PararActionPerformed(evt);
            }
        });
 
        jB_Ruta.setText("Ruta");
        jB_Ruta.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_RutaActionPerformed(evt);
            }
        });
 
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jB_Ruta)
                .addGap(32, 32, 32)
                .addComponent(jB_Grabar)
                .addGap(26, 26, 26)
                .addComponent(jB_Parar)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB_Ruta)
                    .addComponent(jB_Grabar)
                    .addComponent(jB_Parar))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        pack();
    }                  
 
    private void jB_RutaActionPerformed(java.awt.event.ActionEvent evt) {
        JFileChooser explorador = new JFileChooser("C:/musica");
        explorador.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        if (explorador.showOpenDialog(this)==JFileChooser.APPROVE_OPTION){
            ruta = explorador.getSelectedFile().toString();
        }
    }
 
    private void jB_GrabarActionPerformed(java.awt.event.ActionEvent evt) {
 
        AudioFormat audioFormat = new AudioFormat(AudioFormat.Encoding.PCM_SIGNED,
        44100.0F, 16, 2, 4, 44100.0F, false);
        File ruta_Archivo = new File(ruta);
        DataLine.Info	
        info = new DataLine.Info(TargetDataLine.class, audioFormat);
        TargetDataLine	targetDataLine = null;
        try{
            targetDataLine = (TargetDataLine) AudioSystem.getLine(info);
            targetDataLine.open(audioFormat);
        }
        catch (LineUnavailableException e){
            e.printStackTrace();
            System.exit(1);
        }
        AudioFileFormat.Type	
        targetType = AudioFileFormat.Type.WAVE;
        Graba_Salida_Audio(targetDataLine,targetType,ruta_Archivo);
    }
    
    public void Graba_Salida_Audio(TargetDataLine line,AudioFileFormat.Type targetType,File file){
 
        jB_Grabar.setEnabled(false);
        jB_Parar.setEnabled(true);
        m_line = line;
        m_audioInputStream = new AudioInputStream(line);
        m_targetType = targetType;
        m_outputFile = file;
 
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
            m_line.start();
            try{
                AudioSystem.write(m_audioInputStream,m_targetType, m_outputFile);
            }
            catch (IOException e){e.printStackTrace();}
            }
        });
        t.start();
	}

    private void jB_PararActionPerformed(java.awt.event.ActionEvent evt) {
 
        jB_Grabar.setEnabled(true);
        jB_Parar.setEnabled(false);
        m_line.stop();
        m_line.close();
    }
}


