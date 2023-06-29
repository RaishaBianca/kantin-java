

import java.text.DecimalFormat;

public class panelMenu extends javax.swing.JFrame {
    private void create_components() {

        btnEnt2 = new javax.swing.JButton();
        foodDimsum = new javax.swing.JCheckBox();
        foodChicken = new javax.swing.JCheckBox();
        foodRoti = new javax.swing.JCheckBox();
        foodKetoprak = new javax.swing.JCheckBox();
        drinkAlpukat = new javax.swing.JCheckBox();
        drinkAqua = new javax.swing.JCheckBox();
        drinkPopice = new javax.swing.JCheckBox();
        drinkCoffee = new javax.swing.JCheckBox();
        textSub = new javax.swing.JScrollPane();
        txtSub = new javax.swing.JTextPane();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnEnt = new javax.swing.JButton();
        btnCle = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnEnt1 = new javax.swing.JButton();
        btnEnt3 = new javax.swing.JButton();
        txtTax = new javax.swing.JScrollPane();
        txtTot = new javax.swing.JTextPane();
        textSub1 = new javax.swing.JScrollPane();
        txtPajak = new javax.swing.JTextPane();


        btnEnt2.setFont(new java.awt.Font("Consolas", 0, 10)); // NOI18N
        btnEnt2.setText("Close");
        btnEnt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnt2ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        foodDimsum.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        foodDimsum.setText("Dimsum 10k");
        foodDimsum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foodDimsumActionPerformed(evt);
            }
        });

        foodChicken.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        foodChicken.setText("Nasi Chicken Katsu 20k");
        foodChicken.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foodChickenActionPerformed(evt);
            }
        });

        foodRoti.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        foodRoti.setText("Roti Bakar 10k");
        foodRoti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foodRotiActionPerformed(evt);
            }
        });

        foodKetoprak.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        foodKetoprak.setText("Ketoprak 15k");
        foodKetoprak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foodKetoprakActionPerformed(evt);
            }
        });

        drinkAlpukat.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        drinkAlpukat.setText("Jus Alpukat 10k");

        drinkAqua.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        drinkAqua.setText("Aqua 5k");
        drinkAqua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drinkAquaActionPerformed(evt);
            }
        });

        drinkPopice.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        drinkPopice.setText("Pop Ice 5k");

        drinkCoffee.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        drinkCoffee.setText("Iced Coffee 5k");
        drinkCoffee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drinkCoffeeActionPerformed(evt);
            }
        });

        textSub.setViewportView(txtSub);

        jLabel5.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel5.setText("SubTotal");

        jLabel3.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel3.setText("Pajak");

        jLabel4.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel4.setText("Total");

        btnEnt.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        btnEnt.setText("Enter");
        btnEnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntActionPerformed(evt);
            }
        });

        btnCle.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        btnCle.setText("Clear");
        btnCle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCleActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel1.setText("Menu");

        btnEnt1.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        btnEnt1.setText("Close");
        btnEnt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnt1ActionPerformed(evt);
            }
        });

        btnEnt3.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        btnEnt3.setText("Next");
        btnEnt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnt3ActionPerformed(evt);
            }
        });

        txtTax.setViewportView(txtTot);

        textSub1.setViewportView(txtPajak);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(foodDimsum)
                                                        .addComponent(foodRoti)
                                                        .addComponent(foodKetoprak)
                                                        .addComponent(foodChicken))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(drinkPopice)
                                                        .addComponent(drinkAqua)
                                                        .addComponent(drinkCoffee)
                                                        .addComponent(drinkAlpukat)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(btnEnt)
                                                        .addComponent(btnCle))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addComponent(jLabel5)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(textSub, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addComponent(jLabel4)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(txtTax, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addComponent(jLabel3)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(textSub1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                                .addGap(233, 233, 233)
                                .addComponent(btnEnt1)
                                .addGap(18, 18, 18)
                                .addComponent(btnEnt3)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(219, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(83, 83, 83))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(foodChicken)
                                        .addComponent(drinkAqua))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(drinkPopice)
                                        .addComponent(foodRoti))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(drinkCoffee)
                                        .addComponent(foodDimsum))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(drinkAlpukat)
                                        .addComponent(foodKetoprak))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(65, 65, 65)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(btnEnt1)
                                                                        .addComponent(btnEnt3))
                                                                .addContainerGap())
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(5, 5, 5)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jLabel4)
                                                                        .addComponent(txtTax, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addContainerGap(131, Short.MAX_VALUE))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(textSub, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel5))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(12, 12, 12)
                                                                .addComponent(textSub1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jLabel3)))
                                                .addContainerGap())
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(14, 14, 14)
                                                .addComponent(btnEnt)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnCle)
                                                .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>

    private void foodDimsumActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void foodChickenActionPerformed(java.awt.event.ActionEvent evt) {
        //selects coffee option
    }

    private void foodRotiActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void foodKetoprakActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void drinkAquActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void drinkCofActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void drinkAquaActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void drinkCoffeeActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnEntActionPerformed(java.awt.event.ActionEvent evt) {

        DecimalFormat df = new DecimalFormat("0.00");
        double total;
        double subtotal = 0;
        final double TAXRATE = .08;
        double tax;

        if(foodChicken.isSelected()) {
            subtotal = subtotal + 20000;
        }if (foodRoti.isSelected()) {
            subtotal = subtotal + 10000;
        }if (foodDimsum.isSelected()) {
            subtotal = subtotal + 10000;}
        if (foodKetoprak.isSelected()) {
            subtotal = subtotal + 15000;}


        if(drinkAqua.isSelected()) {
            subtotal = subtotal + 5000;
        }if (drinkPopice.isSelected()){
            subtotal = subtotal + 5000;
        }if(drinkCoffee.isSelected()) {
            subtotal = subtotal + 5000;
        }if (drinkAlpukat.isSelected())
            subtotal = subtotal + 10000;

        txtSub.setText(Double.toString(subtotal));
        subtotal = Double.parseDouble(txtSub.getText());

        tax = subtotal*TAXRATE;
        total = tax + subtotal;

        txtPajak.setText(Double.toString(tax));
        txtTot.setText(Double.toString(total));
        txtPajak.setText(df.format(tax));
        txtTot.setText(df.format(total));
        txtSub.setText(df.format(subtotal));

    }

    private void btnCleActionPerformed(java.awt.event.ActionEvent evt) {
        // Clears all Fields
        foodChicken.setSelected(false);
        foodDimsum.setSelected(false);
        foodRoti.setSelected(false);
        foodKetoprak.setSelected(false);
        drinkAqua.setSelected(false);
        drinkPopice.setSelected(false);
        drinkCoffee.setSelected(false);
        drinkAlpukat.setSelected(false);
//        txtTot.isEnabled()(false);
//        txtPajak.isEnabled(false);
//        txtSub.isEnabled(false);
        txtTot.setText("");
        txtPajak.setText("");
        txtSub.setText("");
    }

    private void btnEnt1ActionPerformed(java.awt.event.ActionEvent evt) {
        // exit JFrame
        System.exit(0);
    }

    private void btnEnt2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnEnt3ActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run() {
                new panelPembayaran().setVisible(true);
            }
        });
    }

    public panelMenu() {
        dispose();
        create_components();
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(panelMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(panelMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(panelMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(panelMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    private javax.swing.JButton btnCle;
    private javax.swing.JButton btnEnt;
    private javax.swing.JButton btnEnt1;
    private javax.swing.JButton btnEnt2;
    private javax.swing.JButton btnEnt3;
    private javax.swing.JCheckBox drinkAlpukat;
    private javax.swing.JCheckBox drinkAqua;
    private javax.swing.JCheckBox drinkCoffee;
    private javax.swing.JCheckBox drinkPopice;
    private javax.swing.JCheckBox foodChicken;
    private javax.swing.JCheckBox foodDimsum;
    private javax.swing.JCheckBox foodKetoprak;
    private javax.swing.JCheckBox foodRoti;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane textSub;
    private javax.swing.JScrollPane textSub1;
    private javax.swing.JTextPane txtPajak;
    private javax.swing.JTextPane txtSub;
    private javax.swing.JScrollPane txtTax;
    private javax.swing.JTextPane txtTot;
}
