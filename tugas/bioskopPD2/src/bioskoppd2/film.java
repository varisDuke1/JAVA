/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bioskoppd2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Firda
 */
public class film extends javax.swing.JFrame {

    private static Connection koneksi;
    private DefaultTableModel model;

    private static Connection buka_koneksi() {
        if (koneksi == null) {
            try {
                String url = "jdbc:mysql://localhost:3306/bioskoppd";
                String user = "root";
                String password = "";

                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksi = DriverManager.getConnection(url, user, password);
            } catch (SQLException t) {
                System.out.println("Error Membuat Koneksi");
            }
        }
        return koneksi;
    }

    private void ambil_data_tab() {
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        try {
            Connection c = buka_koneksi();
            java.sql.Statement s = c.createStatement();
            String sql = "select * from t_film";
            ResultSet r = s.executeQuery(sql);

            while (r.next()) {
                Object[] o = new Object[6];
                o[0] = r.getString("id_film");
                o[1] = r.getString("judul_film");
                o[2] = r.getString("genre");
                o[3] = r.getString("id_studio");
                o[4] = r.getString("jadwal_tayang");
                o[5] = r.getString("jam_mulai");

                model.addRow(o);

            }
            r.close();
            s.close();

        } catch (SQLException e) {
            System.out.println("Terjadi Kesalahan " + e.getMessage());
        }
    }

    private void ambil_tabel_klik() {
        int i = this.jTable1.getSelectedRow();
        String id = (String) model.getValueAt(i, 0);
        this.idfilm.setText(id);
        String jdl = (String) model.getValueAt(i, 1);
        judul.setText(jdl);
        String gnr = (String) model.getValueAt(i, 2);
        this.genre.setText(gnr);
        String jad = (String) model.getValueAt(i, 4);
        this.jdwl.setText(jad);
    }

    public void calendar() {
        Calendar tanggal = new GregorianCalendar();
        int bulan = tanggal.get(Calendar.MONTH) + 1;
        int tgl = tanggal.get(Calendar.DAY_OF_MONTH);
        int tahun = tanggal.get(Calendar.YEAR);

        this.jdwl.setText("" + tahun + "-" + bulan + "-" + tgl);
    }

    public void combo() {
        try {
            cIdstudio.addItem("");
            Connection koneksi = buka_koneksi();
            java.sql.Statement stt = koneksi.createStatement();
            String SQL = "select id_studio from t_jenis_studio";
            ResultSet a = stt.executeQuery(SQL);
            while (a.next()) {
                cIdstudio.addItem(a.getString(0));
            }
            stt.close();
            koneksi.close();
        } catch (SQLException err) {
            System.out.println(err);
        }
    }

    /**
     * Creates new form film
     */
    public film() {
        initComponents();
        model = new DefaultTableModel();
        this.jTable1.setModel(model);
        model.addColumn("id_film");
        model.addColumn("judul_film");
        model.addColumn("genre");
        model.addColumn("id_studio");
        model.addColumn("jadwal_tayang");
        model.addColumn("jam_mulai");
        ambil_data_tab();
        calendar();
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
        jLabel1 = new javax.swing.JLabel();
        idfilm = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        judul = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        genre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jdwl = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        cCari = new javax.swing.JComboBox();
        cari = new javax.swing.JTextField();
        btnCari = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        cIdstudio = new javax.swing.JComboBox();
        cJammulai = new javax.swing.JComboBox();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID Film");

        idfilm.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Judul Film");

        judul.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Genre");

        genre.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ID Studio");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Jadwal Tayang");

