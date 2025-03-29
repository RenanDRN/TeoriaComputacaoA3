
package Telas;

import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.BorderLayout;
import javax.swing.JFrame;


public class TelaVendingMachine extends javax.swing.JFrame {

        private double saldo = 0.0; 
        private final double limite = 99.00; 
        private int QtdDonut = 3;
        private int QtdCandy = 4;
        private int QtdChoco = 3;
        private double precoDonut = 6.00;
        private double precoCandy = 7.00;
        private double precoChoco = 8.00;
        private String ProdEscolhido;
        private boolean produtoEscolhido = false;
        private javax.swing.ImageIcon imagem;
        
    public TelaVendingMachine() {
        initComponents();
        btnPegar.setEnabled(false);
        btnPegar.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensVendingMachine/botao_pegar_tradicional-8.png")));
        precoDonut1.setText(String.format("%.2f", precoDonut));
        precoDonut2.setText(String.format("%.2f", precoDonut));
        precoDonut3.setText(String.format("%.2f", precoDonut));
        precoCandy1.setText(String.format("%.2f", precoCandy));
        precoCandy2.setText(String.format("%.2f", precoCandy));
        precoCandy3.setText(String.format("%.2f", precoCandy));
        precoCandy4.setText(String.format("%.2f", precoCandy));
        precoChoco1.setText(String.format("%.2f", precoChoco));
        precoChoco2.setText(String.format("%.2f", precoChoco));
        precoChoco3.setText(String.format("%.2f", precoChoco));
    }
    
