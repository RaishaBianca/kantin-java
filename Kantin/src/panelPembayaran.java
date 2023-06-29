public class panelPembayaran extends javax.swing.JFrame{
    private javax.swing.JButton jButtonNext;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;

    private void create_components() {
        jLabel1 = new javax.swing.JLabel();
        jButtonNext = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        jLabel1.setText("Ingin Melanjutkan Pembayaran?");

        jButtonNext.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jButtonNext.setText("Yes");
        jButtonNext.addActionListener(
                new java.awt.event.ActionListener() {

                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButtonNextActionPerformed(evt);
                    }
                }
        );

        jButton2.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jButton2.setText("No");
        jButton2.addActionListener(
                new java.awt.event.ActionListener() {

                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton2ActionPerformed(evt);
                    }
                }
        );

        jLabel3.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel3.setText("Do you want continue payment?");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
                getContentPane()
        );
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout
                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(
                                javax.swing.GroupLayout.Alignment.TRAILING,
                                layout
                                        .createSequentialGroup()
                                        .addContainerGap(68, Short.MAX_VALUE)
                                        .addComponent(jLabel1)
                                        .addGap(80, 80, 80)
                        )
                        .addGroup(
                                layout
                                        .createSequentialGroup()
                                        .addGroup(
                                                layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(
                                                                layout
                                                                        .createSequentialGroup()
                                                                        .addGap(140, 140, 140)
                                                                        .addComponent(jButtonNext)
                                                                        .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED
                                                                        )
                                                                        .addComponent(jButton2)
                                                        )
                                                        .addGroup(
                                                                layout
                                                                        .createSequentialGroup()
                                                                        .addGap(89, 89, 89)
                                                                        .addComponent(jLabel3)
                                                        )
                                        )
                                        .addContainerGap(
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                Short.MAX_VALUE
                                        )
                        )
        );
        layout.setVerticalGroup(
                layout
                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(
                                layout
                                        .createSequentialGroup()
                                        .addGap(84, 84, 84)
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel3)
                                        .addGap(39, 39, 39)
                                        .addGroup(
                                                layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jButtonNext)
                                                        .addComponent(jButton2)
                                        )
                                        .addContainerGap(110, Short.MAX_VALUE)
                        )
        );

        pack();
    } // </editor-fold>

    private void jButtonNextActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
        java.awt.EventQueue.invokeLater(
                new Runnable() {
                    public void run() {
                        new panelKodePembayaran().setVisible(true);
                    }
                }
        );
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        // exit JFrame
        System.exit(0);
    }

    public panelPembayaran() {
        create_components();
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java
                    .util.logging.Logger.getLogger(panelPembayaran.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java
                    .util.logging.Logger.getLogger(panelPembayaran.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java
                    .util.logging.Logger.getLogger(panelPembayaran.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java
                    .util.logging.Logger.getLogger(panelPembayaran.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
}
