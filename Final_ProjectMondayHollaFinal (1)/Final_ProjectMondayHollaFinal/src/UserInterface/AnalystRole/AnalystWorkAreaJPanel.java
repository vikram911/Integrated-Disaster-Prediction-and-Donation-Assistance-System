/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.AnalystRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.AnalyticsOrganization;
import Business.Organization.DonationOrganization;
import Business.Organization.Organization;
import static Business.Organization.Organization.Type.Donation;
import Business.Organization.ResearchOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.DonationWorkRequest;
import Business.WorkQueue.ScientistWorkRequest;
import Business.WorkQueue.WorkRequest;
import DynamicDijsktars.Graph;
import DynamicDijsktars.Vertex;
import java.awt.BorderLayout;
import java.awt.Color;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.time.Day;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;

/**
 *
 * @author vikram
 */
public class AnalystWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AnalystWorkAreaJPanel
     */
    JPanel userProcessContainer;
    EcoSystem business;
    AnalyticsOrganization analyticsOrganization;
    UserAccount account;
    Enterprise enterprise;
    Network network;

    public AnalystWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, AnalyticsOrganization analyticsOrganization, Enterprise enterprise, EcoSystem business, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        this.account = account;
        this.enterprise = enterprise;
        this.network = network;
        this.analyticsOrganization = analyticsOrganization;

        populateTable();

        //print emtire work queue
        for (WorkRequest workRequest : analyticsOrganization.getWorkQueue().getWorkRequestList()) {
            if (workRequest instanceof DonationWorkRequest) {
                System.out.println(workRequest.getStatus() + " work request object " + workRequest.getClass());
                String area = ((DonationWorkRequest) workRequest).getDonation().getDonatedTo();
                System.out.println(area);
            }

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnBarChart = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        chartJPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        workrequest = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnFundsDonor = new javax.swing.JButton();
        btnTotalDonation = new javax.swing.JButton();
        btnFoodDonors = new javax.swing.JButton();
        donorAnalysisJPanel = new javax.swing.JPanel();
        btnClothesDonors = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnNonEmergency = new javax.swing.JButton();
        btnDonationBar = new javax.swing.JButton();
        donationChartJLabel = new javax.swing.JPanel();
        btnFoodArea = new javax.swing.JButton();
        btnClothesArea = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnBarChart.setText("Bar Chart");
        btnBarChart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBarChartActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Donor Analytics");

        jButton2.setText("Pie Chart");

        jButton3.setText("Line Chart");

        chartJPanel.setBackground(new java.awt.Color(204, 204, 255));
        chartJPanel.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(249, Short.MAX_VALUE)
                .addComponent(btnBarChart, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(327, 327, 327))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chartJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBarChart, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addComponent(chartJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(320, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        workrequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Status", "Sender", "Sent To"
            }
        ));
        jScrollPane1.setViewportView(workrequest);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(433, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(528, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("WorkRequestCatalog", jPanel4);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Donor Analysis");

        btnFundsDonor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnFundsDonor.setText("Funds Donors");
        btnFundsDonor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFundsDonorActionPerformed(evt);
            }
        });

        btnTotalDonation.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnTotalDonation.setText("Total Donation Analysis");
        btnTotalDonation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTotalDonationActionPerformed(evt);
            }
        });

        btnFoodDonors.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnFoodDonors.setText("Food Donors");
        btnFoodDonors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFoodDonorsActionPerformed(evt);
            }
        });

        donorAnalysisJPanel.setBackground(new java.awt.Color(255, 255, 255));
        donorAnalysisJPanel.setLayout(new javax.swing.BoxLayout(donorAnalysisJPanel, javax.swing.BoxLayout.LINE_AXIS));

        btnClothesDonors.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnClothesDonors.setText("Clothes Donors");
        btnClothesDonors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClothesDonorsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(donorAnalysisJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 242, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(btnFundsDonor, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnFoodDonors, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(btnClothesDonors, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(btnTotalDonation)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnFundsDonor, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnFoodDonors, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnClothesDonors, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnTotalDonation, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(150, 150, 150)
                .addComponent(donorAnalysisJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(122, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Donor", jPanel3);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Donation Analytics");
        jPanel5.add(jLabel2);
        jLabel2.setBounds(207, 11, 378, 31);

        btnNonEmergency.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnNonEmergency.setText("Emergency/Non Emergency");
        btnNonEmergency.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNonEmergencyActionPerformed(evt);
            }
        });
        jPanel5.add(btnNonEmergency);
        btnNonEmergency.setBounds(290, 70, 180, 40);

        btnDonationBar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDonationBar.setText("Funds/Area");
        btnDonationBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDonationBarActionPerformed(evt);
            }
        });
        jPanel5.add(btnDonationBar);
        btnDonationBar.setBounds(140, 70, 130, 40);

        donationChartJLabel.setBackground(new java.awt.Color(255, 255, 255));
        donationChartJLabel.setLayout(new java.awt.BorderLayout());
        jPanel5.add(donationChartJLabel);
        donationChartJLabel.setBounds(80, 160, 760, 230);

        btnFoodArea.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnFoodArea.setText("Food/Area");
        btnFoodArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFoodAreaActionPerformed(evt);
            }
        });
        jPanel5.add(btnFoodArea);
        btnFoodArea.setBounds(510, 80, 100, 40);

        btnClothesArea.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnClothesArea.setText("Clothes/Area");
        btnClothesArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClothesAreaActionPerformed(evt);
            }
        });
        jPanel5.add(btnClothesArea);
        btnClothesArea.setBounds(640, 80, 130, 40);

        jTabbedPane1.addTab("Donation", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1018, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBarChartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBarChartActionPerformed
        // TODO add your handling code here:
        DefaultCategoryDataset barChartData = new DefaultCategoryDataset();
        barChartData.setValue(20000, "No of donors", "January");
        barChartData.setValue(15000, "No of donors", "February");
        barChartData.setValue(10000, "No of donors", "March");
        barChartData.setValue(40000, "No of donors", "April");
        barChartData.setValue(30000, "No of donors", "May");

        JFreeChart barChart = ChartFactory.createBarChart("Emergency Donation", "Monthly", "Contribution Amount", barChartData, PlotOrientation.VERTICAL, false, true, false);
        CategoryPlot brChart = barChart.getCategoryPlot();
        brChart.setRangeGridlinePaint(Color.GREEN);

        ChartPanel barPanel = new ChartPanel(barChart);
        chartJPanel.removeAll();
        chartJPanel.add(barPanel, BorderLayout.CENTER);
        chartJPanel.validate();


    }//GEN-LAST:event_btnBarChartActionPerformed

    public void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) workrequest.getModel();
        dtm.setRowCount(0);

        //WorkRequest request : organization.getWorkQueue().getWorkRequestList()
        for (WorkRequest request : analyticsOrganization.getWorkQueue().getWorkRequestList()) {

            //ScientistWorkRequest swr = (ScientistWorkRequest) request;
            Object[] row = new Object[3];
            row[0] = request;
            row[1] = request.getSender().getUsername();
            row[2] = request.getReceiver().getUsername();
            dtm.addRow(row);

        }
        //break; 

    }

    private void btnDonationBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDonationBarActionPerformed
        // TODO add your handling code here:
        DefaultCategoryDataset barChartData = new DefaultCategoryDataset();
        Map<String, Integer> areaFunds = new HashMap<String, Integer>();

