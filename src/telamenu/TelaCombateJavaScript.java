package telamenu;

import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import sons.ExecutarSom;

public class TelaCombateJavaScript extends javax.swing.JFrame {

    public TelaCombateJavaScript(String dificuldade, int contador) {
        initComponents();
        this.dificuldade = dificuldade;
        contadorErros(contador);
        if (lblcoracaom1.isEnabled() == true) {
            lblcoracaom1.setEnabled(false);
        }
        if (dificuldade.equals("medio")) {
            lblcoracaom1.setEnabled(false);
        }
        if (dificuldade.equals("dificil")) {
            lblcoracaom2.setEnabled(false);
        }

        som = new ExecutarSom(false, "Terra");

    }

    public TelaCombateJavaScript() {
        initComponents();

        this.dificuldade = "facil";

        som = new ExecutarSom(false, "Terra");
    }

    public ExecutarSom som;
    private int pergunta;
    private int perguntaMed;
    private int perguntaDif;
    public int contador;
    private String dificuldade;

    public int gerarPerguntaFacil() {
        Random randomico = new Random();
        return randomico.nextInt(3) + 1;

    }

    public int gerarPerguntaMedio() {
        Random randomico = new Random();
        return randomico.nextInt(3) + 1;

    }

    public int gerarPerguntaDificil() {
        Random randomico = new Random();
        return randomico.nextInt(3) + 1;

    }

