/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.JTableHeader;
import org.jfree.ui.RefineryUtilities;
import test.Channel;
import test.Entry;
import test.Feed;

/**
 *
 * @author Logic Mind
 */
public class Analysis extends javax.swing.JFrame {

    ArrayList<String> f1 = new ArrayList<String>();
    ArrayList<String> f2 = new ArrayList<String>();
    ArrayList<String> f3 = new ArrayList<String>();
    ArrayList<String> f4 = new ArrayList<String>();
    ArrayList<String> f5 = new ArrayList<String>();
    ArrayList<String> f6 = new ArrayList<String>();
    ArrayList<String> temperature = new ArrayList<String>();
    ArrayList<String> mem = new ArrayList<String>();
    ArrayList<String> pressure = new ArrayList<String>();
    ArrayList<String> heartbeat = new ArrayList<String>();
    ArrayList<String> fifth = new ArrayList<String>();
    ArrayList<String> sixth = new ArrayList<String>();
    ArrayList<String> heartbeatCleaned = new ArrayList<String>();
    
    
    ArrayList<Double> valuesEcl = new ArrayList<Double>();
    
    
    ArrayList<String> classification = new ArrayList<String>();
    
    
    public Analysis() {
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
        pred = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        temp = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        mems = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        presss = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        bp = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jButton1.setText("ANALYSIS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        pred.setText("PREDICTION");
        pred.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                predActionPerformed(evt);
            }
        });

        jLabel1.setText("Enter Temperature");

        temp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tempActionPerformed(evt);
            }
        });

        jLabel2.setText("Enter HeartBeat");

        jLabel3.setText("Enter BP");

        jLabel4.setText("Enter Glucose");

        jButton2.setText("FETCH DATA");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pred)
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(temp)
                            .addComponent(mems)
                            .addComponent(presss)
                            .addComponent(bp, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE))))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(temp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(mems, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(presss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(bp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addComponent(pred)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       try{
       //
       try{
         temperature.clear();
       mem.clear();
       pressure.clear();
       heartbeat.clear();
       heartbeatCleaned.clear();
       f1.clear();
       f2.clear();
       f3.clear();
       f4.clear();
       Channel ch = new Channel(719991,"A6PMISNFPB8O8GGK","GSKPCOWTPINXKGZS");
       ch.setUrl("http://api.thingspeak.com");
       boolean status = ch.isAvailable();
       System.out.println(status);
       Feed ff = ch.getChannelFeed();
       ArrayList<Entry> allEntries = ff.getEntryList();
       JOptionPane.showMessageDialog(null,"actual populated size from thingspeak "+allEntries.size());
        for(int i=0;i<allEntries.size();i++){
         Entry e = (Entry)allEntries.get(i);
         //
             
                
                if(e.getField(1) == null){
                f1.add("null values");
            }
               else{
                f1.add(e.getField(1).toString().trim()); 
            }
                
             if(e.getField(2) == null){
                f2.add("null values");
            }
               else{
                f2.add(e.getField(2).toString().trim()); 
            }  
             
              if(e.getField(3) == null){
                f3.add("null values");
            }
               else{
                f3.add(e.getField(3).toString().trim()); 
            }  
              
               if(e.getField(4) == null){
                f4.add("null values");
            }
               else{
                f4.add(e.getField(4).toString().trim()); 
            } 
               
               if(e.getField(5) == null){
                f5.add("null values");
            }
               else{
                f5.add(e.getField(5).toString().trim()); 
            } 
               
               if(e.getField(6) == null){
                f5.add("null values");
            }
               else{
                f6.add(e.getField(6).toString().trim()); 
            } 
           
        }
       
       temperature = f1;
       mem = f2;
       pressure = f3;
       heartbeat = f4;  
       fifth = f5;
       sixth = f6;
       
       
       //cleaning process..
       for(int i=0;i<heartbeat.size();i++){
           String heartbeatString = heartbeat.get(i);
           if(heartbeatString.endsWith("ATE0")){
            heartbeatString = heartbeatString.replace( "ATE0","");
            heartbeatCleaned.add(heartbeatString);
           }
           else{
               heartbeatCleaned.add(heartbeatString);
           }
       }
       
       JOptionPane.showMessageDialog(null,"total size of the tuple is "+sixth.size());
       //cleaning process...ends  
        System.out.println(temperature.size()+":"+mem.size()+":"+pressure.size()+":"+heartbeatCleaned.size());
       //table code starts..
       JFrame frame = new JFrame();
       Vector<Vector> rowData = new Vector<Vector>();
       rowData.clear();
       rowData.clear();
       Vector<String> row = null;
       Vector<String> columnNames = new Vector<String>();
       columnNames.clear();
       columnNames.addElement("TEMPERATURE");
       columnNames.addElement("MEM X");
       columnNames.addElement("MEM Y");
       columnNames.addElement("PRESSURE");
       columnNames.addElement("HB");
       columnNames.addElement("GLUCOSE");
       
       for (int i = 0; i < temperature.size(); i++) {
                    row = new Vector<String>();
                    row.add(temperature.get(i));
                    row.add(mem.get(i));
                    row.add(pressure.get(i));
                    row.add(heartbeatCleaned.get(i)); 
                    row.add(fifth.get(i)); 
                    row.add(sixth.get(i)); 
                    rowData.add(row);
                    //row.clear();
        }
        JTable table = new JTable(rowData, columnNames);
        JTableHeader header = table.getTableHeader();
        header.setDefaultRenderer(new KeepSortIconHeaderRenderer(header.getDefaultRenderer()));
        table.getTableHeader().setDefaultRenderer(new HeaderRenderer());

        JScrollPane scrollPane = new JScrollPane(table);

        frame.add(scrollPane, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1300, 1400);
        frame.setTitle("E-health care");
        frame.setVisible(true);
        frame.setResizable(true);       
       //table code ends..  
       
       
       //classification starts...
       double tempNormal = 33.0;
       double tempAbnormal = 32.0;
               
       double memsNormal = 190.0;
       double memsAbnormal = 191.0;
       
       double pressureNormal = 248.0;
       double pressureAbnormal = 249.0;
       
       double heartBeatNormal = 16.0;
       double heartBeatAbnormal = 35.0;
       classification.clear();
       
       System.out.println(temperature.size()+":"+mem.size()+":"+pressure.size()+":"+heartbeatCleaned.size());
//       for(int i=0;i<temperature.size();i++){
for(int i=0;i<40;i++){
           String temString = temperature.get(i);
           String memString = mem.get(i);
           String preString = pressure.get(i);
           String hbString = heartbeatCleaned.get(i);
           
           double temDouble = Double.parseDouble(temString);
           double memDouble = Double.parseDouble(memString);
           double preDouble = Double.parseDouble(preString);
           double hbDouble = Double.parseDouble(hbString);
           
           System.out.println(temDouble+":"+memDouble+":"+preDouble+":"+hbDouble);
           
           if(temDouble<=tempNormal && memDouble<=memsNormal && preDouble<=pressureNormal && hbDouble>=heartBeatNormal){
             classification.add("NORMAL");  
           }
           else{
              classification.add("ABNORMAL");   
           }
       }  
           //table code starts..
           
           System.out.println("afterr classification");
       JFrame frame1 = new JFrame();
       Vector<Vector> rowData1 = new Vector<Vector>();
       rowData1.clear();
       rowData1.clear();
       Vector<String> row1 = null;
       Vector<String> columnNames1 = new Vector<String>();
       columnNames1.clear();
       columnNames1.addElement("TEMP");
       columnNames1.addElement("MEMS x");
       columnNames1.addElement("MEMS Y");
       columnNames1.addElement("PRESSURE");
       columnNames1.addElement("Classification");
       for (int J = 0; J < 40; J++) {
                    row1 = new Vector<String>();
                    row1.add(temperature.get(J));
                    row1.add(mem.get(J));
                    row1.add(pressure.get(J));
                    row1.add(heartbeatCleaned.get(J)); 
                    row1.add(classification.get(J)); 
                    rowData1.add(row1);
                    //row.clear();
        }
        JTable table1 = new JTable(rowData1, columnNames1);
        JTableHeader header1 = table1.getTableHeader();
        header1.setDefaultRenderer(new KeepSortIconHeaderRenderer(header1.getDefaultRenderer()));
        table1.getTableHeader().setDefaultRenderer(new HeaderRenderer());

        JScrollPane scrollPane1 = new JScrollPane(table1);

        frame1.add(scrollPane1, BorderLayout.CENTER);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setSize(1300, 1400);
        frame1.setTitle("E-health care CLASSIFICATION");
        frame1.setVisible(true);
        frame1.setResizable(true);       
       //table code ends..  
       
       
       int normalFrequency = Collections.frequency(classification, "NORMAL");
       int abnormalFrequency = Collections.frequency(classification, "ABNORMAL");
        BarChart2 chart = new BarChart2("E-HealthCare",normalFrequency,abnormalFrequency );
      chart.pack( );        
      RefineryUtilities.centerFrameOnScreen( chart );        
      chart.setVisible( true ); 
       //classification ends..
        pred.setEnabled(true);
       
       }catch(Exception e){
           System.out.println(e);
       }
       //       
       }catch(Exception e){
           System.out.println(e);
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        try{
        //pred.setEnabled(false);
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_formComponentShown

    private void predActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_predActionPerformed
       try{
           valuesEcl.clear();           
           int kValue = (int)(Math.random()*((temperature.size())+1))+1;
           System.out.println(kValue);     
           double tempValue = Double.parseDouble(temp.getText());
           double memsValue = Double.parseDouble(mems.getText());
           double presValue = Double.parseDouble(presss.getText());
           double bpValue = Double.parseDouble(bp.getText());        
           for(int i=0;i<40;i++){
               double tValue = Double.parseDouble(temperature.get(i));
               double mValue = Double.parseDouble(mem.get(i));
               double pValue = Double.parseDouble(pressure.get(i));
               double bValue = Double.parseDouble(heartbeatCleaned.get(i));
               double val1 = tValue - tempValue;
               double val2 = mValue - memsValue;
               double val3 = pValue - presValue;
               double val4 = bValue - bpValue;               
               val1 = val1 * val1;
               val2 = val2 * val2;
               val3 = val3 * val3;
               val4 = val4 * val4;
               valuesEcl.add(val1 + val2 + val3 + val4);
           } 
          ArrayList<Double> valuesEclSort = new ArrayList<Double>();
          valuesEclSort.clear();
          ArrayList<Integer> originalIndexes = new ArrayList<Integer>();
          originalIndexes.clear();
          valuesEclSort = (ArrayList<Double>) valuesEcl.clone();
          Collections.sort(valuesEclSort);
          Collections.reverse(valuesEclSort);
          System.out.println(valuesEcl);
          System.out.println(valuesEclSort);
          for(int i=0;i<valuesEclSort.size();i++){
              double value = valuesEclSort.get(i);
              originalIndexes.add(valuesEcl.indexOf(value));
          }
          System.out.println(originalIndexes);
          ArrayList<String> yesNoStatus = new ArrayList<String>();
          yesNoStatus.clear();
          for(int i=0;i<originalIndexes.size();i++){
              if(originalIndexes.get(i)>=kValue){
                yesNoStatus.add("YES");  
              }
              else{
                yesNoStatus.add("NO");  
              }
          }
          System.out.println(yesNoStatus);
          
          int normalYesFrequency = 0;
          int abnormalYesFrequency = 0;
          
           for(int i=0;i<originalIndexes.size();i++){
               int index = originalIndexes.get(i);
               String status = classification.get(index);
               if(status.equals("NORMAL") && yesNoStatus.get(i).equals("YES")){
                  ++normalYesFrequency; 
               }
               else if(status.equals("ABNORMAL") && yesNoStatus.get(i).equals("YES")){
                  ++abnormalYesFrequency; 
               }
           }
             
           System.out.println(normalYesFrequency+":"+abnormalYesFrequency);
           
           BarChart2 chart = new BarChart2("E-HealthCare[PREDICTIONS]",normalYesFrequency,abnormalYesFrequency );
           chart.pack( );        
           RefineryUtilities.centerFrameOnScreen( chart );        
           chart.setVisible( true );
           
           
           if(normalYesFrequency>abnormalYesFrequency){
               JOptionPane.showMessageDialog(null, "The tuple is predicted as NORMAL as KNN gives normal frequency is more than abnormal["+normalYesFrequency+":"+abnormalYesFrequency+"]");
           }
           if(abnormalYesFrequency>normalYesFrequency){
               JOptionPane.showMessageDialog(null, "The tuple is predicted as ABNORMAL as KNN gives normal frequency is more than abnormal["+normalYesFrequency+":"+abnormalYesFrequency+"]");
           }
           else{
            JOptionPane.showMessageDialog(null, "The tuple is predicted as MIXED as KNN gives normal frequency is same  abnormal["+normalYesFrequency+":"+abnormalYesFrequency+"]");   
           }
       }catch(Exception e){
           System.out.println(e);
       }
    }//GEN-LAST:event_predActionPerformed

    private void tempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tempActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tempActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try{
          ArrayList<Double> temperatureFinal = new ArrayList<Double>();
          ArrayList<Double> heartBeatFinal = new ArrayList<Double>();
          ArrayList<Double> bpFinal = new ArrayList<Double>();
          ArrayList<Double> gluocseFinal = new ArrayList<Double>();
          ArrayList<String> classficationFinal = new ArrayList<String>();
          temperatureFinal.clear();
          heartBeatFinal.clear();
          bpFinal.clear();
          gluocseFinal.clear();
          classficationFinal.clear();
          for(int i=0;i<400;i++){
              double t = (Math.random() * ((38.0 - 36.0) + 1)) + 36.0; //
              double h = (Math.random() * ((100.0 - 60.0) + 1)) + 60.0; //
              double b = (Math.random() * ((140.0 - 120.0) + 1)) + 120.0; //
              double g = (Math.random() * ((120.0 - 90.0) + 1)) + 90.0; //
              temperatureFinal.add(t);
              heartBeatFinal.add(h);
              bpFinal.add(b);
              gluocseFinal.add(g); 
          }
          System.err.println();
          //table starts.
          JFrame frame = new JFrame();
       Vector<Vector> rowData = new Vector<Vector>();
       rowData.clear();
       rowData.clear();
       Vector<String> row = null;
       Vector<String> columnNames = new Vector<String>();
       columnNames.clear();
       columnNames.addElement("TEMPERATURE");
       columnNames.addElement("HEART RATE");
       columnNames.addElement("BP");       
       columnNames.addElement("GLUCOSE");
       
       for (int i = 0; i < temperatureFinal.size(); i++) {
                    row = new Vector<String>();
                    row.add(temperatureFinal.get(i)+"");
                    row.add(heartBeatFinal.get(i)+"");
                    row.add(bpFinal.get(i)+"");
                    row.add(gluocseFinal.get(i)+""); 
                   rowData.add(row);
        }
        JTable table = new JTable(rowData, columnNames);
        JTableHeader header = table.getTableHeader();
        header.setDefaultRenderer(new KeepSortIconHeaderRenderer(header.getDefaultRenderer()));
        table.getTableHeader().setDefaultRenderer(new HeaderRenderer());

        JScrollPane scrollPane = new JScrollPane(table);

        frame.add(scrollPane, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1300, 1400);
        frame.setTitle("E-health care");
        frame.setVisible(true);
        frame.setResizable(true);       
          //table ends...
          //classification starts..
        int posCount =0 ;
        int negCount = 0;
        
        for(int i=0;i<temperatureFinal.size();i++){
            double t = temperatureFinal.get(i);
            double h  = heartBeatFinal.get(i);
            double b = bpFinal.get(i);
            double g = gluocseFinal.get(i);
            if(t<=37){
                ++posCount;
            }
            else{
                ++negCount;
            }
            if(h<=80){
                ++posCount;
            }
            else{
                ++negCount;
            }
            if(b>=130){
                ++posCount;
            }
            else{
                ++negCount;
            }
            if(g<=115){
                ++posCount;
            }
            else{
                ++negCount;
            }
            if(posCount>negCount){
                classficationFinal.add("normal");
            }
            else if(posCount<negCount){
                classficationFinal.add("abnormal");
            }
            else if(posCount==negCount){
                classficationFinal.add("unpredictable");
            }
            posCount = 0;
            negCount =0;
        }  
          //classification ends..
          
          //table starts.
          JFrame frame1 = new JFrame();
       Vector<Vector> rowData1 = new Vector<Vector>();
       rowData1.clear();
       rowData1.clear();
       Vector<String> row1 = null;
       Vector<String> columnNames1 = new Vector<String>();
       columnNames1.clear();
       columnNames1.addElement("TEMPERATURE");
       columnNames1.addElement("HEART RATE");
       columnNames1.addElement("BP");       
       columnNames1.addElement("GLUCOSE");
       columnNames1.addElement("CLASSFICATION");
       for (int i = 0; i < temperatureFinal.size(); i++) {
                    row1 = new Vector<String>();
                    row1.add(temperatureFinal.get(i)+"");
                    row1.add(heartBeatFinal.get(i)+"");
                    row1.add(bpFinal.get(i)+"");
                    row1.add(gluocseFinal.get(i)+"");
                    row1.add(classficationFinal.get(i));
                   rowData1.add(row1);
        }
        JTable table1 = new JTable(rowData1, columnNames1);
        JTableHeader header1 = table1.getTableHeader();
        header1.setDefaultRenderer(new KeepSortIconHeaderRenderer(header.getDefaultRenderer()));
        table1.getTableHeader().setDefaultRenderer(new HeaderRenderer());

        JScrollPane scrollPane1 = new JScrollPane(table1);

        frame1.add(scrollPane1, BorderLayout.CENTER);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setSize(1300, 1400);
        frame1.setTitle("E-health care");
        frame1.setVisible(true);
        frame1.setResizable(true);       
          //table ends...
          
          
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Analysis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Analysis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Analysis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Analysis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Analysis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bp;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField mems;
    private javax.swing.JButton pred;
    private javax.swing.JTextField presss;
    private javax.swing.JTextField temp;
    // End of variables declaration//GEN-END:variables
}
