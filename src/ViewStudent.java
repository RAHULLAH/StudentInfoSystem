import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class ViewStudent extends javax.swing.JFrame {

    DefaultComboBoxModel teamBox;
    File file = new File("student.dat");
    Scanner scnr = null;
    String[] line;
    int flg;
    int noofitem = 0;

    /**
     * Creates new form ViewStudent
     */
    public ViewStudent() {
        initComponents();
        String[] line = null;
        int i = 1;
        String[] id = new String[100];

        try {
            scnr = new Scanner(file);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AddStudent.class.getName()).log(Level.SEVERE, null, ex);
        }
        while (scnr.hasNextLine()) {
            line = new String[i];
            line[i - 1] = scnr.nextLine();
            String[] split = line[i - 1].split(("\\,"));
            id[i - 1] = split[0];
            i++;
        }
        String[] chkid = new String[i];
        chkid[0] = "Select";
        for (int j = 1; j < i; j++) {
            chkid[j] = id[j - 1];
        }
        teamBox = new DefaultComboBoxModel(chkid);
        comboIdStu.setModel(teamBox);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        comboIdStu = new javax.swing.JComboBox<>();
        txtstunm = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtareastuadd = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        combogender = new javax.swing.JComboBox<>();
        txtphno = new javax.swing.JTextField();
        txtparentphno = new javax.swing.JTextField();
        txtdob = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnViewStu = new javax.swing.JButton();
        btnupdatestu = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuStureg = new javax.swing.JMenu();
        menuregstu = new javax.swing.JMenuItem();
        menustuview = new javax.swing.JMenuItem();
        menusearchstu = new javax.swing.JMenuItem();
        menuregcourse = new javax.swing.JMenu();
        menuaddcourse = new javax.swing.JMenuItem();
        menuviewcourse = new javax.swing.JMenuItem();
        menuassigncourse = new javax.swing.JMenu();
        menuassign = new javax.swing.JMenuItem();
        jMenu14 = new javax.swing.JMenu();
        menuaddgrades = new javax.swing.JMenuItem();
        menuviewgrades = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("View Students");

        jLabel2.setText("Select Student ID");

        comboIdStu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        comboIdStu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboIdStuActionPerformed(evt);
            }
        });

        txtstunm.setCaretColor(new java.awt.Color(255, 0, 0));
        txtstunm.setEnabled(false);
        txtstunm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtstunmActionPerformed(evt);
            }
        });

        txtareastuadd.setColumns(20);
        txtareastuadd.setRows(5);
        txtareastuadd.setEnabled(false);
        jScrollPane1.setViewportView(txtareastuadd);

        jLabel7.setText("Gender");

        combogender.setEditable(true);
        combogender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Male", "Female" }));
        combogender.setEnabled(false);

        txtphno.setEnabled(false);

        txtparentphno.setEnabled(false);

        txtdob.setEnabled(false);

        jLabel3.setText("Student Name");

        jLabel4.setText("Student Address");

        jLabel5.setText("Phone Number");

        jLabel6.setText("Parents Number");

        jLabel8.setText("D.O.B (dd/mm/yyyy)");

        btnViewStu.setText("View");
        btnViewStu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewStuActionPerformed(evt);
            }
        });

        btnupdatestu.setText("Update");
        btnupdatestu.setEnabled(false);
        btnupdatestu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdatestuActionPerformed(evt);
            }
        });

        MenuStureg.setText("Student");

        menuregstu.setText("Register Student");
        menuregstu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuregstuActionPerformed(evt);
            }
        });
        MenuStureg.add(menuregstu);

        menustuview.setText("View/Edit Student");
        menustuview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menustuviewActionPerformed(evt);
            }
        });
        MenuStureg.add(menustuview);

        menusearchstu.setText("Search Student");
        menusearchstu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menusearchstuActionPerformed(evt);
            }
        });
        MenuStureg.add(menusearchstu);

        jMenuBar1.add(MenuStureg);

        menuregcourse.setText("Courses");

        menuaddcourse.setText("Register Course");
        menuaddcourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuaddcourseActionPerformed(evt);
            }
        });
        menuregcourse.add(menuaddcourse);

        menuviewcourse.setText("View/Edit Course");
        menuviewcourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuviewcourseActionPerformed(evt);
            }
        });
        menuregcourse.add(menuviewcourse);

        jMenuBar1.add(menuregcourse);

        menuassigncourse.setText("Assign Courses");
        menuassigncourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuassigncourseActionPerformed(evt);
            }
        });

        menuassign.setText("Assign");
        menuassign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuassignActionPerformed(evt);
            }
        });
        menuassigncourse.add(menuassign);

        jMenuBar1.add(menuassigncourse);

        jMenu14.setText("Grades");

        menuaddgrades.setText("Add Grades");
        menuaddgrades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuaddgradesActionPerformed(evt);
            }
        });
        jMenu14.add(menuaddgrades);

        menuviewgrades.setText("View Grades");
        menuviewgrades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuviewgradesActionPerformed(evt);
            }
        });
        jMenu14.add(menuviewgrades);

        jMenuBar1.add(jMenu14);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(jLabel2)))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(combogender, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtphno, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtstunm, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(comboIdStu, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnViewStu)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnupdatestu))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                            .addComponent(txtparentphno)
                            .addComponent(txtdob))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboIdStu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewStu)
                    .addComponent(jLabel2)
                    .addComponent(btnupdatestu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtstunm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtphno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(combogender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtparentphno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtdob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtstunmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtstunmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtstunmActionPerformed

    private void btnViewStuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewStuActionPerformed
        noofitem = 0;
        flg = comboIdStu.getSelectedIndex();
        if (flg == 0) {
            set();
            JOptionPane.showMessageDialog(null, " Select a Student ID", "Message", JOptionPane.INFORMATION_MESSAGE);
        } else {
            try {
                scnr = new Scanner(file);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(AddStudent.class.getName()).log(Level.SEVERE, null, ex);
            }
            while (scnr.hasNextLine()) {
                line = scnr.nextLine().split("\\,");
                noofitem++;
                if (Integer.parseInt(line[0]) == flg) {
                    txtstunm.setText(line[1]);
                    txtareastuadd.setText(line[2]);
                    txtphno.setText(line[3]);
                    combogender.setSelectedItem(line[4]);
                    txtparentphno.setText(line[5]);
                    txtdob.setText(line[6]);
                    reset();
                }
            }
        }
    }//GEN-LAST:event_btnViewStuActionPerformed

    private void btnupdatestuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdatestuActionPerformed

        Pattern pattern = Pattern.compile("\\d{10}");
        Matcher matcher = pattern.matcher(txtphno.getText().toString());
        Matcher matcher1 = pattern.matcher(txtparentphno.getText().toString());
        if (txtstunm.getText().equals("") || txtareastuadd.getText().equals("") || txtphno.getText().equals("") || txtparentphno.getText().equals("") || txtdob.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "No field should be left empty", "Message", JOptionPane.INFORMATION_MESSAGE);
        } else if (!matcher.matches() || !matcher1.matches()) {
            JOptionPane.showMessageDialog(null, "Phone Number is no valid.", "Message", JOptionPane.INFORMATION_MESSAGE);
        } else if (!isValidFormat("dd/MM/yyyy", txtdob.getText().toString(), Locale.ENGLISH)) {
            JOptionPane.showMessageDialog(null, "Invalid Date.Please Enter date in format dd/mm/yyyy", "Message", JOptionPane.INFORMATION_MESSAGE);
        } else {
            String[] getStudent = new String[noofitem];
            System.out.println("items: " + noofitem);
            try {
                scnr = new Scanner(file);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(AddStudent.class.getName()).log(Level.SEVERE, null, ex);
            }
            while (scnr.hasNextLine()) {
                line = scnr.nextLine().split("\\,");

                if (Integer.parseInt(line[0]) == flg) {
                    getStudent[flg - 1] = line[0] + "," + txtstunm.getText().toString() + "," + txtareastuadd.getText().toString() + "," + txtphno.getText().toString() + "," + combogender.getSelectedItem().toString() + "," + txtparentphno.getText().toString() + "," + txtdob.getText().toString() + "\n";
                    // reset();
                } else {
                    getStudent[Integer.parseInt(line[0]) - 1] = line[0] + "," + line[1] + "," + line[2] + "," + line[3] + "," + line[4] + "," + line[5] + "," + line[6] + "\n";
                }
            }

            try {
                PrintWriter printWriter = new PrintWriter(new FileWriter("student.dat"));
                for (int l = 0; l < noofitem; l++) {
                    printWriter.print(getStudent[l]);
                }
                printWriter.close();
            } catch (IOException ex) {
                Logger.getLogger(ViewStudent.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnupdatestuActionPerformed

    private void comboIdStuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboIdStuActionPerformed
        set();
    }//GEN-LAST:event_comboIdStuActionPerformed

    private void menuregstuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuregstuActionPerformed
        ViewStudent vStu = new ViewStudent();
        AddStudent adds = new AddStudent();
        adds.setVisible(true);
        vStu.setVisible(false);
        dispose();
    }//GEN-LAST:event_menuregstuActionPerformed

    private void menustuviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menustuviewActionPerformed
        ViewStudent vStu = new ViewStudent();
        ViewStudent vstu = new ViewStudent();
        vstu.setVisible(true);
        vStu.setVisible(false);
        dispose();
    }//GEN-LAST:event_menustuviewActionPerformed

    private void menusearchstuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menusearchstuActionPerformed
        ViewStudent vStu = new ViewStudent();
        SearchStudent sstu = new SearchStudent();
        sstu.setVisible(true);
        vStu.setVisible(false);
        dispose();
    }//GEN-LAST:event_menusearchstuActionPerformed

    private void menuaddcourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuaddcourseActionPerformed
        ViewStudent vStu = new ViewStudent();
        AddCourse acourse = new AddCourse();
        acourse.setVisible(true);
        vStu.setVisible(false);
        dispose();
    }//GEN-LAST:event_menuaddcourseActionPerformed

    private void menuviewcourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuviewcourseActionPerformed
        ViewStudent vStu = new ViewStudent();
        ViewCourse vcourse = new ViewCourse();
        vcourse.setVisible(true);
        vStu.setVisible(false);
        dispose();
    }//GEN-LAST:event_menuviewcourseActionPerformed

    private void menuassigncourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuassigncourseActionPerformed

    }//GEN-LAST:event_menuassigncourseActionPerformed

    private void menuaddgradesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuaddgradesActionPerformed
        ViewStudent vStu = new ViewStudent();
        AddGrade agrd = new AddGrade();
        agrd.setVisible(true);
        vStu.setVisible(false);
        dispose();
    }//GEN-LAST:event_menuaddgradesActionPerformed

    private void menuviewgradesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuviewgradesActionPerformed
        ViewStudent vStu = new ViewStudent();
        ViewGrades vgrd = new ViewGrades();
        vgrd.setVisible(true);
        vStu.setVisible(false);
        dispose();
    }//GEN-LAST:event_menuviewgradesActionPerformed

    private void menuassignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuassignActionPerformed
        ViewStudent vStu = new ViewStudent();
        EnrollStudents enrstu = new EnrollStudents();
        enrstu.setVisible(true);
        vStu.setVisible(false);
        dispose();
    }//GEN-LAST:event_menuassignActionPerformed

    public static boolean isValidFormat(String format, String value, Locale locale) {
        LocalDateTime ldt = null;
        DateTimeFormatter fomatter = DateTimeFormatter.ofPattern(format, locale);

        try {
            ldt = LocalDateTime.parse(value, fomatter);
            String result = ldt.format(fomatter);
            return result.equals(value);
        } catch (DateTimeParseException e) {
            try {
                LocalDate ld = LocalDate.parse(value, fomatter);
                String result = ld.format(fomatter);
                return result.equals(value);
            } catch (DateTimeParseException exp) {
                try {
                    LocalTime lt = LocalTime.parse(value, fomatter);
                    String result = lt.format(fomatter);
                    return result.equals(value);
                } catch (DateTimeParseException e2) {
                    // Debugging purposes
                    //e2.printStackTrace();
                }
            }
        }

        return false;
    }

    public void reset() {
        txtstunm.setEnabled(true);
        txtareastuadd.setEnabled(true);
        txtphno.setEnabled(true);
        combogender.setEnabled(true);
        txtparentphno.setEnabled(true);
        txtdob.setEnabled(true);
        btnupdatestu.setEnabled(true);
    }

    public void set() {
        txtstunm.setText("");
        txtareastuadd.setText("");
        txtphno.setText("");
        combogender.setSelectedIndex(0);
        txtparentphno.setText("");
        txtdob.setText("");

        txtstunm.setEnabled(false);
        txtareastuadd.setEnabled(false);
        txtphno.setEnabled(false);
        combogender.setEnabled(false);
        txtparentphno.setEnabled(false);
        txtdob.setEnabled(false);
        btnupdatestu.setEnabled(false);
    }

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
            java.util.logging.Logger.getLogger(ViewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuStureg;
    private javax.swing.JButton btnViewStu;
    private javax.swing.JButton btnupdatestu;
    private javax.swing.JComboBox<String> comboIdStu;
    private javax.swing.JComboBox<String> combogender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu14;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem menuaddcourse;
    private javax.swing.JMenuItem menuaddgrades;
    private javax.swing.JMenuItem menuassign;
    private javax.swing.JMenu menuassigncourse;
    private javax.swing.JMenu menuregcourse;
    private javax.swing.JMenuItem menuregstu;
    private javax.swing.JMenuItem menusearchstu;
    private javax.swing.JMenuItem menustuview;
    private javax.swing.JMenuItem menuviewcourse;
    private javax.swing.JMenuItem menuviewgrades;
    private javax.swing.JTextArea txtareastuadd;
    private javax.swing.JTextField txtdob;
    private javax.swing.JTextField txtparentphno;
    private javax.swing.JTextField txtphno;
    private javax.swing.JTextField txtstunm;
    // End of variables declaration//GEN-END:variables
}
