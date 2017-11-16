package view.inputforms;

import baseclasses.Classroom;
import baseclasses.Classroom.RoomType;
import exceptionhandling.ErrorDialog;
import exceptionhandling.NoDataException;
import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import model.ClassroomDataModel;
/**
 * This class contains all the code for the view
 */
public class InputClassroomForm extends javax.swing.JFrame {

    ArrayList<Classroom> listOfClassrooms;
            
   public InputClassroomForm(ClassroomDataModel data) {
        // Initialize the components
        initComponents();
        
        // Once the form components are created, create a data model that will
        // hold all the enumerated room types in the drop down component on the form
        DefaultComboBoxModel roomTypeList = new DefaultComboBoxModel(RoomType.values());

        // Once we have the data model we can link it to the drop down component on the form
        typeOfRoomListField.setModel(roomTypeList);
        
        // Retrieve the list of classrooms from the data model and store locally
        this.listOfClassrooms = data.getListOfClassrooms();
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
        roomNumberInputField = new javax.swing.JTextField();
        roomnumberlabel = new javax.swing.JLabel();
        roomtypelabel = new javax.swing.JLabel();
        typeOfRoomListField = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        savebutton = new javax.swing.JButton();
        clearbutton = new javax.swing.JButton();
        closebutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Classroom Input Window");

        roomnumberlabel.setText("Room Number:");

        roomtypelabel.setText("Room Type:");

        typeOfRoomListField.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "RoomType.values()" }));
        typeOfRoomListField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeOfRoomListFieldActionPerformed(evt);
            }
        });

        savebutton.setText("Save");
        savebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebuttonActionPerformed(evt);
            }
        });
        jPanel1.add(savebutton);

        clearbutton.setText("Clear");
        clearbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(clearbutton);

        closebutton.setText("  Exit ");
        closebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closebuttonActionPerformed(evt);
            }
        });
        jPanel1.add(closebutton);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(roomnumberlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(roomtypelabel)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(roomNumberInputField, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(typeOfRoomListField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(84, 84, 84)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(129, 129, 129))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(209, 209, 209))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(roomNumberInputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(roomnumberlabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(roomtypelabel)
                            .addComponent(typeOfRoomListField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void savebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebuttonActionPerformed
        // Create a new classroom object
            Classroom aClassroom = new Classroom();

            // Retrieve the values from the form
            String room = this.roomNumberInputField.getText();            
           
            // If no room number is input, throw an exception and display 
            // the error dialog.  Don't allow the user to continue until the
            // error if fixed.
            try {
                if (room.length() == 0) {
                    throw new NoDataException("Missing room number");
                }
            } catch (NoDataException error) {
                ErrorDialog errordialog = new ErrorDialog(error.getMessage());
                errordialog.setVisible(true);
            }
            
            // The value must come from the drop down list of string values and converted to a RoomType and RoomType value
            // Step 1 - Retrieve the data model associated with the combo list box
            ComboBoxModel datamodel = this.typeOfRoomListField.getModel();
            // Step 2 - Retrieve the selected item
            Object selectedItem = datamodel.getSelectedItem();
            // Step 3 - Convert (Cast) the selected item to a RoomType object
            RoomType roomType = (RoomType) selectedItem;
            // Step 4 - Use the Classroom setters to set the values
            aClassroom.setRoomNumber(room);
            aClassroom.setTypeOfRoom(roomType);
            
            // Add to the list in the data model
            this.listOfClassrooms.add(aClassroom);
    }//GEN-LAST:event_savebuttonActionPerformed

    private void clearbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearbuttonActionPerformed
        this.roomNumberInputField.setText("");
        this.typeOfRoomListField.setSelectedIndex(0);
    }//GEN-LAST:event_clearbuttonActionPerformed

    private void closebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closebuttonActionPerformed
        this.dispose();
    }//GEN-LAST:event_closebuttonActionPerformed

    private void typeOfRoomListFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeOfRoomListFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeOfRoomListFieldActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearbutton;
    private javax.swing.JButton closebutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField roomNumberInputField;
    private javax.swing.JLabel roomnumberlabel;
    private javax.swing.JLabel roomtypelabel;
    private javax.swing.JButton savebutton;
    private javax.swing.JComboBox typeOfRoomListField;
    // End of variables declaration//GEN-END:variables
   

}