    private void atualizarBotoes() {
        if (saldo >= precoDonut && QtdDonut != 0) {  
            btnDonut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensVendingMachine/botao_donut_tradicional-8.png")));
            btnDonut.setEnabled(true);
            btnDonut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        } else {
            btnDonut.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensVendingMachine/botao_donut_escuro-8.png")));
            btnDonut.setEnabled(false);
            btnDonut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensVendingMachine/botao_donut_escuro-8.png")));
            btnDonut.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
         
        }
        if(saldo >= precoCandy && QtdCandy != 0){
            btnCandy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensVendingMachine/botao_candy_tradicional-8.png")));
            btnCandy.setEnabled(true);
            btnCandy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        }else{
            btnCandy.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensVendingMachine/botao_candy_escuro-8.png")));
            btnCandy.setEnabled(false);
            btnCandy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensVendingMachine/botao_candy_escuro-8.png")));
            btnCandy.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        }
        if(saldo >= precoChoco && QtdChoco != 0){
            btnChoco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensVendingMachine/botao_choco_tradicional-8.png")));
            btnChoco.setEnabled(true);
            btnChoco.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        }else{
            btnChoco.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensVendingMachine/botao_choco_escuro-8.png")));
            btnChoco.setEnabled(false);
            btnChoco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensVendingMachine/botao_choco_escuro-8.png")));
            btnChoco.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        }

        }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ProdutoEscolhido = new java.awt.Panel();
        troco1 = new javax.swing.JLabel();
        troco2 = new javax.swing.JLabel();
        troco3 = new javax.swing.JLabel();
        troco4 = new javax.swing.JLabel();
        valorTrocoEscolhido = new javax.swing.JLabel();
        BotaoEscolhidoLabel = new javax.swing.JButton();
        textHelp4 = new javax.swing.JLabel();
        textHelp5 = new javax.swing.JLabel();
        DoceEscolhidoPanel = new javax.swing.JLabel();
        FundoPanel = new javax.swing.JLabel();
        btnCandy = new javax.swing.JButton();
        btnChoco = new javax.swing.JButton();
        btnDonut = new javax.swing.JButton();
        btnPegar = new javax.swing.JButton();
        textHelp = new javax.swing.JLabel();
        textHelp1 = new javax.swing.JLabel();
        textHelp2 = new javax.swing.JLabel();
        valorMaquina = new javax.swing.JLabel();
        precoChoco3 = new javax.swing.JLabel();
        precoChoco2 = new javax.swing.JLabel();
        precoChoco1 = new javax.swing.JLabel();
        precoCandy4 = new javax.swing.JLabel();
        precoCandy3 = new javax.swing.JLabel();
        precoCandy2 = new javax.swing.JLabel();
        precoCandy1 = new javax.swing.JLabel();
        precoDonut3 = new javax.swing.JLabel();
        precoDonut2 = new javax.swing.JLabel();
        precoDonut1 = new javax.swing.JLabel();
        Maquina = new javax.swing.JLabel();
        Donut3 = new javax.swing.JLabel();
        Donut2 = new javax.swing.JLabel();
        Donut1 = new javax.swing.JLabel();
        Candy1 = new javax.swing.JLabel();
        Candy4 = new javax.swing.JLabel();
        Candy3 = new javax.swing.JLabel();
        Candy2 = new javax.swing.JLabel();
        Choco1 = new javax.swing.JLabel();
        Choco2 = new javax.swing.JLabel();
        Choco3 = new javax.swing.JLabel();
        DoceEscolhido = new javax.swing.JLabel();
        FundoMaquinaAberta = new javax.swing.JLabel();
        FundoMaquina = new javax.swing.JLabel();
        Carteira = new javax.swing.JLabel();
        btnMoeda1 = new javax.swing.JButton();
        btnNota2 = new javax.swing.JButton();
        btnNota5 = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vending Machine");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ProdutoEscolhido.setBackground(new java.awt.Color(255, 204, 153));
        ProdutoEscolhido.setMinimumSize(new java.awt.Dimension(980, 630));
        ProdutoEscolhido.setPreferredSize(new java.awt.Dimension(980, 630));
        ProdutoEscolhido.setVisible(false);
        ProdutoEscolhido.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        troco1.setPreferredSize(new java.awt.Dimension(210, 380));
        ProdutoEscolhido.add(troco1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, -1, -1));

        troco2.setPreferredSize(new java.awt.Dimension(210, 380));
        ProdutoEscolhido.add(troco2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 130, -1, -1));

        troco3.setPreferredSize(new java.awt.Dimension(210, 380));
        ProdutoEscolhido.add(troco3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 140, -1, -1));

        troco4.setPreferredSize(new java.awt.Dimension(210, 380));
        ProdutoEscolhido.add(troco4, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 150, -1, -1));

        valorTrocoEscolhido.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        valorTrocoEscolhido.setForeground(new java.awt.Color(0, 0, 0));
        valorTrocoEscolhido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        valorTrocoEscolhido.setText("00,00");
        ProdutoEscolhido.add(valorTrocoEscolhido, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 30, 180, 60));

        BotaoEscolhidoLabel.setBackground(new java.awt.Color(102, 51, 0));
        BotaoEscolhidoLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BotaoEscolhidoLabel.setForeground(new java.awt.Color(255, 255, 255));
        BotaoEscolhidoLabel.setText("Voltar para a maquina de doces");
        BotaoEscolhidoLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotaoEscolhidoLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotaoEscolhidoLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoEscolhidoLabelActionPerformed(evt);
            }
        });
        ProdutoEscolhido.add(BotaoEscolhidoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 550, 350, 50));

        textHelp4.setBackground(new java.awt.Color(255, 255, 255));
        textHelp4.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        textHelp4.setForeground(new java.awt.Color(0, 0, 0));
        textHelp4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        textHelp4.setText("Doce escolhido");
        textHelp4.setToolTipText("");
        ProdutoEscolhido.add(textHelp4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 290, 60));

        textHelp5.setBackground(new java.awt.Color(255, 255, 255));
        textHelp5.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        textHelp5.setForeground(new java.awt.Color(0, 0, 0));
        textHelp5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        textHelp5.setText("Troco:");
        textHelp5.setToolTipText("");
        ProdutoEscolhido.add(textHelp5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 30, 130, 60));
        ProdutoEscolhido.add(DoceEscolhidoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 430, 420));

        FundoPanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensVendingMachine/BackgroundPanel.png"))); // NOI18N
        ProdutoEscolhido.add(FundoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 630));

        getContentPane().add(ProdutoEscolhido, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, -1, -1));

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
        btnPegar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPegarActionPerformed(evt);
            }
        });
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

        precoChoco3.setBackground(new java.awt.Color(25, 25, 69));
        precoChoco3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        precoChoco3.setForeground(new java.awt.Color(255, 255, 255));
        precoChoco3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        precoChoco3.setOpaque(true);
        getContentPane().add(precoChoco3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 524, 50, 20));

        precoChoco2.setBackground(new java.awt.Color(25, 25, 69));
        precoChoco2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        precoChoco2.setForeground(new java.awt.Color(255, 255, 255));
        precoChoco2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        precoChoco2.setOpaque(true);
        getContentPane().add(precoChoco2, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 524, 50, 20));

        precoChoco1.setBackground(new java.awt.Color(25, 25, 69));
        precoChoco1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        precoChoco1.setForeground(new java.awt.Color(255, 255, 255));
        precoChoco1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        precoChoco1.setOpaque(true);
        getContentPane().add(precoChoco1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 524, 50, 20));

        precoCandy4.setBackground(new java.awt.Color(25, 25, 69));
        precoCandy4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        precoCandy4.setForeground(new java.awt.Color(255, 255, 255));
        precoCandy4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        precoCandy4.setOpaque(true);
        getContentPane().add(precoCandy4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 378, 50, 20));

        precoCandy3.setBackground(new java.awt.Color(25, 25, 69));
        precoCandy3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        precoCandy3.setForeground(new java.awt.Color(255, 255, 255));
        precoCandy3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        precoCandy3.setOpaque(true);
        getContentPane().add(precoCandy3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1004, 379, 50, 20));

        precoCandy2.setBackground(new java.awt.Color(25, 25, 69));
        precoCandy2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        precoCandy2.setForeground(new java.awt.Color(255, 255, 255));
        precoCandy2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        precoCandy2.setOpaque(true);
        getContentPane().add(precoCandy2, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 381, 50, 20));

        precoCandy1.setBackground(new java.awt.Color(25, 25, 69));
        precoCandy1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        precoCandy1.setForeground(new java.awt.Color(255, 255, 255));
        precoCandy1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        precoCandy1.setOpaque(true);
        getContentPane().add(precoCandy1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 382, 50, 20));

        precoDonut3.setBackground(new java.awt.Color(25, 25, 69));
        precoDonut3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        precoDonut3.setForeground(new java.awt.Color(255, 255, 255));
        precoDonut3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        precoDonut3.setOpaque(true);
        getContentPane().add(precoDonut3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 209, 50, 20));

        precoDonut2.setBackground(new java.awt.Color(25, 25, 69));
        precoDonut2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        precoDonut2.setForeground(new java.awt.Color(255, 255, 255));
        precoDonut2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        precoDonut2.setOpaque(true);
        getContentPane().add(precoDonut2, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 211, 50, 20));

        precoDonut1.setBackground(new java.awt.Color(25, 25, 69));
        precoDonut1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        precoDonut1.setForeground(new java.awt.Color(255, 255, 255));
        precoDonut1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        precoDonut1.setOpaque(true);
        getContentPane().add(precoDonut1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 212, 50, 20));

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

        Choco1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensVendingMachine/doce_choco_3-8.png"))); // NOI18N
        getContentPane().add(Choco1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 410, 110, 120));

        Choco2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensVendingMachine/doce_choco_1-8.png"))); // NOI18N
        getContentPane().add(Choco2, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 410, 110, 120));

        Choco3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensVendingMachine/doce_choco_2-8.png"))); // NOI18N
        getContentPane().add(Choco3, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 410, 110, 120));
        getContentPane().add(DoceEscolhido, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 630, 120, 100));

        FundoMaquinaAberta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensVendingMachine/fundo_roxo_tampa-8.png"))); // NOI18N
        getContentPane().add(FundoMaquinaAberta, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 630, 470, 110));

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
        }else{
            JOptionPane.showMessageDialog(this, "Limite da máquina atingido!", "Aviso", JOptionPane.WARNING_MESSAGE);
       }
    }//GEN-LAST:event_btnNota5ActionPerformed

    private void btnNota2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNota2ActionPerformed
        if (saldo + 2.00 <= limite) {
            saldo += 2.00; 
            valorMaquina.setText(String.format("%.2f", saldo)); 
            atualizarBotoes();
        }else{
            JOptionPane.showMessageDialog(this, "Limite da máquina atingido!", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
                                      
    }//GEN-LAST:event_btnNota2ActionPerformed

    private void btnMoeda1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoeda1ActionPerformed
        if (saldo + 1.00 <= limite) {
            saldo += 1.00; 
            valorMaquina.setText(String.format("%.2f", saldo)); 
            atualizarBotoes();
        }else{
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
        
        if (produtoEscolhido) {
            JOptionPane.showMessageDialog(this, "Você já escolheu um produto! Pegue-o antes de selecionar outro.", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (saldo >= precoDonut) {
            saldo -= precoDonut;
            valorMaquina.setText(String.format("%.2f", saldo));
            DoceEscolhido.setVisible(true);
            btnDonut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            btnDonut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensVendingMachine/botao_donut_amarelo-8.png")));
            ProdEscolhido = "Donut";
            produtoEscolhido = true; 


            btnCandy.setEnabled(false);
            btnChoco.setEnabled(false);
            btnPegar.setEnabled(true);


            new Thread(() -> {
                try {
                    Thread.sleep(200); 
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                atualizarBotoes(); 
            }).start();


            if (QtdDonut == 3) {
                --QtdDonut;
                Maquina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensVendingMachine/maquina_vazia_aberto-8.png")));
                Donut1.setVisible(false);
                DoceEscolhido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensVendingMachine/doce_donut_2-8.png")));  
                btnPegar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                btnPegar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensVendingMachine/botao_pegar_escuro-8.png")));  
            }else if(QtdDonut == 2) {
                --QtdDonut;
                Maquina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensVendingMachine/maquina_vazia_aberto-8.png")));
                Donut2.setVisible(false);
                DoceEscolhido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensVendingMachine/doce_donut_2_escuro-8.png")));  
                btnPegar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                btnPegar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensVendingMachine/botao_pegar_escuro-8.png")));  
            }else {
                --QtdDonut;
                Maquina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensVendingMachine/maquina_vazia_aberto-8.png")));
                Donut3.setVisible(false);
                DoceEscolhido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensVendingMachine/doce_donut_3-8.png"))); 
                btnPegar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                btnPegar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensVendingMachine/botao_pegar_escuro-8.png")));  
                }
        }else{
            JOptionPane.showMessageDialog(this, "Saldo insuficiente!", "Aviso", JOptionPane.WARNING_MESSAGE);
            btnPegar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        }
    }//GEN-LAST:event_btnDonutActionPerformed

    private void btnCandyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCandyActionPerformed
         
    if (produtoEscolhido) {
        JOptionPane.showMessageDialog(this, "Você já escolheu um produto! Pegue-o antes de selecionar outro.", "Aviso", JOptionPane.WARNING_MESSAGE);
        return;
    }

    if (saldo >= precoCandy) {
        saldo -= precoCandy;
        valorMaquina.setText(String.format("%.2f", saldo));
        DoceEscolhido.setVisible(true);
        btnCandy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensVendingMachine/botao_candy_amarelo-8.png")));
        ProdEscolhido = "Candy";
        produtoEscolhido = true; 

        
        btnDonut.setEnabled(false);
        btnChoco.setEnabled(false);
        btnPegar.setEnabled(true);

       
        new Thread(() -> {
            try {
                Thread.sleep(200); 
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            atualizarBotoes(); 
        }).start();

       
        if (QtdCandy == 4) {
            --QtdCandy;
            Maquina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensVendingMachine/maquina_vazia_aberto-8.png")));
            Candy1.setVisible(false);
            DoceEscolhido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensVendingMachine/doce_candy_1-8.png")));
            btnPegar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            btnPegar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensVendingMachine/botao_pegar_escuro-8.png")));  
        } else if (QtdCandy == 3) {
            --QtdCandy;
            Maquina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensVendingMachine/maquina_vazia_aberto-8.png")));
            Candy2.setVisible(false);
            DoceEscolhido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensVendingMachine/doce_candy_4-8.png")));
            btnPegar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            btnPegar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensVendingMachine/botao_pegar_escuro-8.png")));  
        } else if (QtdCandy == 2) {
            --QtdCandy;
            Maquina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensVendingMachine/maquina_vazia_aberto-8.png")));
            Candy3.setVisible(false);
            DoceEscolhido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensVendingMachine/doce_candy_3-8.png")));
            btnPegar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            btnPegar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensVendingMachine/botao_pegar_escuro-8.png")));  
        } else {
            --QtdCandy;
            Maquina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensVendingMachine/maquina_vazia_aberto-8.png")));
            Candy4.setVisible(false);
            DoceEscolhido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensVendingMachine/doce_candy_2-8.png")));
            btnPegar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            btnPegar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensVendingMachine/botao_pegar_escuro-8.png")));  
        }
    } else {
        JOptionPane.showMessageDialog(this, "Saldo insuficiente!", "Aviso", JOptionPane.WARNING_MESSAGE);
        btnPegar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    }
    }//GEN-LAST:event_btnCandyActionPerformed

    private void btnChocoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChocoActionPerformed

    if (produtoEscolhido) {
        JOptionPane.showMessageDialog(this, "Você já escolheu um produto! Pegue-o antes de selecionar outro.", "Aviso", JOptionPane.WARNING_MESSAGE);
        return;
    }

    if (saldo >= precoChoco) {
        saldo -= precoChoco;
        valorMaquina.setText(String.format("%.2f", saldo));
        DoceEscolhido.setVisible(true);
        btnChoco.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnChoco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensVendingMachine/botao_choco_amarelo-8.png")));
        ProdEscolhido = "Choco";
        produtoEscolhido = true; 
        
        
        btnDonut.setEnabled(false);
        btnCandy.setEnabled(false);
        btnPegar.setEnabled(true);

      
        new Thread(() -> {
            try {
                Thread.sleep(200); 
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            atualizarBotoes(); 
        }).start();

        
        if (QtdChoco == 3) {
            --QtdChoco;
            Maquina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensVendingMachine/maquina_vazia_aberto-8.png")));
            Choco1.setVisible(false);
            DoceEscolhido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensVendingMachine/doce_choco_1-8.png")));  
            btnPegar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            btnPegar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensVendingMachine/botao_pegar_escuro-8.png")));  
        } else if (QtdChoco == 2) {
            --QtdChoco;
            Maquina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensVendingMachine/maquina_vazia_aberto-8.png")));
            Choco2.setVisible(false);
            DoceEscolhido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensVendingMachine/doce_choco_2-8.png")));  
            btnPegar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            btnPegar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensVendingMachine/botao_pegar_escuro-8.png")));  
        } else {
            --QtdChoco;
            Maquina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensVendingMachine/maquina_vazia_aberto-8.png")));
            Choco3.setVisible(false);
            DoceEscolhido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensVendingMachine/doce_choco_3-8.png"))); 
            btnPegar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            btnPegar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensVendingMachine/botao_pegar_escuro-8.png")));  
        }
    } else {
        JOptionPane.showMessageDialog(this, "Saldo insuficiente!", "Aviso", JOptionPane.WARNING_MESSAGE);
        btnPegar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    }

    }//GEN-LAST:event_btnChocoActionPerformed

    private void BotaoEscolhidoLabelActionPerformed(java.awt.event.ActionEvent evt) {
        // Reseta as variáveis do painel ProdutoEscolhido
        DoceEscolhidoPanel.setIcon(null); // Remove o ícone do doce selecionado
        valorTrocoEscolhido.setText("00,00"); // Reseta o valor do troco
    
        // Torna visíveis apenas os componentes específicos do painel ProdutoEscolhido
        valorTrocoEscolhido.setVisible(true);
        DoceEscolhidoPanel.setVisible(true);
    
        // Torna o painel ProdutoEscolhido invisível
        ProdutoEscolhido.setVisible(false);
    }

        private void atualizarTrocoVisual(double troco) {
            // Reseta os ícones dos labels de troco
            troco1.setIcon(null);
            troco2.setIcon(null);
            troco3.setIcon(null);
            troco4.setIcon(null);
        
            // Define os valores das notas e moedas disponíveis
            int[] valores = {5, 2, 1}; // Notas e moedas disponíveis
            String[] imagens = {"/ImagensVendingMachine/5reais.jpg", 
                                "/ImagensVendingMachine/2reais.jpg", 
                                "/ImagensVendingMachine/1real.png"}; // Caminhos das imagens
            javax.swing.JLabel[] trocoLabels = {troco1, troco2, troco3, troco4}; // Labels de troco
        
            int index = 0; // Índice para os labels de troco
            for (int i = 0; i < valores.length; i++) {
                while (troco >= valores[i] && index < trocoLabels.length) {
                    // Atualiza o ícone do label correspondente
                    trocoLabels[index].setIcon(new javax.swing.ImageIcon(getClass().getResource(imagens[i])));
                    troco -= valores[i];
                    index++;
                }
            }
        }

    private void btnPegarActionPerformed(java.awt.event.ActionEvent evt) {
        String mensagem;
        DoceEscolhido.setVisible(false);
        btnPegar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensVendingMachine/botao_pegar_escuro-8.png")));
    
        if (ProdEscolhido.equals("Donut")) {
            mensagem = "Você pegou: Donut";
            imagem = new javax.swing.ImageIcon(getClass().getResource("/ImagensVendingMachine/donut_redimensionado.png"));
        } else if (ProdEscolhido.equals("Candy")) {
            mensagem = "Você pegou: Candy";
            imagem = new javax.swing.ImageIcon(getClass().getResource("/ImagensVendingMachine/candy_redimensionado.png"));
        } else if (ProdEscolhido.equals("Choco")) {
            mensagem = "Você pegou: Choco";
            imagem = new javax.swing.ImageIcon(getClass().getResource("/ImagensVendingMachine/choco_redimensionado.png"));
        } else {
            JOptionPane.showMessageDialog(this, "Nenhum produto foi selecionado.", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }
    
        double troco = saldo;

        atualizarTrocoVisual(troco);
        saldo = 0.0;
        valorMaquina.setText(String.format("%.2f", saldo));
    
        // Atualiza o painel ProdutoEscolhido
        DoceEscolhidoPanel.setIcon(imagem); // Define a imagem do doce selecionado
        valorTrocoEscolhido.setText(String.format("R$ %.2f", troco)); // Define o valor do troco
        ProdutoEscolhido.setVisible(true); // Torna o painel ProdutoEscolhido visível
    
        // Garante que todos os componentes internos do painel estejam visíveis
        for (java.awt.Component component : ProdutoEscolhido.getComponents()) {
            component.setVisible(true);
        }
    
        // Atualiza o estado da máquina
        Maquina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensVendingMachine/maquina_vazia_fechado-8.png")));
        btnPegar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensVendingMachine/botao_pegar_tradicional-8.png")));
    
        produtoEscolhido = false;
        btnDonut.setEnabled(true);
        btnCandy.setEnabled(true);
        btnChoco.setEnabled(true);
        btnPegar.setEnabled(false);

        // Atualiza o estado do panel
        valorTrocoEscolhido.setVisible(true);
        BotaoEscolhidoLabel.setVisible(true);
        DoceEscolhidoPanel.setVisible(true);

    
        // Reabastece a máquina se necessário
        if (QtdDonut == 0 && QtdCandy == 0 && QtdChoco == 0) {
            JOptionPane.showMessageDialog(this, "Máquina vazia. Reabastecendo estoque...", "Aviso", JOptionPane.INFORMATION_MESSAGE);
    
            QtdDonut = 3;
            QtdCandy = 4;
            QtdChoco = 3;
    
            Donut1.setVisible(true);
            Donut2.setVisible(true);
            Donut3.setVisible(true);
            Candy1.setVisible(true);
            Candy2.setVisible(true);
            Candy3.setVisible(true);
            Candy4.setVisible(true);
            Choco1.setVisible(true);
            Choco2.setVisible(true);
            Choco3.setVisible(true);
    }
    
    }                                        

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
    private javax.swing.JButton BotaoEscolhidoLabel;
    private javax.swing.JLabel Candy1;
    private javax.swing.JLabel Candy2;
    private javax.swing.JLabel Candy3;
    private javax.swing.JLabel Candy4;
    private javax.swing.JLabel Carteira;
    private javax.swing.JLabel Choco1;
    private javax.swing.JLabel Choco2;
    private javax.swing.JLabel Choco3;
    private javax.swing.JLabel DoceEscolhido;
    private javax.swing.JLabel DoceEscolhidoPanel;
    private javax.swing.JLabel Donut1;
    private javax.swing.JLabel Donut2;
    private javax.swing.JLabel Donut3;
    private javax.swing.JLabel FundoMaquina;
    private javax.swing.JLabel FundoMaquinaAberta;
    private javax.swing.JLabel FundoPanel;
    private javax.swing.JLabel Maquina;
    private java.awt.Panel ProdutoEscolhido;
    private javax.swing.JButton btnCandy;
    private javax.swing.JButton btnChoco;
    private javax.swing.JButton btnDonut;
    private javax.swing.JButton btnMoeda1;
    private javax.swing.JButton btnNota2;
    private javax.swing.JButton btnNota5;
    private javax.swing.JButton btnPegar;
    private javax.swing.JLabel precoCandy1;
    private javax.swing.JLabel precoCandy2;
    private javax.swing.JLabel precoCandy3;
    private javax.swing.JLabel precoCandy4;
    private javax.swing.JLabel precoChoco1;
    private javax.swing.JLabel precoChoco2;
    private javax.swing.JLabel precoChoco3;
    private javax.swing.JLabel precoDonut1;
    private javax.swing.JLabel precoDonut2;
    private javax.swing.JLabel precoDonut3;
    private javax.swing.JLabel textHelp;
    private javax.swing.JLabel textHelp1;
    private javax.swing.JLabel textHelp2;
    private javax.swing.JLabel textHelp4;
    private javax.swing.JLabel textHelp5;
    private javax.swing.JLabel troco1;
    private javax.swing.JLabel troco2;
    private javax.swing.JLabel troco3;
    private javax.swing.JLabel troco4;
    private javax.swing.JLabel valorMaquina;
    private javax.swing.JLabel valorTrocoEscolhido;
    // End of variables declaration//GEN-END:variables
}
