package currencyconverter;

import java.awt.Color;
import java.util.HashMap;

public class CurrenyConverter extends javax.swing.JFrame {
    
   //created a hash map to store rate of currencies 
    private final HashMap<String , Double> rates=new HashMap<>();
    
    public CurrenyConverter() {
        initComponents();
        
        // adding rates with its currencies into the hash map
        rates.put("USD",1.0);
        rates.put("INR",83.0);
        rates.put("EUR",0.92);
        rates.put("JPY",155.0);
        rates.put("GBP",0.79);
        rates.put("AUD",1.50);
        rates.put("CAD",1.36);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        target = new javax.swing.JComboBox<>();
        base = new javax.swing.JComboBox<>();
        amount = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        resultPanel = new javax.swing.JPanel();
        lblrs = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 631, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Bodoni MT", 3, 36)); // NOI18N
        jLabel1.setText("Currency Converter");

        jLabel2.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jLabel2.setText("Name of Target Currency :");

        jLabel3.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jLabel3.setText("Amount :");

        jLabel4.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jLabel4.setText("Name of Base Currency :");

        target.setBackground(new java.awt.Color(0, 0, 0));
        target.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        target.setForeground(new java.awt.Color(255, 255, 255));
        target.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Currency", "USD", "INR", "EUR", "JPY", "GBP", "AUD", "CAD      ", " " }));
        target.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                targetActionPerformed(evt);
            }
        });

        base.setBackground(new java.awt.Color(0, 0, 0));
        base.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        base.setForeground(new java.awt.Color(255, 255, 255));
        base.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Currency", "USD", "INR", "EUR", "JPY", "GBP", "AUD", "CAD      ", " " }));
        base.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baseActionPerformed(evt);
            }
        });

        amount.setBackground(new java.awt.Color(102, 102, 102));
        amount.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Bodoni MT", 2, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Convert");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        resultPanel.setBackground(new java.awt.Color(255, 255, 255));

        lblrs.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        lblrs.setForeground(new java.awt.Color(255, 255, 255));
        lblrs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout resultPanelLayout = new javax.swing.GroupLayout(resultPanel);
        resultPanel.setLayout(resultPanelLayout);
        resultPanelLayout.setHorizontalGroup(
            resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblrs, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
                .addContainerGap())
        );
        resultPanelLayout.setVerticalGroup(
            resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblrs, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
        );

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Bodoni MT", 2, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(64, 64, 64)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(target, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(base, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(resultPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(base, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(target, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(resultPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void targetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_targetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_targetActionPerformed

    private void baseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_baseActionPerformed

    private void amountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amountActionPerformed
     

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    try{
            resultPanel.setVisible(true);
            resultPanel.setBackground(Color.BLACK);
            lblrs.setForeground(Color.white);   
            //to get the selected item  from both combo box and to get content from the text field
            String baseC=(String) base.getSelectedItem().toString();  
            String targetC=(String)target.getSelectedItem().toString();
            double amtA=Double.parseDouble(amount.getText());
            double amtB;
            //to get the rates of the selected item
            double Base=rates.get(baseC);
            double Target=rates.get(targetC);
            double usdAmt= amtA / Base;
            amtB=usdAmt * Target;        //to calculate the converted amount
            double rounded = Math.round(amtB * 100.0) / 100.0;        //to round off the amtB
           if (targetC.equals("Select Currency") || baseC.equals("Select Currency")){    
                lblrs.setText("Please select a currency!!!");
            }
            else{
                if (targetC=="USD"){
                lblrs.setText("Your converted amount is: "+rounded+" Dollars");
                }
                else if(targetC=="INR"){
                    lblrs.setText("Your converted amount is: "+rounded+" Rupees");
               }
                else if(targetC=="EUR"){
                    lblrs.setText("Your converted amount is: "+rounded+" Euro");  
                }
                else if(targetC=="JPY"){
                    lblrs.setText("Your converted amount is: "+rounded+" Yen");
                }
                else if(targetC=="GBP"){
                    lblrs.setText("Your converted amount is: "+rounded+" Pounds");
                }
                else if(targetC=="AUD"){
                    lblrs.setText("Your converted amount is: "+rounded+" Australian Dollars");
                }
                else{
                    lblrs.setText("Your converted amount is: "+rounded+" Canadian Dollars");
                } 
            }
            
        }
        catch(NumberFormatException e){
            lblrs.setText("Please enter a valid Amount!!!");
            lblrs.setForeground(Color.red);
            resultPanel.setBackground(Color.white);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //to clear the text field and uncheck the combo box
        amount.setText("");
        base.setSelectedIndex(0);
        target.setSelectedIndex(0);
        resultPanel.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(CurrenyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CurrenyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CurrenyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CurrenyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CurrenyConverter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amount;
    private javax.swing.JComboBox<String> base;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblrs;
    private javax.swing.JPanel resultPanel;
    private javax.swing.JComboBox<String> target;
    // End of variables declaration//GEN-END:variables
}
