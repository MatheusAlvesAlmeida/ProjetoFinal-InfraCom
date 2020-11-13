package br.ufpe.cin.infracom;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author matheus
 */
public class Cliente extends javax.swing.JFrame {

    public Cliente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTextField6 = new javax.swing.JTextField();
        jDialog1 = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ipDestino = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        botaoIniciarTeste = new javax.swing.JToggleButton();
        portaOrigem = new javax.swing.JTextField();
        tamanhoMsg = new javax.swing.JTextField();
        portaDestino = new javax.swing.JTextField();
        duracaoTeste = new javax.swing.JTextField();
        numPacotes = new javax.swing.JTextField();
        totalBytes = new javax.swing.JTextField();

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Cliente");

        jLabel2.setText("Porta de origem*:");

        jLabel3.setText("Porta de destino*:");

        jLabel4.setText("Tamanho da mensagem (bytes)*:");

        ipDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ipDestinoActionPerformed(evt);
            }
        });

        jLabel5.setText("IP de destino*:");

        jLabel6.setText("Escolha uma dessas opções*:");

        jLabel7.setText("Nº pacotes a serem enviados:");

        jLabel8.setText("Total de bytes a serem enviados:");

        jLabel9.setText("Duração do teste em segundos:");

        botaoIniciarTeste.setText("Iniciar teste");
        botaoIniciarTeste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoIniciarTesteActionPerformed(evt);
            }
        });

        duracaoTeste.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                duracaoTesteKeyPressed(evt);
            }
        });

        numPacotes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                numPacotesKeyPressed(evt);
            }
        });

        totalBytes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                totalBytesKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(portaDestino, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                                    .addComponent(ipDestino)))
                            .addComponent(jLabel6)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(portaOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tamanhoMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(numPacotes, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(totalBytes, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(duracaoTeste, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 270, Short.MAX_VALUE)
                        .addComponent(botaoIniciarTeste)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(portaOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(portaDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(ipDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tamanhoMsg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(numPacotes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(totalBytes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(botaoIniciarTeste)
                    .addComponent(duracaoTeste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void botaoIniciarTesteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoIniciarTesteActionPerformed
        if(this.portaOrigem.getText().isEmpty() || this.tamanhoMsg.getText().isEmpty() || 
                this.ipDestino.getText().isEmpty() || this.tamanhoMsg.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Você não digitou todas as informações necessárias");
        }else{
            if(this.numPacotes.getText().isEmpty() && this.duracaoTeste.getText().isEmpty() && this.totalBytes.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Você não escolheu uma das 3 opções");
            }else{
                try {
                    this.iniciarEnvio();
                } catch (IOException ex) {
                    Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_botaoIniciarTesteActionPerformed

    private void ipDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ipDestinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ipDestinoActionPerformed

    private void numPacotesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numPacotesKeyPressed
        this.duracaoTeste.setText("");
        this.totalBytes.setText("");
    }//GEN-LAST:event_numPacotesKeyPressed

    private void totalBytesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_totalBytesKeyPressed
        this.duracaoTeste.setText("");
        this.numPacotes.setText("");
    }//GEN-LAST:event_totalBytesKeyPressed

    private void duracaoTesteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_duracaoTesteKeyPressed
        this.numPacotes.setText("");
        this.totalBytes.setText("");
    }//GEN-LAST:event_duracaoTesteKeyPressed

    private void iniciarEnvio() throws UnknownHostException, IOException{
        if(!this.numPacotes.getText().isEmpty()){
            this.enviarNumPacotes();
        }else if(!this.duracaoTeste.getText().isEmpty()){
            this.enviarDuracaoTeste();
        }else{
            this.enviarTotalBytes();
        }
    }
    
    private void enviarNumPacotes() throws SocketException, UnknownHostException, IOException{
        DatagramSocket clientSocket = new DatagramSocket();
        InetAddress ipServidor = InetAddress.getByName(this.ipDestino.getText());
        byte[] enviarDados = new byte[Integer.parseInt(this.tamanhoMsg.getText())];
        
        for (int i = 0; i < Integer.parseInt(this.numPacotes.getText()); i++) {
            DatagramPacket enviarPacote = new DatagramPacket(enviarDados, enviarDados.length, ipServidor, Integer.parseInt(this.portaDestino.getText()));
            clientSocket.send(enviarPacote);
        }
        clientSocket.close();
    }
    //Testar
    private void enviarDuracaoTeste() throws SocketException, UnknownHostException, IOException{
        boolean temTempo = true;
        DatagramSocket clientSocket = new DatagramSocket();
        InetAddress ipServidor = InetAddress.getByName(this.ipDestino.getText());
        byte[] enviarDados = new byte[Integer.parseInt(this.tamanhoMsg.getText())];
        long tempo = System.currentTimeMillis();
        
        while (temTempo) {            
            DatagramPacket enviarPacote = new DatagramPacket(enviarDados, enviarDados.length, ipServidor, Integer.parseInt(this.portaDestino.getText()));
            clientSocket.send(enviarPacote);
            if((System.currentTimeMillis() - tempo) >= Integer.parseInt(this.duracaoTeste.getText())){
                temTempo = false;
            }
        }
        clientSocket.close();
    }
    //Testar
    private void enviarTotalBytes() throws SocketException, UnknownHostException, IOException{
        int x = (int) Math.ceil(Integer.parseInt(this.totalBytes.getText()) / Integer.parseInt(this.tamanhoMsg.getText()));
        DatagramSocket clientSocket = new DatagramSocket();
        InetAddress ipServidor = InetAddress.getByName(this.ipDestino.getText());
        byte[] enviarDados = new byte[Integer.parseInt(this.tamanhoMsg.getText())];
        
        for (int i = 0; i < x; i++) {
            DatagramPacket enviarPacote = new DatagramPacket(enviarDados, enviarDados.length, ipServidor, Integer.parseInt(this.portaDestino.getText()));
            clientSocket.send(enviarPacote);
        }
        clientSocket.close();
    }
    
    public static void main(String args[]) {
        //Usar cabeçalho no envio de msgs
        Cliente cliente = new Cliente();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                cliente.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton botaoIniciarTeste;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField duracaoTeste;
    private javax.swing.JTextField ipDestino;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField numPacotes;
    private javax.swing.JTextField portaDestino;
    private javax.swing.JTextField portaOrigem;
    private javax.swing.JTextField tamanhoMsg;
    private javax.swing.JTextField totalBytes;
    // End of variables declaration//GEN-END:variables
    
}
