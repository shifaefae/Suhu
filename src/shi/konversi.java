package shi;
public class konversi extends javax.swing.JFrame {
    public konversi() {
        initComponents();
        reset();
    }
    void reset(){
        tSuhuAsal.setText(null);
        vHasil.setText(null);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bKonversi = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tSuhuAsal = new javax.swing.JTextField();
        tSkalaAsal = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        tSkalaTujuan = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        a = new javax.swing.JPanel();
        vHasil = new javax.swing.JLabel();
        bReset = new javax.swing.JButton();
        bClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bKonversi.setBorder(javax.swing.BorderFactory.createTitledBorder("Suhu Asal"));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("KONVERSI SUHU");

        jLabel2.setText("Suhu Asal");

        tSkalaAsal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celcius", "Kelvin", "Fahrenheit", " " }));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Konversi ke"));

        tSkalaTujuan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celcius", "Kelvin", "Fahrenheit", " " }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addComponent(tSkalaTujuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tSkalaTujuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        jButton1.setText("Konversi");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        a.setBorder(javax.swing.BorderFactory.createTitledBorder("Hasil"));

        vHasil.setText("jLabel3");

        javax.swing.GroupLayout aLayout = new javax.swing.GroupLayout(a);
        a.setLayout(aLayout);
        aLayout.setHorizontalGroup(
            aLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(vHasil)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        aLayout.setVerticalGroup(
            aLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aLayout.createSequentialGroup()
                .addComponent(vHasil)
                .addGap(0, 36, Short.MAX_VALUE))
        );

        bReset.setText("Reset");
        bReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bResetActionPerformed(evt);
            }
        });

        bClose.setText("Close");
        bClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bKonversiLayout = new javax.swing.GroupLayout(bKonversi);
        bKonversi.setLayout(bKonversiLayout);
        bKonversiLayout.setHorizontalGroup(
            bKonversiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bKonversiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(38, 38, 38)
                .addGroup(bKonversiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bKonversiLayout.createSequentialGroup()
                        .addComponent(bReset)
                        .addGap(18, 18, 18)
                        .addComponent(bClose))
                    .addComponent(jButton1)
                    .addComponent(jLabel1)
                    .addGroup(bKonversiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(tSkalaAsal, javax.swing.GroupLayout.Alignment.LEADING, 0, 129, Short.MAX_VALUE)
                        .addComponent(tSuhuAsal, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(bKonversiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(a, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        bKonversiLayout.setVerticalGroup(
            bKonversiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bKonversiLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(23, 23, 23)
                .addGroup(bKonversiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tSuhuAsal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tSkalaAsal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(bKonversiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bReset)
                    .addComponent(bClose))
                .addGap(0, 197, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(bKonversi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bKonversi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bResetActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_bResetActionPerformed

    private void bCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCloseActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_bCloseActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        double suhu_asal = Double.parseDouble(tSuhuAsal.getText());
        String skala_asal = tSkalaAsal.getSelectedItem().toString();
        String skala_tujuan = tSkalaTujuan.getSelectedItem().toString();
        double hasil = 0;
        if(skala_asal.equals("Celcius")&&skala_tujuan.equals("Celcius")){
            hasil = suhu_asal;
            
        }else if (skala_asal.equals("Celcius")&&skala_tujuan.equals("Kelvin")){
            hasil = suhu_asal + 273.15;
            
        }else if (skala_asal.equals("Celcius")&&skala_tujuan.equals("Fahrenheit")){
            hasil =(suhu_asal*9/5)+32;
            
        }else if (skala_asal.equals("Kelvin")&&skala_tujuan.equals("Celcius")){
            hasil = suhu_asal - 273.15;
            
        }else if (skala_asal.equals("Kelvin")&&skala_tujuan.equals("Kelvin")){
            hasil = suhu_asal;
            
        }else if (skala_asal.equals("Kelvin")&&skala_tujuan.equals("Fahrenheit")){
            hasil = (suhu_asal - 273.15)*9/5+32;
            
        }else if (skala_asal.equals("Fahrenheit")&&skala_tujuan.equals("Celcius")){
            hasil =(suhu_asal - 32)*5/9;
            
        }else if (skala_asal.equals("Fahrenheit")&&skala_tujuan.equals("Kelvin")){
            hasil =(suhu_asal - 32)*5/9 +273.15;
            
        }else if (skala_asal.equals("Fahrenheit")&&skala_tujuan.equals("Fahrenheit")){
            hasil =suhu_asal;
            
        }
        String skala = skala_tujuan.substring(0,1);
        vHasil.setText(String.format("%.2f",hasil)+"\u00B0"+skala);
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new konversi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel a;
    private javax.swing.JButton bClose;
    private javax.swing.JPanel bKonversi;
    private javax.swing.JButton bReset;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> tSkalaAsal;
    private javax.swing.JComboBox<String> tSkalaTujuan;
    private javax.swing.JTextField tSuhuAsal;
    private javax.swing.JLabel vHasil;
    // End of variables declaration//GEN-END:variables
}
