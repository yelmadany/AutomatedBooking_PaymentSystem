/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package System;
//import com.raven.datechooser.*;
import java.text.Format;  
import java.text.ParseException;
import java.text.SimpleDateFormat;  
import java.util.Date;  
import java.util.Calendar;  
import java.time.DayOfWeek;
import javax.swing.AbstractButton;

import java.util.ArrayList;
import java.util.Enumeration;


import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Yo200
 */

public class AgentSelect extends javax.swing.JFrame {
    
    /**
     * Creates new form AgentSelect
     */
    LeasingOffice L;
    LeasingAgent Agent;
    ArrayList<Store> Cart;
    String Date;
    String Day;
    String Time;
    
    //ArrayList<Schedule> WSched;
    public AgentSelect(LeasingOffice LO, ArrayList<Store> cart) {
        Cart = cart;
        L = LO;
        initComponents();
        dpopulate();
        GroupOfTimingsButtonGroup.add(j0800_0900RadioButton);
        GroupOfTimingsButtonGroup.add(j0900_1000RadioButton);        
        GroupOfTimingsButtonGroup.add(j1000_1100RadioButton);
        GroupOfTimingsButtonGroup.add(j1100_1200RadioButton);
        GroupOfTimingsButtonGroup.add(j1200_1300RadioButton);
        GroupOfTimingsButtonGroup.add(j1300_1400RadioButton);
        GroupOfTimingsButtonGroup.add(j1400_1500RadioButton);
        GroupOfTimingsButtonGroup.add(j1500_1600RadioButton);
        GroupOfTimingsButtonGroup.add(j1600_1700RadioButton);
        GroupOfTimingsButtonGroup.add(j1700_1800RadioButton);
        
        
    }
    private void dpopulate(){
        for(int i = 0; i< L.Agents.size();i++){
             //Sched = L.Agents.get(i).GetAgentSchedule();
             AgentComboBox.addItem(L.Agents.get(i).name); //populate the names
             ///populateAgent(Sched);
        }
    }
    
    private void displaySched(LeasingAgent Ag, String dayName) {
        // finds the correcet day of the week
        
        int correctDayOfWeek = 0;
        
        for (int i = 1; i <= 7; ++i) {
            if (DayOfWeek.of(i).name().equals(dayName))
                correctDayOfWeek = i - 1;
        }
        
        ArrayList<ArrayList<Boolean>> sched = Ag.GetAgentSchedule().get_Sched();

        // gets the RadioButtons from ButtonGroup
        Enumeration elements = GroupOfTimingsButtonGroup.getElements();  
        AbstractButton button; 
        
        for (Boolean bool : sched.get(correctDayOfWeek)) {
            button = (AbstractButton)elements.nextElement();
            if (bool) {
                button.setEnabled(true);
            }
            else {
                button.setEnabled(false);
            }
        }
    }
    
