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
import java.net.SocketTimeoutException;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.apache.commons.net.ntp.NTPUDPClient;
import org.apache.commons.net.ntp.TimeInfo;

public class Servidor extends javax.swing.JFrame {

    public Servidor() throws SocketException, IOException {
        this.serverSocketUDP = new DatagramSocket(this.porta);
        this.receberDados = new byte[2000];
        initComponents();
    }

    String a = "a.st1.ntp.br";

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

        jLabel1.setText("InformaÃ§Ãµes da avaliaÃ§Ã£o");

        resumoOpcoes.setText("Resumo das opÃ§Ãµes");

        bytesEnviados.setText("Bytes enviados");

        bytesRecebidos.setText("Bytes recebidos");

        taxaTrans.setText("Taxa de transferÃªncia");

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
        final Servidor servidor = new Servidor();
        int qntddBytes = 0, opcao = 0, opcaoValor = 0, bitFlag = 0, portaCliente = 0, qteBytesRecebidos = 0, pacotesEnviados = 0, pacotesRecebidos = 0, tamMsg = 0;
        double tempAnterior = System.currentTimeMillis(), tempAtual = System.currentTimeMillis();
        int contadorDeJitter = 0, nSeqPacoteAnterior = 0;
        double jitterMinimo = Double.MAX_VALUE, jitterMaximo = 0, jitterMedio, somaJitter = 0;
        boolean temDados = false;
        String ipCliente = "", endereco = "a.st1.ntp.br", tempoSaidaCliente = "";

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                servidor.setVisible(true);
            }
        });

        int conti = 0, p1 = 0, p2 = 0, p3 = 0, p4 = 0, p5 = 0, p6 = 0;

        servidor.serverSocketUDP.setSoTimeout(60000); //set timeout 1 minuto para poder digitar
        while (bitFlag != 1) {
            DatagramPacket receberPacote = new DatagramPacket(servidor.receberDados, servidor.receberDados.length);
            try {
                servidor.serverSocketUDP.receive(receberPacote);
            } catch (SocketTimeoutException e) {
                System.out.println("### Timeout");
                break;
            }

            byte[] pacote = receberPacote.getData();
            if (!temDados) {
                for (int i = 0; i < pacote.length; i++) {
                    if (pacote[i] == -1) {
                        tamMsg = i + 1;
                        i = pacote.length;
                    }
                }
                for (int i = 7; i < 15; i++) {
                	int p = 0;
                	p = (int)pacote[i];
                	tempoSaidaCliente += (char)p;
				}
                temDados = true;
            }

            opcao = pacote[0];

            p1 = (int) pacote[1];
            p2 = (int) pacote[2];
            p3 = (int) pacote[3];
            p4 = (int) pacote[4];
            p5 = (int) pacote[5];
            p6 = (int) pacote[6];

            if (p1 < 0) {
                p1 = p1 + 256;
            }
            if (p2 < 0) {
                p2 = p2 + 256;
            }
            if (p3 < 0) {
                p3 = p3 + 256;
            }
            if (p4 < 0) {
                p4 = p4 + 256;
            }
            if (p5 < 0) {
                p5 = p5 + 256;
            }
            if (p6 < 0) {
                p6 = p6 + 256;
            }

            qntddBytes = p1 + p2;
            opcaoValor = p3 + p4;
            nSeqPacoteAnterior = p5 + p6;

            ipCliente = receberPacote.getAddress().getHostAddress();
            portaCliente = receberPacote.getPort();
            
            System.out.println(qntddBytes + " " + opcaoValor + " " + nSeqPacoteAnterior);
            qteBytesRecebidos += tamMsg;

            byte cabecalho = pacote[0];
            bitFlag = (cabecalho >> 4) & 1;
            pacotesRecebidos++;
            //Calcular o Jitter
            tempAtual = System.currentTimeMillis();
            if (nSeqPacoteAnterior == pacote[4] - 1) {
                System.out.println("Pacote: " + pacote[4]);
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
            }
            //Fim do cÃ¡lculo dos jitters min e max. 

            nSeqPacoteAnterior = (pacote[5] * 255) + pacote[6];
            String msgDecode = new String(receberPacote.getData(), "UTF-8");
            System.out.println("Pacote recebido " + conti + ": " + Arrays.toString(pacote));
            conti++;
            servidor.serverSocketUDP.setSoTimeout(5000); //set timeout pra 5s
        }
        int tempoPrimeiroPacote = Integer.parseInt(tempoSaidaCliente);
        long tempoUltimoPacote = servidor.getWebTime(endereco);
        tempoUltimoPacote = tempoUltimoPacote%100000000;
        int tempoUltimoPacoteint = (int)tempoUltimoPacote;
        double tempoTotal = tempoUltimoPacoteint - tempoPrimeiroPacote;
        tempoTotal = tempoTotal/1000;
        double txTransferencia = qntddBytes/tempoTotal;
        System.out.println("Tempo total: " + tempoTotal);

        if (opcao == 1 || opcao == 17) { //opção: nº de pacotes
            pacotesEnviados = opcaoValor;
            System.out.println("OPCAO 1");
        } else if (opcao == 2 || opcao == 18) { //opção: totalbytes
            pacotesEnviados = (int) Math.ceil(qntddBytes / tamMsg);
            System.out.println("OPCAO 2");
        } else if (opcao == 3 || opcao == 19) { //opção: tempo
            pacotesEnviados = nSeqPacoteAnterior;
            System.out.println("OPCAO 3");
        } else {
            System.out.println("Erro no cálculo de pacotes enviados");
        }

        if (contadorDeJitter == 1) { //SÃ“ RECEBEU 1 PACOTE
            jitterMinimo = 0;
            jitterMaximo = 0;
            jitterMedio = 0;
        } else {
            jitterMedio = somaJitter / contadorDeJitter;
        }

        String jitterInfo = "Jitter mínimo: " + jitterMinimo + "\n Jitter máximo: " + jitterMaximo + "\n Jitter médio: " + jitterMedio + "";
        String opcoesInfo = "O cliente escolheu a opção " + opcaoValor + "";
        int perdaPacotesPor = 100 - (int) Math.floor((pacotesRecebidos * 100) / pacotesEnviados);
        System.out.println(pacotesRecebidos);
        System.out.println(pacotesEnviados);
        System.out.println(perdaPacotesPor + "%");
        servidor.bytesEnviadosLabel.setText(Integer.toString(qntddBytes));
        servidor.jitterLabel.setText(jitterInfo);
        servidor.resumoOpcoesLabel.setText(opcoesInfo);
        servidor.bytesRecebidosLabel.setText(Integer.toString(qteBytesRecebidos));
        servidor.perdaPacotesLabel.setText(Double.toString(perdaPacotesPor));
        String enviar = "" + opcoesInfo + "#" + Integer.toString(qntddBytes) + "#" + Integer.toString(qteBytesRecebidos) + "#" + txTransferencia + "%";
        try {
            servidor.socket = new Socket(ipCliente, 3005);
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
