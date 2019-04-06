/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databse;

import java.sql.PreparedStatement;
import javax.swing.*;
import java.sql.*;
import java.sql.SQLException;

/**
 *
 * @author MUSA
 */
public class ct3 extends javax.swing.JFrame {
    public ct3() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        col_name = new javax.swing.JTextField();
        col_len = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        type_name = new javax.swing.JComboBox();
        table_name = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        add = new javax.swing.JButton();
        modify = new javax.swing.JButton();
        change = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        col_name1 = new javax.swing.JLabel();
        column1 = new javax.swing.JTextField();
        type_name1 = new javax.swing.JComboBox();
        col_len1 = new javax.swing.JTextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 153, 153));
        setMinimumSize(new java.awt.Dimension(1000, 600));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("length");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(380, 160, 110, 30);

        col_name.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(col_name);
        col_name.setBounds(10, 220, 147, 30);

        col_len.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        col_len.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                col_lenActionPerformed(evt);
            }
        });
        getContentPane().add(col_len);
        col_len.setBounds(380, 350, 147, 29);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(710, 530, 90, 30);

        jLabel3.setBackground(new java.awt.Color(255, 204, 204));
        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("            DataBase");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(270, 4, 330, 40);

        type_name.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        type_name.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "INT", "VARCHAR", "CHAR", "BOOLEAN", "DECIMAL", "DATE", "TEXT", "FLOAT", "DOUBLE", "REAL", "NUMERIC", "BIN", "CURRENT_USER", "COMPRESS", "DAYNAMIC", "DES_DECRYPT", "DES_ENCRYPT", "HEX", "LOWER", "PASSWORD", "REVERSE", "SHA1", "SOUNDEX", "SPACE", "UNCOMPRESS" }));
        type_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                type_nameActionPerformed(evt);
            }
        });
        getContentPane().add(type_name);
        type_name.setBounds(200, 350, 122, 30);

        table_name.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(table_name);
        table_name.setBounds(298, 87, 190, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Type");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(200, 160, 101, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("Table Name:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(110, 80, 180, 30);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(820, 530, 90, 30);

        add.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        add.setText("ADD");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        getContentPane().add(add);
        add.setBounds(100, 450, 100, 40);

        modify.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        modify.setText("Modify");
        modify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyActionPerformed(evt);
            }
        });
        getContentPane().add(modify);
        modify.setBounds(230, 450, 113, 40);

        change.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        change.setText("Drop");
        change.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeActionPerformed(evt);
            }
        });
        getContentPane().add(change);
        change.setBounds(380, 450, 100, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Existing tables");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(560, 100, 130, 22);

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "xyz", "student", "stud", "rt", "mnm", "mn", "student1", "db" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(730, 100, 110, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("column name1");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(10, 170, 150, 22);

        col_name1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        col_name1.setText("column name2");
        getContentPane().add(col_name1);
        col_name1.setBounds(10, 290, 140, 20);

        column1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        column1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                column1ActionPerformed(evt);
            }
        });
        getContentPane().add(column1);
        column1.setBounds(10, 350, 140, 30);

        type_name1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        type_name1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "INT", "VARCHAR", "CHAR", "BOOLEAN", "DECIMAL", "DATE", "TEXT", "FLOAT", "DOUBLE", "REAL", "NUMERIC", "BIN", "CURRENT_USER", "COMPRESS", "DAYNAMIC", "DES_DECRYPT", "DES_ENCRYPT", "HEX", "LOWER", "PASSWORD", "REVERSE", "SHA1", "SOUNDEX", "SPACE", "UNCOMPRESS" }));
        type_name1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                type_name1ActionPerformed(evt);
            }
        });
        getContentPane().add(type_name1);
        type_name1.setBounds(200, 220, 122, 30);

        col_len1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        col_len1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                col_len1ActionPerformed(evt);
            }
        });
        getContentPane().add(col_len1);
        col_len1.setBounds(380, 220, 147, 29);
        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(580, 190, 100, 100);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String sql = new String();
        try{  
            Statement stmt=null;
             Class.forName("com.mysql.jdbc.Driver");
             Connection  con=DriverManager.getConnection("jdbc:mysql://127.0.0.1/te-a4-g3","root","");
             stmt=con.createStatement();
             String len = col_len.getText().length() == 0 ? "11": col_len.getText();
             String tablename=table_name.getText();
              sql="create table "+tablename+"("
                      +col_name.getText()+" "+
                      type_name.getSelectedItem()+
                      "("+len+"));";
              
             stmt.execute(sql.toString());
        //  JOptionPane.showMessageDialog(null, sql);
         // JOptionPane.showMessageDialog(null, "Data Save");
   JOptionPane.showMessageDialog(rootPane, tablename+" table Saved");
          
         }
        catch(Exception e)
        {
            System.out.println(sql);
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Not Save");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
       String sql= new String();
        try{
            Statement stmt=null;
            Class.forName("com.mysql.jdbc.Driver");
            Connection  con=DriverManager.getConnection("jdbc:mysql://127.0.0.1/te-a4-g3","root","");
            stmt=con.createStatement();
            String tablename=table_name.getText();
                  String len = col_len.getText().length() == 0 ? "11": col_len.getText();
            //  if(add.getText().equals("ADD"))

            sql="ALTER TABLE " +tablename+ " ADD("
            +col_name.getText()+" "+
            type_name.getSelectedItem()+
            "("+len+"))";
             stmt.execute(sql);
             //con.alter(sql);
           
             JOptionPane.showMessageDialog(null, sql);
         //    JOptionPane.showMessageDialog(rootPane, col_name+" Added");
            
    }//GEN-LAST:event_addActionPerformed
catch(Exception e)
{
     JOptionPane.showMessageDialog(rootPane," not added");
}
    } 
       
    private void modifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyActionPerformed
        // TODO add your handling code here:
         String sql= new String();
        try{
            Statement stmt=null;
            Class.forName("com.mysql.jdbc.Driver");
            Connection  con=DriverManager.getConnection("jdbc:mysql://127.0.0.1/te-a4-g3","root","");
            stmt=con.createStatement();
            String tablename=table_name.getText();
               String len = col_len.getText().length() == 0 ? "11": col_len.getText();
            sql="ALTER TABLE " +tablename+ " CHANGE  "
            +col_name.getText()+" "
            +column1.getText()+" "
            +type_name.getSelectedItem()
          + "("+len+")";
            
          // System.out.println(sql);
         stmt.execute(sql);
          // ALTER TABLE  `student` CHANGE  `rollno`  `Roll` INT( 6 ) NULL DEFAULT NULL
           
            JOptionPane.showMessageDialog(null, "Table modified successfully");
            // JOptionPane.showMessageDialog(r, col_name+" Modified");
    }//GEN-LAST:event_modifyActionPerformed

        catch(Exception e)
{
     JOptionPane.showMessageDialog(null," not Modified");
}}
    private void changeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeActionPerformed
        // TODO add your handling code here:
         String sql= new String();
        try{
            Statement stmt=null;
            Class.forName("com.mysql.jdbc.Driver");
            Connection  con=DriverManager.getConnection("jdbc:mysql://127.0.0.1/te-a4-g3","root","");
            stmt=con.createStatement();
            String tablename=table_name.getText();
            
            
          //  sql="ALTER TABLE " +tablename+" DROP DATABASE"+tablename;
            
           sql="ALTER TABLE " +tablename+" DROP COLUMN "
                    +col_name.getText();
           //+" " 
               //     +type_name.getSelectedItem();
            
         //   sql="ALTER TABLE student DROP COLUMN name"; 
        //    ALTER TABLE `student` DROP `name`;
            
             stmt.execute(sql);
           
            JOptionPane.showMessageDialog(null, sql);
             //JOptionPane.showMessageDialog(rootPane , col_name+" Drop successfully");
        
    }//GEN-LAST:event_changeActionPerformed
