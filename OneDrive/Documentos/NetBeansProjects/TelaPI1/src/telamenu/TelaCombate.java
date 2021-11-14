package telamenu;

import java.awt.HeadlessException;
import sons.ExecutarSom;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class TelaCombate extends javax.swing.JFrame {

    public TelaCombate(String dificuldade) {
        initComponents();

        this.dificuldade = dificuldade;
        if (lblcoracaom1.isEnabled() == true) {
            lblcoracaom1.setEnabled(false);
        }

        if (dificuldade.equals("dificil") && lblcoracaom2.isEnabled() == true) {
            lblcoracaom2.setEnabled(false);
        }

        som = new ExecutarSom(false, "Terra");

    }

    public TelaCombate() {
        initComponents();

        this.dificuldade = "facil";

        som = new ExecutarSom(false, "Terra");

    }

    public ExecutarSom som;
    private int pergunta;
    public int contador;
    private String dificuldade;

    public TelaCombate(ExecutarSom som, int pergunta, int contador, JButton btnAlt1, JButton btnAlt2, JButton btnAlt3, JButton btnAlt4, JButton jButton5, JLabel jLabel1, JLabel jLabel2, JLabel jLabel3, JLabel jLabel4, JLabel jLabel5, JLabel jLabel6, JLabel lblPergunta, JLabel lblcoracaoj1, JLabel lblcoracaoj2, JLabel lblcoracaoj3, JLabel lblcoracaom1, JLabel lblcoracaom2, JLabel lblcoracaom3) throws HeadlessException {
        this.som = som;
        this.pergunta = pergunta;
        this.contador = contador;
        this.btnAlt1 = btnAlt1;
        this.btnAlt2 = btnAlt2;
        this.btnAlt3 = btnAlt3;
        this.btnAlt4 = btnAlt4;
        this.jButton5 = jButton5;
        this.jLabel1 = jLabel1;
        this.jLabel2 = jLabel2;
        this.jLabel3 = jLabel3;
        this.jLabel4 = jLabel4;
        this.jLabel5 = jLabel5;
        this.jLabel6 = jLabel6;
        this.lblPergunta = lblPergunta;
        this.lblcoracaoj1 = lblcoracaoj1;
        this.lblcoracaoj2 = lblcoracaoj2;
        this.lblcoracaoj3 = lblcoracaoj3;
        this.lblcoracaom1 = lblcoracaom1;
        this.lblcoracaom2 = lblcoracaom2;
        this.lblcoracaom3 = lblcoracaom3;
    }

    public int gerarPergunta() {
        Random randomico = new Random();
        return randomico.nextInt(3) + 1;

    }

    public void proximaFase(String dificuldade) {
        if (dificuldade.equals("facil")) {
            TelaCombate tela = new TelaCombate("medio");
            tela.setVisible(true);
            dispose();

        }
        if (dificuldade.equals("medio")) {
            TelaCombate tela = new TelaCombate("dificil");
            tela.setVisible(true);
            dispose();

        } else if (dificuldade.equals("dificil")) {
            lblcoracaom3.setEnabled(false);
            JOptionPane.showMessageDialog(null, "Você ganhou do Mestre Python, recebeu o troféu que garante sua conquista"
                    + " selecione um novo local.");
            TelaLocais tela = new TelaLocais();
            tela.setVisible(true);
            dispose();

        }

    }

    public boolean validarResposta(int resposta) {

        boolean validadorResposta = false;
        switch (pergunta) {
            case 1:
                if (resposta == 4) {
                    validadorResposta = true;
                }
                break;
            case 2:
                if (resposta == 3) {
                    validadorResposta = true;
                }
                break;
            case 3:
                if (resposta == 3) {
                    validadorResposta = true;
                }
                break;
        }
        return validadorResposta;

    }

    public void contadorAcertos(int contador) {
        if (contador == 2) {
            JOptionPane.showMessageDialog(null, "Você ganhou desse mestre, Parabéns!!!");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblcoracaom3 = new javax.swing.JLabel();
        lblcoracaom2 = new javax.swing.JLabel();
        lblcoracaom1 = new javax.swing.JLabel();
        lblPergunta = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblcoracaoj1 = new javax.swing.JLabel();
        lblcoracaoj2 = new javax.swing.JLabel();
        lblcoracaoj3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnAlt1 = new javax.swing.JButton();
        btnAlt2 = new javax.swing.JButton();
        btnAlt3 = new javax.swing.JButton();
        btnAlt4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblcoracaom3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-coração-de-pixel-30.png"))); // NOI18N
        getContentPane().add(lblcoracaom3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 30, 30));

        lblcoracaom2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-coração-de-pixel-30.png"))); // NOI18N
        getContentPane().add(lblcoracaom2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 30, 30));

        lblcoracaom1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-coração-de-pixel-30.png"))); // NOI18N
        getContentPane().add(lblcoracaom1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 30, 30));
        getContentPane().add(lblPergunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 240, 110));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bi_person-circle.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 140, 150));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/emojione-monotone_alien-monster.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 140, 140));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Mestre Python.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 410, 90));

        lblcoracaoj1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-coração-de-pixel-30.png"))); // NOI18N
        getContentPane().add(lblcoracaoj1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 270, 30, 30));

        lblcoracaoj2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-coração-de-pixel-30.png"))); // NOI18N
        getContentPane().add(lblcoracaoj2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, 30, 30));

        lblcoracaoj3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-coração-de-pixel-30.png"))); // NOI18N
        getContentPane().add(lblcoracaoj3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 270, 30, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/layout jogador.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 410, 90));

        btnAlt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlt1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAlt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, 210, 50));

        btnAlt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlt2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAlt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 440, 210, 50));

        btnAlt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlt3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAlt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 380, 210, 50));

        btnAlt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlt4ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAlt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 440, 210, 50));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/1.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 740, 170));

        jButton5.setText("Som");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, 100, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Imagem principal da tela de Locais.jpeg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAlt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlt1ActionPerformed
        // TODO add your handling code here:
        if (validarResposta(3) || validarResposta(4)) {

            if (lblcoracaoj1.isEnabled() == true) {
                lblcoracaoj1.setEnabled(false);
                JOptionPane.showMessageDialog(null, "Você errou :(");
            } else if (lblcoracaoj2.isEnabled() == true) {
                lblcoracaoj2.setEnabled(false);
                JOptionPane.showMessageDialog(null, "Você errou :(");
            } else {
                lblcoracaoj3.setEnabled(false);
                JOptionPane.showMessageDialog(null, "Você perdeu, pratique mais");

            }
        }

    }//GEN-LAST:event_btnAlt1ActionPerformed

    private void btnAlt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlt2ActionPerformed
        // TODO add your handling code here:

        if (validarResposta(3) || validarResposta(4)) {

            if (lblcoracaoj1.isEnabled() == true) {
                lblcoracaoj1.setEnabled(false);
                JOptionPane.showMessageDialog(null, "Você errou :(");
            } else if (lblcoracaoj2.isEnabled() == true) {
                lblcoracaoj2.setEnabled(false);
                JOptionPane.showMessageDialog(null, "Você errou :(");
            } else {
                lblcoracaoj3.setEnabled(false);
                JOptionPane.showMessageDialog(null, "Você perdeu, pratique mais.");

            }
        }


    }//GEN-LAST:event_btnAlt2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:

        som.tocar();


    }//GEN-LAST:event_jButton5ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:

        pergunta = gerarPergunta();
        String perguntaString = String.format("/perguntas/perguntasjava/faceis/pergunta%d.png", pergunta);
        lblPergunta.setIcon(new ImageIcon(getClass().getResource(perguntaString)));

        String alternativaString = String.format("/respostas/respostasjava/facil/questao%d", pergunta);
        btnAlt1.setIcon(new ImageIcon(getClass().getResource(alternativaString + "/alternativa1.png")));
        btnAlt2.setIcon(new ImageIcon(getClass().getResource(alternativaString + "/alternativa2.png")));
        btnAlt3.setIcon(new ImageIcon(getClass().getResource(alternativaString + "/alternativa3.png")));
        btnAlt4.setIcon(new ImageIcon(getClass().getResource(alternativaString + "/alternativa4.png")));


    }//GEN-LAST:event_formWindowOpened


    private void btnAlt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlt4ActionPerformed
        // TODO add your handling code here
        if (validarResposta(4)) {
            lblcoracaom1.setEnabled(false);
            JOptionPane.showMessageDialog(null, "Você acertou");
            contador += 1;
            contadorAcertos(contador);
            proximaFase(dificuldade);

        } else if (validarResposta(3) && lblcoracaoj1.isEnabled() == true) {
            lblcoracaoj1.setEnabled(false);
            JOptionPane.showMessageDialog(null, "Você errou :(");
        } else if (validarResposta(3) && lblcoracaoj2.isEnabled() == true) {
            lblcoracaoj2.setEnabled(false);
            JOptionPane.showMessageDialog(null, "Você errou :(");
        } else {
            lblcoracaoj3.setEnabled(false);
            JOptionPane.showMessageDialog(null, "Você perdeu, pratique mais.");
        }

    }//GEN-LAST:event_btnAlt4ActionPerformed

    private void btnAlt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlt3ActionPerformed
        // TODO add your handling code here:
        if (validarResposta(3)) {
            lblcoracaom1.setEnabled(false);
            JOptionPane.showMessageDialog(null, "Você acertou");
            contador += 1;
            contadorAcertos(contador);
            proximaFase(dificuldade);
        } else if (validarResposta(4) && lblcoracaoj1.isEnabled() == true) {
            lblcoracaoj1.setEnabled(false);
            JOptionPane.showMessageDialog(null, "Você errou :(");
        } else if (validarResposta(4) && lblcoracaoj2.isEnabled() == true) {
            lblcoracaoj2.setEnabled(false);
            JOptionPane.showMessageDialog(null, "Você errou :(");
        } else {
            lblcoracaoj3.setEnabled(false);
            JOptionPane.showMessageDialog(null, "Você perdeu, pratique mais.");
        }
        
        if (validarResposta(3) && dificuldade.equals("medio")){
                
            
        }
        
        
    }//GEN-LAST:event_btnAlt3ActionPerformed

/**
 * @param args the command line arguments
 */
public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                

}
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCombate.class

.getName()).log(java.util.logging.Level.SEVERE, null, ex);

        

} catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCombate.class

.getName()).log(java.util.logging.Level.SEVERE, null, ex);

        

} catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCombate.class

.getName()).log(java.util.logging.Level.SEVERE, null, ex);

        

} catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCombate.class

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCombate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlt1;
    private javax.swing.JButton btnAlt2;
    private javax.swing.JButton btnAlt3;
    private javax.swing.JButton btnAlt4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblPergunta;
    private javax.swing.JLabel lblcoracaoj1;
    private javax.swing.JLabel lblcoracaoj2;
    private javax.swing.JLabel lblcoracaoj3;
    private javax.swing.JLabel lblcoracaom1;
    private javax.swing.JLabel lblcoracaom2;
    private javax.swing.JLabel lblcoracaom3;
    // End of variables declaration//GEN-END:variables

}
