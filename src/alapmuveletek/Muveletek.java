package alapmuveletek;

public class Muveletek extends javax.swing.JFrame {

    String osztas = "12:4";

    public Muveletek() {
        initComponents();
    }

    private void osztas() {
        lblFeladat.setText(osztas);
    }

    private void ellenorzes() {
        /* osztás */
        btnEllenorzes.setEnabled(true);
        int szam = Integer.parseInt(txtEredmeny.getText());

        if (szam == 3) {
            txtEredmeny.setText("");
            lblValasz.setText("Jó válasz!");
            btnEllenorzes.setEnabled(false);
        } else if (txtEredmeny.getText().isEmpty()) {
            txtEredmeny.setText("");
            lblValasz.setText("Nem adtál meg választ!");
        } else {
            txtEredmeny.setText("");
            lblValasz.setText("Rossz válasz!");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        pnlGyakorlas = new javax.swing.JPanel();
        lblFeladat = new javax.swing.JLabel();
        txtEredmeny = new javax.swing.JTextField();
        btnEllenorzes = new javax.swing.JButton();
        lblValasz = new javax.swing.JLabel();
        btnUj = new javax.swing.JButton();
        btnMegoldas = new javax.swing.JButton();
        pnlStat = new javax.swing.JPanel();
        lblOsszKerdes = new javax.swing.JLabel();
        lblOsszProba = new javax.swing.JLabel();
        lblOsszeadKerdes = new javax.swing.JLabel();
        lblKivonasKerdes = new javax.swing.JLabel();
        lblOsztasProba = new javax.swing.JLabel();
        lblSzorzasKerdes = new javax.swing.JLabel();
        lblOsszeadProba = new javax.swing.JLabel();
        lblKivonasProba = new javax.swing.JLabel();
        lbOsztasKerdes = new javax.swing.JLabel();
        lblEredmeny = new javax.swing.JLabel();
        lblSzorzasProba = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuFajl = new javax.swing.JMenu();
        menuFajlMegnyit = new javax.swing.JMenuItem();
        menuFajlMent = new javax.swing.JMenuItem();
        menuFajlKilep = new javax.swing.JMenuItem();
        menuMuveletek = new javax.swing.JMenu();
        menuMuveletekOssz = new javax.swing.JRadioButtonMenuItem();
        menuMuveletekKivon = new javax.swing.JRadioButtonMenuItem();
        menuMuveletekOszt = new javax.swing.JRadioButtonMenuItem();
        menuMuveletekSzorz = new javax.swing.JRadioButtonMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Alapműveletek gyakorlás");

        pnlGyakorlas.setBorder(javax.swing.BorderFactory.createTitledBorder("Gyakorlás"));

        lblFeladat.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblFeladat.setText("5 + 12 =");

        btnEllenorzes.setText("Ellenőrzés");
        btnEllenorzes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEllenorzesActionPerformed(evt);
            }
        });

        lblValasz.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblValasz.setText("15 nem jó!");

        javax.swing.GroupLayout pnlGyakorlasLayout = new javax.swing.GroupLayout(pnlGyakorlas);
        pnlGyakorlas.setLayout(pnlGyakorlasLayout);
        pnlGyakorlasLayout.setHorizontalGroup(
            pnlGyakorlasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGyakorlasLayout.createSequentialGroup()
                .addGroup(pnlGyakorlasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlGyakorlasLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lblFeladat, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEredmeny, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEllenorzes))
                    .addGroup(pnlGyakorlasLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(lblValasz, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlGyakorlasLayout.setVerticalGroup(
            pnlGyakorlasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGyakorlasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlGyakorlasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFeladat)
                    .addComponent(txtEredmeny, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEllenorzes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblValasz, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnUj.setText("Új feladat");

        btnMegoldas.setText("Megoldás");

        pnlStat.setBorder(javax.swing.BorderFactory.createTitledBorder("Statisztika"));

        lblOsszKerdes.setText("Össz kérdések száma: 1");

        lblOsszProba.setText("Össz próbálkozások száma: 1");

        lblOsszeadKerdes.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOsszeadKerdes.setText("Összeadás: 1");

        lblKivonasKerdes.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblKivonasKerdes.setText("Kivonás: 0");

        lblOsztasProba.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOsztasProba.setText("Osztás: 0");

        lblSzorzasKerdes.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSzorzasKerdes.setText("Szorzás: 0");

        lblOsszeadProba.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOsszeadProba.setText("Összeadás: 1");

        lblKivonasProba.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblKivonasProba.setText("Kivonás: 0");

        lbOsztasKerdes.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbOsztasKerdes.setText("Osztás: 0");

        lblEredmeny.setText("Eredmény: 0 %");

        lblSzorzasProba.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSzorzasProba.setText("Szorzás: 0");

        javax.swing.GroupLayout pnlStatLayout = new javax.swing.GroupLayout(pnlStat);
        pnlStat.setLayout(pnlStatLayout);
        pnlStatLayout.setHorizontalGroup(
            pnlStatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlStatLayout.createSequentialGroup()
                .addGroup(pnlStatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlStatLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(lblOsszKerdes, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlStatLayout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(pnlStatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblKivonasKerdes, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblOsszeadKerdes, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbOsztasKerdes, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSzorzasKerdes, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlStatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblOsszProba, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlStatLayout.createSequentialGroup()
                        .addGroup(pnlStatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblOsszeadProba, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblKivonasProba, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblOsztasProba, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlStatLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblSzorzasProba, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(pnlStatLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEredmeny, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlStatLayout.setVerticalGroup(
            pnlStatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlStatLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlStatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOsszKerdes)
                    .addComponent(lblOsszProba))
                .addGap(18, 18, 18)
                .addGroup(pnlStatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlStatLayout.createSequentialGroup()
                        .addComponent(lblOsszeadKerdes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblKivonasKerdes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbOsztasKerdes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSzorzasKerdes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addComponent(lblEredmeny))
                    .addGroup(pnlStatLayout.createSequentialGroup()
                        .addComponent(lblOsszeadProba)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblKivonasProba)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblOsztasProba)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSzorzasProba)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        menuFajl.setText("Fájl");

        menuFajlMegnyit.setText("Megnyit");
        menuFajl.add(menuFajlMegnyit);

        menuFajlMent.setText("Ment");
        menuFajl.add(menuFajlMent);

        menuFajlKilep.setText("Kilép");
        menuFajl.add(menuFajlKilep);

        jMenuBar1.add(menuFajl);

        menuMuveletek.setText("Műveletek");

        buttonGroup1.add(menuMuveletekOssz);
        menuMuveletekOssz.setText("Összeadás");
        menuMuveletek.add(menuMuveletekOssz);

        buttonGroup1.add(menuMuveletekKivon);
        menuMuveletekKivon.setText("Kivonás");
        menuMuveletek.add(menuMuveletekKivon);

        buttonGroup1.add(menuMuveletekOszt);
        menuMuveletekOszt.setText("Osztás");
        menuMuveletekOszt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMuveletekOsztActionPerformed(evt);
            }
        });
        menuMuveletek.add(menuMuveletekOszt);

        buttonGroup1.add(menuMuveletekSzorz);
        menuMuveletekSzorz.setText("Szorzás");
        menuMuveletek.add(menuMuveletekSzorz);

        jMenuBar1.add(menuMuveletek);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlGyakorlas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnUj)
                            .addComponent(btnMegoldas)))
                    .addComponent(pnlStat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnUj)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMegoldas))
                    .addComponent(pnlGyakorlas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlStat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuMuveletekOsztActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMuveletekOsztActionPerformed
        osztas();
    }//GEN-LAST:event_menuMuveletekOsztActionPerformed

    private void btnEllenorzesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEllenorzesActionPerformed
        ellenorzes();
    }//GEN-LAST:event_btnEllenorzesActionPerformed

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
            java.util.logging.Logger.getLogger(Muveletek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Muveletek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Muveletek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Muveletek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Muveletek().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEllenorzes;
    private javax.swing.JButton btnMegoldas;
    private javax.swing.JButton btnUj;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lbOsztasKerdes;
    private javax.swing.JLabel lblEredmeny;
    private javax.swing.JLabel lblFeladat;
    private javax.swing.JLabel lblKivonasKerdes;
    private javax.swing.JLabel lblKivonasProba;
    private javax.swing.JLabel lblOsszKerdes;
    private javax.swing.JLabel lblOsszProba;
    private javax.swing.JLabel lblOsszeadKerdes;
    private javax.swing.JLabel lblOsszeadProba;
    private javax.swing.JLabel lblOsztasProba;
    private javax.swing.JLabel lblSzorzasKerdes;
    private javax.swing.JLabel lblSzorzasProba;
    private javax.swing.JLabel lblValasz;
    private javax.swing.JMenu menuFajl;
    private javax.swing.JMenuItem menuFajlKilep;
    private javax.swing.JMenuItem menuFajlMegnyit;
    private javax.swing.JMenuItem menuFajlMent;
    private javax.swing.JMenu menuMuveletek;
    private javax.swing.JRadioButtonMenuItem menuMuveletekKivon;
    private javax.swing.JRadioButtonMenuItem menuMuveletekOssz;
    private javax.swing.JRadioButtonMenuItem menuMuveletekOszt;
    private javax.swing.JRadioButtonMenuItem menuMuveletekSzorz;
    private javax.swing.JPanel pnlGyakorlas;
    private javax.swing.JPanel pnlStat;
    private javax.swing.JTextField txtEredmeny;
    // End of variables declaration//GEN-END:variables
}
