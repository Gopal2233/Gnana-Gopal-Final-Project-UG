package application;


import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel; 
import org.jfree.chart.JFreeChart; 
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset; 
import org.jfree.data.category.DefaultCategoryDataset; 
import org.jfree.ui.ApplicationFrame; 
import org.jfree.ui.RefineryUtilities; 

import java.util.*;

public class BarChart3 extends ApplicationFrame {
   ArrayList<Integer> cVals = new ArrayList<Integer>();
   
   String mName = "";
   
   public BarChart3( String applicationTitle , String Category,Float Accuracy) {
      super( applicationTitle );        
      
      JFreeChart barChart = ChartFactory.createBarChart(
         applicationTitle,           
         "Normal and Abnormal Frequencies",            
         "Frequncy of tweets",            
         createDataset(Category,Accuracy),          
         PlotOrientation.VERTICAL,           
         true, true, false);
         
      ChartPanel chartPanel = new ChartPanel( barChart );        
      chartPanel.setPreferredSize(new java.awt.Dimension( 560 , 367 ) );        
      setContentPane( chartPanel ); 
   }
   
   private CategoryDataset createDataset(String cat,float acc) {
            
          
     final DefaultCategoryDataset dataset = 
     new DefaultCategoryDataset( );  
           dataset.addValue( acc , cat , cat );  
      //dataset.addValue( value2 , "ABNORMAL" , "ABNORMAL FREQUENCY" );  
        
     return dataset; 
   }
   
    private CategoryDataset createDataset(int value1,int value2) {
      final String fiat = "NORMAL FREQUENCY";        
      final String audi = "ABNORMAL FREQUENCY";        
          
     final DefaultCategoryDataset dataset = 
     new DefaultCategoryDataset( );  
           dataset.addValue( value1 , "NORMAL" , "NORMAL FREQUENCY" );  
      dataset.addValue( value2 , "ABNORMAL" , "ABNORMAL FREQUENCY" );  
        
     return dataset; 
   }
   
   
//   public BarChart2( String applicationTitle ,String movieName, int size) {
//      super( applicationTitle );        
//      mName = movieName;
//      JFreeChart barChart = ChartFactory.createBarChart(
//         applicationTitle,           
//         "MovieName",            
//         "Frequncy of tweets",            
//         createDataset(size,mName),          
//         PlotOrientation.VERTICAL,           
//         true, true, false);
//         
//      ChartPanel chartPanel = new ChartPanel( barChart );        
//      chartPanel.setPreferredSize(new java.awt.Dimension( 560 , 367 ) );        
//      setContentPane( chartPanel ); 
//   }
   
   
//    private CategoryDataset createDataset(int value2,String movieName) {
//      final String fiat = "POSITIVE FREQUENCY";        
//      final String audi = "NEGETIVE FREQUENCY";        
//          
//      final DefaultCategoryDataset dataset = 
//      new DefaultCategoryDataset( );  
//      
//      dataset.addValue( value2 , movieName , "Number Of tweets" );  
//      //dataset.addValue( value2 , audi , "-ve accuracy" );  
//         
//      return dataset; 
//   }
   
    
    
   
   
   
   
   //
   
  
   //
   
   
   
   
   public static void main( String[ ] args ) {
//      BarChart2 chart = new BarChart2("BIT COIN", 
//         "STATISTICS");
//      chart.pack( );        
//      RefineryUtilities.centerFrameOnScreen( chart );        
//      chart.setVisible( true ); 
   }
}