catch(Exception e)
{
     JOptionPane.showMessageDialog(rootPane," not Droped");
}}
    private void col_lenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_col_lenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_col_lenActionPerformed

    private void type_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_type_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_type_nameActionPerformed

    private void type_name1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_type_name1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_type_name1ActionPerformed

    private void col_len1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_col_len1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_col_len1ActionPerformed

    private void column1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_column1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_column1ActionPerformed

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
            java.util.logging.Logger.getLogger(ct3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ct3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ct3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ct3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ct3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton change;
    private javax.swing.JTextField col_len;
    private javax.swing.JTextField col_len1;
    private javax.swing.JTextField col_name;
    private javax.swing.JLabel col_name1;
    private javax.swing.JTextField column1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton modify;
    private javax.swing.JTextField table_name;
    private javax.swing.JComboBox type_name;
    private javax.swing.JComboBox type_name1;
    // End of variables declaration//GEN-END:variables

    private static class prepareStatement {

        public prepareStatement() {
        }

        private void setString(int i, String text) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private void execute() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    private static class con {

        private static prepareStatement prepareStatement() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private static PreparedStatement PreparedStatement() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private static PreparedStatement PreparedStatement(String sql) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private static prepareStatement prepareStatement(String sql) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public con() {
        }
    }
}