        jdwl.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N

        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Film", "Judul Film", "Genre", "ID Studio", "Jadwal Tayang"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        cCari.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        cCari.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ID Film", "Judul Film", "Genre", "ID Studio", "Jadwal Tayang", "Jam Mulai" }));

        cari.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N

        btnCari.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btnCari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/1400136310_google_web_search.png"))); // NOI18N
        btnCari.setText("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        btnSimpan.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btnSimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/1400151006_vintage11.png"))); // NOI18N
        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnUbah.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btnUbah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ubah.png"))); // NOI18N
        btnUbah.setText("Ubah");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });

        btnHapus.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btnHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/hps.png"))); // NOI18N
        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnRefresh.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btnRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/1400151695_arrow-sync.png"))); // NOI18N
        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Jam Mulai");

        cIdstudio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "221", "222", "223", "212" }));

        cJammulai.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "13.00", "15.00", "18.00", "21.00" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(244, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(280, 280, 280))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(111, 111, 111))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(73, 73, 73)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(genre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                                .addComponent(judul, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(idfilm, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jdwl, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(cJammulai, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cIdstudio, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(417, 417, 417))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(257, 257, 257)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnUbah, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cCari, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(cari, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCari, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idfilm, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(judul, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genre, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cIdstudio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jdwl, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cJammulai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpan)
                    .addComponent(btnUbah)
                    .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRefresh))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cari, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCari, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/master.png"))); // NOI18N
        jMenu1.setText("Master");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/film.png"))); // NOI18N
        jMenuItem1.setText("Film");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/userr.png"))); // NOI18N
        jMenuItem2.setText("User");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/stu.png"))); // NOI18N
        jMenuItem5.setText("Bangku");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/trans.png"))); // NOI18N
        jMenu2.setText("Transaksi");

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/tran.png"))); // NOI18N
        jMenuItem3.setText("Pemesanan");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/kel.png"))); // NOI18N
        jMenu4.setText("Keluar");

        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/keluar.png"))); // NOI18N
        jMenuItem8.setText("Keluar");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem8);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here
        new film().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        new pengguna().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        new bangku().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        new menu_studio().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        new login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        ambil_tabel_klik();
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        // TODO add your handling code here:
        if (cari.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Isi Kolom Cari!!", "Alert!", JOptionPane.ERROR_MESSAGE);
        } else {
            model.getDataVector().removeAllElements();
            model.fireTableDataChanged();
            try {
                Connection c = buka_koneksi();
                java.sql.Statement s = c.createStatement();
                String sql = "";
                if (cCari.getSelectedIndex() == 0) {
                    sql = "select * from t_film where id_film like '%" + cari.getText() + "%'";
                } else if (cCari.getSelectedIndex() == 1) {
                    sql = "select * from t_film where judul_film like '%" + cari.getText() + "%'";
                } else if (cCari.getSelectedIndex() == 2) {
                    sql = "select * from t_film where genre like '%" + cari.getText() + "%'";
                } else if (cCari.getSelectedIndex() == 3) {
                    sql = "select * from t_film where id_studio like '%" + cari.getText() + "%'";
                } else if (cCari.getSelectedIndex() == 4) {
                    sql = "select * from t_film where jadwal_tayang like '%" + cari.getText() + "%'";
                } else if (cCari.getSelectedIndex() == 5) {
                    sql = "select * from t_film where jam_mulai like '%" + cari.getText() + "%'";
                }
                ResultSet q = s.executeQuery(sql);

                while (q.next()) {
                    Object[] o = new Object[6];
                    o[0] = q.getString("id_film");
                    o[1] = q.getString("judul_film");
                    o[2] = q.getString("genre");
                    o[3] = q.getString("id_studio");
                    o[4] = q.getString("jadwal_tayang");
                    o[5] = q.getString("jam_mulai");

                    model.addRow(o);
                }
                q.close();
                s.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, "Maaf, Masih Ada Kesalahan\n" + ex.getMessage() + "'", "ERROR!!!", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnCariActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:
        String q = idfilm.getText();
        String w = judul.getText();
        String e = genre.getText();
        String t = jdwl.getText();
        if (q.length() == 0 && w.length() == 0 && e.length() == 0 && t.length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Masih Banyak Yang Kosong", "Alert!", JOptionPane.ERROR_MESSAGE);
        } else if (q.length() == 0 && w.length() != 0 && e.length() != 0 && t.length() != 0) {
            JOptionPane.showMessageDialog(rootPane, "ID Film Masih Kosong", "Alert!", JOptionPane.ERROR_MESSAGE);
        } else if (q.length() != 0 && w.length() == 0 && e.length() != 0 && t.length() != 0) {
            JOptionPane.showMessageDialog(rootPane, "Judul Film Masih Kosong", "Alert!", JOptionPane.ERROR_MESSAGE);
        } else if (q.length() != 0 && w.length() != 0 && e.length() == 0 && t.length() != 0) {
            JOptionPane.showMessageDialog(rootPane, "Genre Masih Kosong", "Alert!", JOptionPane.ERROR_MESSAGE);
        } else if (q.length() != 0 && w.length() != 0 && e.length() != 0 && t.length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Jadwal Tayang Masih Kosong", "Alert!", JOptionPane.ERROR_MESSAGE);
        } else {
            Connection conn = null;
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/bioskoppd";
            String user = "root";
            String password = "";
            try {
                conn = DriverManager.getConnection(url, user, password);
                java.sql.Statement stt = conn.createStatement();
                String SQL = "insert into t_film values('" + idfilm.getText() + "','"
                        + judul.getText()
                        + "','" + genre.getText()
                        + "','" + cIdstudio.getSelectedItem() + "','"
                        + jdwl.getText() + "' , '"
                        + cJammulai.getSelectedItem()
                        + "')";
                stt.executeUpdate(SQL);
                stt.close();
                conn.close();
                JOptionPane.showMessageDialog(this, "Data Berhasil Disimpan");
                ambil_data_tab();
                idfilm.setText(null);
                judul.setText(null);
                genre.setText(null);
                jdwl.setText(null);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, "Maaf, Masih Ada Kesalahan\n" + ex.getMessage() + "'", "ERROR!!!", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        // TODO add your handling code here:
        Connection conn = null;
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/bioskoppd";
        String user = "root";
        String pass = "";
        try {
            conn = DriverManager.getConnection(url, user, pass);
            java.sql.Statement stt = conn.createStatement();
            String SQL = "update t_film set judul_film='"
                    + judul.getText() + "',genre='"
                    + genre.getText()
                    + "',id_studio='" + cIdstudio.getSelectedItem() + "',jadwal_tayang='"
                    + jdwl.getText() + "',jam_mulai='"
                    + cJammulai.getSelectedItem() + "' where id_film = '" + idfilm.getText() + "'";
            stt.executeUpdate(SQL);
            stt.close();
            conn.close();
            JOptionPane.showMessageDialog(this, "Data berhasil diubah");
            ambil_data_tab();
            idfilm.setText(null);
            judul.setText(null);
            genre.setText(null);
            jdwl.setText(null);
            cari.setText(null);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Maaf, Masih Ada Kesalahan\n" + ex.getMessage() + "'", "ERROR!!!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnUbahActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(rootPane, "Apakah Anda Ingin Menghapus?", "EXIT",
                JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
        switch (a) {
            case 0:
                Connection c = buka_koneksi();
                String sqlkode = "Delete from t_film "
                        + "where id_film = '" + this.idfilm.getText() + "'";
                try {
                    PreparedStatement p2 = (PreparedStatement) c.prepareStatement(sqlkode);
                    p2.executeUpdate();
                    p2.close();
                    idfilm.setText(null);
                    judul.setText(null);
                    genre.setText(null);
                    jdwl.setText(null);
                    cari.setText(null);
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(rootPane, "Maaf, Masih Ada Kesalahan\n" + ex.getMessage() + "'", "ERROR!!!", JOptionPane.ERROR_MESSAGE);
                }
                ambil_data_tab();
                break;
            case 1:
                JOptionPane.showMessageDialog(this, "Lanjutkan Pekerjaan Anda");
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        ambil_data_tab();
        idfilm.setText(null);
        judul.setText(null);
        genre.setText(null);
        jdwl.setText(null);
        cari.setText(null);
    }//GEN-LAST:event_btnRefreshActionPerformed

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
            java.util.logging.Logger.getLogger(film.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(film.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(film.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(film.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new film().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnUbah;
    private javax.swing.JComboBox cCari;
    private javax.swing.JComboBox cIdstudio;
    private javax.swing.JComboBox cJammulai;
    private javax.swing.JTextField cari;
    private javax.swing.JTextField genre;
    private javax.swing.JTextField idfilm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jdwl;
    private javax.swing.JTextField judul;
    // End of variables declaration//GEN-END:variables
}
