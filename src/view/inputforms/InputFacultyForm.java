package view.inputforms;

import baseclasses.Faculty;
import java.util.ArrayList;
import model.FacultyDataModel;

public class InputFacultyForm extends javax.swing.JFrame  {
    
    ArrayList<Faculty> listOfFaculty;
    /**
     * default constructor
     */
    public InputFacultyForm(FacultyDataModel facultyData) {

        // Initialize all the components on the form
        initComponents();
        
        // Retrieve the list of faculties from the data model and store locally
        this.listOfFaculty = facultyData.getListOfFaculty();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        nameField = new javax.swing.JTextField();
        addressField = new javax.swing.JTextField();
        ssnTextfield = new javax.swing.JTextField();
        exitButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        dateOfBirthYear = new javax.swing.JSpinner();
        dateOfBirthMonth = new javax.swing.JSpinner();
        dateOfBirthDay = new javax.swing.JSpinner();
        dateOfHireDay = new javax.swing.JSpinner();
        dateOfHireMonth = new javax.swing.JSpinner();
        dateOfHireYear = new javax.swing.JSpinner();
        dateOfTerminationYear = new javax.swing.JSpinner();
        dateOfTerminationMonth = new javax.swing.JSpinner();
        dateOfTerminationDay = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        salaryField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        addCourseButton = new javax.swing.JButton();
        statusField = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jFormattedTextField1.setText("jFormattedTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(nameField);
        nameField.setBounds(160, 50, 200, 30);
        getContentPane().add(addressField);
        addressField.setBounds(160, 90, 200, 30);
        getContentPane().add(ssnTextfield);
        ssnTextfield.setBounds(160, 130, 200, 30);

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(exitButton);
        exitButton.setBounds(400, 110, 110, 29);

        jLabel1.setText("Add Faculty");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(220, 10, 150, 16);

        jLabel2.setText("Name:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 50, 130, 16);

        jLabel3.setText("Address:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 90, 140, 16);

        jLabel4.setText("SSN");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 130, 130, 16);

        jLabel5.setText("Data Of Birth");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 190, 140, 20);

        jLabel6.setText("Data Of Hire");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 240, 120, 20);

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        getContentPane().add(saveButton);
        saveButton.setBounds(400, 50, 110, 29);

        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });
        getContentPane().add(clearButton);
        clearButton.setBounds(400, 80, 110, 29);

        jLabel7.setText("Data Of Termination");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 280, 130, 30);

        dateOfBirthYear.setModel(new javax.swing.SpinnerListModel(new String[] {"1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019"}));
        getContentPane().add(dateOfBirthYear);
        dateOfBirthYear.setBounds(160, 190, 60, 30);

        dateOfBirthMonth.setModel(new javax.swing.SpinnerListModel(new String[] {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}));
        getContentPane().add(dateOfBirthMonth);
        dateOfBirthMonth.setBounds(240, 190, 50, 30);

        dateOfBirthDay.setModel(new javax.swing.SpinnerListModel(new String[] {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
        getContentPane().add(dateOfBirthDay);
        dateOfBirthDay.setBounds(310, 190, 50, 30);

        dateOfHireDay.setModel(new javax.swing.SpinnerListModel(new String[] {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
        getContentPane().add(dateOfHireDay);
        dateOfHireDay.setBounds(310, 240, 50, 30);

        dateOfHireMonth.setModel(new javax.swing.SpinnerListModel(new String[] {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}));
        getContentPane().add(dateOfHireMonth);
        dateOfHireMonth.setBounds(240, 240, 50, 30);

        dateOfHireYear.setModel(new javax.swing.SpinnerListModel(new String[] {"1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019"}));
        getContentPane().add(dateOfHireYear);
        dateOfHireYear.setBounds(160, 240, 60, 30);

        dateOfTerminationYear.setModel(new javax.swing.SpinnerListModel(new String[] {"1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019"}));
        getContentPane().add(dateOfTerminationYear);
        dateOfTerminationYear.setBounds(160, 290, 60, 30);

        dateOfTerminationMonth.setModel(new javax.swing.SpinnerListModel(new String[] {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}));
        getContentPane().add(dateOfTerminationMonth);
        dateOfTerminationMonth.setBounds(240, 290, 50, 30);

        dateOfTerminationDay.setModel(new javax.swing.SpinnerListModel(new String[] {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
        getContentPane().add(dateOfTerminationDay);
        dateOfTerminationDay.setBounds(310, 290, 50, 30);

        jLabel8.setText("Month");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(244, 170, 40, 16);

        jLabel9.setText("Year");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(180, 170, 30, 16);

        jLabel10.setText("Day");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(320, 170, 30, 16);

        jLabel12.setText("Status");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(10, 340, 130, 16);
        getContentPane().add(salaryField);
        salaryField.setBounds(160, 390, 130, 26);

        jLabel11.setText("Salary");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(10, 390, 130, 16);

        jLabel13.setText("Enter Single Digits, no spaces, no commas");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(160, 420, 330, 16);

        addCourseButton.setText("Add Courses");
        addCourseButton.setEnabled(false);
        getContentPane().add(addCourseButton);
        addCourseButton.setBounds(400, 140, 110, 29);
        getContentPane().add(statusField);
        statusField.setBounds(160, 340, 130, 26);

        jLabel14.setText("Full Time or Part Time");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(160, 370, 220, 16);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // Create a new faculty object
        Faculty aFaculty = new Faculty();

        // Retrieve the values from the input form
        String name = this.nameField.getText();
        String address = this.addressField.getText();
        String ssn = this.ssnTextfield.getText();
        String status = this.statusField.getText();
        String salary = this.salaryField.getText();

       // Set the values to report form
        aFaculty.setName(name);
        aFaculty.setAddress(address);
        aFaculty.setSocialSecurityNumber(ssn);
        aFaculty.setStatus(status);
        aFaculty.setSalary(Double.valueOf(salary));

        // Add to the list in the data model
        this.listOfFaculty.add(aFaculty);
    }//GEN-LAST:event_saveButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        this.nameField.setText("");
        this.addressField.setText("");
        this.ssnTextfield.setText("");
        this.statusField.setText("");
        this.salaryField.setText("");
        this.dateOfBirthYear.setValue(1950);
        this.dateOfBirthMonth.setValue("Jan");
        this.dateOfBirthDay.setValue(01);
        this.dateOfHireYear.setValue(1950);
        this.dateOfHireMonth.setValue("Jan");
        this.dateOfHireDay.setValue(01);
        this.dateOfBirthYear.setValue(1950);
        this.dateOfBirthMonth.setValue("Jan");
        this.dateOfBirthDay.setValue(01);
    }//GEN-LAST:event_clearButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_exitButtonActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCourseButton;
    private javax.swing.JTextField addressField;
    private javax.swing.JButton clearButton;
    private javax.swing.JSpinner dateOfBirthDay;
    private javax.swing.JSpinner dateOfBirthMonth;
    private javax.swing.JSpinner dateOfBirthYear;
    private javax.swing.JSpinner dateOfHireDay;
    private javax.swing.JSpinner dateOfHireMonth;
    private javax.swing.JSpinner dateOfHireYear;
    private javax.swing.JSpinner dateOfTerminationDay;
    private javax.swing.JSpinner dateOfTerminationMonth;
    private javax.swing.JSpinner dateOfTerminationYear;
    private javax.swing.JButton exitButton;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField salaryField;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField ssnTextfield;
    private javax.swing.JTextField statusField;
    // End of variables declaration//GEN-END:variables
}
