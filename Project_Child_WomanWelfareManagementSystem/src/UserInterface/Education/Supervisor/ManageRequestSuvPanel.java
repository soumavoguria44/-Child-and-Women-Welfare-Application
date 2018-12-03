/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Education.Supervisor;

import Business.EcoSystem;
import Business.Enterprise.EducationEnterprise;
import Business.Organization.EducationSupervisorOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.DistributorWorkRequest;
import Business.WorkQueue.SupervisorWorkRequest;
import Business.WorkQueue.TeacherWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author souma
 */
public class ManageRequestSuvPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageRequestSuvPanel
     */
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private EducationEnterprise enterprise;
    private EcoSystem system;
    private Organization organization;
    
    public ManageRequestSuvPanel(JPanel userProcessContainer, EcoSystem system, EducationEnterprise enterprise, UserAccount account,Organization organization) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.userAccount=account;
        this.enterprise=enterprise;
        this.system=system;
        this.organization=organization;
        populateTable();
        poupulateStatusTable();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblStatus = new javax.swing.JTable();
        btnAssignToMe = new javax.swing.JButton();
        btnProceed = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblManageRequestSuv = new javax.swing.JTable();

        tblStatus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message", "Sender", "Status", "Receiver", "Result"
            }
        ));
        jScrollPane2.setViewportView(tblStatus);

        btnAssignToMe.setText("Assign to Me");
        btnAssignToMe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignToMeActionPerformed(evt);
            }
        });

        btnProceed.setText("Proceed");
        btnProceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProceedActionPerformed(evt);
            }
        });

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        tblManageRequestSuv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message", "Sender", "Status", "Receiver", "Result"
            }
        ));
        jScrollPane3.setViewportView(tblManageRequestSuv);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(btnAssignToMe)
                        .addGap(268, 268, 268)
                        .addComponent(btnProceed))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBack)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(62, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(59, 59, 59)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(60, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAssignToMe)
                    .addComponent(btnProceed))
                .addGap(42, 42, 42)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBack)
                .addContainerGap(115, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(38, 38, 38)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(351, Short.MAX_VALUE)))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignToMeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignToMeActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblManageRequestSuv.getSelectedRow();
        
        if (selectedRow < 0){
            return;
        }
        
        WorkRequest request = (WorkRequest)tblManageRequestSuv.getValueAt(selectedRow, 0);
        request.setReceiver(userAccount);
        request.setStatus("Pending");
        populateTable();
        
        
    }//GEN-LAST:event_btnAssignToMeActionPerformed
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel)tblManageRequestSuv.getModel();
        
        model.setRowCount(0);
        EducationSupervisorOrganization eduSuvOrg=(EducationSupervisorOrganization) organization;
        for(WorkRequest request : eduSuvOrg.getWorkQueue().getWorkRequestList()){
           
          Object[] row = new Object[5];
            row[0] = request;
            row[1] = request.getSender().getEmployee().getName();
            row[2] = request.getStatus();
            row[3] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            String result=((SupervisorWorkRequest)request).getResult();
            row[4]= result == null ? "Waiting" : result;
            model.addRow(row);   
            
           
        }
    }
    public void poupulateStatusTable()
    {
        DefaultTableModel model = (DefaultTableModel)tblManageRequestSuv.getModel();
        
        model.setRowCount(0);
        EducationSupervisorOrganization eduSuvOrg=(EducationSupervisorOrganization) organization;
        for(WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()){
           
          Object[] row = new Object[5];
            row[0] = request;
            row[1] = request.getSender().getEmployee().getName();
            row[2] = request.getStatus();
            row[3] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            String result=((DistributorWorkRequest)request) !=null ?((DistributorWorkRequest)request).getResult():((TeacherWorkRequest)request).getResult();
            row[4]= result == null ? "Waiting" : result;
            model.addRow(row); 
        }
    }
    private void btnProceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProceedActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblManageRequestSuv.getSelectedRow();
        
        if (selectedRow < 0){
            return;
        }
        SupervisorWorkRequest request = (SupervisorWorkRequest)tblManageRequestSuv.getValueAt(selectedRow, 0);
     
        request.setStatus("Processing");
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("SupervisorAssignmentJPanel", new SupervisorAssignmentJPanel(userProcessContainer, system, enterprise, userAccount,organization,request));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnProceedActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        //EducationSupervisorWorkAreaJPanel eduSupWa = (EducationSupervisorWorkAreaJPanel) component;
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssignToMe;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnProceed;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblManageRequestSuv;
    private javax.swing.JTable tblStatus;
    // End of variables declaration//GEN-END:variables
}
