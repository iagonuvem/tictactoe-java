/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogodavelha;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 * Classe do jogo
 * @author Iago Nuvem
 */
public class main extends javax.swing.JFrame {
    
    private String NomeJogador1;
    private String NomeJogador2;
    private boolean jog1Ativ;
    private boolean jog2Ativ;
    
    
    
    /**
     * Construtor da classe
     * @author Iago Nuvem
     * @param j1 [Nome do Jogador 1][String]
     * @param j2 [Nome do Jogador 2][String]
     */
    public main(String j1, String j2){
        this.NomeJogador1 = j1;
        this.NomeJogador2 = j2;
        
        // Inicializa a jogada, sendo o jogador 1 o primeiro a jogar
        this.jog1Ativ = true;
        this.jog2Ativ = false;
        
        //Inicializa os componentes da tela
        initComponents();
        
        //Exibe os nomes dos jogadores na tela
        txtJog1.setText(j1);
        txtJog2.setText(j2);
        
        // Coloca o nome do jogador da jogada atual diferente do jogador "em pausa"
        txtJog1.setForeground(Color.white);
        txtJog2.setForeground(Color.lightGray);
        
    }
    
    /**
     * Creates new form main
     */
    public main() {
        initComponents();
    }
    
    /**
     * Limpa o preenchimento do jogo
     * @author Iago Nuvem
     */
    public void zeraTabuleiro(){
        
        // Coloca o jogador 1 como o próximo a jogar
        this.jog2Ativ = false;
        this.jog1Ativ = true;
        
        txtJog1.setForeground(Color.white);
        txtJog2.setForeground(Color.lightGray);
        
        // Limpa os botões
        B1.setText("");
        B2.setText("");
        B3.setText("");
        B4.setText("");
        B5.setText("");
        B6.setText("");
        B7.setText("");
        B8.setText("");
        B9.setText("");
    }
    
    /**
     * Seta o jogador ativo e verifica se há um vencedor
     * @author Iago Nuvem
     */
    public void JogadorAtivo() {
        
        if (jog1Ativ == true){
            jog1Ativ = false;
            jog2Ativ = true;
            
            txtJog1.setForeground(Color.lightGray);
            txtJog2.setForeground(Color.white);
        } else {
            jog1Ativ = true;
            jog2Ativ = false;
            
            txtJog1.setForeground(Color.white);
            txtJog2.setForeground(Color.lightGray);
        }
        
        JogadorVencedor("X");
        JogadorVencedor("o");
                
        
    }
    
    public void JogadorVencedor(String Jogador){
        
        // Verifica Linhas
        if (
            (B1.getText().equals(Jogador) && B2.getText().equals(Jogador) && B3.getText().equals(Jogador)) ||
            (B4.getText().equals(Jogador) && B5.getText().equals(Jogador) && B6.getText().equals(Jogador)) ||
            (B7.getText().equals(Jogador) && B8.getText().equals(Jogador) && B9.getText().equals(Jogador))
            ) {
            
            if (Jogador.equals("X")){
                Vencedor(1);
            }
            else{
                Vencedor(2);
            }
        }
        // Verifica colunas
        else if(
                (B1.getText().equals(Jogador) && B4.getText().equals(Jogador) && B7.getText().equals(Jogador)) ||
                (B2.getText().equals(Jogador) && B5.getText().equals(Jogador) && B8.getText().equals(Jogador)) ||
                (B3.getText().equals(Jogador) && B6.getText().equals(Jogador) && B9.getText().equals(Jogador))
               ){
            if (Jogador.equals("X")){
                Vencedor(1);
            }
            else{
                Vencedor(2);
            }    
        }
        // Verifica diagonais
        else if(
                (B1.getText().equals(Jogador) && B5.getText().equals(Jogador) && B9.getText().equals(Jogador)) ||
                (B3.getText().equals(Jogador) && B5.getText().equals(Jogador) && B7.getText().equals(Jogador))
               ){
            if (Jogador.equals("X")){
                Vencedor(1);
            }
            else{
                Vencedor(2);
            }
        }
        // Empate, caso TODO o jogo esteja preenchido e não entrou nas condições anteriores
        else if(
                (B1.getText().equals("X") || B1.getText().equals("o")) &&
                (B2.getText().equals("X") || B2.getText().equals("o")) &&
                (B3.getText().equals("X") || B3.getText().equals("o")) &&
                (B4.getText().equals("X") || B4.getText().equals("o")) &&
                (B5.getText().equals("X") || B5.getText().equals("o")) &&
                (B6.getText().equals("X") || B6.getText().equals("o")) &&
                (B7.getText().equals("X") || B7.getText().equals("o")) &&
                (B8.getText().equals("X") || B8.getText().equals("o")) &&
                (B9.getText().equals("X") || B9.getText().equals("o"))
                )
        {
            Vencedor(0);
        }
        
    }
  
