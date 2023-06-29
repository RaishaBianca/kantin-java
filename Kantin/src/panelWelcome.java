public class panelWelcome extends javax.swing.JFrame{
    private javax.swing.JButton btnClo;
    private javax.swing.JButton btnNex;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel lblWel;
    private void create_components() {
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        lblWel = new javax.swing.JLabel();
        btnClo = new javax.swing.JButton();
        btnNex = new javax.swing.JButton();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblWel.setFont(new java.awt.Font("Consolas", 0, 48)); // NOI18N
        lblWel.setText("Welcome!");

        btnClo.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        btnClo.setText("Close");
        btnClo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloActionPerformed(evt);
            }
        });

        btnNex.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        btnNex.setText("Next");
        btnNex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNexActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(btnClo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnNex)
                                .addGap(57, 57, 57))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(180, 180, 180)
                                .addComponent(lblWel)
                                .addContainerGap(198, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(lblWel)
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnClo)
                                        .addComponent(btnNex))
                                .addContainerGap(110, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    private void btnCloActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }


    private void btnNexActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new panelAntrian().setVisible(true);
            }
        });
    }

    public panelWelcome() {
        create_components();
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(panelWelcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(panelWelcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(panelWelcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(panelWelcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

}
