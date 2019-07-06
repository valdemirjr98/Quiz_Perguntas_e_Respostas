
package br.edu.fatec.aula;

import java.awt.List;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import javafx.application.Application;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Quiz extends javax.swing.JFrame {

   
    public Quiz() {
        initComponents();
    }
    
    private void jogarnovamente(){
        int Confirm = JOptionPane.showConfirmDialog(null,"Deseja Jogar Novamente?","Fim de jogo", JOptionPane.YES_NO_OPTION);
        if (Confirm == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Fim do Jogo");
            System.exit(0);
        } else if (Confirm == JOptionPane.YES_OPTION){
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);}
    }   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        perguntaTextArea = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        resposta1Button = new javax.swing.JButton();
        resposta2Button = new javax.swing.JButton();
        resposta3Button = new javax.swing.JButton();
        resposta4Button = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        pular1Button = new javax.swing.JButton();
        pular2Button = new javax.swing.JButton();
        pular3Button = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        numroAcertosLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quiz");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(52, 73, 94));

        jScrollPane2.setBorder(null);
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        perguntaTextArea.setEditable(false);
        perguntaTextArea.setBackground(new java.awt.Color(120, 111, 166));
        perguntaTextArea.setColumns(20);
        perguntaTextArea.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        perguntaTextArea.setLineWrap(true);
        perguntaTextArea.setRows(5);
        perguntaTextArea.setText("Ai pai para");
        perguntaTextArea.setWrapStyleWord(true);
        jScrollPane2.setViewportView(perguntaTextArea);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setLayout(new java.awt.GridLayout(4, 0, 0, 15));

        resposta1Button.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        resposta1Button.setText("Resposta 1");
        resposta1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resposta1ButtonActionPerformed(evt);
            }
        });
        jPanel3.add(resposta1Button);

        resposta2Button.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        resposta2Button.setText("Resposta 2");
        resposta2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resposta2ButtonActionPerformed(evt);
            }
        });
        jPanel3.add(resposta2Button);

        resposta3Button.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        resposta3Button.setText("Resposta 3");
        resposta3Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resposta3ButtonActionPerformed(evt);
            }
        });
        jPanel3.add(resposta3Button);

        resposta4Button.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        resposta4Button.setText("Resposta 4");
        resposta4Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resposta4ButtonActionPerformed(evt);
            }
        });
        jPanel3.add(resposta4Button);

        jPanel4.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

        pular1Button.setBackground(new java.awt.Color(76, 180, 38));
        pular1Button.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        pular1Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/fatec/imagem/redo-5-24.png"))); // NOI18N
        pular1Button.setText("PULAR");
        pular1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pular1ButtonActionPerformed(evt);
            }
        });
        jPanel4.add(pular1Button);

        pular2Button.setBackground(new java.awt.Color(76, 180, 38));
        pular2Button.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        pular2Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/fatec/imagem/redo-5-24.png"))); // NOI18N
        pular2Button.setText("PULAR");
        pular2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pular2ButtonActionPerformed(evt);
            }
        });
        jPanel4.add(pular2Button);

        pular3Button.setBackground(new java.awt.Color(76, 180, 38));
        pular3Button.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        pular3Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/fatec/imagem/redo-5-24.png"))); // NOI18N
        pular3Button.setText("PULAR");
        pular3Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pular3ButtonActionPerformed(evt);
            }
        });
        jPanel4.add(pular3Button);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ACERTOS");

        numroAcertosLabel.setBackground(new java.awt.Color(255, 255, 255));
        numroAcertosLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        numroAcertosLabel.setForeground(new java.awt.Color(255, 255, 255));
        numroAcertosLabel.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(numroAcertosLabel)
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(numroAcertosLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void resposta1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resposta1ButtonActionPerformed
        try {
        if (numeroRespostaCorreta == 1){
            numeroAcertos++;
            numroAcertosLabel.setText("" + numeroAcertos);
            
        Collections.shuffle(lista);  //Emparralha a lista
            
        String linha = lista.remove(0);
        String[] partes = linha.split("[|]");
            
            perguntaTextArea.setText(partes[0]);
            resposta1Button.setText(partes[1]);
            resposta2Button.setText(partes[2]);
            resposta3Button.setText(partes[3]);
            resposta4Button.setText(partes[4]);
            numeroRespostaCorreta = Integer.parseInt(partes[5]);
            
        }else{
            JOptionPane.showMessageDialog(null,
                "Você Errou. \n A resposta correta seria a alternativa " + numeroRespostaCorreta,
                "Você é noob!",
                JOptionPane.ERROR_MESSAGE);   
            JOptionPane.showMessageDialog(null,
                "Você Acertou  " + numeroAcertos,
                "Fim",
                JOptionPane.INFORMATION_MESSAGE);
        
        jogarnovamente();
        }  
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null,
                "    Você foi ótimo! \nNumero de Acertos: " + numeroAcertos,
                "Fim de Jogo",
                JOptionPane.INFORMATION_MESSAGE);
            jogarnovamente();
        }
        Collections.shuffle(lista);
    }//GEN-LAST:event_resposta1ButtonActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    
    String caminho = "src\\br\\edu\\fatec\\arquivo\\Dados.txt";    
    File arquivo = new File(caminho); 
        
    try {
        Scanner entrada = new Scanner(arquivo);
        
        while(entrada.hasNext()){            
            String linha = entrada.nextLine();          //Le uma linha do arquivo
            lista.add(linha);                          //Adiciona na lista                 
        }       
        
        Collections.shuffle(lista);  //Emparralha a lista
        
        
        String linha = lista.remove(0);
        
        
        String[] partes = linha.split("[|]");
            
            perguntaTextArea.setText(partes[0]);
            resposta1Button.setText(partes[1]);
            resposta2Button.setText(partes[2]);
            resposta3Button.setText(partes[3]);
            resposta4Button.setText(partes[4]);
            numeroRespostaCorreta = Integer.parseInt(partes[5]);
            
    } catch(IOException ex){ 
        
        JOptionPane.showMessageDialog(null,
                "Falha ao ler o Arquivo!",
                "Erro de Arquivo",
                JOptionPane.ERROR_MESSAGE); 
        jogarnovamente();
        
    }//GEN-LAST:event_formWindowOpened
  Collections.shuffle(lista);
    }
    private void pular1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pular1ButtonActionPerformed
       pular1Button.setEnabled(false);     
        
        String linha = lista.remove(0);
        String[] partes = linha.split("[|]");
            
            perguntaTextArea.setText(partes[0]);
            resposta1Button.setText(partes[1]);
            resposta2Button.setText(partes[2]);
            resposta3Button.setText(partes[3]);
            resposta4Button.setText(partes[4]);
            numeroRespostaCorreta = Integer.parseInt(partes[5]);
            
       
    }//GEN-LAST:event_pular1ButtonActionPerformed

    private void resposta2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resposta2ButtonActionPerformed
        try{
        if (numeroRespostaCorreta == 2){
            numeroAcertos++;
            numroAcertosLabel.setText("" + numeroAcertos);
            
        Collections.shuffle(lista);  //Emparralha a lista    
            
        String linha = lista.remove(0);
        String[] partes = linha.split("[|]");
            
            perguntaTextArea.setText(partes[0]);
            resposta1Button.setText(partes[1]);
            resposta2Button.setText(partes[2]);
            resposta3Button.setText(partes[3]);
            resposta4Button.setText(partes[4]);
            numeroRespostaCorreta = Integer.parseInt(partes[5]);
        }else{
            JOptionPane.showMessageDialog(null,
                "Você Errou. \n A resposta correta seria a alternativa " + numeroRespostaCorreta,
                "Você é noob!",
                JOptionPane.ERROR_MESSAGE);
            
            JOptionPane.showMessageDialog(null,
                "Você Acertou  " + numeroAcertos,
                "Vitoria!",
                JOptionPane.INFORMATION_MESSAGE);
        jogarnovamente();
               }
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null,
                "    Você foi ótimo! \nNumero de Acertos: " + numeroAcertos,
                "Fim de Jogo",
                JOptionPane.INFORMATION_MESSAGE);
            jogarnovamente();
        }
        Collections.shuffle(lista);
    }//GEN-LAST:event_resposta2ButtonActionPerformed

    private void resposta3ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resposta3ButtonActionPerformed
        try{
        if (numeroRespostaCorreta == 3){
            numeroAcertos++;
            numroAcertosLabel.setText("" + numeroAcertos);
            
        Collections.shuffle(lista);  //Emparralha a lista    
            
        String linha = lista.remove(0);
        String[] partes = linha.split("[|]");
            
            perguntaTextArea.setText(partes[0]);
            resposta1Button.setText(partes[1]);
            resposta2Button.setText(partes[2]);
            resposta3Button.setText(partes[3]);
            resposta4Button.setText(partes[4]);
            numeroRespostaCorreta = Integer.parseInt(partes[5]);
        }else{
            JOptionPane.showMessageDialog(null,
                "Você Errou. \nA resposta correta seria a alternativa " + numeroRespostaCorreta,
                "Você é noob!",
                JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null,
                "Você Acertou  " + numeroAcertos,
                "Vitoria!",
                JOptionPane.INFORMATION_MESSAGE);
          jogarnovamente();
        }
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null,
                "    Você foi ótimo! \nNumero de Acertos: " + numeroAcertos,
                "Fim de Jogo",
                JOptionPane.INFORMATION_MESSAGE);
            jogarnovamente();
        }
       Collections.shuffle(lista); 
    }//GEN-LAST:event_resposta3ButtonActionPerformed

    private void resposta4ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resposta4ButtonActionPerformed
        try{
        if (numeroRespostaCorreta == 4){
            numeroAcertos++;
            numroAcertosLabel.setText("" + numeroAcertos);
            
        Collections.shuffle(lista);  //Emparralha a lista    
            
        String linha = lista.remove(0);
        String[] partes = linha.split("[|]");
            
            perguntaTextArea.setText(partes[0]);
            resposta1Button.setText(partes[1]);
            resposta2Button.setText(partes[2]);
            resposta3Button.setText(partes[3]);
            resposta4Button.setText(partes[4]);
            numeroRespostaCorreta = Integer.parseInt(partes[5]);
            
        }else{
            JOptionPane.showMessageDialog(null,
                "Você Errou. \nA resposta correta seria a alternativa " + numeroRespostaCorreta,
                "Você e noob !",
                JOptionPane.ERROR_MESSAGE); 
            JOptionPane.showMessageDialog(null,
                "Você Acertou  " + numeroAcertos,   //dispose(); 
                "Vitoria!",
                JOptionPane.INFORMATION_MESSAGE);
        jogarnovamente();        
        }          
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null,
                "    Você foi ótimo! \nNumero de Acertos: " + numeroAcertos,
                "Fim de Jogo",
                JOptionPane.INFORMATION_MESSAGE);
            jogarnovamente();
        }
        Collections.shuffle(lista);
    }//GEN-LAST:event_resposta4ButtonActionPerformed

    private void pular2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pular2ButtonActionPerformed
        pular2Button.setEnabled(false);     
        
        String linha = lista.remove(0);
        String[] partes = linha.split("[|]");
            
            perguntaTextArea.setText(partes[0]);
            resposta1Button.setText(partes[1]);
            resposta2Button.setText(partes[2]);
            resposta3Button.setText(partes[3]);
            resposta4Button.setText(partes[4]);
            numeroRespostaCorreta = Integer.parseInt(partes[5]);
    }//GEN-LAST:event_pular2ButtonActionPerformed

    private void pular3ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pular3ButtonActionPerformed
        pular3Button.setEnabled(false);     
        
        String linha = lista.remove(0);
        String[] partes = linha.split("[|]");
            
            perguntaTextArea.setText(partes[0]);
            resposta1Button.setText(partes[1]);
            resposta2Button.setText(partes[2]);
            resposta3Button.setText(partes[3]);
            resposta4Button.setText(partes[4]);
            numeroRespostaCorreta = Integer.parseInt(partes[5]);
    }//GEN-LAST:event_pular3ButtonActionPerformed
    
     

    
    public static void main(String args[]) {
       
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
            java.util.logging.Logger.getLogger(Quiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Quiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Quiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Quiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Quiz().setVisible(true);
            }
        });
    }
    
    private int numeroAcertos = 0;
    private int numeroRespostaCorreta;
    private ArrayList<String> lista = new ArrayList<>();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel numroAcertosLabel;
    private javax.swing.JTextArea perguntaTextArea;
    private javax.swing.JButton pular1Button;
    private javax.swing.JButton pular2Button;
    private javax.swing.JButton pular3Button;
    private javax.swing.JButton resposta1Button;
    private javax.swing.JButton resposta2Button;
    private javax.swing.JButton resposta3Button;
    private javax.swing.JButton resposta4Button;
    // End of variables declaration//GEN-END:variables
}
