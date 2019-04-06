
package databse;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;


public class ct4 extends javax.swing.JFrame {
    JInternalFrame jif=new JInternalFrame();
    
    public ct4() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jInternalFrame2 = new javax.swing.JInternalFrame();
        jLabel2 = new javax.swing.JLabel();
        col_name3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        col_len3 = new javax.swing.JTextField();
        type_name3 = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        table_name3 = new javax.swing.JTextField();
        col_name = new javax.swing.JTextField();
        type_name = new javax.swing.JComboBox();
        col_len = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        chkbox = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();
        jInternalFrame4 = new javax.swing.JInternalFrame();
        jLabel5 = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        change = new javax.swing.JButton();
        modify = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tb1_name = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        col_name1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        type_name1 = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        col_len1 = new javax.swing.JTextField();
        col_name2 = new javax.swing.JLabel();
        column1 = new javax.swing.JTextField();
        type_name2 = new javax.swing.JComboBox();
        col_len2 = new javax.swing.JTextField();
        combo_box1 = new javax.swing.JComboBox();
        jToolBar1 = new javax.swing.JToolBar();
        jInternalFrame3 = new javax.swing.JInternalFrame();
        jLabel12 = new javax.swing.JLabel();
        cmbox = new javax.swing.JComboBox();
        drop = new javax.swing.JButton();
        jInternalFrame9 = new javax.swing.JInternalFrame();
        jLabel6 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jInternalFrame5 = new javax.swing.JInternalFrame();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        cn1 = new javax.swing.JTextField();
        cn2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        clt1 = new javax.swing.JComboBox();
        clt2 = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        jInternalFrame6 = new javax.swing.JInternalFrame();
        jInternalFrame7 = new javax.swing.JInternalFrame();
        jInternalFrame8 = new javax.swing.JInternalFrame();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jTabbedPane2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane2MouseClicked(evt);
            }
        });

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 925, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 457, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("EXIT", jInternalFrame1);

        jTabbedPane1.addTab("FILE", jTabbedPane2);

        jTabbedPane3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane3MouseClicked(evt);
            }
        });

        jInternalFrame2.setVisible(true);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("coulmns");

        col_name3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Type");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Length");

        col_len3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        type_name3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        type_name3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "INT", "VARCHAR", "CHAR", "DATE", "NUMERIC", " " }));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setText("Table Name:");

        table_name3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        table_name3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                table_name3ActionPerformed(evt);
            }
        });

        col_name.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        type_name.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        type_name.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "INT", "VARCHAR", "NUMERIC", "DATE" }));

        col_len.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton3.setText("Save");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        chkbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkboxActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setText("Primary Key");

        javax.swing.GroupLayout jInternalFrame2Layout = new javax.swing.GroupLayout(jInternalFrame2.getContentPane());
        jInternalFrame2.getContentPane().setLayout(jInternalFrame2Layout);
        jInternalFrame2Layout.setHorizontalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame2Layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jInternalFrame2Layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(col_name3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(col_name, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jInternalFrame2Layout.createSequentialGroup()
                        .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(table_name3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(type_name3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(45, 45, 45)
                                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(col_len3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(col_len))))
                        .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addComponent(chkbox))
                            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(182, 182, 182))
                    .addGroup(jInternalFrame2Layout.createSequentialGroup()
                        .addComponent(type_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jInternalFrame2Layout.setVerticalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(table_name3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel11))
                .addGap(29, 29, 29)
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkbox, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(col_name3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(col_len3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(type_name3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, 43)
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(col_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(type_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(col_len, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(107, 107, 107)
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(101, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Create Table", jInternalFrame2);

        jInternalFrame4.setVisible(true);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Exsisting Table");

        add.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        add.setText("ADD");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        change.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        change.setText("DROP");
        change.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeActionPerformed(evt);
            }
        });

        modify.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        modify.setText("MODIFY");
        modify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton4.setText("Exit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Table Name");

        tb1_name.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("column name1");

        col_name1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Type");

        type_name1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        type_name1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "INT", "VARCHAR", "CHAR", "BOOLEAN", "DECIMAL", "DATE", "TEXT", "FLOAT", "DOUBLE", "REAL", "NUMERIC", "BIN", "CURRENT_USER", "COMPRESS", "DAYNAMIC", "DES_DECRYPT", "DES_ENCRYPT", "HEX", "LOWER", "PASSWORD", "REVERSE", "SHA1", "SOUNDEX", "SPACE", "UNCOMPRESS" }));
        type_name1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                type_name1ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("length");

        col_len1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        col_len1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                col_len1ActionPerformed(evt);
            }
        });

        col_name2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        col_name2.setText("column name2");

        column1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        column1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                column1ActionPerformed(evt);
            }
        });

        type_name2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        type_name2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "INT", "VARCHAR", "CHAR", "BOOLEAN", "DECIMAL", "DATE", "TEXT", "FLOAT", "DOUBLE", "REAL", "NUMERIC", "BIN", "CURRENT_USER", "COMPRESS", "DAYNAMIC", "DES_DECRYPT", "DES_ENCRYPT", "HEX", "LOWER", "PASSWORD", "REVERSE", "SHA1", "SOUNDEX", "SPACE", "UNCOMPRESS" }));
        type_name2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                type_name2ActionPerformed(evt);
            }
        });

        col_len2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        col_len2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                col_len2ActionPerformed(evt);
            }
        });

        combo_box1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        combo_box1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_box1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame4Layout = new javax.swing.GroupLayout(jInternalFrame4.getContentPane());
        jInternalFrame4.getContentPane().setLayout(jInternalFrame4Layout);
        jInternalFrame4Layout.setHorizontalGroup(
            jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame4Layout.createSequentialGroup()
                .addGroup(jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame4Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addGroup(jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(col_name2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jInternalFrame4Layout.createSequentialGroup()
                                .addGroup(jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(column1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(col_name1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(126, 126, 126)
                                .addGroup(jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(type_name1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(type_name2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jInternalFrame4Layout.createSequentialGroup()
                                .addGap(153, 153, 153)
                                .addGroup(jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jInternalFrame4Layout.createSequentialGroup()
                                        .addGroup(jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1))
                                        .addGap(48, 48, 48)
                                        .addGroup(jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(combo_box1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(tb1_name, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)))
                                    .addGroup(jInternalFrame4Layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(modify, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(change, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jInternalFrame4Layout.createSequentialGroup()
                                        .addGap(312, 312, 312)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jInternalFrame4Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(285, 285, 285)
                        .addGroup(jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(col_len2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(col_len1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(173, Short.MAX_VALUE))
        );
        jInternalFrame4Layout.setVerticalGroup(
            jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_box1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tb1_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGroup(jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame4Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(col_len1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jInternalFrame4Layout.createSequentialGroup()
                                .addComponent(col_name1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(col_name2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addGroup(jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(type_name2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(col_len2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(column1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(167, Short.MAX_VALUE))
                    .addGroup(jInternalFrame4Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jInternalFrame4Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(add)
                                    .addComponent(modify)
                                    .addComponent(change)
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(66, 66, 66))
                            .addGroup(jInternalFrame4Layout.createSequentialGroup()
                                .addComponent(type_name1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );

        jTabbedPane3.addTab("Alter Table", jInternalFrame4);

        jToolBar1.setRollover(true);

        jInternalFrame3.setVisible(true);
        jInternalFrame3.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jInternalFrame3AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel12.setText("List of Tables");

        cmbox.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cmbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmboxActionPerformed(evt);
            }
        });

        drop.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        drop.setText("Drop");
        drop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dropActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame3Layout = new javax.swing.GroupLayout(jInternalFrame3.getContentPane());
        jInternalFrame3.getContentPane().setLayout(jInternalFrame3Layout);
        jInternalFrame3Layout.setHorizontalGroup(
            jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame3Layout.createSequentialGroup()
                .addGroup(jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame3Layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(cmbox, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jInternalFrame3Layout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(drop, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(475, Short.MAX_VALUE))
        );
        jInternalFrame3Layout.setVerticalGroup(
            jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addComponent(drop)
                .addContainerGap(304, Short.MAX_VALUE))
        );

        jToolBar1.add(jInternalFrame3);

        jTabbedPane3.addTab("Drop Table", jToolBar1);

        jInternalFrame9.setVisible(true);

        jLabel6.setText("List of Tables");

        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame9Layout = new javax.swing.GroupLayout(jInternalFrame9.getContentPane());
        jInternalFrame9.getContentPane().setLayout(jInternalFrame9Layout);
        jInternalFrame9Layout.setHorizontalGroup(
            jInternalFrame9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame9Layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(505, Short.MAX_VALUE))
        );
        jInternalFrame9Layout.setVerticalGroup(
            jInternalFrame9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame9Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jInternalFrame9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(392, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Show Tables", jInternalFrame9);

        jTabbedPane1.addTab("DDL", jTabbedPane3);

        jTabbedPane4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane4MouseClicked(evt);
            }
        });

        jInternalFrame5.setVisible(true);

        jComboBox1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setText("List of tables");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel14.setText("column name");

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel15.setText("Type");

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel16.setText("Length");

        cn1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cn1ActionPerformed(evt);
            }
        });

        cn2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jTextField3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jTextField4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        clt1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        clt2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setText("Insert Tuple");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame5Layout = new javax.swing.GroupLayout(jInternalFrame5.getContentPane());
        jInternalFrame5.getContentPane().setLayout(jInternalFrame5Layout);
        jInternalFrame5Layout.setHorizontalGroup(
            jInternalFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame5Layout.createSequentialGroup()
                .addGroup(jInternalFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame5Layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addGroup(jInternalFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(jInternalFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jInternalFrame5Layout.createSequentialGroup()
                                .addGroup(jInternalFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cn1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(clt1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(jInternalFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(clt2, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cn2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                                    .addComponent(jTextField4)))
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jInternalFrame5Layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(427, Short.MAX_VALUE))
        );
        jInternalFrame5Layout.setVerticalGroup(
            jInternalFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame5Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jInternalFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jInternalFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jInternalFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jInternalFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame5Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jInternalFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jInternalFrame5Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50)
                .addComponent(jButton2)
                .addContainerGap(124, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Insert Tuple", jInternalFrame5);

        jInternalFrame6.setVisible(true);

        javax.swing.GroupLayout jInternalFrame6Layout = new javax.swing.GroupLayout(jInternalFrame6.getContentPane());
        jInternalFrame6.getContentPane().setLayout(jInternalFrame6Layout);
        jInternalFrame6Layout.setHorizontalGroup(
            jInternalFrame6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame6Layout.setVerticalGroup(
            jInternalFrame6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane4.addTab("Select Tuple", jInternalFrame6);

        jInternalFrame7.setVisible(true);

        javax.swing.GroupLayout jInternalFrame7Layout = new javax.swing.GroupLayout(jInternalFrame7.getContentPane());
        jInternalFrame7.getContentPane().setLayout(jInternalFrame7Layout);
        jInternalFrame7Layout.setHorizontalGroup(
            jInternalFrame7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame7Layout.setVerticalGroup(
            jInternalFrame7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane4.addTab("Update Tuple", jInternalFrame7);

        jInternalFrame8.setVisible(true);

        javax.swing.GroupLayout jInternalFrame8Layout = new javax.swing.GroupLayout(jInternalFrame8.getContentPane());
        jInternalFrame8.getContentPane().setLayout(jInternalFrame8Layout);
        jInternalFrame8Layout.setHorizontalGroup(
            jInternalFrame8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame8Layout.setVerticalGroup(
            jInternalFrame8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane4.addTab("Delete Tuple", jInternalFrame8);

        jTabbedPane1.addTab("DML", jTabbedPane4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 951, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTabbedPane2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane2MouseClicked
        // TODO add your handling code here:
         System.exit(0);
    }//GEN-LAST:event_jTabbedPane2MouseClicked
        
    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
         String sql= null;
        try{
            Statement stmt=null;
            Class.forName("com.mysql.jdbc.Driver");
            Connection  con=DriverManager.getConnection("jdbc:mysql://127.0.0.1/tea4g3","root","");
            stmt=con.createStatement();
            String tablename=tb1_name.getText();
                 // String len = col_len.getText().length() == 0 ? "11": col_len.getText();
            //  if(add.getText().equals("ADD"))

            sql="ALTER TABLE " +tablename+ " ADD("
            +col_name1.getText()+" "+
            type_name1.getSelectedItem()+
            "("+col_len1.getText()+"))";

            //System.out.println(sql);
            stmt.execute(sql);
             //con.alter(sql);
           
             JOptionPane.showMessageDialog(null, sql);
         //    JOptionPane.showMessageDialog(rootPane, col_name+" Added");
            
    }                                   
catch(Exception e)
{
     JOptionPane.showMessageDialog(null," not added");
}
    }//GEN-LAST:event_addActionPerformed

    private void modifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyActionPerformed
        // TODO add your handling code here:
         String sql= new String();
        try{
            Statement stmt=null;
            Class.forName("com.mysql.jdbc.Driver");
            Connection  con=DriverManager.getConnection("jdbc:mysql://127.0.0.1/tea4g3","root","");
            stmt=con.createStatement();
            String tablename=tb1_name.getText();
             //  String len = col_len.getText().length() == 0 ? "11": col_len.getText();
            sql="ALTER TABLE " +tablename+ " CHANGE  "
            +col_name1.getText()+" "
            +column1.getText()+" "
            +type_name.getSelectedItem()
          + "("+col_len1.getText()+")";
         
           // System.out.println(sql);
         
      stmt.execute(sql.toString());
          // ALTER TABLE  `student` CHANGE  `rollno`  `Roll` INT( 6 ) NULL DEFAULT NULL
           
            JOptionPane.showMessageDialog(null, "Table modified successfully");
            // JOptionPane.showMessageDialog(r, col_name+" Modified");
    }                                      

        catch(Exception e)
{
     JOptionPane.showMessageDialog(null," not Modified");
}
    }//GEN-LAST:event_modifyActionPerformed

    private void changeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeActionPerformed
        // TODO add your handling code here:
        String sql= new String();
        try{
            Statement stmt=null;
            Class.forName("com.mysql.jdbc.Driver");
            Connection  con=DriverManager.getConnection("jdbc:mysql://127.0.0.1/tea4g3","root","");
            stmt=con.createStatement();
            String tablename=tb1_name.getText();
            
            
         //  sql="ALTER TABLE " +tablename+" DROP DATABASE"+tablename;
            
          sql="ALTER TABLE " +tablename+" DROP COLUMN "
                   +col_name1.getText();
           //+" " 
               //     +type_name.getSelectedItem();
            
         //   sql="ALTER TABLE student DROP COLUMN name"; 
        //    ALTER TABLE `student` DROP `name`;
            
             stmt.execute(sql);
           
            JOptionPane.showMessageDialog(null, sql);
             //JOptionPane.showMessageDialog(rootPane , col_name+" Drop successfully");
        
    }                                      
catch(Exception e)
{
     JOptionPane.showMessageDialog(rootPane," not Droped");
}
    }//GEN-LAST:event_changeActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String sql = new String();
        try{
            Statement stmt=null;
            Class.forName("com.mysql.jdbc.Driver");
            Connection  con=DriverManager.getConnection("jdbc:mysql://127.0.0.1/tea4g3","root","");
            stmt=con.createStatement();
           // String len = col_len3.getText().length() == 0 ? "11": col_len.getText();
            String tablename=table_name3.getText();
            sql="create table "+tablename+"("
            +col_name3.getText()+" "
            +type_name3.getSelectedItem()+
            "("+col_len3.getText()+"));";
            

            stmt.execute(sql.toString());
            //  JOptionPane.showMessageDialog(null, sql);
            // JOptionPane.showMessageDialog(null, "Data Save");
            JOptionPane.showMessageDialog(rootPane, tablename+" table Saved");

        }
        catch(Exception e)
        {
            System.out.println(sql);
            System.out.println(e);
            JOptionPane.showMessageDialog(null, " Table Not Save already exist");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void type_name1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_type_name1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_type_name1ActionPerformed

    private void col_len1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_col_len1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_col_len1ActionPerformed

    private void column1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_column1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_column1ActionPerformed

    private void type_name2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_type_name2ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_type_name2ActionPerformed

    private void col_len2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_col_len2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_col_len2ActionPerformed

    private void combo_box1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_box1ActionPerformed
        // TODO add your handling code here:
      
       try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con =DriverManager.getConnection("jdbc:mysql://127.0.0.1/tea4g3","root","");

            Statement stmt = con.createStatement();
            String query="select table_name from information_schema.tables where TABLE_SCHEMA='tea4g3'";
            ResultSet rs=stmt.executeQuery(query);
            System.out.println("stmts created");
            System.out.println(query);
            while(rs.next())
            {
                String s= rs.getString(1);
                combo_box1.addItem(s);
               
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(rootPane," not succesful");
        }
    }//GEN-LAST:event_combo_box1ActionPerformed

    private void chkboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkboxActionPerformed
        // TODO add your handling code here:
         String sql= new String();
        try{
            Statement stmt=null;
            Class.forName("com.mysql.jdbc.Driver");
            Connection  con=DriverManager.getConnection("jdbc:mysql://127.0.0.1/tea4g3","root","");
            stmt=con.createStatement();
            String tablename=table_name3.getText();
            sql="create table " + table_name3.getText().toString()+" ADD PRIMARY KEY"+"("+col_name3.getText().toString()+")";
            System.out.println(sql);
            //  stmt.execute(sql.toString());
              
    //    sql="ALTER TABLE  "+ selectedtab.getText().toString()+"  ADD PRIMARY KEY"+"("+cl1.getText().toString()+")";
              
        }
        catch(Exception e)
        {
             JOptionPane.showMessageDialog(rootPane," not succesful");
        } 
    }//GEN-LAST:event_chkboxActionPerformed

    private void jInternalFrame3AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jInternalFrame3AncestorAdded
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jInternalFrame3AncestorAdded

    private void dropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dropActionPerformed
        // TODO add your handling code here:
         String sql = null;
          Statement stmt=null;
           Connection con=null;
          try{
           String str=cmbox.getSelectedItem().toString();
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://127.0.0.1/tea4g3","root","");
            stmt=con.createStatement();
            sql="drop table "+cmbox.getSelectedItem();
           
            stmt.execute(sql);
            cmbox.removeItem(str);
             JOptionPane.showMessageDialog(null," table drop");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null," not drop");
        }
        
    }//GEN-LAST:event_dropActionPerformed

    private void cmboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmboxActionPerformed
        // TODO add your handling code here:
         try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con =DriverManager.getConnection("jdbc:mysql://127.0.0.1/tea4g3","root","");

            Statement stmt = con.createStatement();
            String query="select table_name from information_schema.tables where TABLE_SCHEMA='tea4g3'";
            ResultSet rs=stmt.executeQuery(query);
            System.out.println("stmts created");
            System.out.println(query);
            while(rs.next())
            {
                String s= rs.getString(1);
                cmbox.addItem(s);
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(rootPane," not succesful");
        }
    }//GEN-LAST:event_cmboxActionPerformed

    private void jTabbedPane4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane4MouseClicked

           try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con =DriverManager.getConnection("jdbc:mysql://127.0.0.1/tea4g3","root","");
            ResultSet rs=null;
            Statement stmt = con.createStatement();
             String tablename=jComboBox1.getSelectedItem().toString();
    //String query="select COLUMN_NAME, DATA_TYPE from INFORMATION_SCHEMA.COLUMNS where TABLE_NAME="+jComboBox1.getSelectedItem();
   //String query="select table_name *from information_schema.tables where TABLE_SCHEMA='tea4g3'";
  //and column_name, column_type from INFORMATION_SCHEMA.COLUMNS where table_name ='db'";
 //String sql="select column_name, column_type from INFORMATION_SCHEMA.COLUMNS where table_name ='db' and table_schema='tea4g3'";
             
              rs=stmt.executeQuery("select *from "+jComboBox1.getSelectedItem());
              ResultSetMetaData rsMetaData=rs.getMetaData();
              int numberOfColumns=rsMetaData.getColumnCount();
              System.out.println("resultSet MetaData column count=" +numberOfColumns);
              String[] clms=new String[2];
              String clmt[]=new String[2];
              int len[]=new int [2];
              String name;
              for(int i=1;i<numberOfColumns;i++)
              {
                  name=rsMetaData.getColumnName(i);
                  System.out.println(rsMetaData.getColumnName(i));
                  clmt[i-1]=rsMetaData.getColumnTypeName(i);
                  clms[i-1]=name;
                  len[i-1]=(rsMetaData.getColumnDisplaySize(i));
                  System.out.println(len[i-1]);
              }
              cn1.setText(clms[0]);
              cn2.setText(clms[1]);
              //cl3.setText(clms[2]);
             // cl4.setText(clms[3]);
              
          /*    clt1.setText(clmt[0]);
              ctl2.setText(clmt[1]);
              clt3.setText(clmt[2]);
              clt4.setText(clmt[3]); */
       }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_jTabbedPane4MouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here: try
        try{
            Statement stmt=null;
             ResultSet rs=null;
            Class.forName("com.mysql.jdbc.Driver");
            Connection  con=DriverManager.getConnection("jdbc:mysql://127.0.0.1/tea4g3","root","");
            stmt=con.createStatement();
            String tablename=jComboBox1.getSelectedItem().toString();
            rs=stmt.executeQuery("select * from INFORMATION_SCHEMA.TABLES" +jComboBox1.getSelectedItem());
           
            while(rs.next())
            {
                rs.getString(" ");
                
            }

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(rootPane," not succesful");
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
      
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
     
    }//GEN-LAST:event_jButton2ActionPerformed

    private void table_name3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_table_name3ActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_table_name3ActionPerformed

    private void jTabbedPane3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane3MouseClicked
        // TODO add your handling code here:
          try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con =DriverManager.getConnection("jdbc:mysql://127.0.0.1/tea4g3","root","");

            Statement stmt = con.createStatement();
            String query="select table_name from information_schema.tables where TABLE_SCHEMA='tea4g3'";
            ResultSet rs=stmt.executeQuery(query);
            System.out.println("stmts created");
            System.out.println(query);
            while(rs.next())
            {
                String s= rs.getString(1);
                jComboBox4.addItem(s);
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(rootPane," not succesful");
        }
    }//GEN-LAST:event_jTabbedPane3MouseClicked

    private void cn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cn1ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ActionPerformed

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
            java.util.logging.Logger.getLogger(ct4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ct4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ct4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ct4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ct4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton change;
    private javax.swing.JCheckBox chkbox;
    private javax.swing.JComboBox clt1;
    private javax.swing.JComboBox clt2;
    private javax.swing.JComboBox cmbox;
    private javax.swing.JTextField cn1;
    private javax.swing.JTextField cn2;
    private javax.swing.JTextField col_len;
    private javax.swing.JTextField col_len1;
    private javax.swing.JTextField col_len2;
    private javax.swing.JTextField col_len3;
    private javax.swing.JTextField col_name;
    private javax.swing.JTextField col_name1;
    private javax.swing.JLabel col_name2;
    private javax.swing.JTextField col_name3;
    private javax.swing.JTextField column1;
    private javax.swing.JComboBox combo_box1;
    private javax.swing.JButton drop;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    public static javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JInternalFrame jInternalFrame3;
    private javax.swing.JInternalFrame jInternalFrame4;
    private javax.swing.JInternalFrame jInternalFrame5;
    private javax.swing.JInternalFrame jInternalFrame6;
    private javax.swing.JInternalFrame jInternalFrame7;
    private javax.swing.JInternalFrame jInternalFrame8;
    private javax.swing.JInternalFrame jInternalFrame9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JButton modify;
    private javax.swing.JTextField table_name3;
    private javax.swing.JTextField tb1_name;
    private javax.swing.JComboBox type_name;
    private javax.swing.JComboBox type_name1;
    private javax.swing.JComboBox type_name2;
    private javax.swing.JComboBox type_name3;
    // End of variables declaration//GEN-END:variables
}
