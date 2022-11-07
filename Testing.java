
package healthanalyticswithml;
import java.net.URL;
import java.net.URLConnection;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Toshiba
 */
public class Testing {
    
    public static void main(String []args){
        try{
        
        
         // URL u=new URL("http://103.16.101.52:8080/sendsms/bulksms?username=ja09-kavya4985&password=kavya498&type=0&dlr=1&destination=8105652151&source=kavyas&message=testing1");
      
           URL u=new URL("http://103.16.101.52:8080/sendsms/bulksms?username=ja09-health&password=bitcse&type=0&dlr=1&destination=8904694942&source=agopal&message=problem777:777");
           
           URLConnection yc =u.openConnection();
	   yc.getInputStream();
         

         System.out.println("send");
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
}
