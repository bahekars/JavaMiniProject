/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.JOptionPane;

/**
 *
 * @author sid
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
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

        jButton1 = new javax.swing.JButton();
        SplitPane = new javax.swing.JSplitPane();
        TopPanel = new javax.swing.JPanel();
        PatientView = new javax.swing.JButton();
        DoctorView = new javax.swing.JButton();
        AdminView = new javax.swing.JButton();
        BottomPanel = new javax.swing.JPanel();
        PatientPanel = new javax.swing.JPanel();
        NearbyLabel = new javax.swing.JLabel();
        HospitalTable = new javax.swing.JScrollPane();
        HospitalDetails = new javax.swing.JTable();
        locationLabel = new javax.swing.JLabel();
        locationTextField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        DoctorPanel = new javax.swing.JPanel();
        DocSplitPane = new javax.swing.JSplitPane();
        DocTopPanel = new javax.swing.JPanel();
        LabelDate = new javax.swing.JLabel();
        LabelVitalSign = new javax.swing.JLabel();
        LabelHeart = new javax.swing.JLabel();
        LabelBlood = new javax.swing.JLabel();
        LabelTemp = new javax.swing.JLabel();
        LabelResp = new javax.swing.JLabel();
        TextHeart = new javax.swing.JTextField();
        TextBlood = new javax.swing.JTextField();
        TextTemp = new javax.swing.JTextField();
        TextResp = new javax.swing.JTextField();
        LabelDiagnosis = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextDiagnosis = new javax.swing.JTextArea();
        ButtonDisplay = new javax.swing.JButton();
        LabelDoctor = new javax.swing.JLabel();
        DateChooser = new com.toedter.calendar.JDateChooser();
        DocBotPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        AdminPanel = new javax.swing.JPanel();
        LabelAdmin = new javax.swing.JLabel();
        TextCommunity = new javax.swing.JTextField();
        LabelCommunity = new javax.swing.JLabel();
        ButtonCommunity = new javax.swing.JButton();
        LabelHospName = new javax.swing.JLabel();
        TextHospName = new javax.swing.JTextField();
        LabelHospLoc = new javax.swing.JLabel();
        TextHospLoc = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TextHospComm = new javax.swing.JTextField();
        ButtonAddHosp = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SplitPane.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        PatientView.setText("Patient");

        DoctorView.setText("Doctor");

        AdminView.setText("Admin");

        javax.swing.GroupLayout TopPanelLayout = new javax.swing.GroupLayout(TopPanel);
        TopPanel.setLayout(TopPanelLayout);
        TopPanelLayout.setHorizontalGroup(
            TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TopPanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(PatientView, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117)
                .addComponent(DoctorView, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
                .addComponent(AdminView, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );
        TopPanelLayout.setVerticalGroup(
            TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TopPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PatientView)
                    .addComponent(DoctorView)
                    .addComponent(AdminView))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        SplitPane.setTopComponent(TopPanel);

        BottomPanel.setLayout(new java.awt.CardLayout());

        NearbyLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        NearbyLabel.setText("Nearby Hospitals");

        HospitalDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "Location", "Community"
            }
        ));
        HospitalTable.setViewportView(HospitalDetails);

        locationLabel.setText("Enter Location :");

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PatientPanelLayout = new javax.swing.GroupLayout(PatientPanel);
        PatientPanel.setLayout(PatientPanelLayout);
        PatientPanelLayout.setHorizontalGroup(
            PatientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PatientPanelLayout.createSequentialGroup()
                .addGroup(PatientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PatientPanelLayout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(NearbyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PatientPanelLayout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(locationLabel)
                        .addGap(81, 81, 81)
                        .addComponent(locationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PatientPanelLayout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PatientPanelLayout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(HospitalTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(140, Short.MAX_VALUE))
        );
        PatientPanelLayout.setVerticalGroup(
            PatientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PatientPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NearbyLabel)
                .addGap(54, 54, 54)
                .addGroup(PatientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(locationLabel)
                    .addComponent(locationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(searchButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(HospitalTable, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
        );

        BottomPanel.add(PatientPanel, "card2");

        DocSplitPane.setDividerLocation(300);
        DocSplitPane.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        LabelDate.setText("Date :");

        LabelVitalSign.setText("Vital Sign");

        LabelHeart.setText("Heart Rate");

        LabelBlood.setText("Blood Pressure");

        LabelTemp.setText("Temperature");

        LabelResp.setText("Respiratory Rate");

        TextBlood.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextBloodFocusLost(evt);
            }
        });

        LabelDiagnosis.setText("Diagnosis");

        TextDiagnosis.setColumns(20);
        TextDiagnosis.setRows(5);
        jScrollPane1.setViewportView(TextDiagnosis);

        ButtonDisplay.setText("Display");
        ButtonDisplay.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ButtonDisplayFocusLost(evt);
            }
        });

        LabelDoctor.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        LabelDoctor.setText("Doctor Panel");

        javax.swing.GroupLayout DocTopPanelLayout = new javax.swing.GroupLayout(DocTopPanel);
        DocTopPanel.setLayout(DocTopPanelLayout);
        DocTopPanelLayout.setHorizontalGroup(
            DocTopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DocTopPanelLayout.createSequentialGroup()
                .addGroup(DocTopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DocTopPanelLayout.createSequentialGroup()
                        .addGroup(DocTopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(DocTopPanelLayout.createSequentialGroup()
                                .addGroup(DocTopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(DocTopPanelLayout.createSequentialGroup()
                                        .addGap(41, 41, 41)
                                        .addComponent(LabelDate))
                                    .addGroup(DocTopPanelLayout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addComponent(DateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(52, 52, 52)
                                .addGroup(DocTopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LabelBlood)
                                    .addComponent(LabelHeart)
                                    .addComponent(LabelTemp)
                                    .addComponent(LabelResp))
                                .addGap(104, 104, 104)
                                .addGroup(DocTopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TextBlood, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TextTemp, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TextResp, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TextHeart, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(DocTopPanelLayout.createSequentialGroup()
                                .addGap(213, 213, 213)
                                .addComponent(ButtonDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addGroup(DocTopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(DocTopPanelLayout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(LabelDiagnosis))))
                    .addGroup(DocTopPanelLayout.createSequentialGroup()
                        .addGroup(DocTopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(DocTopPanelLayout.createSequentialGroup()
                                .addGap(289, 289, 289)
                                .addComponent(LabelDoctor))
                            .addGroup(DocTopPanelLayout.createSequentialGroup()
                                .addGap(252, 252, 252)
                                .addComponent(LabelVitalSign, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        DocTopPanelLayout.setVerticalGroup(
            DocTopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DocTopPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(LabelDoctor)
                .addGap(47, 47, 47)
                .addComponent(LabelVitalSign)
                .addGap(26, 26, 26)
                .addGroup(DocTopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelHeart)
                    .addComponent(TextBlood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(DocTopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DocTopPanelLayout.createSequentialGroup()
                        .addGroup(DocTopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(DocTopPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(DocTopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TextTemp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LabelBlood))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TextHeart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DocTopPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LabelTemp)
                                .addGap(6, 6, 6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addGroup(DocTopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelResp, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TextResp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(ButtonDisplay))
                    .addGroup(DocTopPanelLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(LabelDate)
                        .addGap(18, 18, 18)
                        .addComponent(DateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(DocTopPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(LabelDiagnosis)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        DocSplitPane.setTopComponent(DocTopPanel);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Date", "Heart Rate", "Blood Pressure", "Temperature", "Respiratory", "Diagnosis"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel1.setText("Display Encounter Details");

        javax.swing.GroupLayout DocBotPanelLayout = new javax.swing.GroupLayout(DocBotPanel);
        DocBotPanel.setLayout(DocBotPanelLayout);
        DocBotPanelLayout.setHorizontalGroup(
            DocBotPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DocBotPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DocBotPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(231, 231, 231))
        );
        DocBotPanelLayout.setVerticalGroup(
            DocBotPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DocBotPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        DocSplitPane.setRightComponent(DocBotPanel);

        javax.swing.GroupLayout DoctorPanelLayout = new javax.swing.GroupLayout(DoctorPanel);
        DoctorPanel.setLayout(DoctorPanelLayout);
        DoctorPanelLayout.setHorizontalGroup(
            DoctorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DocSplitPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        DoctorPanelLayout.setVerticalGroup(
            DoctorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DocSplitPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        BottomPanel.add(DoctorPanel, "card3");

        LabelAdmin.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        LabelAdmin.setText("Admin Controls");

        LabelCommunity.setText("Community Name");

        ButtonCommunity.setText("Add Community");

        LabelHospName.setText("Hospital Name");

        LabelHospLoc.setText("Hospital Location");

        jLabel2.setText("Hospital Community");

        ButtonAddHosp.setText("Add Hospital");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Hospital Name", "Hospital Location", "Hospital Community", "Modify"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        javax.swing.GroupLayout AdminPanelLayout = new javax.swing.GroupLayout(AdminPanel);
        AdminPanel.setLayout(AdminPanelLayout);
        AdminPanelLayout.setHorizontalGroup(
            AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AdminPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ButtonAddHosp)
                .addGap(245, 245, 245))
            .addGroup(AdminPanelLayout.createSequentialGroup()
                .addGroup(AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AdminPanelLayout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addComponent(LabelAdmin))
                    .addGroup(AdminPanelLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(AdminPanelLayout.createSequentialGroup()
                                .addGroup(AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TextCommunity)
                                    .addComponent(LabelCommunity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ButtonCommunity, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE))
                                .addGap(89, 89, 89)
                                .addGroup(AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LabelHospLoc)
                                    .addComponent(jLabel2)
                                    .addComponent(LabelHospName))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TextHospName, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TextHospComm, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TextHospLoc, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        AdminPanelLayout.setVerticalGroup(
            AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdminPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelAdmin)
                .addGap(30, 30, 30)
                .addGroup(AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelCommunity)
                    .addComponent(LabelHospName)
                    .addComponent(TextHospName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelHospLoc)
                    .addComponent(TextHospLoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AdminPanelLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(ButtonCommunity))
                    .addGroup(AdminPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextHospComm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))))
                .addGap(18, 18, 18)
                .addComponent(ButtonAddHosp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        BottomPanel.add(AdminPanel, "card4");

        SplitPane.setRightComponent(BottomPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
        if(locationTextField.getText().isEmpty() || locationTextField.getText() == null)
        {
        JOptionPane.showMessageDialog(this, "Please enter a location!!!");
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void ButtonDisplayFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ButtonDisplayFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonDisplayFocusLost

    private void TextBloodFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextBloodFocusLost
        // TODO add your handling code here:
        
    }//GEN-LAST:event_TextBloodFocusLost

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AdminPanel;
    private javax.swing.JButton AdminView;
    private javax.swing.JPanel BottomPanel;
    private javax.swing.JButton ButtonAddHosp;
    private javax.swing.JButton ButtonCommunity;
    private javax.swing.JButton ButtonDisplay;
    private com.toedter.calendar.JDateChooser DateChooser;
    private javax.swing.JPanel DocBotPanel;
    private javax.swing.JSplitPane DocSplitPane;
    private javax.swing.JPanel DocTopPanel;
    private javax.swing.JPanel DoctorPanel;
    private javax.swing.JButton DoctorView;
    private javax.swing.JTable HospitalDetails;
    private javax.swing.JScrollPane HospitalTable;
    private javax.swing.JLabel LabelAdmin;
    private javax.swing.JLabel LabelBlood;
    private javax.swing.JLabel LabelCommunity;
    private javax.swing.JLabel LabelDate;
    private javax.swing.JLabel LabelDiagnosis;
    private javax.swing.JLabel LabelDoctor;
    private javax.swing.JLabel LabelHeart;
    private javax.swing.JLabel LabelHospLoc;
    private javax.swing.JLabel LabelHospName;
    private javax.swing.JLabel LabelResp;
    private javax.swing.JLabel LabelTemp;
    private javax.swing.JLabel LabelVitalSign;
    private javax.swing.JLabel NearbyLabel;
    private javax.swing.JPanel PatientPanel;
    private javax.swing.JButton PatientView;
    private javax.swing.JSplitPane SplitPane;
    private javax.swing.JTextField TextBlood;
    private javax.swing.JTextField TextCommunity;
    private javax.swing.JTextArea TextDiagnosis;
    private javax.swing.JTextField TextHeart;
    private javax.swing.JTextField TextHospComm;
    private javax.swing.JTextField TextHospLoc;
    private javax.swing.JTextField TextHospName;
    private javax.swing.JTextField TextResp;
    private javax.swing.JTextField TextTemp;
    private javax.swing.JPanel TopPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel locationLabel;
    private javax.swing.JTextField locationTextField;
    private javax.swing.JButton searchButton;
    // End of variables declaration//GEN-END:variables
}
