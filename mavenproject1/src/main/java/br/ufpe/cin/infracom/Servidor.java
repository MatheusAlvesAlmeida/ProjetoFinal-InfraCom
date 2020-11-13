package br.ufpe.cin.infracom;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 *
 * @author matheus
 */
public class Servidor extends javax.swing.JFrame {
   
    public Servidor() throws SocketException {
        this.serverSocket = new DatagramSocket(this.porta);
        this.receberDados = new byte[Integer.MAX_VALUE];
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(resumoOpcoes)
                            .addComponent(taxaTrans)
                            .addComponent(perdaPacotes))
                        .addGap(216, 216, 216)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jitter)
                            .addComponent(bytesRecebidos)
                            .addComponent(bytesEnviados))))
                .addContainerGap(232, Short.MAX_VALUE))
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
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bytesRecebidos)
                    .addComponent(taxaTrans))
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(perdaPacotes)
                    .addComponent(jitter))
                .addContainerGap(175, Short.MAX_VALUE))
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

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                servidor.setVisible(true);
            }
        });
        /**
         * Fazer: cliente enviar os pacotes de acordo com a opção escolhida
         * servidor identificar que os pacotes pararam de chegar
         * Solução pro RTT: adicionar uma info extra com o tempo de saída
         */
        while(true){
            DatagramPacket receberPacote = new DatagramPacket(servidor.receberDados, servidor.receberDados.length);
            servidor.serverSocket.receive(receberPacote);
        }
        /**
         * Fazer: verificar informações e alterar valores dos labels de acordo com elas
         * criar conexão TCP com o cliente e realizar a troca de informações
         */
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bytesEnviados;
    private javax.swing.JLabel bytesRecebidos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jitter;
    private javax.swing.JLabel perdaPacotes;
    private javax.swing.JLabel resumoOpcoes;
    private javax.swing.JLabel taxaTrans;
    // End of variables declaration//GEN-END:variables
    DatagramSocket serverSocket;
    byte[] receberDados;
    int porta = 3002;
    String ip;
}