    public void proximaFase(String dificuldade) {
        if (dificuldade.equals("facil")) {
            TelaCombateJavaScript tela = new TelaCombateJavaScript("medio", contador);
            tela.setVisible(true);
            dispose();

        } else if (dificuldade.equals("medio")) {

            TelaCombateJavaScript tela = new TelaCombateJavaScript("dificil", contador);
            tela.setVisible(true);
            dispose();

        } else if (dificuldade.equals("dificil")) {
            lblcoracaom3.setEnabled(false);
            JOptionPane.showMessageDialog(null, "Você ganhou do Mestre JavaScript, recebeu o troféu que garante sua conquista,"
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
                if (resposta == 3) {
                    validadorResposta = true;
                }
                break;
            case 2:
                if (resposta == 1) {
                    validadorResposta = true;
                }
                break;
            case 3:
                if (resposta == 1) {
                    validadorResposta = true;
                }
                break;
        }
        return validadorResposta;

    }

    public boolean validarRespostaMedio(int resposta) {

        boolean validadorRespostaMedio = false;
        switch (perguntaMed) {
            case 1:
                if (resposta == 2) {
                    validadorRespostaMedio = true;
                }
                break;
            case 2:
                if (resposta == 3) {
                    validadorRespostaMedio = true;
                }
                break;
            case 3:
                if (resposta == 2) {
                    validadorRespostaMedio = true;
                }
                break;
        }
        return validadorRespostaMedio;

    }

    public boolean validarRespostaDificil(int resposta) {

        boolean validadorRespostaDificil = false;
        switch (perguntaDif) {
            case 1:
                if (resposta == 3) {
                    validadorRespostaDificil = true;
                }
                break;
            case 2:
                if (resposta == 4) {
                    validadorRespostaDificil = true;
                }
                break;
            case 3:
                if (resposta == 2) {
                    validadorRespostaDificil = true;
                }
                break;
        }
        return validadorRespostaDificil;

    }

    public void contadorErros(int contador) {

        if (contador == 1 && lblcoracaoj1.isEnabled() == true) {
            lblcoracaoj1.setEnabled(false);
        } else if (contador == 2 && lblcoracaoj2.isEnabled() == true) {
            lblcoracaoj1.setEnabled(false);
            lblcoracaoj2.setEnabled(false);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAlt1 = new javax.swing.JButton();
        btnAlt3 = new javax.swing.JButton();
        btnAlt2 = new javax.swing.JButton();
        btnAlt4 = new javax.swing.JButton();
        lblPergunta = new javax.swing.JLabel();
        lblcoracaoj1 = new javax.swing.JLabel();
        lblcoracaoj2 = new javax.swing.JLabel();
        lblcoracaoj3 = new javax.swing.JLabel();
        lblcoracaom1 = new javax.swing.JLabel();
        lblcoracaom2 = new javax.swing.JLabel();
        lblcoracaom3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAlt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlt1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAlt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, 210, 50));

        btnAlt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlt3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAlt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 380, 210, 50));

        btnAlt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlt2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAlt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 440, 210, 50));

        btnAlt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlt4ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAlt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 440, 210, 50));
        getContentPane().add(lblPergunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 250, 110));

        lblcoracaoj1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-coração-de-pixel-30.png"))); // NOI18N
        getContentPane().add(lblcoracaoj1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, -1, -1));

        lblcoracaoj2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-coração-de-pixel-30.png"))); // NOI18N
        getContentPane().add(lblcoracaoj2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 280, -1, -1));

        lblcoracaoj3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-coração-de-pixel-30.png"))); // NOI18N
        getContentPane().add(lblcoracaoj3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 280, -1, -1));

        lblcoracaom1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-coração-de-pixel-30.png"))); // NOI18N
        getContentPane().add(lblcoracaom1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, -1, -1));

        lblcoracaom2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-coração-de-pixel-30.png"))); // NOI18N
        getContentPane().add(lblcoracaom2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, -1, -1));

        lblcoracaom3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-coração-de-pixel-30.png"))); // NOI18N
        getContentPane().add(lblcoracaom3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/layout pergunta.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bi_person-circle.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/linguagemjs.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, 130, 110));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Mestre JavaScript.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/layout jogador.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/localJavaScript(fundo).jpeg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAlt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlt1ActionPerformed
        // TODO add your handling code here:
        if (dificuldade.equals("facil")) {
            if (validarResposta(1)) {
                lblcoracaom1.setEnabled(false);
                JOptionPane.showMessageDialog(null, "Você acertou");
                proximaFase(dificuldade);
            } else if (validarResposta(3)) {
                if (lblcoracaoj1.isEnabled() == true) {
                    lblcoracaoj1.setEnabled(false);
                    JOptionPane.showMessageDialog(null, "Você errou :(");
                    contadorErros(contador += 1);
                } else if (lblcoracaoj2.isEnabled() == true) {
                    lblcoracaoj2.setEnabled(false);
                    JOptionPane.showMessageDialog(null, "Você errou :(");
                    contadorErros(contador += 1);
                } else {
                    lblcoracaoj3.setEnabled(false);
                    JOptionPane.showMessageDialog(null, "Você perdeu, pratique mais.");
                    TelaDerrota derrota = new TelaDerrota();
                    derrota.setVisible(true);
                    dispose();
                }
            }
        }

    }//GEN-LAST:event_btnAlt1ActionPerformed

    private void btnAlt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlt2ActionPerformed
        // TODO add your handling code here:
        if (dificuldade.equals("facil")) {
            if (lblcoracaoj1.isEnabled() == true) {
                lblcoracaoj1.setEnabled(false);
                JOptionPane.showMessageDialog(null, "Você errou :(");
                contadorErros(contador += 1);
            } else if (lblcoracaoj2.isEnabled() == true) {
                lblcoracaoj2.setEnabled(false);
                JOptionPane.showMessageDialog(null, "Você errou :(");
                contadorErros(contador += 1);
            } else {
                lblcoracaoj3.setEnabled(false);
                JOptionPane.showMessageDialog(null, "Você perdeu, pratique mais.");
                TelaDerrota derrota = new TelaDerrota();
                derrota.setVisible(true);
                dispose();
            }
        }

        if (dificuldade.equals("medio")) {
            if (validarRespostaMedio(2)) {
                lblcoracaom2.setEnabled(false);
                JOptionPane.showMessageDialog(null, "Você acertou");
                proximaFase(dificuldade);
            } else if (validarRespostaMedio(3)) {
                if (lblcoracaoj1.isEnabled() == true) {
                    lblcoracaoj1.setEnabled(false);
                    JOptionPane.showMessageDialog(null, "Você errou :(");
                    contadorErros(contador += 1);
                } else if (lblcoracaoj2.isEnabled() == true) {
                    lblcoracaoj2.setEnabled(false);
                    JOptionPane.showMessageDialog(null, "Você errou :(");
                    contadorErros(contador += 1);
                } else {
                    lblcoracaoj3.setEnabled(false);
                    JOptionPane.showMessageDialog(null, "Você perdeu, pratique mais.");
                    TelaDerrota derrota = new TelaDerrota();
                    derrota.setVisible(true);
                    dispose();
                }
            }

        } else if (dificuldade.equals("dificil")) {
            if (validarRespostaDificil(2)) {
                lblcoracaom3.setEnabled(false);
                JOptionPane.showMessageDialog(null, "Você acertou");
                proximaFase(dificuldade);
            } else if (validarRespostaDificil(3) || validarRespostaDificil(4)) {
                if (lblcoracaoj1.isEnabled() == true) {
                    lblcoracaoj1.setEnabled(false);
                    JOptionPane.showMessageDialog(null, "Você errou :(");
                    contadorErros(contador += 1);
                } else if (lblcoracaoj2.isEnabled() == true) {
                    lblcoracaoj2.setEnabled(false);
                    JOptionPane.showMessageDialog(null, "Você errou :(");
                    contadorErros(contador += 1);
                } else {
                    lblcoracaoj3.setEnabled(false);
                    JOptionPane.showMessageDialog(null, "Você perdeu, pratique mais.");
                    TelaDerrota derrota = new TelaDerrota();
                    derrota.setVisible(true);
                    dispose();
                }
            }
        }

    }//GEN-LAST:event_btnAlt2ActionPerformed

    private void btnAlt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlt3ActionPerformed
        // TODO add your handling code here:
        if (dificuldade.equals("facil")) {
            if (validarResposta(3)) {
                lblcoracaom1.setEnabled(false);
                JOptionPane.showMessageDialog(null, "Você acertou");
                proximaFase(dificuldade);
            } else if (validarResposta(1)) {
                if (lblcoracaoj1.isEnabled() == true) {
                    lblcoracaoj1.setEnabled(false);
                    JOptionPane.showMessageDialog(null, "Você errou :(");
                    contadorErros(contador += 1);
                } else if (lblcoracaoj2.isEnabled() == true) {
                    lblcoracaoj2.setEnabled(false);
                    JOptionPane.showMessageDialog(null, "Você errou :(");
                    contadorErros(contador += 1);
                } else {
                    lblcoracaoj3.setEnabled(false);
                    JOptionPane.showMessageDialog(null, "Você perdeu, pratique mais.");
                    TelaDerrota derrota = new TelaDerrota();
                    derrota.setVisible(true);
                    dispose();
                }
            }

        } else if (dificuldade.equals("medio")) {
            if (validarRespostaMedio(3)) {
                lblcoracaom2.setEnabled(false);
                JOptionPane.showMessageDialog(null, "Você acertou");
                proximaFase(dificuldade);

            } else if (validarRespostaMedio(2)) {
                if (lblcoracaoj1.isEnabled() == true) {
                    lblcoracaoj1.setEnabled(false);
                    JOptionPane.showMessageDialog(null, "Você errou :(");
                    contadorErros(contador += 1);
                } else if (lblcoracaoj2.isEnabled() == true) {
                    lblcoracaoj2.setEnabled(false);
                    JOptionPane.showMessageDialog(null, "Você errou :(");
                    contadorErros(contador += 1);
                } else {
                    lblcoracaoj3.setEnabled(false);
                    JOptionPane.showMessageDialog(null, "Você perdeu, pratique mais.");
                    TelaDerrota derrota = new TelaDerrota();
                    derrota.setVisible(true);
                    dispose();
                }
            }
        } else if (dificuldade.equals("dificil")) {
            if (validarRespostaDificil(3)) {
                lblcoracaom3.setEnabled(false);
                JOptionPane.showMessageDialog(null, "Você acertou");
                proximaFase(dificuldade);
            } else if (validarRespostaDificil(2) || validarRespostaDificil(4)) {
                if (lblcoracaoj1.isEnabled() == true) {
                    lblcoracaoj1.setEnabled(false);
                    JOptionPane.showMessageDialog(null, "Você errou :(");
                    contadorErros(contador += 1);
                } else if (lblcoracaoj2.isEnabled() == true) {
                    lblcoracaoj2.setEnabled(false);
                    JOptionPane.showMessageDialog(null, "Você errou :(");
                    contadorErros(contador += 1);
                } else {
                    lblcoracaoj3.setEnabled(false);
                    JOptionPane.showMessageDialog(null, "Você perdeu, pratique mais.");
                    TelaDerrota derrota = new TelaDerrota();
                    derrota.setVisible(true);
                    dispose();
                }
            }
        }
    }//GEN-LAST:event_btnAlt3ActionPerformed

    private void btnAlt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlt4ActionPerformed
        // TODO add your handling code here:
        if (dificuldade.equals("dificil")) {
            if (validarRespostaDificil(4)) {
                lblcoracaom3.setEnabled(false);
                JOptionPane.showMessageDialog(null, "Você acertou");
            }
        } else {
            if (lblcoracaoj1.isEnabled() == true) {
                lblcoracaoj1.setEnabled(false);
                JOptionPane.showMessageDialog(null, "Você errou :(");
                contadorErros(contador += 1);
            } else if (lblcoracaoj2.isEnabled() == true) {
                lblcoracaoj2.setEnabled(false);
                JOptionPane.showMessageDialog(null, "Você errou :(");
                contadorErros(contador += 1);
            } else {
                lblcoracaoj3.setEnabled(false);
                JOptionPane.showMessageDialog(null, "Você perdeu, pratique mais.");
                TelaDerrota derrota = new TelaDerrota();
                derrota.setVisible(true);
                dispose();
            }
        }


    }//GEN-LAST:event_btnAlt4ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        pergunta = gerarPerguntaFacil();
        String perguntaFacil = String.format("/perguntas/perguntasjavascript/faceis/pergunta%d.png", pergunta);
        lblPergunta.setIcon(new ImageIcon(getClass().getResource(perguntaFacil)));

        String alternativaFacil = String.format("/respostas/respostasjavascript/facil/questao%d", pergunta);
        btnAlt1.setIcon(new ImageIcon(getClass().getResource(alternativaFacil + "/alternativa1.png")));
        btnAlt2.setIcon(new ImageIcon(getClass().getResource(alternativaFacil + "/alternativa2.png")));
        btnAlt3.setIcon(new ImageIcon(getClass().getResource(alternativaFacil + "/alternativa3.png")));
        btnAlt4.setIcon(new ImageIcon(getClass().getResource(alternativaFacil + "/alternativa4.png")));

        if (dificuldade.equals("medio")) {
            perguntaMed = gerarPerguntaMedio();
            String perguntaMedio = String.format("/perguntas/perguntasjavascript/medias/pergunta%d.png", perguntaMed);
            lblPergunta.setIcon(new ImageIcon(getClass().getResource(perguntaMedio)));

            String alternativaMedio = String.format("/respostas/respostasjavascript/medio/questao%d", perguntaMed);
            btnAlt1.setIcon(new ImageIcon(getClass().getResource(alternativaMedio + "/alternativa1.png")));
            btnAlt2.setIcon(new ImageIcon(getClass().getResource(alternativaMedio + "/alternativa2.png")));
            btnAlt3.setIcon(new ImageIcon(getClass().getResource(alternativaMedio + "/alternativa3.png")));
            btnAlt4.setIcon(new ImageIcon(getClass().getResource(alternativaMedio + "/alternativa4.png")));

        } else if (dificuldade.equals("dificil")) {
            perguntaDif = gerarPerguntaDificil();
            String perguntaDificil = String.format("/perguntas/perguntasjavascript/dificeis/pergunta%d.png", perguntaDif);
            lblPergunta.setIcon(new ImageIcon(getClass().getResource(perguntaDificil)));

            String alternativaDificil = String.format("/respostas/respostasjavascript/dificil/questao%d", perguntaDif);
            btnAlt1.setIcon(new ImageIcon(getClass().getResource(alternativaDificil + "/alternativa1.png")));
            btnAlt2.setIcon(new ImageIcon(getClass().getResource(alternativaDificil + "/alternativa2.png")));
            btnAlt3.setIcon(new ImageIcon(getClass().getResource(alternativaDificil + "/alternativa3.png")));
            btnAlt4.setIcon(new ImageIcon(getClass().getResource(alternativaDificil + "/alternativa4.png")));

        }
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(TelaCombateJavaScript.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCombateJavaScript.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCombateJavaScript.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCombateJavaScript.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCombateJavaScript().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlt1;
    private javax.swing.JButton btnAlt2;
    private javax.swing.JButton btnAlt3;
    private javax.swing.JButton btnAlt4;
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