    void populateAgent(Schedule S){
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CalendarDateChooser = new com.raven.datechooser.DateChooser();
        GroupOfTimingsButtonGroup = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        SelectAgentLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        AgentLabel = new javax.swing.JLabel();
        AgentComboBox = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        DateLabel = new javax.swing.JLabel();
        DateTxtField = new javax.swing.JTextField();
        ShowCalendarButton = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        CheckAvailabilityButton = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        AvailableTimeLabel = new javax.swing.JLabel();
        j0800_0900RadioButton = new javax.swing.JRadioButton();
        j0900_1000RadioButton = new javax.swing.JRadioButton();
        j1000_1100RadioButton = new javax.swing.JRadioButton();
        j1100_1200RadioButton = new javax.swing.JRadioButton();
        j1200_1300RadioButton = new javax.swing.JRadioButton();
        j1400_1500RadioButton = new javax.swing.JRadioButton();
        j1300_1400RadioButton = new javax.swing.JRadioButton();
        j1500_1600RadioButton = new javax.swing.JRadioButton();
        j1600_1700RadioButton = new javax.swing.JRadioButton();
        j1700_1800RadioButton = new javax.swing.JRadioButton();
        jPanel9 = new javax.swing.JPanel();
        ConfirmApptButton = new javax.swing.JButton();

        CalendarDateChooser.setForeground(new java.awt.Color(0, 128, 236));
        CalendarDateChooser.setTextRefernce(DateTxtField);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agent Selection");
        setLocation(new java.awt.Point(500, 200));
        setResizable(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 102, 0)));
        jPanel2.setPreferredSize(new java.awt.Dimension(478, 29));

        SelectAgentLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SelectAgentLabel.setText("SELECT AGENT AND APPOINTMENT TIME");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(106, Short.MAX_VALUE)
                .addComponent(SelectAgentLabel)
                .addGap(94, 94, 94))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(SelectAgentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel1.setPreferredSize(new java.awt.Dimension(200, 200));

        AgentLabel.setText("Agent:");

        AgentComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgentComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AgentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AgentComboBox, 0, 238, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AgentComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AgentLabel))
                .addContainerGap())
        );

        DateLabel.setText("Date:");

        DateTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DateTxtFieldActionPerformed(evt);
            }
        });

        ShowCalendarButton.setText("...");
        ShowCalendarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowCalendarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DateTxtField)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ShowCalendarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DateLabel)
                    .addComponent(DateTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ShowCalendarButton))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        CheckAvailabilityButton.setBackground(new java.awt.Color(0, 128, 236));
        CheckAvailabilityButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        CheckAvailabilityButton.setForeground(new java.awt.Color(255, 255, 255));
        CheckAvailabilityButton.setText("CHECK AVAILABILITY");
        CheckAvailabilityButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckAvailabilityButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(106, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(CheckAvailabilityButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CheckAvailabilityButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(80, 80, 80)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel6.setPreferredSize(new java.awt.Dimension(478, 270));
        jPanel6.setLayout(new java.awt.BorderLayout());

        jPanel7.setLayout(new java.awt.BorderLayout());

        jPanel8.setPreferredSize(new java.awt.Dimension(478, 30));

        AvailableTimeLabel.setText("Available Times: [Select 1]");

        j0800_0900RadioButton.setText("0800 - 0900");
        j0800_0900RadioButton.setEnabled(false);
        j0800_0900RadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j0800_0900RadioButtonActionPerformed(evt);
            }
        });

        j0900_1000RadioButton.setText("0900 - 1000");
        j0900_1000RadioButton.setEnabled(false);
        j0900_1000RadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j0900_1000RadioButtonActionPerformed(evt);
            }
        });

        j1000_1100RadioButton.setText("1000 - 1100");
        j1000_1100RadioButton.setEnabled(false);
        j1000_1100RadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j1000_1100RadioButtonActionPerformed(evt);
            }
        });

        j1100_1200RadioButton.setText("1100 - 1200");
        j1100_1200RadioButton.setEnabled(false);
        j1100_1200RadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j1100_1200RadioButtonActionPerformed(evt);
            }
        });

        j1200_1300RadioButton.setText("1200 - 1300");
        j1200_1300RadioButton.setEnabled(false);
        j1200_1300RadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j1200_1300RadioButtonActionPerformed(evt);
            }
        });

        j1400_1500RadioButton.setText("1400 - 1500");
        j1400_1500RadioButton.setEnabled(false);
        j1400_1500RadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j1400_1500RadioButtonActionPerformed(evt);
            }
        });

        j1300_1400RadioButton.setText("1300 - 1400");
        j1300_1400RadioButton.setEnabled(false);
        j1300_1400RadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j1300_1400RadioButtonActionPerformed(evt);
            }
        });

        j1500_1600RadioButton.setText("1500 - 1600");
        j1500_1600RadioButton.setEnabled(false);
        j1500_1600RadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j1500_1600RadioButtonActionPerformed(evt);
            }
        });

        j1600_1700RadioButton.setText("1600 - 1700");
        j1600_1700RadioButton.setEnabled(false);
        j1600_1700RadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j1600_1700RadioButtonActionPerformed(evt);
            }
        });

        j1700_1800RadioButton.setText("1700 - 1800");
        j1700_1800RadioButton.setEnabled(false);
        j1700_1800RadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j1700_1800RadioButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(j1200_1300RadioButton)
                    .addComponent(j1000_1100RadioButton)
                    .addComponent(j1100_1200RadioButton)
                    .addComponent(j0800_0900RadioButton, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(j0900_1000RadioButton, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(j1400_1500RadioButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(j1300_1400RadioButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(j1500_1600RadioButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(j1600_1700RadioButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(j1700_1800RadioButton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(55, 55, 55))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(AvailableTimeLabel)
                .addContainerGap(175, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AvailableTimeLabel)
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(j0800_0900RadioButton)
                    .addComponent(j1300_1400RadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(j0900_1000RadioButton)
                    .addComponent(j1400_1500RadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(j1000_1100RadioButton)
                    .addComponent(j1500_1600RadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(j1100_1200RadioButton)
                    .addComponent(j1600_1700RadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(j1200_1300RadioButton)
                    .addComponent(j1700_1800RadioButton))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        jPanel7.add(jPanel8, java.awt.BorderLayout.CENTER);

        jPanel6.add(jPanel7, java.awt.BorderLayout.CENTER);

        jPanel9.setPreferredSize(new java.awt.Dimension(478, 50));

        ConfirmApptButton.setBackground(new java.awt.Color(79, 220, 83));
        ConfirmApptButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ConfirmApptButton.setForeground(new java.awt.Color(255, 255, 255));
        ConfirmApptButton.setText("CONFIRM APPOINTMENT");
        ConfirmApptButton.setEnabled(false);
        ConfirmApptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmApptButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(ConfirmApptButton, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(97, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ConfirmApptButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        jPanel6.add(jPanel9, java.awt.BorderLayout.PAGE_END);

        getContentPane().add(jPanel6, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DateTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DateTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DateTxtFieldActionPerformed

    private void ShowCalendarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowCalendarButtonActionPerformed
        CalendarDateChooser.showPopup();        
    }//GEN-LAST:event_ShowCalendarButtonActionPerformed

    private void CheckAvailabilityButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckAvailabilityButtonActionPerformed
        // TODO add your handling code here:
        ConfirmApptButton.setEnabled(false);
        String dateTxt = DateTxtField.getText();
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");  

        Format f = new SimpleDateFormat("EEEE");  
        String dayName;
        try {
            dayName = f.format(sdf.parse(dateTxt)).toUpperCase();
//            System.out.println("Day Name: "+ DayOfWeek.of(7));
            // leasing office has list of agents
            // each agent has a schedule
            // display schedule based on agent name

            String agent_name = AgentComboBox.getSelectedItem().toString();

            // clear all selected radio buttons
            GroupOfTimingsButtonGroup.clearSelection();

            for (LeasingAgent ag : L.Agents) {
                if (ag.name.equals(agent_name)){
                    this.Agent = ag;                    
                    displaySched(ag, dayName);
                    this.Day = dayName;
                    break;
                }
            }
        } catch (ParseException ex) {
            Logger.getLogger(AgentSelect.class.getName()).log(Level.SEVERE, null, ex);
        }            

    }//GEN-LAST:event_CheckAvailabilityButtonActionPerformed

    private void ConfirmApptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmApptButtonActionPerformed
        // TODO add your handling code here:
        Enumeration elements = GroupOfTimingsButtonGroup.getElements();  
        AbstractButton button; 
        
        while (elements.hasMoreElements()) {
            button = (AbstractButton)elements.nextElement();
            if (button.isSelected()) {
                Time = button.getText();
                this.Date = DateTxtField.getText();
//                System.out.println(Time);
                L.SelectAppDetails(Agent, Date, Time, Day, this.Cart);
                
                break;
            }      
        }  
    }//GEN-LAST:event_ConfirmApptButtonActionPerformed

    private void AgentComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgentComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AgentComboBoxActionPerformed

    private void j0900_1000RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j0900_1000RadioButtonActionPerformed
        // TODO add your handling code here:
                ConfirmApptButton.setEnabled(true);

    }//GEN-LAST:event_j0900_1000RadioButtonActionPerformed

    private void j1000_1100RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j1000_1100RadioButtonActionPerformed
        // TODO add your handling code here:
                ConfirmApptButton.setEnabled(true);

    }//GEN-LAST:event_j1000_1100RadioButtonActionPerformed

    private void j0800_0900RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j0800_0900RadioButtonActionPerformed
        // TODO add your handling code here:
        ConfirmApptButton.setEnabled(true);
    }//GEN-LAST:event_j0800_0900RadioButtonActionPerformed

    private void j1100_1200RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j1100_1200RadioButtonActionPerformed
        // TODO add your handling code here:
        ConfirmApptButton.setEnabled(true);

    }//GEN-LAST:event_j1100_1200RadioButtonActionPerformed

    private void j1200_1300RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j1200_1300RadioButtonActionPerformed
        // TODO add your handling code here:
        ConfirmApptButton.setEnabled(true);

    }//GEN-LAST:event_j1200_1300RadioButtonActionPerformed

    private void j1300_1400RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j1300_1400RadioButtonActionPerformed
        // TODO add your handling code here:
        ConfirmApptButton.setEnabled(true);

    }//GEN-LAST:event_j1300_1400RadioButtonActionPerformed

    private void j1400_1500RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j1400_1500RadioButtonActionPerformed
        // TODO add your handling code here:
        ConfirmApptButton.setEnabled(true);
        
    }//GEN-LAST:event_j1400_1500RadioButtonActionPerformed

    private void j1500_1600RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j1500_1600RadioButtonActionPerformed
        // TODO add your handling code here:
        ConfirmApptButton.setEnabled(true);
        
    }//GEN-LAST:event_j1500_1600RadioButtonActionPerformed

    private void j1600_1700RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j1600_1700RadioButtonActionPerformed
        // TODO add your handling code here:
        ConfirmApptButton.setEnabled(true);

    }//GEN-LAST:event_j1600_1700RadioButtonActionPerformed

    private void j1700_1800RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j1700_1800RadioButtonActionPerformed
        // TODO add your handling code here:
        ConfirmApptButton.setEnabled(true);

    }//GEN-LAST:event_j1700_1800RadioButtonActionPerformed

    /**
     * @param args the command line arguments
     */
  
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> AgentComboBox;
    private javax.swing.JLabel AgentLabel;
    private javax.swing.JLabel AvailableTimeLabel;
    private com.raven.datechooser.DateChooser CalendarDateChooser;
    private javax.swing.JButton CheckAvailabilityButton;
    private javax.swing.JButton ConfirmApptButton;
    private javax.swing.JLabel DateLabel;
    private javax.swing.JTextField DateTxtField;
    private javax.swing.ButtonGroup GroupOfTimingsButtonGroup;
    private javax.swing.JLabel SelectAgentLabel;
    private javax.swing.JButton ShowCalendarButton;
    private javax.swing.JRadioButton j0800_0900RadioButton;
    private javax.swing.JRadioButton j0900_1000RadioButton;
    private javax.swing.JRadioButton j1000_1100RadioButton;
    private javax.swing.JRadioButton j1100_1200RadioButton;
    private javax.swing.JRadioButton j1200_1300RadioButton;
    private javax.swing.JRadioButton j1300_1400RadioButton;
    private javax.swing.JRadioButton j1400_1500RadioButton;
    private javax.swing.JRadioButton j1500_1600RadioButton;
    private javax.swing.JRadioButton j1600_1700RadioButton;
    private javax.swing.JRadioButton j1700_1800RadioButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables
}
