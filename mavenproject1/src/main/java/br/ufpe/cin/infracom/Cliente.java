package br.ufpe.cin.infracom;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.BindException;
import java.net.ConnectException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
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

    private long getWebTime(String address) {
        try {
            NTPUDPClient client = new NTPUDPClient();
            client.open();
            client.setDefaultTimeout(500);
            client.setSoTimeout(500);
            InetAddress inetAddress = InetAddress.getByName(this.a);
            //Log.debug("start ask time....");
            TimeInfo timeInfo = client.getTime(inetAddress);
            //Log.debug("done!");
            System.out.println(timeInfo.getMessage().getTransmitTimeStamp().getTime());
            return timeInfo.getMessage().getTransmitTimeStamp().getTime();
        } catch (Exception e) {
            System.out.println("Erro " + e);
            return 0L;
        }
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
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        resumoOpcoesLabel = new javax.swing.JLabel();
        bytesEnviadosLabel = new javax.swing.JLabel();
        bytesRecebidosLabel = new javax.swing.JLabel();
        taxaTransLabel = new javax.swing.JLabel();
        perdaPacotesLabel = new javax.swing.JLabel();
        jitterLabel = new javax.swing.JLabel();

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

        jLabel6.setText("Escolha uma dessas opÃ§Ãµes*:");

        jLabel7.setText("NÂº pacotes a serem enviados:");

        jLabel8.setText("Total de bytes a serem enviados:");

        jLabel9.setText("DuraÃ§Ã£o do teste em segundos:");

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

        jLabel10.setText("Resultados do teste:");

        jLabel11.setText("Resumo das opÃ§Ãµes:");

        jLabel12.setText("Bytes Enviados:");

        jLabel13.setText("Bytes recebidos:");

        jLabel14.setText("Taxa de transferÃªncia:");

        jLabel15.setText("% da perda de pacotes:");

        jLabel16.setText("Jitter:");

        resumoOpcoesLabel.setText("O cliente escolheu a opÃ§Ã£o");

        bytesEnviadosLabel.setText("Foram enviados");

        bytesRecebidosLabel.setText("Foram recebidos");

        taxaTransLabel.setText("Resultado da taxa de trans");

        perdaPacotesLabel.setText("Igual a");

        jitterLabel.setText("mÃ©tricas do jitter");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(portaDestino, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                            .addComponent(ipDestino)))
                    .addComponent(jLabel6)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(portaOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(numPacotes, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(botaoIniciarTeste)
                                    .addComponent(jLabel9)))
                            .addGap(26, 26, 26)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(totalBytes, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(duracaoTeste, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tamanhoMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(perdaPacotesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel10)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(taxaTransLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jitterLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(resumoOpcoesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                            .addComponent(bytesEnviadosLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bytesRecebidosLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(61, 61, 61))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(resumoOpcoesLabel))
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(portaOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(bytesEnviadosLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(portaDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(ipDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(bytesRecebidosLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(taxaTransLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(perdaPacotesLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jitterLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel16)
                                .addComponent(tamanhoMsg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
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
                    .addComponent(duracaoTeste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoIniciarTeste)
                .addContainerGap())
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
        if (this.portaOrigem.getText().isEmpty() || this.tamanhoMsg.getText().isEmpty()
                || this.ipDestino.getText().isEmpty() || this.tamanhoMsg.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Você não digitou as informações necessárias");
        } else {
            if (this.numPacotes.getText().isEmpty() && this.duracaoTeste.getText().isEmpty() && this.totalBytes.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Você não escolheu uma das 3 opções");
            } else {
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

    private void iniciarEnvio() throws UnknownHostException, IOException {
        if (!this.numPacotes.getText().isEmpty()) {
            this.enviarNumPacotes();
        } else if (!this.duracaoTeste.getText().isEmpty()) {
            this.enviarDuracaoTeste();
        } else {
            this.enviarTotalBytes();
        }
    }

    private void enviarNumPacotes() throws SocketException, UnknownHostException, IOException {
        DatagramSocket clientSocket = new DatagramSocket();
        InetAddress ipServidor = InetAddress.getByName(this.ipDestino.getText());
        byte[] enviarDados = new byte[Integer.parseInt(this.tamanhoMsg.getText())];
        int qtePacotes = Integer.parseInt(this.numPacotes.getText()), qte = qtePacotes * Integer.parseInt(this.tamanhoMsg.getText());
        for (int i = 0; i < qtePacotes; i++) {
            if (i == qtePacotes - 1) {
                enviarDados = this.inserirCabecalhoDados(enviarDados, true, 1, qte, qtePacotes, i);
            } else {
                enviarDados = this.inserirCabecalhoDados(enviarDados, false, 1, qte, qtePacotes, i);
            }
            DatagramPacket enviarPacote = new DatagramPacket(enviarDados, enviarDados.length, ipServidor, Integer.parseInt(this.portaDestino.getText()));
            clientSocket.send(enviarPacote);
        }
        clientSocket.close();
    }

    //Testar
    private void enviarDuracaoTeste() throws SocketException, UnknownHostException, IOException {
        boolean temTempo = true;
        DatagramSocket clientSocket = new DatagramSocket();
        InetAddress ipServidor = InetAddress.getByName(this.ipDestino.getText());
        byte[] enviarDados = new byte[Integer.parseInt(this.tamanhoMsg.getText())];
        long tempo = System.currentTimeMillis();
        int duracao = Integer.parseInt(this.duracaoTeste.getText()) * 1000;

        for (int i = 0; temTempo; i++) {
            if ((System.currentTimeMillis() - tempo) >= duracao) {
                temTempo = false;
                enviarDados = this.inserirCabecalhoDados(enviarDados, true, 3, i, Integer.parseInt(this.duracaoTeste.getText()), i);
            } else {
                enviarDados = this.inserirCabecalhoDados(enviarDados, false, 3, i, Integer.parseInt(this.duracaoTeste.getText()), i);
                System.out.println(i);
            }
            DatagramPacket enviarPacote = new DatagramPacket(enviarDados, enviarDados.length, ipServidor, Integer.parseInt(this.portaDestino.getText()));
            clientSocket.send(enviarPacote);
        }

        clientSocket.close();
    }

    //Testar
    private void enviarTotalBytes() throws SocketException, UnknownHostException, IOException {
        int x = (int) Math.ceil(Integer.parseInt(this.totalBytes.getText()) / Integer.parseInt(this.tamanhoMsg.getText()));
        DatagramSocket clientSocket = new DatagramSocket();
        InetAddress ipServidor = InetAddress.getByName(this.ipDestino.getText());
        byte[] enviarDados = new byte[Integer.parseInt(this.tamanhoMsg.getText())];

        for (int i = 0; i < x; i++) {
            if (i == x - 1) {
                enviarDados = this.inserirCabecalhoDados(enviarDados, true, 2, Integer.parseInt(this.totalBytes.getText()), 0, i);
            } else {
                enviarDados = this.inserirCabecalhoDados(enviarDados, false, 2, Integer.parseInt(this.totalBytes.getText()), 0, i);
            }
            DatagramPacket enviarPacote = new DatagramPacket(enviarDados, enviarDados.length, ipServidor, Integer.parseInt(this.portaDestino.getText()));
            clientSocket.send(enviarPacote);
        }
        clientSocket.close();
    }

    private byte[] inserirCabecalhoDados(byte[] dados, boolean ultimo, int opcao, int qteBytes, int opcaoValor, int numSequencia) {
        byte versao;

        if (ultimo) {
            switch (opcao) {
                case 1:
                    versao = (byte) 0b00010001;
                    break;
                case 2:
                    versao = (byte) 0b00010010;
                    break;
                default:
                    versao = (byte) 0b00010011;
                    break;
            }

        } else {
            switch (opcao) {
                case 1:
                    versao = (byte) 0b00000001;
                    break;
                case 2:
                    versao = (byte) 0b00000010;
                    break;
                default:
                    versao = (byte) 0b00000011;
                    break;
            }
        }
        dados[0] = versao;
        dados[1] = (byte) Math.floor(qteBytes / 255);
        qteBytes = qteBytes % 255;
        dados[2] = (byte) qteBytes;
        dados[3] = (byte) Math.floor(opcaoValor / 255);
        opcaoValor = opcaoValor % 255;
        dados[4] = (byte) opcaoValor;
        dados[5] = (byte) Math.floor(numSequencia / 255);
        numSequencia = numSequencia % 255;
        dados[6] = (byte) numSequencia;

        if (dados[5] == 0 && dados[6] == 0 || dados[5] == 0 && dados[6] == 1) {
            long tempPrimeiro = this.getWebTime(this.a);

            //-----------------------------------------------------------------------------------------------------------------------
            //=====================================================#TODO=============================================================
            //-----------------------------------------------------------------------------------------------------------------------
        }
        int x = Integer.parseInt(this.tamanhoMsg.getText()) - 1;
        dados[x] = -1;
        return dados;
    }

    public static void main(String args[]) throws IOException, InterruptedException {
        //Usar cabeÃ§alho no envio de msgs
        final Cliente cliente = new Cliente();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                cliente.setVisible(true);
            }
        });
        try {
            cliente.tmpSocket = new ServerSocket(3005);
            System.out.println("Aguardando conexão do cliente...");
            cliente.socket = cliente.tmpSocket.accept();

            InputStreamReader entrada = new InputStreamReader(cliente.socket.getInputStream());
            BufferedReader le = new BufferedReader(entrada);
            String resposta = le.readLine();
            System.out.println(resposta);
        } catch (BindException e) {
            System.out.println("Endereço ocupado");
        } catch (Exception e) {
            System.out.println("Erro " + e);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton botaoIniciarTeste;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel bytesEnviadosLabel;
    private javax.swing.JLabel bytesRecebidosLabel;
    private javax.swing.JTextField duracaoTeste;
    private javax.swing.JTextField ipDestino;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JLabel jitterLabel;
    private javax.swing.JTextField numPacotes;
    private javax.swing.JLabel perdaPacotesLabel;
    private javax.swing.JTextField portaDestino;
    private javax.swing.JTextField portaOrigem;
    private javax.swing.JLabel resumoOpcoesLabel;
    private javax.swing.JTextField tamanhoMsg;
    private javax.swing.JLabel taxaTransLabel;
    private javax.swing.JTextField totalBytes;
	String a = "a.st1.ntp.br";
    // End of variables declaration//GEN-END:variables
    ServerSocket tmpSocket;
    Socket socket;
}
