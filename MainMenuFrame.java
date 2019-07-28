package Framework_Gui;

import java.sql.*;

public class MainMenuFrame extends javax.swing.JFrame {

    //Creates new form MainMenu
    public MainMenuFrame() {
        initComponents();
    }

    Connection dbConn;
    String env;
    
    public void getParams(Connection dbConn, String env){
        this.dbConn = dbConn;
        this.env = env;
        renameEnv(env);
    }
   
    private void renameEnv(String env) {
        envCopylbl.setText("Env.: " + env); 
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jobsBtn = new javax.swing.JButton();
        instancesBtn = new javax.swing.JButton();
        instConBtn = new javax.swing.JButton();
        instDepBtn = new javax.swing.JButton();
        priorityHierarchyBtn = new javax.swing.JButton();
        runControlBtn = new javax.swing.JButton();
        instNotBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        envCopylbl = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        instConOverBtn = new javax.swing.JButton();
        notifTypesBtn = new javax.swing.JButton();

        jScrollPane1.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jobsBtn.setText("Jobs");
        jobsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jobsBtnActionPerformed(evt);
            }
        });

        instancesBtn.setText("Instances");
        instancesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instancesBtnActionPerformed(evt);
            }
        });

        instConBtn.setText("Instance Contexts");
        instConBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instConBtnActionPerformed(evt);
            }
        });

        instDepBtn.setText("Instance Dependency");
        instDepBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instDepBtnActionPerformed(evt);
            }
        });

        priorityHierarchyBtn.setText("Priority Hierarchy");
        priorityHierarchyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priorityHierarchyBtnActionPerformed(evt);
            }
        });

        runControlBtn.setText("Run Control");
        runControlBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runControlBtnActionPerformed(evt);
            }
        });

        instNotBtn.setText("Instance Notifications");
        instNotBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instNotBtnActionPerformed(evt);
            }
        });

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        envCopylbl.setText("Env.:");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Main Menu");

        instConOverBtn.setText("Instance Contexts Override");
        instConOverBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instConOverBtnActionPerformed(evt);
            }
        });

        notifTypesBtn.setText("Notification Types");
        notifTypesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notifTypesBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(envCopylbl, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(94, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jobsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(instancesBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(instConBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(instDepBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(priorityHierarchyBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(runControlBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(instNotBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(instConOverBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(notifTypesBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(130, 130, 130))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(envCopylbl)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jobsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(priorityHierarchyBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(runControlBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(instancesBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(instDepBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(instConBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(instConOverBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(notifTypesBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(instNotBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addComponent(backBtn)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        DbLogInFrame logIn = new DbLogInFrame(); //calls LogIn window
        logIn.setVisible(true); //set Visible LogInWindow
        dispose(); //close current window of MainMenu
    }//GEN-LAST:event_backBtnActionPerformed

    private void instancesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_instancesBtnActionPerformed
        JobInstancesFrameTbl instances = new JobInstancesFrameTbl();
        instances.getParams(dbConn, env);
        ResultSet resultSet = instances.fetch("", "", "", "", "", "");
        instances.populate(resultSet);
        instances.setVisible(true);    
        dispose();
    }//GEN-LAST:event_instancesBtnActionPerformed

    private void instNotBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_instNotBtnActionPerformed
        InstanceNotificationsFrameTbl instanceNotifications = new InstanceNotificationsFrameTbl();
        instanceNotifications.getParams(dbConn, env);
        ResultSet resultSet = instanceNotifications.fetch("", "", "", "");
        instanceNotifications.populate(resultSet);
        instanceNotifications.setVisible(true);    
        dispose();
    }//GEN-LAST:event_instNotBtnActionPerformed

    private void jobsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jobsBtnActionPerformed
        JobsFrameTbl jobs = new JobsFrameTbl();
        jobs.getParams(dbConn, env);
        ResultSet resultSet = jobs.fetch("", "", "", "", "", "");
        jobs.populate(resultSet);
        jobs.setVisible(true);    
        dispose();
    }//GEN-LAST:event_jobsBtnActionPerformed

    private void instConBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_instConBtnActionPerformed
        JobInstContextsFrameTbl contexts = new JobInstContextsFrameTbl();
        contexts.getParams(dbConn, env);
        ResultSet resultSet = contexts.fetch("", "", "", "", "");
        contexts.populate(resultSet);
        contexts.setVisible(true);    
        dispose();
    }//GEN-LAST:event_instConBtnActionPerformed

    private void instDepBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_instDepBtnActionPerformed
        JobInstanceDepFrameTbl jobInstanceDep = new JobInstanceDepFrameTbl();
        jobInstanceDep.getParams(dbConn, env);
        ResultSet resultSet = jobInstanceDep.fetch("", "", "");
        jobInstanceDep.populate(resultSet);
        jobInstanceDep.setVisible(true);    
        dispose();
    }//GEN-LAST:event_instDepBtnActionPerformed

    private void priorityHierarchyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priorityHierarchyBtnActionPerformed
        PriorityHierarchyFrameTbl priorityHierarchy = new PriorityHierarchyFrameTbl();
        priorityHierarchy.getParams(dbConn, env);
        ResultSet resultSet = priorityHierarchy.fetch("", "", "");
        priorityHierarchy.populate(resultSet);
        priorityHierarchy.setVisible(true);    
        dispose();
    }//GEN-LAST:event_priorityHierarchyBtnActionPerformed

    private void runControlBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runControlBtnActionPerformed
        RunControlFrameTbl runControl = new RunControlFrameTbl();
        runControl.getParams(dbConn, env);
        ResultSet resultSet = runControl.fetch("", "");
        runControl.populate(resultSet);
        runControl.setVisible(true);    
        dispose();
    }//GEN-LAST:event_runControlBtnActionPerformed

    private void notifTypesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notifTypesBtnActionPerformed
        NotifTypesFrameTbl notifTypes = new NotifTypesFrameTbl();
        notifTypes.getParams(dbConn, env);
        ResultSet resultSet = notifTypes.fetch("", "", "");
        notifTypes.populate(resultSet);
        notifTypes.setVisible(true);    
        dispose();
    }//GEN-LAST:event_notifTypesBtnActionPerformed

    private void instConOverBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_instConOverBtnActionPerformed
        JobInstContextsOverrFrameTbl jobInstContOverr = new JobInstContextsOverrFrameTbl();
        jobInstContOverr.getParams(dbConn, env);
        ResultSet resultSet = jobInstContOverr.fetch("", "", "", "");
        jobInstContOverr.populate(resultSet);
        jobInstContOverr.setVisible(true);    
        dispose();
    }//GEN-LAST:event_instConOverBtnActionPerformed


    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenuFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel envCopylbl;
    private javax.swing.JButton instConBtn;
    private javax.swing.JButton instConOverBtn;
    private javax.swing.JButton instDepBtn;
    private javax.swing.JButton instNotBtn;
    private javax.swing.JButton instancesBtn;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jobsBtn;
    private javax.swing.JButton notifTypesBtn;
    private javax.swing.JButton priorityHierarchyBtn;
    private javax.swing.JButton runControlBtn;
    // End of variables declaration//GEN-END:variables
}
