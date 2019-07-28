package Framework_Gui;


import java.sql.*;
import java.util.Arrays;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;



public class PriorityHierarchyFrameTbl extends javax.swing.JFrame {

    //Creates new form JobsFrameTbl
    public PriorityHierarchyFrameTbl() {
        initComponents();
    }
    
    Connection dbConn;
    ResultSet resultSet;
    PreparedStatement preparedStatement;
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
        jobUpdatetbl = new javax.swing.JTable();
        envCopylbl = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        runBtn = new javax.swing.JButton();
        instanceIdtxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jobInserttbl = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        hierarchyLeveltxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        activeIndicatortxt = new javax.swing.JTextField();
        searchDatabtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jobUpdatetbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Priority Hierarchy Id", "Instance Id", "Hierarchy Level", "Creator", "Active Indicator", "Creation Time"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jobUpdatetbl.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jobUpdatetbl);

        envCopylbl.setText("Env.:");

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        runBtn.setText("Run");
        runBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runBtnActionPerformed(evt);
            }
        });

        instanceIdtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instanceIdtxtActionPerformed(evt);
            }
        });

        jLabel1.setText("Instance Id:");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Priority Hierarchy");

        jobInserttbl.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
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
                "Instance Id", "Hierarchy Level", "Creator"
            }
        ));
        jobInserttbl.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jobInserttbl);

        jLabel5.setText("Insert");

        jLabel6.setText("Update");

        jLabel7.setText("Hierarchy level:");

        jLabel9.setText("Active Indicator:");

        activeIndicatortxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activeIndicatortxtActionPerformed(evt);
            }
        });

        searchDatabtn.setText("Search");
        searchDatabtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchDatabtnActionPerformed(evt);
            }
        });

        clearBtn.setText("Clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(runBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(724, 724, 724)
                                .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(hierarchyLeveltxt)
                                    .addComponent(instanceIdtxt, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(activeIndicatortxt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchDatabtn, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 158, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(envCopylbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                    .addComponent(envCopylbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(instanceIdtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hierarchyLeveltxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(activeIndicatortxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9)
                    .addComponent(searchDatabtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backBtn)
                    .addComponent(runBtn)
                    .addComponent(clearBtn))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        MainMenuFrame mainMenu = new MainMenuFrame();
        mainMenu.getParams(dbConn, env); //Had to give back the parameters becouse during reopening it forgets these
        mainMenu.setVisible(true);
        dispose();       
    }//GEN-LAST:event_backBtnActionPerformed

    private void runBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runBtnActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Are you sure you want to update and insert?", "WARNING",
        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                        
            //Get the inserted values for search
            String[] searchValues = getSearchValues();
            
            //Fetch data
            ResultSet resultSet = fetch(searchValues[0], searchValues[1], searchValues[2]);

            //Update
            update(resultSet);
            
            //Insert
            insert();

            //Run Search again to show newly inserted, updated values
            search();
          
        // NO_OPTION
        } else { 
            ; //do nothing
        }    
    }//GEN-LAST:event_runBtnActionPerformed

    private void searchDatabtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchDatabtnActionPerformed
        search();      
    }//GEN-LAST:event_searchDatabtnActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        //Clear Insert table for reuse after successfull insertion
        if (JOptionPane.showConfirmDialog(null, "Are you sure you want to clear the Insert table?", "WARNING",
        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            
            for (int f = 0; f < jobInserttbl.getRowCount(); f++) {
                for(int j = 0; j < jobInserttbl.getColumnCount(); j++) {
                    jobInserttbl.setValueAt(null, f, j);
                }
            }
            
        // NO_OPTION
        } else { 
            ; //do nothing
        }
    }//GEN-LAST:event_clearBtnActionPerformed

    private void activeIndicatortxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activeIndicatortxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_activeIndicatortxtActionPerformed

    private void instanceIdtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_instanceIdtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_instanceIdtxtActionPerformed

    public String[] getSearchValues() {      
        String[] searchValues = new String[3];
        
        //Created for like statement in sql and to make diff between java null and sql null
        String instanceId =         "  " + instanceIdtxt.getText().toLowerCase()        + "  ";
        String hierarchyLevel =     "  " + hierarchyLeveltxt.getText().toLowerCase()    + "  ";
        String activeIndicator =    "'%" + activeIndicatortxt.getText().toLowerCase()   + "%'";
        
        searchValues[0] = instanceId;
        searchValues[1] = hierarchyLevel;
        searchValues[2] = activeIndicator;
        
        return searchValues;
    }
          
    public void search() {
        //Get the inserted values for search
        String[] searchValues = getSearchValues(); 
        
        //populates Update table
        ResultSet resultSet = fetch(searchValues[0], searchValues[1], searchValues[2]);
        populate(resultSet);
    }
    
    public ResultSet fetch(String instanceId, String hierarchyLevel, String activeIndicator) {          
            ResultSet resultSet = null;  
            // Have to use coalesce to show null values in Jtable rather than empty values
            String query="select po_priority_hierarchy_id AS \"Priority Hierarchy Id\", coalesce(cast(instance_id as varchar(20)), 'null') AS \"Instance Id\",  coalesce(cast(hierarchy_level as varchar(20)), 'null') AS \"Hierarchy Level\", coalesce(created_by, 'null') AS \"Creator\", coalesce(active_record_indicator, 'null') AS \"Active Indicator\", coalesce(cast(creation_datetime as varchar(20)), 'null') as \"Creation Time\" from po_job_run_control.po_priority_hierarchy where 1=1";
   
            // Decide if need to add a is null statement for the query or a like statment at the end
            // Length 4 is equal to '%%'
            if (instanceId.length() > 4) {
                
                if (instanceId.equals("  null  ")) {
                    query = query + " and instance_id is null ";
                } else {
                    query = query + " and instance_id = " + instanceId + " ";
                }
                
            }  
            
            if (hierarchyLevel.length() > 4) {
                
                if (hierarchyLevel.equals("  null  ")) {
                    query = query + " and hierarchy_level is null ";
                } else {
                    query = query + " and hierarchy_level = " + hierarchyLevel + " ";
                }

            }
             
            if (activeIndicator.length() > 4) {
                
                if (activeIndicator.equals("'%null%'")) {
                    query = query + " and active_record_indicator is null ";
                } else {
                    query = query + " and lower(active_record_indicator) like " + activeIndicator + " ";
                }

            }
            
            query = query + " order by po_priority_hierarchy_id desc limit 100;";
        
        //Run query and put it into table    
        try {
            preparedStatement = dbConn.prepareStatement(query);
            resultSet = preparedStatement.executeQuery();
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "During Select --> "+ e);
        }
       
        return resultSet;       
    }
    
    
    public void populate(ResultSet resultSet) {      
        jobUpdatetbl.setModel(DbUtils.resultSetToTableModel(resultSet));   
    }
    
    
    public void executer(PreparedStatement ps) {      
        try{           
            ps.execute();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "During Insert/Update --> " + e);
        }       
    }
    
    private void update(ResultSet resultSet) {        
        try{
            
            ResultSetMetaData rsmd = resultSet.getMetaData();
            int rsColumnsNumber = rsmd.getColumnCount();
            int updRowIdx = 0;
            String rsColumnValue;
            String rsPrimaryKey;
            String update = null;
            PreparedStatement ps = null;

            while (resultSet.next()) {
                
                rsPrimaryKey = resultSet.getObject(1).toString();
                
                for (int rsColIdx = 1; rsColIdx <= rsColumnsNumber; rsColIdx++) {
                       
                    // Result set from query what was inserted into Update jTable (jobUpdatetbl)
                    rsColumnValue = resultSet.getObject(rsColIdx).toString();
  
                    // Get rewritten data from jobUpdatetbl
                    int updColIdx = rsColIdx-1;
                    String updTableColumn = jobUpdatetbl.getColumnName(updColIdx);
                   
                    
                    String updTableColumnValue = jobUpdatetbl.getModel().getValueAt(updRowIdx,updColIdx).toString();                    
                    String updTablePrimaryKey = jobUpdatetbl.getModel().getValueAt(updRowIdx,0).toString();
                    if (rsColIdx == rsColumnsNumber){
                        updRowIdx++;
                    }

                    // Update the rewritten data in the database based on primary key
                    if (rsPrimaryKey.equals(updTablePrimaryKey) && !rsColumnValue.equals(updTableColumnValue)) {
                        
                        if (updTableColumn.equals("Instance Id")) {
        
                            update = "update po_job_run_control.po_priority_hierarchy set instance_id = '"+ updTableColumnValue +"' where po_priority_hierarchy_id = "+ updTablePrimaryKey;
                        
                        } else if (updTableColumn.equals("Hierarchy Level")) {
                            
                            update = "update po_job_run_control.po_priority_hierarchy set hierarchy_level = '"+ updTableColumnValue +"' where po_priority_hierarchy_id = "+ updTablePrimaryKey;
                        
                        } else if (updTableColumn.equals("Creator")) {
                             
                            update = "update po_job_run_control.po_priority_hierarchy set created_by = '"+ updTableColumnValue +"' where po_priority_hierarchy_id = "+ updTablePrimaryKey;
                            
                        } else if (updTableColumn.equals("Active Indicator")) {
                            
                            update = "update po_job_run_control.po_priority_hierarchy set active_record_indicator = upper('"+ updTableColumnValue +"') where po_priority_hierarchy_id = "+ updTablePrimaryKey;

                        } 
                                            
                        //Execute update
                        ps = dbConn.prepareStatement(update);
                        executer(ps);                        
                        
                    }
                                 
                }
                 
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "In Update table --> " + e);
        }      
    }
     
    private void insert() {     
        Object[] rowData = new Object[jobInserttbl.getColumnCount()];
        int insrtColumnsNumber = jobInserttbl.getColumnCount();
        String insert = null;
        PreparedStatement ps = null;

        // Getting only filled rows by required column
        int getRowCount = jobInserttbl.getRowCount();
        int insrtRowsNumber = 0;
        for (int i = 0; i < getRowCount; i++) {
           if (jobInserttbl.getValueAt(i, 0) != null){
               insrtRowsNumber++;
           }
        }
        
        // Creating Array from inserted rows
        for (int insrtRowIdx = 0;  insrtRowIdx < insrtRowsNumber; insrtRowIdx++) {
            for (int insrtColIdx = 0; insrtColIdx < insrtColumnsNumber; insrtColIdx++) {
                rowData[insrtColIdx] = jobInserttbl.getValueAt(insrtRowIdx, insrtColIdx);
                System.out.println(Arrays.toString(rowData));
            }
            
            try {
                
                insert = "insert into po_job_run_control.po_priority_hierarchy (instance_id, hierarchy_level, created_by, active_record_indicator, creation_datetime) values(?, ?, ?, 'A', now());";
                ps = dbConn.prepareStatement(insert);
                
                //instance_id
                    if (rowData[0] != null){ 
                        ps.setInt(1, Integer.parseInt((String)rowData[0]));
                    } else {
                        ps.setNull(1, Types.INTEGER);
                    }
                //hierarchy_level
                    if (rowData[1] != null){ 
                        ps.setInt(2, Integer.parseInt((String)rowData[1]));
                    } else {
                        ps.setNull(2, Types.INTEGER);
                    }
                //created_by
                    if (rowData[2] != null){ 
                        ps.setString(3, (String)rowData[2]);
                    } else {
                        ps.setNull(3, Types.VARCHAR);
                    }
              

            executer(ps);
            
           
            
            } catch (ClassCastException|SQLException e) {
                JOptionPane.showMessageDialog(null, "In Insert table --> " + e);
            } 
            
        }    
    }
            
    public static void main(String args[]) {     
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PriorityHierarchyFrameTbl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PriorityHierarchyFrameTbl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PriorityHierarchyFrameTbl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PriorityHierarchyFrameTbl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PriorityHierarchyFrameTbl().setVisible(true);
            }
        });
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField activeIndicatortxt;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton clearBtn;
    private javax.swing.JLabel envCopylbl;
    private javax.swing.JTextField hierarchyLeveltxt;
    private javax.swing.JTextField instanceIdtxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jobInserttbl;
    private javax.swing.JTable jobUpdatetbl;
    private javax.swing.JButton runBtn;
    private javax.swing.JButton searchDatabtn;
    // End of variables declaration//GEN-END:variables

}
