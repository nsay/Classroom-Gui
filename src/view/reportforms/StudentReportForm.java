package view.reportforms;

import baseclasses.Student;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import model.StudentDataModel;

/**
 * This class contains all the code for the view
 */
public class StudentReportForm extends javax.swing.JFrame {

    public StudentReportForm(StudentDataModel studentData) {
        // Initialize all the components on the form
        initComponents(); 
        
        // Retrieve the list of faculties from the data model
        ArrayList<Student> listOfStudent = studentData.getListOfStudents();

        // Call method that will add all faculties to the text area on the form
        this.populateTextArea(listOfStudent);

        // Call method that will add all faculties to the table on the form
        this.populateTable(listOfStudent);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaOfStudents = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        closeButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableOfStudents = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 500));
        getContentPane().setLayout(null);

        jLabel1.setText("List Of Students At A Glance");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(295, 20, 190, 16);

        textAreaOfStudents.setColumns(20);
        textAreaOfStudents.setRows(5);
        jScrollPane1.setViewportView(textAreaOfStudents);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 45, 720, 124);

        jLabel2.setText("List of Students");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(320, 190, 270, 16);

        closeButton.setText("Close");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(closeButton);
        closeButton.setBounds(300, 380, 120, 29);

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        tableOfStudents.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "Address", "SSN"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableOfStudents.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tableOfStudents.setColumnSelectionAllowed(true);
        jScrollPane3.setViewportView(tableOfStudents);
        tableOfStudents.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(10, 220, 720, 138);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * Private method that will add all students to the text area on the form
     */
    private void populateTextArea(ArrayList<Student> listOfStudent) {

        // Initialize the string which will hold the data for the text area
        // Start with labels
        String allStudentText = "Name\tAddress\tSSN\n";

        // Loop through the list and add the students to the text area,
        // Each time adding a cr/lf between items for readibility.
        for (int i = 0; i < listOfStudent.size(); i++) {
            Student aStudent = listOfStudent.get(i);
            String name = aStudent.getName();
            String address = aStudent.getAddress();
            String ssn = aStudent.getSocialSecurityNumber();
            allStudentText += name;
            allStudentText += "\t";
            allStudentText += address;
            allStudentText += "\t";
            allStudentText += ssn;
            allStudentText += "\n";
        }
        // Once all the data is in the string, set the text of the text area to the string value
        textAreaOfStudents.setText(allStudentText);

    }

    /**
     * Private method that will add all students to the table on the form
     */
    private void populateTable(ArrayList<Student> listOfStudents) {

        // A table model like this will hold the data for the JTable (this is the M in MVC)
        DefaultTableModel defaultTableModel = new DefaultTableModel();

        // add columns to table model
        defaultTableModel.addColumn("Name");
        defaultTableModel.addColumn("Address");
        defaultTableModel.addColumn("SSN");

        // Link the data model to the table
        tableOfStudents.setModel(defaultTableModel);

        // Add the students in the ArrayList to the table model
        for (Student aStudent : listOfStudents) {

            // Create a vector that is one row in the table
            Vector aStudentForTable = new Vector();

            // Add the data to the vector
            aStudentForTable.add(aStudent.getName());
            aStudentForTable.add(aStudent.getAddress());
            aStudentForTable.add(aStudent.getSocialSecurityNumber());

            // Add the vector to the  data model that is connected to the JTable
            defaultTableModel.addRow(aStudentForTable);

            tableOfStudents.setModel(defaultTableModel);
        }
    }
    
    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_closeButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tableOfStudents;
    private javax.swing.JTextArea textAreaOfStudents;
    // End of variables declaration//GEN-END:variables
}
