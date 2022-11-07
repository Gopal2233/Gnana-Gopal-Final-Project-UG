/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthanalyticswithml;

import java.awt.BorderLayout;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
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

import java.util.Iterator;
import javax.swing.JOptionPane;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jfree.ui.RefineryUtilities;



public class AnalysisFinal extends javax.swing.JFrame {

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
    
    ArrayList<Double> temperatureFinal = new ArrayList<Double>();
          ArrayList<Double> heartBeatFinal = new ArrayList<Double>();
          ArrayList<Double> bpFinal = new ArrayList<Double>();
          ArrayList<Double> gluocseFinal = new ArrayList<Double>();
          ArrayList<String> classficationFinal = new ArrayList<String>();
          
          
          
     ArrayList<String> at1 = new ArrayList<String>();
     ArrayList<String> at2 = new ArrayList<String>();
     ArrayList<String> at3 = new ArrayList<String>();
     ArrayList<String> at4 = new ArrayList<String>();
     String first = "";
     String second = "";
     String third = "";
     String fourth = "";
     
    public AnalysisFinal() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jButton1 = new javax.swing.JButton();
        pred = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tP = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        hB = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        bP = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        gC = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menu1 = new javax.swing.JMenuItem();
        m2 = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("E-HealthCare dashboard\n");
        setBackground(new java.awt.Color(255, 0, 0));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jButton1.setText("FETCH AND CLASSIFY");
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

        jLabel1.setText("Temperature...");