//        barChartData.setValue(20000,"Funds","January");
//        barChartData.setValue(15000,"Contribution Amount","February");
//        barChartData.setValue(10000,"Contribution Amount","March");
//        barChartData.setValue(40000,"Contribution Amount","April");
//        barChartData.setValue(30000,"Contribution Amount","May");
//        
        for (WorkRequest request : analyticsOrganization.getWorkQueue().getWorkRequestList()) {
            if (request instanceof DonationWorkRequest) {
                if (((DonationWorkRequest) request).getDonation().getDonatedTo() != null) {
                    barChartData.setValue(((DonationWorkRequest) request).getDonation().getMoneyDonation(), "Funds", ((DonationWorkRequest) request).getDonation().getDonatedTo());
                }

            }
        }

        JFreeChart barChart = ChartFactory.createBarChart("Emergency Donation", "Area", "Funds", barChartData, PlotOrientation.VERTICAL, false, true, false);
        CategoryPlot brChart = barChart.getCategoryPlot();
        brChart.setRangeGridlinePaint(Color.GREEN);

        ChartPanel barPanel = new ChartPanel(barChart);
        donationChartJLabel.removeAll();
        donationChartJLabel.add(barPanel, BorderLayout.CENTER);
        donationChartJLabel.validate();
    }//GEN-LAST:event_btnDonationBarActionPerformed

    private void btnFundsDonorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFundsDonorActionPerformed
        // TODO add your handling code here:
        DefaultCategoryDataset barChartData = new DefaultCategoryDataset();

       for (WorkRequest wr : analyticsOrganization.getWorkQueue().getWorkRequestList()) {
           if (wr instanceof DonationWorkRequest) {
               if (((DonationWorkRequest) wr).getDonation().getMoneyDonation() != 0.0) {
                   System.out.println(((DonationWorkRequest) wr).getDonation().getMoneyDonation() + " " + wr.getSender().getUsername());
                   barChartData.setValue(((DonationWorkRequest) wr).getDonation().getMoneyDonation(), "funds", wr.getSender().getUsername());
               }

           }
       }