    /**
     * Exibe mensagem de parabenização ao jogador vencedor
     * @author Iago Nuvem
     * @param JogadorVencedor [0 - Empate || 1 - Jogador 1 || 2 - Jogador 2, indica o jogador que ganhou][int]
     */
    public void Vencedor(int JogadorVencedor) {
        // Empate
        if(JogadorVencedor == 0){
            JOptionPane.showMessageDialog(null, "Empate!");
            zeraTabuleiro();
        }
        // Jogador 1 venceu
        if(JogadorVencedor == 1) {
            JOptionPane.showMessageDialog(null, this.NomeJogador1+" venceu!");
            zeraTabuleiro();
        }
        // Jogador 2 venceu
        if(JogadorVencedor == 2) {
            JOptionPane.showMessageDialog(null, this.NomeJogador2+" venceu!");
            zeraTabuleiro();
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtJog1 = new javax.swing.JTextField();
        txtJog2 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        B1 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        B4 = new javax.swing.JButton();
        B7 = new javax.swing.JButton();
        B5 = new javax.swing.JButton();
        B6 = new javax.swing.JButton();
        B8 = new javax.swing.JButton();
        B9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(400, 100));
        setLocationByPlatform(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(35, 170, 225));

        txtJog1.setEditable(false);
        txtJog1.setBackground(new java.awt.Color(30, 170, 225));
        txtJog1.setFont(new java.awt.Font("Myriad Pro Light SemiExt", 0, 24)); // NOI18N
        txtJog1.setForeground(new java.awt.Color(255, 255, 255));
        txtJog1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtJog1.setBorder(null);
        txtJog1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJog1ActionPerformed(evt);
            }
        });

        txtJog2.setEditable(false);
        txtJog2.setBackground(new java.awt.Color(30, 170, 225));
        txtJog2.setFont(new java.awt.Font("Myriad Pro Light SemiExt", 0, 24)); // NOI18N
        txtJog2.setForeground(new java.awt.Color(255, 255, 255));
        txtJog2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtJog2.setBorder(null);
        txtJog2.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        B1.setBackground(new java.awt.Color(30, 170, 225));
        B1.setFont(new java.awt.Font("Texas Grunge Demo", 0, 48)); // NOI18N
        B1.setForeground(new java.awt.Color(255, 255, 255));
        B1.setBorder(null);
        B1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });

        B2.setBackground(new java.awt.Color(35, 170, 225));
        B2.setFont(new java.awt.Font("Texas Grunge Demo", 0, 48)); // NOI18N
        B2.setForeground(new java.awt.Color(255, 255, 255));
        B2.setBorder(null);
        B2.setBorderPainted(false);
        B2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });

        B3.setBackground(new java.awt.Color(30, 170, 225));
        B3.setFont(new java.awt.Font("Texas Grunge Demo", 0, 48)); // NOI18N
        B3.setForeground(new java.awt.Color(255, 255, 255));
        B3.setBorder(null);
        B3.setBorderPainted(false);
        B3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });

        B4.setBackground(new java.awt.Color(30, 170, 225));
        B4.setFont(new java.awt.Font("Texas Grunge Demo", 0, 48)); // NOI18N
        B4.setForeground(new java.awt.Color(255, 255, 255));
        B4.setBorder(null);
        B4.setBorderPainted(false);
        B4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4ActionPerformed(evt);
            }
        });

        B7.setBackground(new java.awt.Color(30, 170, 225));
        B7.setFont(new java.awt.Font("Texas Grunge Demo", 0, 48)); // NOI18N
        B7.setForeground(new java.awt.Color(255, 255, 255));
        B7.setBorder(null);
        B7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B7ActionPerformed(evt);
            }
        });

        B5.setBackground(new java.awt.Color(30, 170, 225));
        B5.setFont(new java.awt.Font("Texas Grunge Demo", 0, 48)); // NOI18N
        B5.setForeground(new java.awt.Color(255, 255, 255));
        B5.setBorder(null);
        B5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B5ActionPerformed(evt);
            }
        });

        B6.setBackground(new java.awt.Color(30, 170, 225));
        B6.setFont(new java.awt.Font("Texas Grunge Demo", 0, 48)); // NOI18N
        B6.setForeground(new java.awt.Color(255, 255, 255));
        B6.setBorder(null);
        B6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B6ActionPerformed(evt);
            }
        });

        B8.setBackground(new java.awt.Color(30, 170, 225));
        B8.setFont(new java.awt.Font("Texas Grunge Demo", 0, 48)); // NOI18N
        B8.setForeground(new java.awt.Color(255, 255, 255));
        B8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B8ActionPerformed(evt);
            }
        });

        B9.setBackground(new java.awt.Color(30, 170, 225));
        B9.setFont(new java.awt.Font("Texas Grunge Demo", 0, 48)); // NOI18N
        B9.setForeground(new java.awt.Color(255, 255, 255));
        B9.setBorder(null);
        B9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(B1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(B4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(B7, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(B5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(B2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(B8, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(B9, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                    .addComponent(B3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(B1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(B6, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                    .addComponent(B5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(B4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(B8, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                    .addComponent(B9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tictactoe-icon.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Texas Grunge Demo", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("X");

        jLabel3.setFont(new java.awt.Font("Texas Grunge Demo", 0, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("o");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(150, 150, 150)
                .addComponent(jLabel3)
                .addGap(173, 173, 173))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtJog1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addComponent(txtJog2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(jLabel1)))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtJog1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtJog2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtJog1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJog1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJog1ActionPerformed

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4ActionPerformed
        if(this.jog1Ativ == true){
            if(B4.getText().equals("")){
                B4.setText("X");
                JogadorAtivo();
            }
        } 
        else {
            if(B4.getText().equals("")){
                B4.setText("o");
                JogadorAtivo();
            }
        }
    }//GEN-LAST:event_B4ActionPerformed

    private void B6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B6ActionPerformed
        if(this.jog1Ativ == true){
            if(B6.getText().equals("")){
                B6.setText("X");
                JogadorAtivo();
            }
        } 
        else {
            if(B6.getText().equals("")){
                B6.setText("o");
                JogadorAtivo();
            }
        }
    }//GEN-LAST:event_B6ActionPerformed

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
        if(this.jog1Ativ == true){
            if(B1.getText().equals("")){
                B1.setText("X");
                JogadorAtivo();
            }
        } 
        else {
            if(B1.getText().equals("")){
                B1.setText("o");
                JogadorAtivo();
            }
        }
    }//GEN-LAST:event_B1ActionPerformed

    private void B8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B8ActionPerformed
        if(this.jog1Ativ == true){
            if(B8.getText().equals("")){
                B8.setText("X");
                JogadorAtivo();
            }
        } 
        else {
            if(B8.getText().equals("")){
                B8.setText("o");
                JogadorAtivo();
            }
        }
    }//GEN-LAST:event_B8ActionPerformed

    private void B9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B9ActionPerformed
        if(this.jog1Ativ == true){
            if(B9.getText().equals("")){
                B9.setText("X");
                JogadorAtivo();
            }
        } 
        else {
            if(B9.getText().equals("")){
                B9.setText("o");
                JogadorAtivo();
            }
        }
    }//GEN-LAST:event_B9ActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
        if(this.jog1Ativ == true){
            if(B2.getText().equals("")){
                B2.setText("X");
                JogadorAtivo();
            }
        } 
        else {
            if(B2.getText().equals("")){
                B2.setText("o");
                JogadorAtivo();
            }
        }
    }//GEN-LAST:event_B2ActionPerformed

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
        if(this.jog1Ativ == true){
            if(B3.getText().equals("")){
                B3.setText("X");
                JogadorAtivo();
            }
        } 
        else {
            if(B3.getText().equals("")){
                B3.setText("o");
                JogadorAtivo();
            }
        }
    }//GEN-LAST:event_B3ActionPerformed

    private void B5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B5ActionPerformed
        if(this.jog1Ativ == true){
            if(B5.getText().equals("")){
                B5.setText("X");
                JogadorAtivo();
            }
        } 
        else {
            if(B5.getText().equals("")){
                B5.setText("o");
                JogadorAtivo();
            }
        }
    }//GEN-LAST:event_B5ActionPerformed

    private void B7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B7ActionPerformed
        if(this.jog1Ativ == true){
            if(B7.getText().equals("")){
                B7.setText("X");
                JogadorAtivo();
            }
        } 
        else {
            if(B7.getText().equals("")){
                B7.setText("o");
                JogadorAtivo();
            }
        }
    }//GEN-LAST:event_B7ActionPerformed

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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JButton B4;
    private javax.swing.JButton B5;
    private javax.swing.JButton B6;
    private javax.swing.JButton B7;
    private javax.swing.JButton B8;
    private javax.swing.JButton B9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtJog1;
    private javax.swing.JTextField txtJog2;
    // End of variables declaration//GEN-END:variables

}
