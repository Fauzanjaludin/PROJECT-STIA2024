/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiproject;

//import static com.sun.xml.internal.fastinfoset.alphabet.BuiltInRestrictedAlphabets.table;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author khairinkasmadi
 */
public class BillGUI extends javax.swing.JFrame {
    
   UserOperation uo=new UserOperation();
   DecimalFormat df = new DecimalFormat(".00");

    /**
     * Creates new form BillGUI
     */
    public BillGUI() {
        initComponents();
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tfBillDate = new javax.swing.JTextField();
        tfAccNum = new javax.swing.JTextField();
        tfName = new javax.swing.JTextField();
        tfAddress = new javax.swing.JTextField();
        tfArrears = new javax.swing.JTextField();
        tfPrevious = new javax.swing.JTextField();
        tfCurrentmeter = new javax.swing.JTextField();
        tfTotalUnit = new javax.swing.JTextField();
        tfCurrentCharge = new javax.swing.JTextField();
        tfTotalBill = new javax.swing.JTextField();
        btnCalculate = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnDisplay = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        DispTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Bill Date");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 14, -1, -1));

        jLabel2.setText("Account Number");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 42, -1, -1));

        jLabel3.setText("Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel4.setText("Address");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 118, -1, -1));

        jLabel5.setText("Arrears");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 156, -1, -1));

        jLabel6.setText("Previous Meter Reading");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 194, -1, -1));

        jLabel7.setText("Current Meter Reading");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 235, -1, -1));

        jLabel8.setText("Total Unit");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 273, -1, -1));

        jLabel9.setText("Current Charge");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 311, -1, -1));

        jLabel10.setText("Total Bill");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 346, -1, -1));
        getContentPane().add(tfBillDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 214, -1));

        tfAccNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAccNumActionPerformed(evt);
            }
        });
        getContentPane().add(tfAccNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 214, -1));
        getContentPane().add(tfName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 214, -1));
        getContentPane().add(tfAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 214, -1));
        getContentPane().add(tfArrears, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 214, -1));
        getContentPane().add(tfPrevious, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 194, 223, -1));
        getContentPane().add(tfCurrentmeter, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 232, 223, -1));

        tfTotalUnit.setEnabled(false);
        getContentPane().add(tfTotalUnit, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 270, 223, -1));
        getContentPane().add(tfCurrentCharge, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 308, 223, -1));
        getContentPane().add(tfTotalBill, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 346, 223, -1));

        btnCalculate.setText("Calculate");
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalculate, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 401, -1, -1));

        btnSave.setText("Save Data");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 401, -1, -1));

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 401, -1, -1));

        btnDisplay.setText("Display All");
        btnDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplayActionPerformed(evt);
            }
        });
        getContentPane().add(btnDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 401, -1, -1));

        btnEdit.setText("Edit");
        getContentPane().add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 401, -1, -1));

        btnDelete.setText("Delete");
        getContentPane().add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 401, -1, -1));

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        getContentPane().add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 401, -1, -1));

        jButton7.setText("Exit");
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1197, 820, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 11, 798, 355));

        DispTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Account Number", "Name", "Address", "Arrears", "Previous Meter ", "Current Meter", "Total Unit", "Current Charge", "Total Bill"
            }
        ));
        jScrollPane2.setViewportView(DispTable);
        DispTable.getAccessibleContext().setAccessibleName("");

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 1171, 314));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane3.setViewportView(jTextArea2);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 610, -1, -1));

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane4.setViewportView(jTextArea3);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 630, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfAccNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAccNumActionPerformed
       
    }//GEN-LAST:event_tfAccNumActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
       Data user;
       UserOperation userOperation = new UserOperation();   //save data
       int date = Integer.parseInt(tfBillDate.getText());
       int accnum = Integer.parseInt(tfAccNum.getText());
       String name = tfName.getText();
       String address = tfAddress.getText();
       double arrears = Double.parseDouble(tfArrears.getText());
       double previous = Double.parseDouble(tfPrevious.getText());
       double current = Double.parseDouble(tfCurrentmeter.getText());
       
       double totalunit = current - previous;  //current meter - previous meter = 
       tfTotalUnit.setText(String.valueOf(totalunit));
       
       
       double currentcharge = Double.parseDouble(tfCurrentCharge.getText());
       double totalbill = arrears + currentcharge;
       tfTotalBill.setText(String.valueOf(totalbill));
       
       user = new Data(date, accnum, name, address, arrears, previous, current, totalunit, currentcharge, totalbill);  //arrangement must same
                  //must save in the object 
        try {      //
            userOperation.addRecord(user);  //save in text file using method addrecord which have method in the class useroperation / add record into tfile
        } catch (IOException ex) {
            //Logger.getLogger(BillGUI.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
            
        }
        JOptionPane.showMessageDialog(null, "The record has been saved successfully");
                
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
       
       double previousmeter = Double.parseDouble(tfPrevious.getText());  //convert String to double
       double currentmeter = Double.parseDouble(tfCurrentmeter.getText());
     
       double totalunit = currentmeter - previousmeter;  //this is in double 
       tfTotalUnit.setText(String.valueOf(totalunit));   //convert to String
       
       double arrears = Double.parseDouble(tfArrears.getText());
       double currentcharge = uo.calctariff(totalunit);
       tfCurrentCharge.setText(String.valueOf(df.format(currentcharge)));
       double totalbill = arrears + currentcharge;
       tfTotalBill.setText(String.valueOf(df.format(totalbill)));
       
    }//GEN-LAST:event_btnCalculateActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        tfBillDate.setText("");
        tfAccNum.setText("");
        tfName.setText("");
        tfAddress.setText("");
        tfArrears.setText("");
        tfPrevious.setText("");
        tfCurrentmeter.setText("");
        tfTotalUnit.setText("");
        tfCurrentCharge.setText("");
        tfTotalBill.setText("");
        
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisplayActionPerformed
       try {
           
           ArrayList <Data> usr;
           
           usr=uo.getData();
           DefaultTableModel model;
           model = (DefaultTableModel) DispTable.getModel();
           for(int i=0;i<usr.size();i++){
               model.addRow(new Object[]{
                   usr.get(i).getDate(),
                   usr.get(i).getAccnum(),
                   usr.get(i).getName(),
                   usr.get(i).getAddress(),
                   usr.get(i).getArrears(),
                   usr.get(i).getPrevious(),
                   usr.get(i).getCurrent(),
                   usr.get(i).getTotalunit(),
                   usr.get(i).getCurrentcharge(),
                   usr.get(i).getTotalbill(),
               });
                      String b="Date                  :"+usr.get(i).getDate()+"\n"
                +"Account Number        :"+usr.get(i).getAccnum()+"\n"
                +"Name                  :"+usr.get(i).getName()+"\n"
                +"Address               :"+usr.get(i).getAddress()+"\n"
                +"Arrears               :"+usr.get(i).getArrears()+"\n"
                +"Previous              :"+usr.get(i).getPrevious()+"\n"
                +"Current               :"+usr.get(i).getCurrent()+"\n"
                +"Total Unit            :"+usr.get(i).getTotalunit()+"\n"
                +"Current Charge        :"+usr.get(i).getCurrentcharge()+"\n"
                +"Total Bill            :"+usr.get(i).getTotalbill()+"\n";
        
        jTextArea1.setText(b);
        
           }
           
       } catch (Exception ex) {
           Logger.getLogger(BillGUI.class.getName()).log(Level.SEVERE, null, ex);
       }
        
        
    }//GEN-LAST:event_btnDisplayActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        Data ax=null;
        int a=0;
        String b;
        try{
     
        a=Integer.parseInt(JOptionPane.showInputDialog("Input Value", null));
        ax=uo.findRecord(a);
        if(ax==null){
            JOptionPane.showMessageDialog(rootPane, "Record Not Found");
        }else{
               b="Date                  :"+ax.getDate()+"\n"
                +"Account Number        :"+ax.getAccnum()+"\n"
                +"Name                  :"+ax.getName()+"\n"
                +"Address               :"+ax.getAddress()+"\n"
                +"Arrears               :"+ax.getArrears()+"\n"
                +"Previous              :"+ax.getPrevious()+"\n"
                +"Current               :"+ax.getCurrent()+"\n"
                +"Total Unit            :"+ax.getTotalunit()+"\n"
                +"Current Charge        :"+ax.getCurrentcharge()+"\n"
                +"Total Bill            :"+ax.getTotalbill()+"\n";
        
        jTextArea1.setText(b);
        }
        }catch(Exception e1){
            
        }
    }//GEN-LAST:event_btnSearchActionPerformed

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
            java.util.logging.Logger.getLogger(BillGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BillGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BillGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BillGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BillGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DispTable;
    private javax.swing.JButton btnCalculate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDisplay;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextField tfAccNum;
    private javax.swing.JTextField tfAddress;
    private javax.swing.JTextField tfArrears;
    private javax.swing.JTextField tfBillDate;
    private javax.swing.JTextField tfCurrentCharge;
    private javax.swing.JTextField tfCurrentmeter;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfPrevious;
    private javax.swing.JTextField tfTotalBill;
    private javax.swing.JTextField tfTotalUnit;
    // End of variables declaration//GEN-END:variables
}