//        
//        barChartData.setValue(15000,"Contribution Amount","February");
//        barChartData.setValue(10000,"Contribution Amount","March");
//        barChartData.setValue(40000,"Contribution Amount","April");
//        barChartData.setValue(30000,"Contribution Amount","May");
       JFreeChart barChart = ChartFactory.createBarChart("Monetory Donation", "Donor name", "Contribution Amount", barChartData, PlotOrientation.VERTICAL, false, true, false);
       CategoryPlot brChart = barChart.getCategoryPlot();
       brChart.setRangeGridlinePaint(Color.GREEN);

       ChartPanel barPanel = new ChartPanel(barChart);
       donorAnalysisJPanel.removeAll();
       donorAnalysisJPanel.add(barPanel, BorderLayout.CENTER);
       donorAnalysisJPanel.validate();
    }//GEN-LAST:event_btnFundsDonorActionPerformed

    private void btnTotalDonationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTotalDonationActionPerformed
        // TODO add your handling code here:

        DefaultPieDataset pieDataset = new DefaultPieDataset();
       double foodCounter = 0;
       double clothCounter = 0;
       double moneyCounter = 0;
       for (WorkRequest wr : analyticsOrganization.getWorkQueue().getWorkRequestList()) {
           if (wr instanceof DonationWorkRequest) {
               foodCounter += ((DonationWorkRequest) wr).getDonation().getFood_quantity();
               clothCounter += ((DonationWorkRequest) wr).getDonation().getCloth_quantity();
               moneyCounter += ((DonationWorkRequest) wr).getDonation().getMoneyDonation();
           }
       }

       pieDataset.setValue("Food", foodCounter);
       pieDataset.setValue("Cloth", clothCounter);
       pieDataset.setValue("money", moneyCounter);
//        pieDataset.setValue("April",40000);
//        pieDataset.setValue("May",30000);

       JFreeChart barChart = ChartFactory.createPieChart("Donation", pieDataset, true, true, false);
       //CategoryPlot brChart = barChart.getCategoryPlot();
       //brChart.setRangeGridlinePaint(Color.GREEN);

       ChartPanel barPanel = new ChartPanel(barChart);
       donorAnalysisJPanel.removeAll();
       donorAnalysisJPanel.add(barPanel, BorderLayout.CENTER);
       donorAnalysisJPanel.validate();
    }//GEN-LAST:event_btnTotalDonationActionPerformed

    private void btnNonEmergencyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNonEmergencyActionPerformed
        // TODO add your handling code here:
        DefaultPieDataset pieDataset = new DefaultPieDataset();
       //getour project code requests here
       double emergencyCounter = 0;
       double nonEmergencyCounter = 0;

       for (WorkRequest w : analyticsOrganization.getWorkQueue().getWorkRequestList()) {
           if (w instanceof DonationWorkRequest) {
               if (((DonationWorkRequest) w).getDonationType().equals(DonationWorkRequest.DonationType.Emergency)) {
                   emergencyCounter++;
               } else if (((DonationWorkRequest) w).getDonationType().equals(DonationWorkRequest.DonationType.NonEmergency)) {
                   nonEmergencyCounter++;
               }
           }
       }

       pieDataset.setValue("Emergency", emergencyCounter);
       pieDataset.setValue("Non Emergency", nonEmergencyCounter);
