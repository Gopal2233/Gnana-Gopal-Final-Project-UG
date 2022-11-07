/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthanalyticswithml;
import java.io.*;
import java.util.*;

public class SerializeData {
    public void serializeTheDoubleSet(ArrayList<Double> values,String fileName){
        try{
        
        FileOutputStream fos = new FileOutputStream(fileName);
        ObjectOutputStream os = new ObjectOutputStream(fos);
        os.writeObject(values);
        os.close();
        fos.close();
        }catch(Exception e){
            System.out.println(e);
        }        
        
    }
}
