/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package planesacademicos;

import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author cmateo
 */
public class Vista extends javax.swing.JFrame {

    /**
     * Creates new form Vista
     */
    DefaultTableModel tabla;
    Archivo archivo;

    public Vista() {
        initComponents();
        tabla();
        archivo = new Archivo();
        setLocationRelativeTo(null);
        jPanel2.setSize(0, 0);
        jPanel1.setLocation(30, 0);
        jPanel1.setBounds(30, 0, 700, 391);
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jPanel6 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        cerrar = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jButton8 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        asignaturaTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        codigoTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        semestreTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        creditoTxt = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        jScrollPane2.setViewportView(jEditorPane1);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Plan Acádemico");
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1030, 393));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "NÚMERO", "PROGRAMA", "ASIGNATURA", "CÓDIGO", "SEMESTRE", "CREDITO"
            }
        ));
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable1.setRowHeight(30);
        jScrollPane3.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(5);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(200);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(200);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(10);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(10);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(10);
        }

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 656, 224));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 680, 250));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel7.setText("PLANES ACADEMICOS");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1618, 15, -1, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1618, 50, 613, 10));

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("CREDITOS PROGRAMA");
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton4.setFocusPainted(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, 150, 35));

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("MOSTRAR REGISTRO");
        jButton3.setBorderPainted(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton3.setFocusPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, -1, 35));

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("ASIGNATURA PROGRAMA");
        jButton5.setBorder(null);
        jButton5.setBorderPainted(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton5.setFocusPainted(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 330, 170, 35));

        cerrar.setBackground(new java.awt.Color(255, 255, 255));
        cerrar.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancel.png"))); // NOI18N
        cerrar.setBorder(null);
        cerrar.setBorderPainted(false);
        cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cerrar.setFocusPainted(false);
        cerrar.setIconTextGap(8);
        cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarActionPerformed(evt);
            }
        });
        jPanel1.add(cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, 10, 10));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 20, 450));

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/down-arrow.png"))); // NOI18N
        jButton6.setBorder(null);
        jButton6.setBorderPainted(false);
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton6.setFocusPainted(false);
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 3, 14, 20));

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setForeground(new java.awt.Color(102, 102, 102));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search-interface-symbol.png"))); // NOI18N
        jButton7.setBorder(null);
        jButton7.setBorderPainted(false);
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton7.setFocusPainted(false);
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, -1, 25));

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Buscar");
        jTextField1.setToolTipText("");
        jTextField1.setBorder(null);
        jTextField1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 33, 250, 20));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 320, 10));

        jButton8.setBackground(new java.awt.Color(255, 255, 255));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/equalization.png"))); // NOI18N
        jButton8.setBorder(null);
        jButton8.setBorderPainted(false);
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton8.setFocusPainted(false);
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 32, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 700, 390));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/left-arrow-line-symbol.png"))); // NOI18N
        jLabel8.setText("jLabel8");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel8MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel8MouseReleased(evt);
            }
        });
        jPanel8.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 20, 70));
        jLabel8.getAccessibleContext().setAccessibleParent(null);

        getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 380));
        jPanel8.getAccessibleContext().setAccessibleParent(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("PROGRAMA");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("ASIGNATURA");

        asignaturaTxt.setBackground(new java.awt.Color(255, 255, 255));
        asignaturaTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        asignaturaTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                asignaturaTxtKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                asignaturaTxtKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("CÓDIGO");

        codigoTxt.setBackground(new java.awt.Color(255, 255, 255));
        codigoTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        codigoTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                codigoTxtKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("SEMESTRE");

        semestreTxt.setBackground(new java.awt.Color(255, 255, 255));
        semestreTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        semestreTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                semestreTxtKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("CREDITOS");

        creditoTxt.setBackground(new java.awt.Color(255, 255, 255));
        creditoTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        creditoTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                creditoTxtKeyTyped(evt);
            }
        });

        jComboBox1.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox1.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ELEGIR PROGRAMA", "MEDICINA", "ADMINISTRACIÓN", "INGENIERÍA DE SISTEMAS", "INGENIERÍA INDUSTRIAL", "DERECHO" }));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("REGISTRAR");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setFocusPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("REGISTRO DE ASIGNATURAS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(170, 170, 170)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel2)
                                .addGap(20, 20, 20)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel6)
                                .addGap(36, 36, 36)
                                .addComponent(creditoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel3)
                                .addGap(21, 21, 21)
                                .addComponent(asignaturaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel5)
                                .addGap(33, 33, 33)
                                .addComponent(semestreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel4)
                                .addGap(49, 49, 49)
                                .addComponent(codigoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(creditoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(asignaturaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(semestreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codigoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        jComboBox1.getAccessibleContext().setAccessibleParent(null);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-300, 0, 300, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabla() {

        
        
        JTableHeader th = jTable1.getTableHeader();

        Border border = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);

        th.setBackground(Color.BLACK);
        th.setForeground(Color.WHITE);
        th.setBorder(border);

        String header[] = {"NÚMERO", "PROGRAMA", "ASIGNATURA", "CÓDIGO", "SEMESTRE", "CREDITOS"};
        tabla = new DefaultTableModel(null, header);

//        tabla.addColumn("NÚMERO");
//        tabla.addColumn("PROGRAMA");
//        tabla.addColumn("ASIGNATURA");
//        tabla.addColumn("CODIGO");
//        tabla.addColumn("SEMESTRE");
//        tabla.addColumn("CREDITOS");
        jTable1.setModel(tabla);

        jTable1.getColumnModel().getColumn(0).setPreferredWidth(10);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(180);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(180);
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(30);
        jTable1.getColumnModel().getColumn(4).setPreferredWidth(30);
        jTable1.getColumnModel().getColumn(5).setPreferredWidth(30);
    }

    public void formVisible(boolean visible) {
        asignaturaTxt.setVisible(visible);
        codigoTxt.setVisible(visible);
        semestreTxt.setVisible(visible);
        creditoTxt.setVisible(visible);
        jComboBox1.setVisible(visible);
        jButton2.setVisible(visible);
    }

    public void limpiarCampos() {
        asignaturaTxt.setText("");
        codigoTxt.setText("");
        semestreTxt.setText("");
        creditoTxt.setText("");
        jComboBox1.setSelectedIndex(0);
    }

    public void mensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }

    public boolean validarCampos() {
        return (asignaturaTxt.getText().isEmpty()
                || (jComboBox1.getSelectedIndex() < 1)
                || codigoTxt.getText().isEmpty()
                || semestreTxt.getText().isEmpty()
                || creditoTxt.getText().isEmpty());

    }

    public void ValidarL(java.awt.event.KeyEvent e) {
        char v = e.getKeyChar();

        if (((v < 'a' || v > 'z') && (v < 'A' || v > 'Z') && (v != ' ')
                && (v > KeyEvent.VK_BACK_SPACE))) {
            e.consume();
            mensaje("Solo se aceptan letras");
        }

    }

    public void ValidarN(java.awt.event.KeyEvent e) {
        char v = e.getKeyChar();
        if ((v < '0' || v > '9') && (v != '.')
                && (v > KeyEvent.VK_BACK_SPACE)) {
            e.consume();
            mensaje("Solo se aceptan numeros");
        }
    }

    private void mensajeListar(String programa, int creditoAsignaturas, int validar, boolean valido, int total) {

        if (creditoAsignaturas == 1) {
            mensaje("Las asignaturas totales para el programa " + programa + " es: " + total);
        } else if (creditoAsignaturas == 2) {
            mensaje("El total de creditos para " + programa + " es: " + total);
        }

        if (validar == 1 && !valido) {
            mensaje("La asignatura ya existe en el programa!");
        } else if (validar == 2 && !valido) {
            mensaje("El Código ya pertenece a una asignatura!");
        }
    }

    private boolean listar(String programa, int opcion, int creditosAsignaturas, int validar)
            throws FileNotFoundException, IOException {

        boolean valido = true;
        String linea = null;
        int total = 0;
        int n = 1;

        File Archivo = new File(archivo.getNOMBRE_ARCHIVO());
        BufferedReader leer = new BufferedReader(new FileReader(Archivo));

        if (opcion != 2) {
            tabla.setRowCount(0);
        }

        while ((linea = leer.readLine()) != null) {

            StringTokenizer campo = new StringTokenizer(linea, "\t");

            String Pro = campo.nextToken().trim();
            String Asig = campo.nextToken().trim();
            String Cod = campo.nextToken().trim();
            String Sem = campo.nextToken().trim();
            String Cre = campo.nextToken().trim();

            String rowData[] = {String.valueOf(n), Pro, Asig, Cod, Sem, Cre};

            if (opcion == 0) {
                tabla.addRow(rowData);
                n++;

            } else if (opcion == 1) {

                if (Pro.equals(programa)) {

                    tabla.addRow(rowData);
                    if (creditosAsignaturas == 1) {
                        total++;
                    } else if (creditosAsignaturas == 2) {
                        total += Integer.parseInt(Cre);
                    }

                    n++;
                }
            } else if (opcion == 2) {

                if (validar == 1) {
                    if (asignaturaTxt.getText().equalsIgnoreCase(Asig) && Pro.equals(programa)) {
                        valido = false;
                        break;
                    }
                } else if (validar == 2) {
                    if (codigoTxt.getText().equalsIgnoreCase(Cod)) {
                        valido = false;
                        break;
                    }
                }
            }
        }

        leer.close();

        mensajeListar(programa, creditosAsignaturas, validar, valido, total);
        return valido;
    }

    private void ejecutarOpcionAsignatura(int opcion) {
        JPanel panel = new JPanel(new GridBagLayout());
        Object[] programas = {"ElEGIR UNA OPCION",
            "MEDICINA",
            "ADMINISTRACIÓN",
            "INGENIERÍA DE SISTEMAS",
            "INGENIERÍA INDUSTRIAL",
            "DERECHO"};

        JComboBox comboBox = new JComboBox(programas);
        comboBox.setSelectedIndex(0);
        JOptionPane.showMessageDialog(null, comboBox, "Seleccione el programa", JOptionPane.QUESTION_MESSAGE);
        panel.add(comboBox);

        String programa = (String) comboBox.getSelectedItem();
        if (comboBox.getSelectedIndex() > 0) {
            try {
                if (opcion == 1) {
                    listar(programa, 1, 2, 0);
                } else if (opcion == 2) {
                    listar(programa, 1, 1, 0);
                }

            } catch (IOException ex) {
                Logger.getLogger(Vista.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            mensaje("OPCION INCORRECTA!!!!");

        }

    }


    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        DatosAsignaturas datos = new DatosAsignaturas();

        String asignatura = asignaturaTxt.getText();
        String programa = (String) jComboBox1.getSelectedItem();
        String codigo = codigoTxt.getText();
        String semestre = semestreTxt.getText();
        String creditos = creditoTxt.getText();

        try {
            if (!validarCampos()) {
                if (listar(programa, 2, 0, 1)) {
                    if (listar(null, 2, 0, 2)) {
                        if (Integer.parseInt(semestre) > 0 && Integer.parseInt(semestre) < 11) {

                            datos.setAsignature(asignatura);
                            datos.setPrograma(programa);
                            datos.setCodigo(codigo);
                            datos.setSemestre(semestre);
                            datos.setCreditos(creditos);
                            archivo.GuardarDatos(datos);
                            limpiarCampos();
                        } else {
                            mensaje("Supera el maximo semestre posible!!");
                        }
                    }
                }
            } else {
                mensaje("Por favor, llene todos los campos\nantes de registrar!!");
            }

        } catch (IOException ex) {
            Logger.getLogger(Vista.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        try {
            listar(null, 0, 0, 0);
        } catch (IOException ex) {
            Logger.getLogger(Vista.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        ejecutarOpcionAsignatura(1);

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        ejecutarOpcionAsignatura(2);

    }//GEN-LAST:event_jButton5ActionPerformed

    private void asignaturaTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_asignaturaTxtKeyPressed

    }//GEN-LAST:event_asignaturaTxtKeyPressed

    private void asignaturaTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_asignaturaTxtKeyTyped
        // TODO add your handling code here:
        ValidarL(evt);

    }//GEN-LAST:event_asignaturaTxtKeyTyped

    private void codigoTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codigoTxtKeyTyped
        // TODO add your handling code here:
        ValidarN(evt);
    }//GEN-LAST:event_codigoTxtKeyTyped

    private void creditoTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_creditoTxtKeyTyped
        // TODO add your handling code here:
        ValidarN(evt);
    }//GEN-LAST:event_creditoTxtKeyTyped

    private void semestreTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_semestreTxtKeyTyped
        // TODO add your handling code here:
        ValidarN(evt);
    }//GEN-LAST:event_semestreTxtKeyTyped

    private void cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_cerrarActionPerformed

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        // TODO add your handling code here:
        this.setState(ICONIFIED);
    }//GEN-LAST:event_jButton6MouseClicked

    int xx, yy;

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        // TODO add your handling code here:
        xx = evt.getX();
        yy = evt.getY();


    }//GEN-LAST:event_jPanel1MousePressed
    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged

        this.setLocation(this.getLocation().x + evt.getX() - xx, this.getLocation().y + evt.getY() - yy);

    }//GEN-LAST:event_jPanel1MouseDragged

    
    int HEIGHTF = 391;
    boolean isMenu = true;
    
      
    
    private void jLabel8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MousePressed
        // TODO add your handling code here:
        if(isMenu){
            isMenu = false;
            this.setSize(1030, HEIGHTF);
        }else{
            isMenu = true;
            this.setSize(730, HEIGHTF);
   
        }
    }//GEN-LAST:event_jLabel8MousePressed

    private void jLabel8MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseReleased
        // TODO add your handling code here:
        if(isMenu){
            jPanel1.setLocation(30, 0);
//            jPanel2.setSize(0, HEIGHTF);
                jPanel2.setLocation(-300,0);
        }else{
            jPanel1.setLocation(330, 0);
//            jPanel2.setSize(300, HEIGHTF);
                jPanel2.setLocation(30,0);

        }
    }//GEN-LAST:event_jLabel8MouseReleased
   
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
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField asignaturaTxt;
    private javax.swing.JButton cerrar;
    private javax.swing.JTextField codigoTxt;
    private javax.swing.JTextField creditoTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField semestreTxt;
    // End of variables declaration//GEN-END:variables
}
