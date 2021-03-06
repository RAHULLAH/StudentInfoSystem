
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class ViewGrades extends javax.swing.JFrame {

    DefaultComboBoxModel teamBox;
    String grade;

    /**
     * Creates new form ViewGrades
     */
    public ViewGrades() {
        initComponents();
        File file = new File("course.dat");
        Scanner scnr = null;
        String[] line;
        int flg;
        int noofitem = 0;
        int i = 100;
        String[] id = new String[100];

        try {
            scnr = new Scanner(file);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AddStudent.class.getName()).log(Level.SEVERE, null, ex);
        }
        while (scnr.hasNextLine()) {
            line = new String[i - 99];
            line[i - 100] = scnr.nextLine();
            String[] split = line[i - 100].split(("\\,"));
            id[i - 100] = split[0];
            i++;
        }
        String[] chkid = new String[i];
        chkid[0] = "Select";
        for (int j = 1; j < i - 99; j++) {
            chkid[j] = id[j - 1];
        }
        teamBox = new DefaultComboBoxModel(chkid);
        jComboBoxCourseID.setModel(teamBox);
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
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtcoursenm = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jComboBoxCourseID = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxStudentID = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxcourseyr = new javax.swing.JComboBox<>();
        jComboBoxcoursesem = new javax.swing.JComboBox<>();
        txtstunm = new javax.swing.JTextField();
        txtgrd = new javax.swing.JTextField();
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

        jLabel1.setText("View Grades");

        jLabel7.setText("Course Year");

        jLabel2.setText("Select CourseID");

        jLabel8.setText("Course Semester");

        txtcoursenm.setEditable(false);

        jLabel6.setText("Grade");

        jComboBoxCourseID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        jComboBoxCourseID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCourseIDActionPerformed(evt);
            }
        });

        jLabel3.setText("Select StudentID");

        jComboBoxStudentID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", " " }));
        jComboBoxStudentID.setEnabled(false);
        jComboBoxStudentID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxStudentIDActionPerformed(evt);
            }
        });

        jLabel4.setText("Student Name");

        jLabel5.setText("Course Name");

        jComboBoxcourseyr.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "1", "2", "3", "4", "5", "6" }));
        jComboBoxcourseyr.setEnabled(false);
        jComboBoxcourseyr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxcourseyrActionPerformed(evt);
            }
        });

        jComboBoxcoursesem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        jComboBoxcoursesem.setEnabled(false);
        jComboBoxcoursesem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxcoursesemActionPerformed(evt);
            }
        });

        txtstunm.setEditable(false);

        txtgrd.setEditable(false);

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
                .addGap(214, 214, 214)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxCourseID, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxcourseyr, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(82, 82, 82)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBoxStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBoxcoursesem, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtgrd, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(285, 285, 285)
                            .addComponent(txtstunm, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(113, 113, 113)
                            .addComponent(txtcoursenm, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(78, 78, 78))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBoxCourseID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBoxStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jComboBoxcourseyr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxcoursesem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtstunm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtcoursenm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtgrd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuregstuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuregstuActionPerformed
        ViewGrades vgrd = new ViewGrades();
        AddStudent adds = new AddStudent();
        adds.setVisible(true);
        vgrd.setVisible(false);
        dispose();
    }//GEN-LAST:event_menuregstuActionPerformed

    private void menustuviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menustuviewActionPerformed
        ViewGrades vgrd = new ViewGrades();
        ViewStudent vstu = new ViewStudent();
        vstu.setVisible(true);
        vgrd.setVisible(false);
        dispose();
    }//GEN-LAST:event_menustuviewActionPerformed

    private void menusearchstuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menusearchstuActionPerformed
        ViewGrades vgrd = new ViewGrades();
        SearchStudent sstu = new SearchStudent();
        sstu.setVisible(true);
        vgrd.setVisible(false);
        dispose();
    }//GEN-LAST:event_menusearchstuActionPerformed

    private void menuaddcourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuaddcourseActionPerformed
        ViewGrades vgrd = new ViewGrades();
        AddCourse acourse = new AddCourse();
        acourse.setVisible(true);
        vgrd.setVisible(false);
        dispose();
    }//GEN-LAST:event_menuaddcourseActionPerformed

    private void menuviewcourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuviewcourseActionPerformed
        ViewGrades vgrd = new ViewGrades();
        ViewCourse vcourse = new ViewCourse();
        vcourse.setVisible(true);
        vgrd.setVisible(false);
        dispose();
    }//GEN-LAST:event_menuviewcourseActionPerformed

    private void menuassigncourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuassigncourseActionPerformed
        
    }//GEN-LAST:event_menuassigncourseActionPerformed

    private void menuaddgradesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuaddgradesActionPerformed
        ViewGrades vgrd = new ViewGrades();
        AddGrade agrd = new AddGrade();
        agrd.setVisible(true);
        vgrd.setVisible(false);
        dispose();
    }//GEN-LAST:event_menuaddgradesActionPerformed

    private void menuviewgradesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuviewgradesActionPerformed
        ViewGrades vggrd = new ViewGrades();
        ViewGrades vgrd = new ViewGrades();
        vgrd.setVisible(true);
        vggrd.setVisible(false);
        dispose();
    }//GEN-LAST:event_menuviewgradesActionPerformed

    private void jComboBoxCourseIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCourseIDActionPerformed

        jComboBoxStudentID.setEnabled(true);
        if (jComboBoxCourseID.getSelectedIndex() == 0) {
            jComboBoxStudentID.setEnabled(false);
        } else {
            jComboBoxStudentID.setSelectedIndex(0);
        }
        jComboBoxcourseyr.setEnabled(false);
        jComboBoxcoursesem.setEnabled(false);
        txtstunm.setText("");
        txtgrd.setText("");
        txtcoursenm.setText("");

        File file = new File("student.dat");
        String[] line = null;
        int i = 1;
        String[] id = new String[100];
        Scanner scnr = null;

        try {
            scnr = new Scanner(file);
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        }
        while (scnr.hasNextLine()) {
            line = new String[i];
            line[i - 1] = scnr.nextLine();
            String[] split = line[i - 1].split(("\\,"));
            id[i - 1] = split[0];
            //            studentname = split[1];
            i++;
        }
        String[] chkid = new String[i];
        chkid[0] = "Select";
        for (int j = 1; j < i; j++) {
            chkid[j] = id[j - 1];
        }
        teamBox = new DefaultComboBoxModel(chkid);
        jComboBoxStudentID.setModel(teamBox);
    }//GEN-LAST:event_jComboBoxCourseIDActionPerformed

    private void jComboBoxStudentIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxStudentIDActionPerformed
        jComboBoxcourseyr.setEnabled(true);
        if (jComboBoxStudentID.getSelectedIndex() == 0) {
            jComboBoxcourseyr.setEnabled(false);
        } else {
            jComboBoxcourseyr.setSelectedIndex(0);
        }
        jComboBoxcoursesem.setEnabled(false);
        txtstunm.setText("");
        txtgrd.setText("");
        txtcoursenm.setText("");
    }//GEN-LAST:event_jComboBoxStudentIDActionPerformed

    private void jComboBoxcourseyrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxcourseyrActionPerformed
        jComboBoxcoursesem.setEnabled(true);
        if (jComboBoxcourseyr.getSelectedIndex() == 0) {
            jComboBoxcoursesem.setEnabled(false);
        } else {
            jComboBoxcoursesem.setSelectedIndex(0);
        }
        txtstunm.setText("");
        txtgrd.setText("");
        txtcoursenm.setText("");
    }//GEN-LAST:event_jComboBoxcourseyrActionPerformed

    private void jComboBoxcoursesemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxcoursesemActionPerformed

        if (jComboBoxCourseID.getSelectedIndex()==0 || jComboBoxStudentID.getSelectedIndex()==0 || jComboBoxcoursesem.getSelectedIndex()==0 || jComboBoxcourseyr.getSelectedIndex()==0) {
        } else {
            int checkavailgrd = checkredun();
            if (checkavailgrd == 0) {
                txtstunm.setText("");
                txtgrd.setText("");
                txtcoursenm.setText("");
                JOptionPane.showMessageDialog(null, "Student is not graded or Grade not Available", "Message", JOptionPane.INFORMATION_MESSAGE);
            } else {
                //reset();
                String[] line;
                int noofitem = 0;
                Scanner scnr = null;
                File file1 = new File("course.dat");
                File file2 = new File("student.dat");
                int flg = jComboBoxCourseID.getSelectedIndex();
                if (flg == 0) {
                    //  set();
                    JOptionPane.showMessageDialog(null, " Select a Course ID", "Message", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    try {
                        scnr = new Scanner(file1);
                    } catch (FileNotFoundException ex) {
                        System.out.println("File not found");
                    }
                    while (scnr.hasNextLine()) {
                        line = scnr.nextLine().split("\\,");
                        noofitem++;
                        if (Integer.parseInt(line[0]) == flg + 99) {
                            txtcoursenm.setText(line[1]);
                        }
                    }
                }

                flg = jComboBoxStudentID.getSelectedIndex();
                noofitem = 0;
                if (flg == 0) {
                    // set();
                    JOptionPane.showMessageDialog(null, " Select a Student ID", "Message", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    try {
                        scnr = new Scanner(file2);
                    } catch (FileNotFoundException ex) {
                        System.out.println("File not found");
                    }
                    while (scnr.hasNextLine()) {
                        line = scnr.nextLine().split("\\,");
                        noofitem++;
                        if (Integer.parseInt(line[0]) == flg) {
                            txtstunm.setText(line[1]);
                        }
                    }
                }

                txtgrd.setText(grade);
            }
        }
    }//GEN-LAST:event_jComboBoxcoursesemActionPerformed

    private void menuassignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuassignActionPerformed
        ViewGrades vgrd = new ViewGrades();
        EnrollStudents enrstu = new EnrollStudents();
        enrstu.setVisible(true);
        vgrd.setVisible(false);
        dispose();
    }//GEN-LAST:event_menuassignActionPerformed

    public int checkredun() {
        String[] line = null;
        Scanner scnr = null;
        File file = new File("grading.dat");
        int i = 1;
        int flag = 0;
        int k = 0;
        String sidd = jComboBoxStudentID.getSelectedItem().toString();
        String crsyr = jComboBoxcourseyr.getSelectedItem().toString();
        String crssem = jComboBoxcoursesem.getSelectedItem().toString();
        String crsid = jComboBoxCourseID.getSelectedItem().toString();
        try {
            scnr = new Scanner(file);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AddStudent.class.getName()).log(Level.SEVERE, null, ex);
        }
        while (scnr.hasNextLine()) {
            line = new String[i];
            line[i - 1] = scnr.nextLine();
            String[] split = line[i - 1].split(("\\,"));
            if (split[0].equals(sidd) && split[1].equals(crsyr) && split[2].equals(crssem) && split[3].equals(crsid)) {
                flag = 1;
                grade = split[4];
            }
            i++;
        }
        return flag;
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
            java.util.logging.Logger.getLogger(ViewGrades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewGrades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewGrades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewGrades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewGrades().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuStureg;
    private javax.swing.JComboBox<String> jComboBoxCourseID;
    private javax.swing.JComboBox<String> jComboBoxStudentID;
    private javax.swing.JComboBox<String> jComboBoxcoursesem;
    private javax.swing.JComboBox<String> jComboBoxcourseyr;
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
    private javax.swing.JTextField txtcoursenm;
    private javax.swing.JTextField txtgrd;
    private javax.swing.JTextField txtstunm;
    // End of variables declaration//GEN-END:variables
}
