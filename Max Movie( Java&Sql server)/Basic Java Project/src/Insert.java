import java.io.*;
import java.net.*;
import java.awt.*;
import javax.swing.*;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author M_M NYEMBO'S
 */
public class Insert extends javax.swing.JFrame {
     static Search search = new Search();
     static BufferedReader br;
     static PrintWriter pw;

    public Insert(JLabel LogomovieMaxx, JButton jBinsert, JLabel jLabel1, JLabel jLabel2, JLabel jLabel3, JLabel jLabel4, JPanel jPanel1, JScrollPane jScrollPane1, JTextField jTextField1, JTextField jTextField2, JTextField jTextField3) throws HeadlessException {
        this.jLogomovieMaxx = LogomovieMaxx;
        this.jBinsert = jBinsert;
        this.jLmoviD = jLabel1;
        this.jLmovieDesc = jLabel2;
        this.jLmovieName = jLabel3;
        this.jLgenreID = jLabel4;
        this.jPanel1 = jPanel1;
        this.jScrollPane1 = jScrollPane1;
        this.jTid = jTextField1;
        this.jTname = jTextField2;
        this.jTgenreId = jTextField3;
    }
     
    public Insert() {
        initComponents();
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
        jLogomovieMaxx = new javax.swing.JLabel();
        jLmoviD = new javax.swing.JLabel();
        jLmovieDesc = new javax.swing.JLabel();
        jLmovieName = new javax.swing.JLabel();
        jLgenreID = new javax.swing.JLabel();
        jTid = new javax.swing.JTextField();
        jTname = new javax.swing.JTextField();
        jTgenreId = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAdesc = new javax.swing.JTextArea();
        jBinsert = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(2, 29, 55));
        setFocusable(false);

        jPanel1.setBackground(new java.awt.Color(2, 29, 55));

        jLogomovieMaxx.setIcon(new javax.swing.ImageIcon("C:\\Users\\M_M NYEMBO'S\\OneDrive\\Desktop\\free-vector-movie-max_066186_movie-max.png")); // NOI18N
        jLogomovieMaxx.setToolTipText("Welcome, Please login and Enjoy !");

        jLmoviD.setFont(new java.awt.Font("Lucida Sans", 0, 16)); // NOI18N
        jLmoviD.setForeground(new java.awt.Color(255, 255, 255));
        jLmoviD.setText("Movie ID");

        jLmovieDesc.setFont(new java.awt.Font("Lucida Sans", 0, 16)); // NOI18N
        jLmovieDesc.setForeground(new java.awt.Color(255, 255, 255));
        jLmovieDesc.setText("Movie Description");

        jLmovieName.setFont(new java.awt.Font("Lucida Sans", 0, 16)); // NOI18N
        jLmovieName.setForeground(new java.awt.Color(255, 255, 255));
        jLmovieName.setText("Movie name");

        jLgenreID.setFont(new java.awt.Font("Lucida Sans", 0, 16)); // NOI18N
        jLgenreID.setForeground(new java.awt.Color(255, 255, 255));
        jLgenreID.setText("Genre ID");

        jTid.setBackground(new java.awt.Color(2, 29, 55));
        jTid.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        jTid.setForeground(new java.awt.Color(255, 255, 255));
        jTid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jTname.setBackground(new java.awt.Color(2, 29, 55));
        jTname.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        jTname.setForeground(new java.awt.Color(255, 255, 255));
        jTname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jTname.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTnameActionPerformed(evt);
            }
        });

        jTgenreId.setBackground(new java.awt.Color(2, 29, 55));
        jTgenreId.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        jTgenreId.setForeground(new java.awt.Color(255, 255, 255));
        jTgenreId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jTextAdesc.setBackground(new java.awt.Color(23, 62, 99));
        jTextAdesc.setColumns(20);
        jTextAdesc.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jTextAdesc.setForeground(new java.awt.Color(255, 255, 255));
        jTextAdesc.setRows(5);
        jTextAdesc.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createEtchedBorder()));
        jScrollPane1.setViewportView(jTextAdesc);

        jBinsert.setBackground(new java.awt.Color(224, 120, 64));
        jBinsert.setFont(new java.awt.Font("Lucida Sans", 0, 16)); // NOI18N
        jBinsert.setForeground(new java.awt.Color(255, 255, 255));
        jBinsert.setText("Insert");
        jBinsert.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBinsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBinsertActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLmovieName)
                            .addComponent(jLmoviD))
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTname, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTid, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLgenreID)
                            .addComponent(jLmovieDesc))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTgenreId, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))
                        .addContainerGap(231, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLogomovieMaxx, javax.swing.GroupLayout.PREFERRED_SIZE, 706, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jBinsert, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(356, 356, 356))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTid, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLmoviD))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLmovieName)
                    .addComponent(jTname, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLmovieDesc)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTgenreId, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLgenreID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBinsert)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLogomovieMaxx, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTnameActionPerformed

    private void jBinsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBinsertActionPerformed
     String movieID = jTid.getText();
     String movieName = jTname.getText();
     String movieDesc = jTextAdesc.getText();
     String genreMovieID = jTgenreId.getText();
     String mg;
     mg = movieID + ", " + movieName + ", " + movieDesc + ", " + genreMovieID;
     Send(mg);
    }//GEN-LAST:event_jBinsertActionPerformed

    /**
     * @param args the command line arguments
     */
        private void Send(String mg) {
       try{
        pw = new PrintWriter(search.soc.getOutputStream(), true);
        String server;
        if(mg != null){
            jTextAdesc.setText("Client: " + mg);
            pw.println("Add: " + mg);
        }
       }catch(IOException e){
           System.out.println(e.toString());
       }
    }
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
            java.util.logging.Logger.getLogger(Insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Insert().setVisible(true);
            }
        });
        try{
            br = new BufferedReader(new InputStreamReader(search.soc.getInputStream()));
            
            String mg;
            String server;
            
            while ((server = br.readLine()) != null){
                mg = server.toString();
             try{
                 JOptionPane.showMessageDialog(null, mg);
                 jTextAdesc.setText(mg);
                }catch(NullPointerException e){
                    System.out.println(e.toString());
                }if(server == ("exit")){
                    break;
            }
        }
    }catch(IOException e){
            System.out.println(e.toString());
    }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBinsert;
    private javax.swing.JLabel jLgenreID;
    private javax.swing.JLabel jLmoviD;
    private javax.swing.JLabel jLmovieDesc;
    private javax.swing.JLabel jLmovieName;
    private javax.swing.JLabel jLogomovieMaxx;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTextArea jTextAdesc;
    private javax.swing.JTextField jTgenreId;
    private javax.swing.JTextField jTid;
    private javax.swing.JTextField jTname;
    // End of variables declaration//GEN-END:variables
      }