//        pieDataset.setValue("March",10000);
//        pieDataset.setValue("April",40000);
//        pieDataset.setValue("May",30000);
//        
       JFreeChart barChart = ChartFactory.createPieChart("Number of Donations", pieDataset, true, true, false);
       //CategoryPlot brChart = barChart.getCategoryPlot();
       //brChart.setRangeGridlinePaint(Color.GREEN);

       ChartPanel barPanel = new ChartPanel(barChart);
       donationChartJLabel.removeAll();
       donationChartJLabel.add(barPanel, BorderLayout.CENTER);
       donationChartJLabel.validate();

//////////////////////////////////////////////////

    }//GEN-LAST:event_btnNonEmergencyActionPerformed

    private void btnFoodDonorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFoodDonorsActionPerformed
        // TODO add your handling code here:
DefaultCategoryDataset barChartData = new DefaultCategoryDataset();

       for (WorkRequest wr : analyticsOrganization.getWorkQueue().getWorkRequestList())
       {
           if (wr instanceof DonationWorkRequest)
           {
               if (((DonationWorkRequest) wr).getDonation().getFood_quantity() != 0.0)
               {
                   System.out.println(((DonationWorkRequest) wr).getDonation().getFood_quantity() + " " + wr.getSender().getUsername());
                   barChartData.setValue(((DonationWorkRequest) wr).getDonation().getFood_quantity(), "Food Qty", wr.getSender().getUsername());
               }

           }
       }

//        
//        barChartData.setValue(15000,"Contribution Amount","February");
//        barChartData.setValue(10000,"Contribution Amount","March");
//        barChartData.setValue(40000,"Contribution Amount","April");
//        barChartData.setValue(30000,"Contribution Amount","May");
       JFreeChart barChart = ChartFactory.createBarChart("Food Donation", "Donor name", "Food quantity donated", barChartData, PlotOrientation.VERTICAL, false, true, false);
       CategoryPlot brChart = barChart.getCategoryPlot();
       brChart.setRangeGridlinePaint(Color.GREEN);

       ChartPanel barPanel = new ChartPanel(barChart);
       donorAnalysisJPanel.removeAll();
       donorAnalysisJPanel.add(barPanel, BorderLayout.CENTER);
       donorAnalysisJPanel.validate();
    }//GEN-LAST:event_btnFoodDonorsActionPerformed

    private void btnClothesDonorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClothesDonorsActionPerformed
        // TODO add your handling code here:
        DefaultCategoryDataset barChartData = new DefaultCategoryDataset();

       for (WorkRequest wr : analyticsOrganization.getWorkQueue().getWorkRequestList())
       {
           if (wr instanceof DonationWorkRequest)
           {
               if (((DonationWorkRequest) wr).getDonation().getCloth_quantity() != 0.0)
               {
                   System.out.println(((DonationWorkRequest) wr).getDonation().getCloth_quantity() + " " + wr.getSender().getUsername());
                   barChartData.setValue(((DonationWorkRequest) wr).getDonation().getCloth_quantity(), "Clothes Qty", wr.getSender().getUsername());
               }

           }
       }
//        
//        barChartData.setValue(15000,"Contribution Amount","February");
//        barChartData.setValue(10000,"Contribution Amount","March");
//        barChartData.setValue(40000,"Contribution Amount","April");
//        barChartData.setValue(30000,"Contribution Amount","May");
       JFreeChart barChart = ChartFactory.createBarChart("Clothes Donation", "Donor name", "Clothes quantity donated", barChartData, PlotOrientation.VERTICAL, false, true, false);
       CategoryPlot brChart = barChart.getCategoryPlot();
       brChart.setRangeGridlinePaint(Color.GREEN);

       ChartPanel barPanel = new ChartPanel(barChart);
       donorAnalysisJPanel.removeAll();
       donorAnalysisJPanel.add(barPanel, BorderLayout.CENTER);
       donorAnalysisJPanel.validate();
    }//GEN-LAST:event_btnClothesDonorsActionPerformed

    private void btnFoodAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFoodAreaActionPerformed
        // TODO add your handling code here:
        DefaultCategoryDataset barChartData = new DefaultCategoryDataset();
       Map<String, Integer> areaFunds = new HashMap<String, Integer>();

