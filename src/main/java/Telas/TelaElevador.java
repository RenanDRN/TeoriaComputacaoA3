
package Telas;

import java.awt.Color;

public class TelaElevador extends javax.swing.JFrame {

    public TelaElevador() {
        initComponents();
}
 
   private int andarAtual = 0;
  
    private void setas(int andarSelecionado){
        if (andarSelecionado > andarAtual) {
            VisorAndar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensAudiosElevador/cima.png")));
        } else if (andarSelecionado < andarAtual) {
            VisorAndar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensAudiosElevador/baixo.png")));
        }
    }
   private void mudarAndarVisual (String imagemFundo){
       backgroundElevador.setIcon(new javax.swing.ImageIcon(getClass().getResource(imagemFundo)));
       VisorAndar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensAudiosElevador/vazio.png")));
   }
   
   
  private void animarPortas(String novoBackground) {
    
    Elevador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensAudiosElevador/portaF.png")));
    
    new javax.swing.Timer(700, e1 -> {
        Elevador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensAudiosElevador/portaM.png")));

        new javax.swing.Timer(900, e2 -> {
            Elevador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensAudiosElevador/portaA.png")));

            new javax.swing.Timer(900, e3 -> {
                Elevador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensAudiosElevador/portaM.png")));

                new javax.swing.Timer(700, e4 -> {
                    Elevador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensAudiosElevador/portaF.png")));

                    new javax.swing.Timer(1000, e5 -> {
                        mudarAndarVisual(novoBackground);
                    }) {{
                        setRepeats(false);
                        start();
                    }};

                }) {{
                    setRepeats(false);
                    start();
                }};

            }) {{
                setRepeats(false);
                start();
            }};

        }) {{
            setRepeats(false);
            start();
        }};

    }) {{
        setRepeats(false);
        start();
    }};
}

   
   private void trocarAndar(int andarSelecionado){
       switch (andarSelecionado) {
            case 0:
               setas(0);
               animarPortas("/ImagensAudiosElevador/bgT.png");
               break;
            case 1:
               setas(1);
               animarPortas("/ImagensAudiosElevador/bg1.png");
               break;
             case 2:
               setas(2);
               animarPortas("/ImagensAudiosElevador/bg2.png");
               break;
             case 3:
               setas(3);
               animarPortas("/ImagensAudiosElevador/bg3.png");
               break;
       }
       
      andarAtual = andarSelecionado;
   }


    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CorParede = new javax.swing.JPanel();
        btn3Andar = new javax.swing.JButton();
        btn2Andar = new javax.swing.JButton();
        btn1Andar = new javax.swing.JButton();
        btnTerreo = new javax.swing.JButton();
        PainelAndares = new javax.swing.JLabel();
        nAndar = new javax.swing.JLabel();
        VisorAndar = new javax.swing.JLabel();
        Elevador = new javax.swing.JLabel();
        fundoElevador = new javax.swing.JLabel();
        backgroundElevador = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Elevador");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CorParede.setBackground(new java.awt.Color(153, 204, 255));
        CorParede.setOpaque(false);
        CorParede.setPreferredSize(new java.awt.Dimension(1280, 800));
        CorParede.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn3Andar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensAudiosElevador/bt3.png"))); // NOI18N
        btn3Andar.setContentAreaFilled(false);
        btn3Andar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn3Andar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn3AndarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn3AndarMouseExited(evt);
            }
        });
        btn3Andar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3AndarActionPerformed(evt);
            }
        });
        CorParede.add(btn3Andar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1019, 305, 26, 25));

        btn2Andar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensAudiosElevador/bt2.png"))); // NOI18N
        btn2Andar.setContentAreaFilled(false);
        btn2Andar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn2Andar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn2AndarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn2AndarMouseExited(evt);
            }
        });
        btn2Andar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2AndarActionPerformed(evt);
            }
        });
        CorParede.add(btn2Andar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1019, 332, 26, 25));

        btn1Andar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensAudiosElevador/bt1.png"))); // NOI18N
        btn1Andar.setContentAreaFilled(false);
        btn1Andar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn1Andar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn1AndarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn1AndarMouseExited(evt);
            }
        });
        btn1Andar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1AndarActionPerformed(evt);
            }
        });
        CorParede.add(btn1Andar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1019, 359, 26, 25));

        btnTerreo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensAudiosElevador/btT.png"))); // NOI18N
        btnTerreo.setContentAreaFilled(false);
        btnTerreo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTerreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTerreoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTerreoMouseExited(evt);
            }
        });
        btnTerreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTerreoActionPerformed(evt);
            }
        });
        CorParede.add(btnTerreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1019, 386, 26, 25));

        PainelAndares.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensAudiosElevador/Prancheta.png"))); // NOI18N
        CorParede.add(PainelAndares, new org.netbeans.lib.awtextra.AbsoluteConstraints(992, 290, -1, -1));

        nAndar.setFont(new java.awt.Font("OCR A Extended", 1, 36)); // NOI18N
        nAndar.setForeground(new java.awt.Color(255, 0, 51));
        nAndar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CorParede.add(nAndar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 30, 30, 30));

        VisorAndar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensAudiosElevador/vazio.png"))); // NOI18N
        CorParede.add(VisorAndar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, -1, -1));

        Elevador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensAudiosElevador/portaF.png"))); // NOI18N
        CorParede.add(Elevador, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, -1, -1));

        fundoElevador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensAudiosElevador/ElevadorFundo.png"))); // NOI18N
        CorParede.add(fundoElevador, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 135, -1, -1));

        backgroundElevador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensAudiosElevador/bgT.png"))); // NOI18N
        CorParede.add(backgroundElevador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(CorParede, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn1AndarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1AndarActionPerformed
      trocarAndar(1);
    }//GEN-LAST:event_btn1AndarActionPerformed

    private void btnTerreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTerreoActionPerformed
        trocarAndar(0);
    }//GEN-LAST:event_btnTerreoActionPerformed

    private void btnTerreoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTerreoMouseEntered
        btnTerreo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensAudiosElevador/btTh.png")));
    }//GEN-LAST:event_btnTerreoMouseEntered

    private void btnTerreoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTerreoMouseExited
        btnTerreo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensAudiosElevador/btT.png")));
    }//GEN-LAST:event_btnTerreoMouseExited

    private void btn1AndarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1AndarMouseEntered
        btn1Andar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensAudiosElevador/bt1h.png")));
    }//GEN-LAST:event_btn1AndarMouseEntered

    private void btn1AndarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1AndarMouseExited
        btn1Andar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensAudiosElevador/bt1.png")));
    }//GEN-LAST:event_btn1AndarMouseExited

    private void btn2AndarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn2AndarMouseEntered
        btn2Andar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensAudiosElevador/bt2h.png")));
    }//GEN-LAST:event_btn2AndarMouseEntered

    private void btn2AndarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn2AndarMouseExited
        btn2Andar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensAudiosElevador/bt2.png")));
    }//GEN-LAST:event_btn2AndarMouseExited

    private void btn3AndarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn3AndarMouseEntered
        btn3Andar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensAudiosElevador/bt3h.png")));
    }//GEN-LAST:event_btn3AndarMouseEntered

    private void btn3AndarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn3AndarMouseExited
        btn3Andar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensAudiosElevador/bt3.png")));
    }//GEN-LAST:event_btn3AndarMouseExited

    private void btn2AndarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2AndarActionPerformed
       trocarAndar(2);
    }//GEN-LAST:event_btn2AndarActionPerformed

    private void btn3AndarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3AndarActionPerformed
       trocarAndar(3);
    }//GEN-LAST:event_btn3AndarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaElevador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaElevador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaElevador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaElevador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaElevador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CorParede;
    private javax.swing.JLabel Elevador;
    private javax.swing.JLabel PainelAndares;
    private javax.swing.JLabel VisorAndar;
    private javax.swing.JLabel backgroundElevador;
    private javax.swing.JButton btn1Andar;
    private javax.swing.JButton btn2Andar;
    private javax.swing.JButton btn3Andar;
    private javax.swing.JButton btnTerreo;
    private javax.swing.JLabel fundoElevador;
    private javax.swing.JLabel nAndar;
    // End of variables declaration//GEN-END:variables
}
