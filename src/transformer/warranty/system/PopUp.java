/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package transformer.warranty.system;

import javax.swing.ImageIcon;

/**
 *
 * @author Jatin
 */
public class PopUp extends javax.swing.JFrame {

    /**
     * Creates new form PopUp
     */
    public PopUp() {
        initComponents();
    }
    public void setMessagelabel(String message){
        stringlabel.setText(message); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        closebutton = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        stringlabel = new javax.swing.JLabel();
        okbutton = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(280, 150));
        setUndecorated(true);
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(null);

        closebutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/transformer/warranty/system/Default_close.png"))); // NOI18N
        closebutton.setText("jLabel6");
        closebutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closebuttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closebuttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closebuttonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                closebuttonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                closebuttonMouseReleased(evt);
            }
        });
        getContentPane().add(closebutton);
        closebutton.setBounds(258, 1, 20, 15);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/transformer/warranty/system/Login_taskbar.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(2, 0, 276, 20);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/transformer/warranty/system/boundary.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(278, 0, 2, 150);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/transformer/warranty/system/Horizontal_boundary.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(2, 148, 276, 2);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/transformer/warranty/system/boundary.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 2, 150);

        stringlabel.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        stringlabel.setForeground(new java.awt.Color(153, 0, 153));
        getContentPane().add(stringlabel);
        stringlabel.setBounds(70, 45, 200, 20);

        okbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/transformer/warranty/system/Ok_button.png"))); // NOI18N
        okbutton.setText("jLabel7");
        okbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                okbuttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                okbuttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                okbuttonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                okbuttonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                okbuttonMouseReleased(evt);
            }
        });
        getContentPane().add(okbutton);
        okbutton.setBounds(220, 105, 35, 25);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/transformer/warranty/system/popup2.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(2, 20, 276, 128);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void okbuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_okbuttonMouseEntered
        ImageIcon ISB=new ImageIcon(getClass().getResource("Ok_button_hover.png"));
       okbutton.setIcon(ISB);
    }//GEN-LAST:event_okbuttonMouseEntered

    private void okbuttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_okbuttonMouseExited
        ImageIcon ISB=new ImageIcon(getClass().getResource("Ok_button.png"));
       okbutton.setIcon(ISB);
    }//GEN-LAST:event_okbuttonMouseExited

    private void okbuttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_okbuttonMousePressed
        ImageIcon ISB=new ImageIcon(getClass().getResource("Ok_button_pressed.png"));
       okbutton.setIcon(ISB);
    }//GEN-LAST:event_okbuttonMousePressed

    private void okbuttonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_okbuttonMouseReleased
        ImageIcon ISB=new ImageIcon(getClass().getResource("Ok_button.png"));
       okbutton.setIcon(ISB);
    }//GEN-LAST:event_okbuttonMouseReleased

    private void closebuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closebuttonMouseClicked
        this.dispose();
    }//GEN-LAST:event_closebuttonMouseClicked

    private void closebuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closebuttonMouseEntered
         ImageIcon II=new ImageIcon(getClass().getResource("Hover_close.png"));
         closebutton.setIcon(II);
    }//GEN-LAST:event_closebuttonMouseEntered

    private void closebuttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closebuttonMouseExited
         ImageIcon II=new ImageIcon(getClass().getResource("Default_close.png"));
        closebutton.setIcon(II);
    }//GEN-LAST:event_closebuttonMouseExited

    private void closebuttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closebuttonMousePressed
         ImageIcon II=new ImageIcon(getClass().getResource("Pressed_close.png"));
       closebutton.setIcon(II);
    }//GEN-LAST:event_closebuttonMousePressed

    private void closebuttonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closebuttonMouseReleased
        ImageIcon II=new ImageIcon(getClass().getResource("Hover_close.png"));
        closebutton.setIcon(II);
    }//GEN-LAST:event_closebuttonMouseReleased

    private void okbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_okbuttonMouseClicked
        this.dispose();
    }//GEN-LAST:event_okbuttonMouseClicked

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
            java.util.logging.Logger.getLogger(PopUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PopUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PopUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PopUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PopUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel closebutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel okbutton;
    private javax.swing.JLabel stringlabel;
    // End of variables declaration//GEN-END:variables
}