//        barChartData.setValue(20000,"Funds","January");
//        barChartData.setValue(15000,"Contribution Amount","February");
//        barChartData.setValue(10000,"Contribution Amount","March");
//        barChartData.setValue(40000,"Contribution Amount","April");
//        barChartData.setValue(30000,"Contribution Amount","May");
//        
       for (WorkRequest request : analyticsOrganization.getWorkQueue().getWorkRequestList()) {
           if (request instanceof DonationWorkRequest)
           {
               if (((DonationWorkRequest) request).getDonation().getDonatedTo() != null)
               {
                   barChartData.setValue(((DonationWorkRequest) request).getDonation().getFood_quantity(), "Food", ((DonationWorkRequest) request).getDonation().getDonatedTo());
               }

           }
       }

       JFreeChart barChart = ChartFactory.createBarChart("Emergency Donation", "Area", "Food", barChartData, PlotOrientation.VERTICAL, false, true, false);
       CategoryPlot brChart = barChart.getCategoryPlot();
       brChart.setRangeGridlinePaint(Color.GREEN);

       ChartPanel barPanel = new ChartPanel(barChart);
       donationChartJLabel.removeAll();
       donationChartJLabel.add(barPanel, BorderLayout.CENTER);
       donationChartJLabel.validate();
    }//GEN-LAST:event_btnFoodAreaActionPerformed

    private void btnClothesAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClothesAreaActionPerformed
        // TODO add your handling code here:
        DefaultCategoryDataset barChartData = new DefaultCategoryDataset();
       Map<String, Integer> areaFunds = new HashMap<String, Integer>();

//        barChartData.setValue(20000,"Funds","January");
//        barChartData.setValue(15000,"Contribution Amount","February");
//        barChartData.setValue(10000,"Contribution Amount","March");
//        barChartData.setValue(40000,"Contribution Amount","April");
//        barChartData.setValue(30000,"Contribution Amount","May");
//        
       for (WorkRequest request : analyticsOrganization.getWorkQueue().getWorkRequestList()) {
           if (request instanceof DonationWorkRequest)
           {
               if (((DonationWorkRequest) request).getDonation().getDonatedTo() != null)
               {
                   barChartData.setValue(((DonationWorkRequest) request).getDonation().getCloth_quantity(), "Clothes", ((DonationWorkRequest) request).getDonation().getDonatedTo());
               }

           }
       }

       JFreeChart barChart = ChartFactory.createBarChart("Emergency Donation", "Area", "Clothes", barChartData, PlotOrientation.VERTICAL, false, true, false);
       CategoryPlot brChart = barChart.getCategoryPlot();
       brChart.setRangeGridlinePaint(Color.GREEN);

       ChartPanel barPanel = new ChartPanel(barChart);
       donationChartJLabel.removeAll();
       donationChartJLabel.add(barPanel, BorderLayout.CENTER);
       donationChartJLabel.validate();
    }//GEN-LAST:event_btnClothesAreaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBarChart;
    private javax.swing.JButton btnClothesArea;
    private javax.swing.JButton btnClothesDonors;
    private javax.swing.JButton btnDonationBar;
    private javax.swing.JButton btnFoodArea;
    private javax.swing.JButton btnFoodDonors;
    private javax.swing.JButton btnFundsDonor;
    private javax.swing.JButton btnNonEmergency;
    private javax.swing.JButton btnTotalDonation;
    private javax.swing.JPanel chartJPanel;
    private javax.swing.JPanel donationChartJLabel;
    private javax.swing.JPanel donorAnalysisJPanel;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable workrequest;
    // End of variables declaration//GEN-END:variables
}