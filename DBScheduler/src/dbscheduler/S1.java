/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbscheduler;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import say.swing.JFontChooser;
/**
 *
 * @author umang
 */
public class S1 extends javax.swing.JFrame {
JFrame f;
    /**
     * Creates new form S1
     */
    public S1() {
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

        jPanel2 = new javax.swing.JPanel();
        WishLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Gwish = new javax.swing.JTextArea();
        Wishcombo = new javax.swing.JComboBox<>();
        SaveIMG1 = new javax.swing.JButton();
        Set = new javax.swing.JButton();
        SFont = new javax.swing.JButton();
        Scolor = new javax.swing.JButton();
        IMG = new javax.swing.JPanel();
        TP = new org.jdesktop.swingx.JXLabel();
        Image = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Close2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        WishLabel.setBackground(new java.awt.Color(255, 255, 255));
        WishLabel.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        WishLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        WishLabel.setText("Wish");

        Gwish.setColumns(20);
        Gwish.setRows(5);
        jScrollPane1.setViewportView(Gwish);

        Wishcombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NULL", "Today is a lovely and special day. This day is as extraordinary as you are my sweet love. Happy Bday!", "You are the reason for my inner peace. You are the reason for my smile. You are the reason why I became whole again. I love you honey! Wonderful Birthday!", "Happy Birthday to my one true love! You deserve to have a day off to celebrate your birthday. Have a rest. Relax. Try to chill. And I will take care of everything honey. I love you!" }));
        Wishcombo.setBorder(null);
        Wishcombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WishcomboActionPerformed(evt);
            }
        });

        SaveIMG1.setIcon(new javax.swing.ImageIcon("C:\\Users\\umang\\OneDrive\\Pictures\\save.jpg")); // NOI18N
        SaveIMG1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveIMG1ActionPerformed(evt);
            }
        });

        Set.setBackground(new java.awt.Color(255, 255, 255));
        Set.setIcon(new javax.swing.ImageIcon("C:\\Users\\umang\\OneDrive\\Pictures\\set.jpg")); // NOI18N
        Set.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetActionPerformed(evt);
            }
        });

        SFont.setIcon(new javax.swing.ImageIcon("C:\\Users\\umang\\OneDrive\\Pictures\\font.jpg")); // NOI18N
        SFont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SFontActionPerformed(evt);
            }
        });

        Scolor.setIcon(new javax.swing.ImageIcon("C:\\Users\\umang\\OneDrive\\Pictures\\color.jpg")); // NOI18N
        Scolor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ScolorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(WishLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Set, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(SFont, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Scolor, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(SaveIMG1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Wishcombo, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(WishLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(Wishcombo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Set)
                    .addComponent(SFont)
                    .addComponent(Scolor)
                    .addComponent(SaveIMG1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        IMG.setLayout(null);

        TP.setLineWrap(true);
        TP.setTextAlignment(org.jdesktop.swingx.JXLabel.TextAlignment.CENTER);
        IMG.add(TP);
        TP.setBounds(70, 80, 430, 140);

        Image.setIcon(new javax.swing.ImageIcon("C:\\Users\\umang\\OneDrive\\Pictures\\S1.jpg")); // NOI18N
        IMG.add(Image);
        Image.setBounds(0, 0, 566, 410);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        Close2.setBackground(new java.awt.Color(255, 0, 51));
        Close2.setForeground(new java.awt.Color(255, 0, 0));
        Close2.setIcon(new javax.swing.ImageIcon("C:\\Users\\umang\\OneDrive\\Pictures\\Screenshots\\Screenshot (33).png")); // NOI18N
        Close2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Close2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 25, Short.MAX_VALUE)
                .addComponent(Close2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(Close2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 383, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 635, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(IMG, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 652, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(IMG, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(10, 10, 10)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void WishcomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WishcomboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_WishcomboActionPerformed

    private void Close2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Close2ActionPerformed
this.dispose();
        try
        {
            new S().setVisible(true);
            //DBScheduler dbs = new DBScheduler();
            //dbs.callScheduler();
        }catch(Exception e)
        {

        }        // TODO add your handling code here:
    }//GEN-LAST:event_Close2ActionPerformed

    private void SaveIMG1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveIMG1ActionPerformed

        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new java.io.File("."));
        chooser.setDialogTitle("Save Image");
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.setAcceptAllFileFilterUsed(false);

        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
        {
            System.out.println("getCurrentDirectory(): " + chooser.getCurrentDirectory());
            System.out.println("getSelectedFile() : " + chooser.getSelectedFile());
            BufferedImage image = new BufferedImage(IMG.getWidth(), IMG.getHeight(), BufferedImage.TYPE_INT_RGB);
            Graphics2D graphics2D = image.createGraphics();

            IMG.paint(graphics2D);
            try{
                ImageIO.write(image,"png", new File(chooser.getSelectedFile()+".png"));
            }
            catch(IOException ex)
            {
            }

        }
        else
        {
            System.out.println("No Selection ");
        }

        /*
        BufferedImage image = new BufferedImage(IMG.getWidth(), IMG.getHeight(), BufferedImage.TYPE_INT_RGB);
        Graphics2D graphics2D = image.createGraphics();

        IMG.paint(graphics2D);
        try{
            ImageIO.write(image,"png", new File("U:/Example.png"));
        }
        catch(IOException ex){
        }*/
    }//GEN-LAST:event_SaveIMG1ActionPerformed

    private void SetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SetActionPerformed
        // TODO add your handling code here:
        // jFontChooser1.setSelectedFont(settings.getFont());
        //int result = fontChooser.showDialog(JadxSettingsWindow.this);
        //if (result == JFontChooser.OK_OPTION) {

            if("NULL".equals(Wishcombo.getSelectedItem().toString()))
            {
                String gwish_T=Gwish.getText();
                // Swish.setText(gwish_T);
                TP.setText(gwish_T);
            }
            else
            {
                String gwish_C= Wishcombo.getSelectedItem().toString();
                // Swish.setText(gwish_C);
                TP.setText(gwish_C);
            }
    }//GEN-LAST:event_SetActionPerformed

    private void SFontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SFontActionPerformed
        // TODO add your handling code here:
        JFontChooser fontChooser = new JFontChooser();
        int result = fontChooser.showDialog(this);
        if (result == JFontChooser.OK_OPTION)
        {
            Font font = fontChooser.getSelectedFont();
            System.out.println("Selected Font : " + font);
            //  Swish.setFont(font);
            TP.setFont(font);
        }
    }//GEN-LAST:event_SFontActionPerformed

    private void ScolorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ScolorActionPerformed
        // TODO add your handling code here:
        Color cc = JColorChooser.showDialog(f,"Choose background color", Color.white);
        TP.setForeground(cc);
    }//GEN-LAST:event_ScolorActionPerformed

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
            java.util.logging.Logger.getLogger(S1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(S1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(S1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(S1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new S1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Close2;
    private javax.swing.JTextArea Gwish;
    private javax.swing.JPanel IMG;
    private javax.swing.JLabel Image;
    private javax.swing.JButton SFont;
    private javax.swing.JButton SaveIMG1;
    private javax.swing.JButton Scolor;
    private javax.swing.JButton Set;
    private org.jdesktop.swingx.JXLabel TP;
    private javax.swing.JLabel WishLabel;
    private javax.swing.JComboBox<String> Wishcombo;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
