/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbscheduler;

/**
 *
 * @author umang
 */
public class All extends javax.swing.JFrame {

    /**
     * Creates new form All
     */
    public All() {
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
        jLabel24 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        Young = new javax.swing.JButton();
        Adult = new javax.swing.JButton();
        Kids = new javax.swing.JButton();
        Elder = new javax.swing.JButton();
        Friend = new javax.swing.JButton();
        Special = new javax.swing.JButton();
        Close = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));

        jLabel24.setBackground(new java.awt.Color(255, 0, 0));
        jLabel24.setIcon(new javax.swing.ImageIcon("C:\\Users\\umang\\OneDrive\\Pictures\\birthdayc.jpg")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(74, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Categories");

        Young.setIcon(new javax.swing.ImageIcon("C:\\Users\\umang\\OneDrive\\Pictures\\young.jpg")); // NOI18N
        Young.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YoungActionPerformed(evt);
            }
        });

        Adult.setIcon(new javax.swing.ImageIcon("C:\\Users\\umang\\OneDrive\\Pictures\\adult.jpg")); // NOI18N
        Adult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdultActionPerformed(evt);
            }
        });

        Kids.setIcon(new javax.swing.ImageIcon("C:\\Users\\umang\\OneDrive\\Pictures\\kids.jpg")); // NOI18N
        Kids.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KidsActionPerformed(evt);
            }
        });

        Elder.setIcon(new javax.swing.ImageIcon("C:\\Users\\umang\\OneDrive\\Pictures\\elder.jpg")); // NOI18N
        Elder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ElderActionPerformed(evt);
            }
        });

        Friend.setIcon(new javax.swing.ImageIcon("C:\\Users\\umang\\OneDrive\\Pictures\\friend.jpg")); // NOI18N
        Friend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FriendActionPerformed(evt);
            }
        });

        Special.setIcon(new javax.swing.ImageIcon("C:\\Users\\umang\\OneDrive\\Pictures\\special.jpg")); // NOI18N
        Special.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpecialActionPerformed(evt);
            }
        });

        Close.setBackground(new java.awt.Color(255, 0, 51));
        Close.setForeground(new java.awt.Color(255, 0, 0));
        Close.setIcon(new javax.swing.ImageIcon("C:\\Users\\umang\\OneDrive\\Pictures\\Screenshots\\Screenshot (33).png")); // NOI18N
        Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Kids, javax.swing.GroupLayout.PREFERRED_SIZE, 96, Short.MAX_VALUE)
                            .addComponent(Young, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(Adult, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(Elder, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(Friend, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(Special, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(106, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Close, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addComponent(Close, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Kids, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Young, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(Adult, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Elder, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Friend, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Special, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseActionPerformed
        // TODO add your handling code here:
        this.dispose();
        try
        {
            new Init().setVisible(true);
            //DBScheduler dbs = new DBScheduler();
            //dbs.callScheduler();
        }catch(Exception e)
        {

        }
    }//GEN-LAST:event_CloseActionPerformed

    private void KidsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KidsActionPerformed
        // TODO add your handling code here:
        this.dispose();
        try
        {
            new K().setVisible(true);
            //DBScheduler dbs = new DBScheduler();
            //dbs.callScheduler();
        }catch(Exception e)
        {

        }
    }//GEN-LAST:event_KidsActionPerformed

    private void YoungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YoungActionPerformed

        // TODO add your handling code here:
        
         this.dispose();
        try
        {
            new Y().setVisible(true);
            //DBScheduler dbs = new DBScheduler();
            //dbs.callScheduler();
        }catch(Exception e)
        {

        }
    }//GEN-LAST:event_YoungActionPerformed

    private void AdultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdultActionPerformed
        // TODO add your handling code here:
        
         this.dispose();
        try
        {
            new A().setVisible(true);
            //DBScheduler dbs = new DBScheduler();
            //dbs.callScheduler();
        }catch(Exception e)
        {

        }
    }//GEN-LAST:event_AdultActionPerformed

    private void ElderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ElderActionPerformed
        // TODO add your handling code here:
        
         this.dispose();
        try
        {
            new E().setVisible(true);
            //DBScheduler dbs = new DBScheduler();
            //dbs.callScheduler();
        }catch(Exception e)
        {

        }
    }//GEN-LAST:event_ElderActionPerformed

    private void FriendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FriendActionPerformed
        // TODO add your handling code here:
         this.dispose();
        try
        {
            new F().setVisible(true);
            //DBScheduler dbs = new DBScheduler();
            //dbs.callScheduler();
        }catch(Exception e)
        {

        }
    }//GEN-LAST:event_FriendActionPerformed

    private void SpecialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpecialActionPerformed
        // TODO add your handling code here:
        
         this.dispose();
        try
        {
            new S().setVisible(true);
            //DBScheduler dbs = new DBScheduler();
            //dbs.callScheduler();
        }catch(Exception e)
        {

        }
    }//GEN-LAST:event_SpecialActionPerformed

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
            java.util.logging.Logger.getLogger(All.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(All.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(All.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(All.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new All().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Adult;
    private javax.swing.JButton Close;
    private javax.swing.JButton Elder;
    private javax.swing.JButton Friend;
    private javax.swing.JButton Kids;
    private javax.swing.JButton Special;
    private javax.swing.JButton Young;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel15;
    // End of variables declaration//GEN-END:variables
}