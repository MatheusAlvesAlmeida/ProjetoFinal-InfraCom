package br.ufpe.cin.infracom;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ConnectException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.Arrays;

/**
 *
 * @author matheus
 */
public class Servidor extends javax.swing.JFrame {
   
    public Servidor() throws SocketException, IOException {
        this.serverSocketUDP = new DatagramSocket(this.porta);
        this.receberDados = new byte[1000];
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        resumoOpcoes = new javax.swing.JLabel();
        bytesEnviados = new javax.swing.JLabel();
        bytesRecebidos = new javax.swing.JLabel();
        taxaTrans = new javax.swing.JLabel();
        perdaPacotes = new javax.swing.JLabel();
        jitter = new javax.swing.JLabel();
        bytesEnviadosLabel = new javax.swing.JLabel();
        taxaTransLabel = new javax.swing.JLabel();
        resumoOpcoesLabel = new javax.swing.JLabel();
        bytesRecebidosLabel = new javax.swing.JLabel();
        perdaPacotesLabel = new javax.swing.JLabel();
        jitterLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Informações da avaliação");

        resumoOpcoes.setText("Resumo das opções");

        bytesEnviados.setText("Bytes enviados");

        bytesRecebidos.setText("Bytes recebidos");

        taxaTrans.setText("Taxa de transferência");

        perdaPacotes.setText("% de perda de pacotes");

        jitter.setText("Jitter");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(resumoOpcoes)
                            .addComponent(taxaTrans)
                            .addComponent(perdaPacotes)
                            .addComponent(resumoOpcoesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
                            .addComponent(perdaPacotesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(taxaTransLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bytesEnviadosLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jitter)
                                    .addComponent(bytesRecebidos)
                                    .addComponent(bytesEnviados))
                                .addGap(0, 220, Short.MAX_VALUE))
                            .addComponent(bytesRecebidosLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jitterLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resumoOpcoes)
                    .addComponent(bytesEnviados))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bytesEnviadosLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resumoOpcoesLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bytesRecebidos)
                    .addComponent(taxaTrans))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(taxaTransLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bytesRecebidosLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(perdaPacotes)
                    .addComponent(jitter))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(perdaPacotesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 104, Short.MAX_VALUE))
                    .addComponent(jitterLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    public static void main(String args[]) throws SocketException, IOException {
        Servidor servidor = new Servidor();
        int qntddBytes = 0, opcao = 0, opcaoValor = 0, bitFlag = 0, portaCliente = 0, qteBytesRecebidos = 0, pacotesEnviados = 0, pacotesRecebidos = 0;
        double timeout = 5000;
        double tempAnterior = System.currentTimeMillis(), tempAtual = System.currentTimeMillis();
        int contadorDeJitter = 0;
        double jitterMinimo = Double.MAX_VALUE, jitterMaximo = 0, jitterMedio, somaJitter = 0;
        boolean temDados = false;
        InetAddress enderecoCliente = null;
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                servidor.setVisible(true);
            }
        });
        
        while (bitFlag != 1) {
            DatagramPacket receberPacote = new DatagramPacket(servidor.receberDados, servidor.receberDados.length);
            servidor.serverSocketUDP.receive(receberPacote);
            byte[] pacote = receberPacote.getData();
            qteBytesRecebidos += pacote.length;
            if (!temDados) {
                opcao = pacote[1];
                qntddBytes = pacote[2];
                opcaoValor = pacote[3];
                enderecoCliente = receberPacote.getAddress();
                portaCliente = receberPacote.getPort();
                pacotesEnviados = qntddBytes / pacote.length;
                temDados = true;
            }
            byte cabecalho = pacote[0];
            bitFlag = (cabecalho >> 4) & 1;
            pacotesRecebidos++;
            //Calcular o Jitter
            tempAtual = System.currentTimeMillis();
            double jitter = tempAtual - tempAnterior;
            contadorDeJitter++;
            if (jitter > jitterMaximo) {
                jitterMaximo = jitter;
            }
            if (jitter < jitterMinimo) {
                jitterMinimo = jitter;
            }
            somaJitter = somaJitter + jitter;
            tempAnterior = tempAtual;
            //Fim do cálculo dos jitters min e max. 

            String msgDecode = new String(receberPacote.getData(), "UTF-8");
            System.out.println("Pacote recebido: " + Arrays.toString(pacote));
        }

        if (contadorDeJitter == 1) { //SÓ RECEBEU 1 PACOTE
            jitterMinimo = 0;
            jitterMaximo = 0;
            jitterMedio = 0;
        } else {
            jitterMedio = somaJitter / contadorDeJitter;
        }
        
        String jitterInfo = "Jitter mínimo: " + jitterMinimo + "\n Jitter máximo: " + jitterMaximo + "\n Jitter médio: " + jitterMedio + "";
        String opcoesInfo = "O cliente escolheu a opção " + opcaoValor + "";
        //double perdaPacotesPor = (pacotesRecebidos * 100) / pacotesEnviados;
        servidor.bytesEnviadosLabel.setText(Integer.toString(qntddBytes));
        servidor.jitterLabel.setText(jitterInfo);
        servidor.resumoOpcoesLabel.setText(opcoesInfo);
        servidor.bytesRecebidosLabel.setText(Integer.toString(qteBytesRecebidos));
        //servidor.perdaPacotesLabel.setText(Double.toString(perdaPacotesPor));
        String enviar = "" + opcoesInfo + "#" + Integer.toString(qntddBytes) + "#" + Integer.toString(qteBytesRecebidos) + "#" + jitterInfo;
        try {
            servidor.socket = new Socket("localhost", 3001);
            DataOutputStream saida = new DataOutputStream(servidor.socket.getOutputStream());
            saida.write(enviar.getBytes());
        } catch (ConnectException e) {
            System.out.println("Não foi possível chegar ao destinatário");
        } catch (Exception e) {
            System.out.println("Erro: " + e);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bytesEnviados;
    private javax.swing.JLabel bytesEnviadosLabel;
    private javax.swing.JLabel bytesRecebidos;
    private javax.swing.JLabel bytesRecebidosLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jitter;
    private javax.swing.JLabel jitterLabel;
    private javax.swing.JLabel perdaPacotes;
    private javax.swing.JLabel perdaPacotesLabel;
    private javax.swing.JLabel resumoOpcoes;
    private javax.swing.JLabel resumoOpcoesLabel;
    private javax.swing.JLabel taxaTrans;
    private javax.swing.JLabel taxaTransLabel;
    // End of variables declaration//GEN-END:variables
    DatagramSocket serverSocketUDP;
    Socket socket;
    byte[] receberDados;
    int porta = 3002, portaCliente;
    String ipCliente;
}
