
package Telas;

import javax.swing.JOptionPane;


public class TelaVendingMachine extends javax.swing.JFrame {

        private double saldo = 0.0; 
        private final double limite = 99.00; 
        
    public TelaVendingMachine() {
        initComponents();
       

    }
    
    private void atualizarBotoes() {
    if (saldo >= 6.00) {
        btnDonut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensVendingMachine/botao_donut_tradicional-8.png")));
    } else {
         btnDonut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensVendingMachine/botao_donut_escuro-8.png")));  
    }
    if(saldo >= 7.00){
        btnCandy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensVendingMachine/botao_candy_tradicional-8.png")));
        
    }else{
        btnCandy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensVendingMachine/botao_candy_escuro-8.png")));
    }
    if(saldo >= 8.00){
        btnChoco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensVendingMachine/botao_choco_tradicional-8.png")));
        
    }else{
        btnChoco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensVendingMachine/botao_choco_escuro-8.png")));
    }
    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Choco1 = new javax.swing.JLabel();
        Choco2 = new javax.swing.JLabel();
        Choco3 = new javax.swing.JLabel();
        btnCandy = new javax.swing.JButton();
        btnChoco = new javax.swing.JButton();
        btnDonut = new javax.swing.JButton();
        btnPegar = new javax.swing.JButton();
        textHelp = new javax.swing.JLabel();
        textHelp1 = new javax.swing.JLabel();
        textHelp2 = new javax.swing.JLabel();
        valorMaquina = new javax.swing.JLabel();
        Maquina = new javax.swing.JLabel();
        Donut3 = new javax.swing.JLabel();
        Donut2 = new javax.swing.JLabel();
        Donut1 = new javax.swing.JLabel();
        Candy1 = new javax.swing.JLabel();
        Candy4 = new javax.swing.JLabel();
        Candy3 = new javax.swing.JLabel();
        Candy2 = new javax.swing.JLabel();
        DoceEscolhido = new javax.swing.JLabel();
        FundoMaquina = new javax.swing.JLabel();
        Carteira = new javax.swing.JLabel();
        btnMoeda1 = new javax.swing.JButton();
        btnNota2 = new javax.swing.JButton();
        btnNota5 = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vending Machine");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Choco1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensVendingMachine/doce_choco_3-8.png"))); // NOI18N
        getContentPane().add(Choco1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 410, 110, 120));

        Choco2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensVendingMachine/doce_choco_1-8.png"))); // NOI18N
        getContentPane().add(Choco2, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 410, 110, 120));

        Choco3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensVendingMachine/doce_choco_2-8.png"))); // NOI18N
        getContentPane().add(Choco3, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 410, 110, 120));

        btnCandy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensVendingMachine/botao_candy_escuro-8.png"))); // NOI18N
        btnCandy.setContentAreaFilled(false);
        btnCandy.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCandy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCandyActionPerformed(evt);
            }
        });
        getContentPane().add(btnCandy, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 140, 100, 40));

        btnChoco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensVendingMachine/botao_choco_escuro-8.png"))); // NOI18N
        btnChoco.setContentAreaFilled(false);
        btnChoco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChocoActionPerformed(evt);
            }
        });
        getContentPane().add(btnChoco, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 190, 100, 40));

        btnDonut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensVendingMachine/botao_donut_escuro-8.png"))); // NOI18N
        btnDonut.setContentAreaFilled(false);
        btnDonut.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnDonut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDonutActionPerformed(evt);
            }
        });
        getContentPane().add(btnDonut, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 90, 100, 40));

        btnPegar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensVendingMachine/botao_pegar_tradicional-8.png"))); // NOI18N
        btnPegar.setContentAreaFilled(false);
        getContentPane().add(btnPegar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 540, 100, 70));

        textHelp.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        textHelp.setForeground(new java.awt.Color(255, 255, 255));
        textHelp.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        textHelp.setText("INSERI-LO NA MÁQUINA.");
        textHelp.setToolTipText("");
        getContentPane().add(textHelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 520, 60));

        textHelp1.setBackground(new java.awt.Color(255, 255, 255));
        textHelp1.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        textHelp1.setForeground(new java.awt.Color(255, 255, 255));
        textHelp1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        textHelp1.setText("CLIQUE SOBRE UM VALOR");
        textHelp1.setToolTipText("");
        getContentPane().add(textHelp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 510, 60));

        textHelp2.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        textHelp2.setForeground(new java.awt.Color(255, 255, 255));
        textHelp2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        textHelp2.setText("DA SUA CARTEIRA PARA");
        textHelp2.setToolTipText("");
        getContentPane().add(textHelp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 520, 60));

        valorMaquina.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        valorMaquina.setForeground(new java.awt.Color(255, 255, 255));
        valorMaquina.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        valorMaquina.setText("00,00");
        getContentPane().add(valorMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 500, 70, 20));

        Maquina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensVendingMachine/maquina_vazia_fechado-8.png"))); // NOI18N
        Maquina.setPreferredSize(new java.awt.Dimension(550, 780));
        getContentPane().add(Maquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, 580, 800));

        Donut3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensVendingMachine/doce_donut_3-8.png"))); // NOI18N
        getContentPane().add(Donut3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 100, 110, 120));

        Donut2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensVendingMachine/doce_donut_2-8.png"))); // NOI18N
        getContentPane().add(Donut2, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 100, 110, 120));

        Donut1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensVendingMachine/doce_donut_1-8.png"))); // NOI18N
        getContentPane().add(Donut1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 100, 110, 120));

        Candy1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensVendingMachine/doce_candy_1-8.png"))); // NOI18N
        getContentPane().add(Candy1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 270, 110, 120));

        Candy4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensVendingMachine/doce_candy_4-8.png"))); // NOI18N
        getContentPane().add(Candy4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 270, 110, 120));

        Candy3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensVendingMachine/doce_candy_3-8.png"))); // NOI18N
        getContentPane().add(Candy3, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 270, 130, 120));

        Candy2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensVendingMachine/doce_candy_2_escuro-8.png"))); // NOI18N
        getContentPane().add(Candy2, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 270, 110, 120));
        getContentPane().add(DoceEscolhido, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 630, 120, 100));

        FundoMaquina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensVendingMachine/fundo_roxo_maquina-8.png"))); // NOI18N
        getContentPane().add(FundoMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 70, 390, 560));

        Carteira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensVendingMachine/Carteira.png"))); // NOI18N
        getContentPane().add(Carteira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 490, 420));

        btnMoeda1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensVendingMachine/1real.png"))); // NOI18N
        btnMoeda1.setContentAreaFilled(false);
        btnMoeda1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMoeda1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMoeda1MouseExited(evt);
            }
        });
        btnMoeda1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoeda1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnMoeda1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 520, 210, 230));

        btnNota2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensVendingMachine/2reais.jpg"))); // NOI18N
        btnNota2.setBorder(null);
        btnNota2.setContentAreaFilled(false);
        btnNota2.setPreferredSize(new java.awt.Dimension(190, 360));
        btnNota2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNota2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNota2MouseExited(evt);
            }
        });
        btnNota2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNota2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnNota2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 200, -1));

        btnNota5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensVendingMachine/5reais.jpg"))); // NOI18N
        btnNota5.setContentAreaFilled(false);
        btnNota5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNota5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNota5MouseExited(evt);
            }
        });
        btnNota5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNota5ActionPerformed(evt);
            }
        });
        getContentPane().add(btnNota5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 190, 360));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensVendingMachine/BackgroundVendingMachine.png"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNota5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNota5ActionPerformed
        if (saldo + 5.00 <= limite) {
        saldo += 5.00; 
        valorMaquina.setText(String.format("%.2f", saldo));
        atualizarBotoes();
    } else {
        JOptionPane.showMessageDialog(this, "Limite da máquina atingido!", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnNota5ActionPerformed

    private void btnNota2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNota2ActionPerformed
        if (saldo + 2.00 <= limite) {
        saldo += 2.00; 
        valorMaquina.setText(String.format("%.2f", saldo)); 
        atualizarBotoes();
    } else {
        JOptionPane.showMessageDialog(this, "Limite da máquina atingido!", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
                                      
    }//GEN-LAST:event_btnNota2ActionPerformed

    private void btnMoeda1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoeda1ActionPerformed
        if (saldo + 1.00 <= limite) {
        saldo += 1.00; 
        valorMaquina.setText(String.format("%.2f", saldo)); 
        atualizarBotoes();
    } else {
        JOptionPane.showMessageDialog(this, "Limite da máquina atingido!", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnMoeda1ActionPerformed

    private void btnNota5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNota5MouseEntered
        btnNota5.setOpaque(true);
    }//GEN-LAST:event_btnNota5MouseEntered

    private void btnNota5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNota5MouseExited
        btnNota5.setOpaque(false);
    }//GEN-LAST:event_btnNota5MouseExited

    private void btnNota2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNota2MouseEntered
        btnNota2.setOpaque(true); 
    }//GEN-LAST:event_btnNota2MouseEntered

    private void btnNota2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNota2MouseExited
        btnNota2.setOpaque(false);
    }//GEN-LAST:event_btnNota2MouseExited

    private void btnMoeda1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMoeda1MouseEntered
        btnMoeda1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensVendingMachine/1realHover.png")));
    }//GEN-LAST:event_btnMoeda1MouseEntered

    private void btnMoeda1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMoeda1MouseExited
        btnMoeda1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensVendingMachine/1real.png")));
    }//GEN-LAST:event_btnMoeda1MouseExited

    private void btnDonutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDonutActionPerformed
        if (saldo >= 6.00) {
        saldo -= 6;
        valorMaquina.setText(String.format("%.2f", saldo));
        btnDonut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensVendingMachine/botao_donut_amarelo-8.png")));
        JOptionPane.showMessageDialog(this, "Donut Comprado com sucesso!", "Status: OK", JOptionPane.INFORMATION_MESSAGE); 

        new Thread(() -> {
            try {
                Thread.sleep(200); 
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            atualizarBotoes(); 
        }).start();
    } else {
        JOptionPane.showMessageDialog(this, "Saldo insuficiente!", "Aviso", JOptionPane.WARNING_MESSAGE);
    }

    }//GEN-LAST:event_btnDonutActionPerformed

    private void btnCandyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCandyActionPerformed
        if (saldo >= 7.00) {
        saldo -= 7;
        valorMaquina.setText(String.format("%.2f", saldo));
        btnCandy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensVendingMachine/botao_candy_amarelo-8.png")));
        JOptionPane.showMessageDialog(this, "Candy Comprado com sucesso!", "Status: OK", JOptionPane.INFORMATION_MESSAGE); 

        new Thread(() -> {
            try {
                Thread.sleep(200); 
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            atualizarBotoes(); 
        }).start();
    } else {
        JOptionPane.showMessageDialog(this, "Saldo insuficiente!", "Aviso", JOptionPane.WARNING_MESSAGE);
    }

    }//GEN-LAST:event_btnCandyActionPerformed

    private void btnChocoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChocoActionPerformed
       if (saldo >= 8.00) {
        saldo -= 8;
        valorMaquina.setText(String.format("%.2f", saldo));
        btnChoco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensVendingMachine/botao_choco_amarelo-8.png")));
        JOptionPane.showMessageDialog(this, "Choco Comprado com sucesso!", "Status: OK", JOptionPane.INFORMATION_MESSAGE); 

        new Thread(() -> {
            try {
                Thread.sleep(200); 
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            atualizarBotoes(); 
        }).start();
    } else {
        JOptionPane.showMessageDialog(this, "Saldo insuficiente!", "Aviso", JOptionPane.WARNING_MESSAGE);
    }


    }//GEN-LAST:event_btnChocoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaVendingMachine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaVendingMachine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaVendingMachine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaVendingMachine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaVendingMachine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Candy1;
    private javax.swing.JLabel Candy2;
    private javax.swing.JLabel Candy3;
    private javax.swing.JLabel Candy4;
    private javax.swing.JLabel Carteira;
    private javax.swing.JLabel Choco1;
    private javax.swing.JLabel Choco2;
    private javax.swing.JLabel Choco3;
    private javax.swing.JLabel DoceEscolhido;
    private javax.swing.JLabel Donut1;
    private javax.swing.JLabel Donut2;
    private javax.swing.JLabel Donut3;
    private javax.swing.JLabel FundoMaquina;
    private javax.swing.JLabel Maquina;
    private javax.swing.JButton btnCandy;
    private javax.swing.JButton btnChoco;
    private javax.swing.JButton btnDonut;
    private javax.swing.JButton btnMoeda1;
    private javax.swing.JButton btnNota2;
    private javax.swing.JButton btnNota5;
    private javax.swing.JButton btnPegar;
    private javax.swing.JLabel textHelp;
    private javax.swing.JLabel textHelp1;
    private javax.swing.JLabel textHelp2;
    private javax.swing.JLabel valorMaquina;
    // End of variables declaration//GEN-END:variables
}