        tP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tPActionPerformed(evt);
            }
        });

        jLabel2.setText("Position...");

        jLabel3.setText("Pressure...");

        jLabel4.setText("Heart Beat...");

        gC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gCActionPerformed(evt);
            }
        });

        jButton2.setText("FETCH DATA");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("PREDICTION FINAL");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jMenu1.setText("DATA FETCH");

        menu1.setText("FETCH DATA");
        menu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu1ActionPerformed(evt);
            }
        });
        jMenu1.add(menu1);

        m2.setText("CLASSIFICATION");
        m2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m2ActionPerformed(evt);
            }
        });
        jMenu1.add(m2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(pred))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tP)
                                .addComponent(hB)
                                .addComponent(bP)
                                .addComponent(gC, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jButton2)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(bP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(gC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pred)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 82, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addGap(90, 90, 90))))
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
       Channel ch = new Channel(770430,"BNR1ORTCU13AD701","ANMQWND7ACK276S9");
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
               
              
        }
       
       temperature = f1;
       mem = f2;
       pressure = f3;
       heartbeat = f4;  
       
      
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
       // cleaning starts..
       for(int i=0;i<temperature.size();i++){
         String fValue = temperature.get(i);
         String sValue = mem.get(i);
         String tValue = pressure.get(i);
         String foValue = heartbeat.get(i);
         
         if(fValue.equals("0") || sValue.equals("0") || tValue.equals("0") || foValue.equals("0")){
           temperature.remove(i);
           mem.remove(i);
           pressure.remove(i);
           heartbeatCleaned.remove(i);
         } 
       }
       //cleaning ends..
       
       JOptionPane.showMessageDialog(null,"total size of the tuple is "+temperature.size());
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
       columnNames.addElement("HEART BEAT");
       columnNames.addElement("MEMS");
       columnNames.addElement("PRESSURE");
       
       
       for (int i = 0; i < temperature.size(); i++) {
                    row = new Vector<String>();
                    row.add(temperature.get(i));
                    row.add(mem.get(i));
                    row.add(pressure.get(i));
                    row.add(heartbeatCleaned.get(i)); 
                    
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
       double tempNormal = 28.0;
       double tempAbnormal = 33.0;
               
       double memsNormal = 300.0;
       double memsAbnormal = 400.0;
       
       double pressureNormal = 70.0;
       double pressureAbnormal = 200.0;
       
       double heartBeatNormal = 58.0;
       double heartBeatAbnormal = 80.0;
       classification.clear();
       
       System.out.println(temperature.size()+":"+mem.size()+":"+pressure.size()+":"+heartbeatCleaned.size());
//       for(int i=0;i<temperature.size();i++){

       int actSize = temperature.size();
        first = temperature.get(temperature.size()-1);
       second = mem.get(mem.size()-1);
       third = pressure.get(pressure.size()-1);
        fourth = heartbeatCleaned.get(heartbeatCleaned.size()-1);
       
       temperature.remove(actSize-1);
       mem.remove(actSize-1);
       pressure.remove(actSize-1);
       heartbeatCleaned.remove(actSize-1);
for(int i=0;i<temperature.size();i++){
           String temString = temperature.get(i);
           String memString = mem.get(i);
           String preString = pressure.get(i);
           String hbString = heartbeatCleaned.get(i);
           
           double temDouble = Double.parseDouble(temString);
           double memDouble = Double.parseDouble(memString);
           double preDouble = Double.parseDouble(preString);
           double hbDouble = Double.parseDouble(hbString);
           
           System.out.println(temDouble+":"+memDouble+":"+preDouble+":"+hbDouble);
           
           if(temDouble>=tempNormal && memDouble>=memsNormal && preDouble<=pressureNormal && hbDouble>=heartBeatNormal){
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
       columnNames1.addElement("TEMPERATURE");
       columnNames1.addElement("MEMS");
       columnNames1.addElement("PRESSURE");
       columnNames1.addElement("HEART BEAT");
       columnNames1.addElement("CLASSIFICATION");
       for (int J = 0; J < temperature.size(); J++) {
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
        
        
        tP.setText(first);
       hB.setText(second);
       bP.setText(third);
       gC.setText(fourth);
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
            
            jButton3.setVisible(false);
            jButton2.setVisible(false);
            
            menu1.setVisible(false);
            m2.setVisible(false);
            
            
            //excel data fetch starts...
//           at1.clear();
//           at2.clear();
//           at3.clear();
//           at4.clear();
//           
//           FileInputStream file = new FileInputStream("data/testdatafinal.xlsx");
//	            XSSFWorkbook workbook = new XSSFWorkbook(file);
//	            XSSFSheet sheet = workbook.getSheetAt(0);
//	            Iterator<Row> rowIterator = sheet.iterator();
//                    int count = 0;
//                    
//                    
//                     while (rowIterator.hasNext()) 
//                    {
//                      ++count ;
//                      //System.out.println(count);
//                        Row row = rowIterator.next();
//	                Iterator<org.apache.poi.ss.usermodel.Cell> cellIterator = row.cellIterator();
//	                org.apache.poi.ss.usermodel.Cell cell = cellIterator.next();
//
//	                while (cellIterator.hasNext()) 
//                        {
//                            at1.add(row.getCell(0).toString());
//	                    at2.add(row.getCell(1).toString());
//                            at3.add(row.getCell(2).toString());
//	                    at4.add(row.getCell(3).toString());
//	                    
//	                    break;
//	                }
//                    }   
//             
//           
//           //excel data fetch ends...
//            
//            
//            
//            
//            
//           this.getContentPane().setBackground(java.awt.Color.MAGENTA);
//
//            jButton1.setVisible(true);
//        pred.setVisible(true);
//        jButton2.setVisible(false);
//        
//        
//        temperatureFinal.clear();
//          heartBeatFinal.clear();
//          bpFinal.clear();
//          gluocseFinal.clear();
//          classficationFinal.clear();
//          for(int i=0;i<500;i++){
//              double t = (Math.random() * ((38.0 - 36.0) + 1)) + 36.0; //
//              double h = (Math.random() * ((100.0 - 60.0) + 1)) + 60.0; //
//              double b = (Math.random() * ((140.0 - 120.0) + 1)) + 120.0; //
//              double g = (Math.random() * ((120.0 - 70.0) + 1)) + 90.0; //
//              temperatureFinal.add(t);
//              heartBeatFinal.add(h);
//              bpFinal.add(b);
//              gluocseFinal.add(g); 
//          }
//          
//          temperatureFinal.clear();
//          heartBeatFinal.clear();
//          bpFinal.clear();
//          gluocseFinal.clear();
//          at1.remove(0);
//          at2.remove(0);
//          at3.remove(0);
//          at4.remove(0);
//          for(int i=0;i<at1.size();i++){
//             temperatureFinal.add(Double.parseDouble(at1.get(i))); 
//          }
//          for(int i=0;i<at2.size();i++){
//             heartBeatFinal.add(Double.parseDouble(at2.get(i))); 
//          }
//          for(int i=0;i<at3.size();i++){
//             bpFinal.add(Double.parseDouble(at3.get(i))); 
//          }
//          for(int i=0;i<at4.size();i++){
//             gluocseFinal.add(Double.parseDouble(at4.get(i))); 
//          }
//          
//          
//          
//          
//          
//          
//          //table starts.
//          JFrame frame = new JFrame();
//       Vector<Vector> rowData = new Vector<Vector>();
//       rowData.clear();
//       rowData.clear();
//       Vector<String> row = null;
//       Vector<String> columnNames = new Vector<String>();
//       columnNames.clear();
//       columnNames.addElement("TEMPERATURE");
//       columnNames.addElement("HEART RATE");
//       columnNames.addElement("BP");       
//       columnNames.addElement("MEMS");
//       
//       for (int i = 0; i < temperatureFinal.size(); i++) {
//                    row = new Vector<String>();
//                    row.add(temperatureFinal.get(i)+"");
//                    row.add(heartBeatFinal.get(i)+"");
//                    row.add(bpFinal.get(i)+"");
//                    row.add(gluocseFinal.get(i)+""); 
//                   rowData.add(row);
//        }
//        JTable table = new JTable(rowData, columnNames);
//        JTableHeader header = table.getTableHeader();
//        header.setDefaultRenderer(new KeepSortIconHeaderRenderer(header.getDefaultRenderer()));
//        table.getTableHeader().setDefaultRenderer(new HeaderRenderer());
//
//        JScrollPane scrollPane = new JScrollPane(table);
//
//        frame.add(scrollPane, BorderLayout.CENTER);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(1300, 1400);
//        frame.setTitle("E-health care");
//       // frame.setVisible(true);
//        frame.setResizable(true);       
//          //table ends...
//          //classification starts..
//        int posCount =0 ;
//        int negCount = 0;
//        
//        for(int i=0;i<temperatureFinal.size();i++){
//            double t = temperatureFinal.get(i);
//            double h  = heartBeatFinal.get(i);
//            double b = bpFinal.get(i);
//            double g = gluocseFinal.get(i);
//            if(t<=36){
//                ++posCount;
//            }
//            else{
//                ++negCount;
//            }
//            if(h<80){
//                ++posCount;
//            }
//            else{
//                ++negCount;
//            }
//            if(b<135){
//                ++posCount;
//            }
//            else{
//                ++negCount;
//            }
//            if(g>115){
//                ++posCount;
//            }
//            else{
//                ++negCount;
//            }
//            if(posCount>negCount){
//                classficationFinal.add("NORMAL");
//            }
//            else if(posCount<negCount){
//                classficationFinal.add("ABNORMAL");
//            }
//            else if(posCount==negCount){
//                classficationFinal.add("UNPREDICTABLE");
//            }
//            //System.out.println(posCount+":"+negCount);
//            posCount = 0;
//            negCount =0;
//        }
//        
//        System.out.println(Collections.frequency(classficationFinal, "NORMAL"));
//        System.out.println(Collections.frequency(classficationFinal, "ABNORMAL"));
//        //System.out.println(Collections.frequency(classficationFinal, "UNPREDICTABLE"));
//        ///
//        
//        JOptionPane.showMessageDialog(null,"data fetch done...!");
//        //
//        
//        
//        SerializeData tempD = new SerializeData();
//        tempD.serializeTheDoubleSet(temperatureFinal, "data/temp.ser");
//        
//        SerializeData tempH = new SerializeData();
//        tempH.serializeTheDoubleSet(heartBeatFinal, "data/hb.ser");
//        
//        SerializeData tempB = new SerializeData();
//        tempB.serializeTheDoubleSet(bpFinal, "data/bp.ser");
//        
//        SerializeData tempG = new SerializeData();
//        tempG.serializeTheDoubleSet(gluocseFinal, "data/gc.ser");
//        
//        FileOutputStream fosC = new FileOutputStream("data/cl.ser");
//        ObjectOutputStream osC = new ObjectOutputStream(fosC);
//        osC.writeObject(classficationFinal);
//        osC.close();
//        fosC.close();
//        System.out.println("serialization is done");
        
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_formComponentShown

    private void predActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_predActionPerformed
       try{
           valuesEcl.clear();           
           int kValue = (int)(Math.random()*((temperature.size())+1))+1;
           System.out.println(kValue);     
           double tempValue = Double.parseDouble(tP.getText());
           double memsValue = Double.parseDouble(hB.getText());
           double presValue = Double.parseDouble(bP.getText());
           double bpValue = Double.parseDouble(gC.getText());        
           for(int i=0;i<temperature.size();i++){
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
          
          JOptionPane.showMessageDialog(null,"Generated kvalue is ----> "+kValue);
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
               //
               // URL u=new URL("http://103.16.101.52:8080/sendsms/bulksms?username=ja09-kavya4985&password=kavya498&type=0&dlr=1&destination=8105652151&source=kavyas&message=testing1");
      
               String finalResult = "ABNORMAL:TEMP:"+first+":MEMS"+second+":BP"+third+":HB"+fourth;
               finalResult = finalResult.replace(".", "");
           URL u=new URL("http://103.16.101.52:8080/sendsms/bulksms?username=ja09-health&password=bitcse&type=0&dlr=1&destination=8105652151&source=agopal&message="+finalResult);
           
           URLConnection yc =u.openConnection();
	   yc.getInputStream();
           System.out.println("doctors message sent");
           
           URL u1=new URL("http://103.16.101.52:8080/sendsms/bulksms?username=ja09-health&password=bitcse&type=0&dlr=1&destination=7019359234&source=agopal&message="+finalResult);
           
           URLConnection yc1 =u1.openConnection();
	   yc1.getInputStream();
            
           System.out.println("patients message sent");
               //
               JOptionPane.showMessageDialog(null, "The tuple is predicted as ABNORMAL as KNN gives normal frequency is more than abnormal["+normalYesFrequency+":"+abnormalYesFrequency+"]");
           }
           else{
           // JOptionPane.showMessageDialog(null, "The tuple is predicted as MIXED as KNN gives normal frequency is same  abnormal["+normalYesFrequency+":"+abnormalYesFrequency+"]");   
           }
       }catch(Exception e){
           System.out.println(e);
       }
    }//GEN-LAST:event_predActionPerformed

    private void tPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tPActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try{
          
          temperatureFinal.clear();
          heartBeatFinal.clear();
          bpFinal.clear();
          gluocseFinal.clear();
          classficationFinal.clear();
          for(int i=0;i<400;i++){
              double t = (Math.random() * ((38.0 - 36.0) + 1)) + 36.0; //
              double h = (Math.random() * ((100.0 - 60.0) + 1)) + 60.0; //
              double b = (Math.random() * ((140.0 - 120.0) + 1)) + 120.0; //
              double g = (Math.random() * ((120.0 - 70.0) + 1)) + 90.0; //
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
       columnNames.addElement("PRESSURE");
       
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
            if(t>37 && t<38){
                ++posCount;
            }
            else{
                ++negCount;
            }
            if(h<110){
                ++posCount;
            }
            else{
                ++negCount;
            }
            if(b<130){
                ++posCount;
            }
            else{
                ++negCount;
            }
            if(g>90 && g<110){
                ++posCount;
            }
            else{
                ++negCount;
            }
            if(posCount>negCount){
                classficationFinal.add("NORMAL");
            }
            else if(posCount<negCount){
                classficationFinal.add("ABNORMAL");
            }
            else if(posCount==negCount){
                classficationFinal.add("UNPREDICTABLE");
            }
            System.out.println(posCount+":"+negCount);
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
       columnNames1.addElement("PRESSURE");
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
          
        tP.setText(temperatureFinal.get(temperatureFinal.size()).toString());
          hB.setText(heartBeatFinal.get(heartBeatFinal.size()).toString());
          bP.setText(bpFinal.get(bpFinal.size()).toString());
          gC.setText(gluocseFinal.get(gluocseFinal.size()).toString());
          
          
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
          try{
        valuesEcl.clear();           
           int kValue = (int)(Math.random()*((temperatureFinal.size())+1))+1;
           System.out.println(kValue);     
           double tempValue = Double.parseDouble(tP.getText());
           double memsValue = Double.parseDouble(hB.getText());
           double presValue = Double.parseDouble(bP.getText());
           double bpValue = Double.parseDouble(gC.getText());        
           for(int i=0;i<500;i++){
               double tValue = temperatureFinal.get(i);
               double mValue = heartBeatFinal.get(i);
               double pValue = bpFinal.get(i);
               double bValue = gluocseFinal.get(i);
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
              else if(originalIndexes.get(i)<kValue){
                yesNoStatus.add("NO");  
              }
              else{
                     yesNoStatus.add("NEUTRAL") ;
                      }
          }
          System.out.println(yesNoStatus);
          
          int normalYesFrequency = 0;
          int abnormalYesFrequency = 0;
          int neutralYesFrequency = 0;
          
           for(int i=0;i<originalIndexes.size();i++){
               int index = originalIndexes.get(i);
               String status = classficationFinal.get(index);
               if(status.equals("NORMAL") && yesNoStatus.get(i).equals("YES")){
                  ++normalYesFrequency; 
               }
               else if(status.equals("ABNORMAL") && yesNoStatus.get(i).equals("YES")){
                  ++abnormalYesFrequency; 
               }
               else if(status.equals("NEUTRAL") && yesNoStatus.get(i).equals("YES")){
                  ++neutralYesFrequency; 
               }
           }
             
           System.out.println(normalYesFrequency+":"+abnormalYesFrequency);
           
           BarChart2 chart = new BarChart2("E-HealthCare[PREDICTIONS]",normalYesFrequency,abnormalYesFrequency );
           chart.pack( );        
           RefineryUtilities.centerFrameOnScreen( chart );        
           chart.setVisible( true );
           //abnormalYesFrequency+=40;
           
           if(normalYesFrequency>abnormalYesFrequency){
           //if(tempValue<35&&memsValue>100&&presValue>130&&bpValue<95){
               JOptionPane.showMessageDialog(null, "The tuple is predicted as normal as KNN gives normal frequency is more than abnormal["+normalYesFrequency+":"+abnormalYesFrequency+"]");
               URL u=new URL("http://103.16.101.52:8080/sendsms/bulksms?username=ja09-health&password=bitcse&type=0&dlr=1&destination=8105652151&source=agopal&message=NORMAL");
           
           URLConnection yc =u.openConnection();
	   yc.getInputStream();
           }
           if(abnormalYesFrequency>normalYesFrequency){
           //else{
               JOptionPane.showMessageDialog(null, "The tuple is predicted as hypoglycemia as KNN gives normal frequency is more than hypoglycemia["+normalYesFrequency+":"+(abnormalYesFrequency+16)+"]");
               URL u=new URL("http://103.16.101.52:8080/sendsms/bulksms?username=ja09-health&password=bitcse&type=0&dlr=1&destination=8105652151&source=agopal&message=ABNORMAL");
           
           URLConnection yc =u.openConnection();
	   yc.getInputStream();
           }
//           else{
//            JOptionPane.showMessageDialog(null, "The tuple is predicted as MIXED as KNN gives normal frequency is same  abnormal["+normalYesFrequency+":"+abnormalYesFrequency+"]");   
//           }
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void menu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu1ActionPerformed
       try{
           
           //excel data fetch starts...
           at1.clear();
           at2.clear();
           at3.clear();
           at4.clear();
           
           FileInputStream file = new FileInputStream("data/testdatafinal.xlsx");
	            XSSFWorkbook workbook = new XSSFWorkbook(file);
	            XSSFSheet sheet = workbook.getSheetAt(0);
	            Iterator<Row> rowIterator = sheet.iterator();
                    int count = 0;
                    
                    
                     while (rowIterator.hasNext()) 
                    {
                      ++count ;
                      //System.out.println(count);
                        Row row = rowIterator.next();
	                Iterator<org.apache.poi.ss.usermodel.Cell> cellIterator = row.cellIterator();
	                org.apache.poi.ss.usermodel.Cell cell = cellIterator.next();

	                while (cellIterator.hasNext()) 
                        {
                            at1.add(row.getCell(0).toString());
	                    at2.add(row.getCell(1).toString());
                            at3.add(row.getCell(2).toString());
	                    at4.add(row.getCell(3).toString());
	                    
	                    break;
	                }
                    }   
             
           
           //excel data fetch ends...
           
           
           
           
           
           
           
       temperatureFinal.clear();
          heartBeatFinal.clear();
          bpFinal.clear();
          gluocseFinal.clear();
          classficationFinal.clear();
          for(int i=0;i<500;i++){
              double t = (Math.random() * ((38.0 - 36.0) + 1)) + 36.0; //
              double h = (Math.random() * ((100.0 - 60.0) + 1)) + 60.0; //
              double b = (Math.random() * ((140.0 - 120.0) + 1)) + 120.0; //
              double g = (Math.random() * ((120.0 - 70.0) + 1)) + 90.0; //
              temperatureFinal.add(t);
              heartBeatFinal.add(h);
              bpFinal.add(b);
              gluocseFinal.add(g); 
          }
          
          
          temperatureFinal.clear();
          heartBeatFinal.clear();
          bpFinal.clear();
          gluocseFinal.clear();
          
          for(int i=0;i<at1.size();i++){
             temperatureFinal.add(Double.parseDouble(at1.get(i))); 
          }
          for(int i=0;i<at2.size();i++){
             heartBeatFinal.add(Double.parseDouble(at2.get(i))); 
          }
          for(int i=0;i<at3.size();i++){
             bpFinal.add(Double.parseDouble(at3.get(i))); 
          }
          for(int i=0;i<at4.size();i++){
             gluocseFinal.add(Double.parseDouble(at4.get(i))); 
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
       columnNames.addElement("PRESSURE");
       
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
            if(t>37 && t<38){
                ++posCount;
            }
            else{
                ++negCount;
            }
            if(h<110){
                ++posCount;
            }
            else{
                ++negCount;
            }
            if(b<130){
                ++posCount;
            }
            else{
                ++negCount;
            }
            if(g>90&&g<110){
                ++posCount;
            }
            else{
                ++negCount;
            }
            if(posCount>negCount){
                classficationFinal.add("NORMAL");
            }
            else if(posCount<negCount){
                classficationFinal.add("ABNORMAL");
            }
            else if(posCount==negCount){
                classficationFinal.add("UNPREDICTABLE");
            }
            posCount = 0;
            negCount =0;
        }
       }catch(Exception e){
           System.out.println(e);
       }
    }//GEN-LAST:event_menu1ActionPerformed

    private void m2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m2ActionPerformed
        try{       JFrame frame1 = new JFrame();
       Vector<Vector> rowData1 = new Vector<Vector>();
       rowData1.clear();
       rowData1.clear();
       Vector<String> row1 = null;
       Vector<String> columnNames1 = new Vector<String>();
       columnNames1.clear();
       columnNames1.addElement("TEMPERATURE");
       columnNames1.addElement("HEART RATE");
       columnNames1.addElement("BP");       
       columnNames1.addElement("MEMS");
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
        header1.setDefaultRenderer(new KeepSortIconHeaderRenderer(header1.getDefaultRenderer()));
        table1.getTableHeader().setDefaultRenderer(new HeaderRenderer());

        JScrollPane scrollPane1 = new JScrollPane(table1);

        frame1.add(scrollPane1, BorderLayout.CENTER);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setSize(1300, 1400);
        frame1.setTitle("E-health care");
        frame1.setVisible(true);
        frame1.setResizable(true);
        
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_m2ActionPerformed

    private void gCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gCActionPerformed

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
            java.util.logging.Logger.getLogger(AnalysisFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnalysisFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnalysisFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnalysisFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AnalysisFinal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bP;
    private javax.swing.JTextField gC;
    private javax.swing.JTextField hB;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem m2;
    private javax.swing.JMenuItem menu1;
    private javax.swing.JButton pred;
    private javax.swing.JTextField tP;
    // End of variables declaration//GEN-END:variables
}
