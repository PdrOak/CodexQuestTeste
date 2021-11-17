package telamenu;

import sons.ExecutarSom;
import telamenu.TelaCombate;

public class TelaLocais extends javax.swing.JFrame {

    public TelaLocais() {
        initComponents();
        som = new ExecutarSom(true, "Terra");
    }
    private ExecutarSom som;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        botaoC = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        botaoJS = new javax.swing.JButton();
        botaoJava = new javax.swing.JButton();
        botaoPython = new javax.swing.JButton();
        botaoCSharp = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        labelTelaPrincipal = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton5.setText("Som");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, 100, 50));

        botaoC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/C.png"))); // NOI18N
        botaoC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        botaoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCActionPerformed(evt);
            }
        });
        getContentPane().add(botaoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(534, 230, -1, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Local python.jpeg"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 90, 125, 125));

        botaoJS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/JavaScript.png"))); // NOI18N
        botaoJS.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        botaoJS.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botaoJS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoJSActionPerformed(evt);
            }
        });
        getContentPane().add(botaoJS, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 210, 50));

        botaoJava.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/java.png"))); // NOI18N
        botaoJava.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        botaoJava.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoJavaActionPerformed(evt);
            }
        });
        getContentPane().add(botaoJava, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 470, 210, 50));

        botaoPython.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/python.png"))); // NOI18N
        botaoPython.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        botaoPython.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPythonActionPerformed(evt);
            }
        });
        getContentPane().add(botaoPython, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 470, 200, 50));

        botaoCSharp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/C#.png"))); // NOI18N
        botaoCSharp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        botaoCSharp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCSharpActionPerformed(evt);
            }
        });
        getContentPane().add(botaoCSharp, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 200, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Local sala de projetos.jpeg"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 125, 125));

        labelTelaPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Tela Principal Jogo copiar.jpg"))); // NOI18N
        labelTelaPrincipal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(labelTelaPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 250, 250));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Local Java.jpeg"))); // NOI18N
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 330, 125, 125));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Local JavaScript.jpeg"))); // NOI18N
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 125, 125));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Local laboratorio.jpeg"))); // NOI18N
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, 125, 125));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Topo da seleção de fases.png"))); // NOI18N
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 540, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Imagem principal da tela de Locais.jpeg"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 530));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCActionPerformed
        // TODO add your handling code here:
        TelaCombateC telaC = new TelaCombateC();
        telaC.setVisible(true);
        dispose();
    }//GEN-LAST:event_botaoCActionPerformed

    private void botaoJSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoJSActionPerformed
        // TODO add your handling code here:
        TelaCombateJavaScript telaJS = new TelaCombateJavaScript();
        telaJS.setVisible(true);
        dispose();
    }//GEN-LAST:event_botaoJSActionPerformed

    private void botaoJavaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoJavaActionPerformed
        // TODO add your handling code here:
        TelaCombate telaJava = new TelaCombate();
        telaJava.setVisible(true);
        dispose();
    }//GEN-LAST:event_botaoJavaActionPerformed

    private void botaoPythonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPythonActionPerformed
        // TODO add your handling code here:
        TelaCombatePython telaPython = new TelaCombatePython();
        telaPython.setVisible(true);
        dispose();
    }//GEN-LAST:event_botaoPythonActionPerformed

    private void botaoCSharpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCSharpActionPerformed
        // TODO add your handling code here:
        TelaCombateCSharp telaCSharp = new TelaCombateCSharp();
        telaCSharp.setVisible(true);
        dispose();
    }//GEN-LAST:event_botaoCSharpActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:


    }//GEN-LAST:event_formWindowOpened

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        som.tocar();

    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaLocais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLocais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLocais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLocais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLocais().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoC;
    private javax.swing.JButton botaoCSharp;
    private javax.swing.JButton botaoJS;
    private javax.swing.JButton botaoJava;
    private javax.swing.JButton botaoPython;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel labelTelaPrincipal;
    // End of variables declaration//GEN-END:variables
}
