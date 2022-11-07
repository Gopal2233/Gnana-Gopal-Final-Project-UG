
package application;
import java.util.*;
public class GetMeanWeight {
    
    float mw = 0.0f;
    public float getMeanWeight(ArrayList<String> values){
        try{
        float count = 0.0f;    
        for(int i=0;i<values.size();i++){
            String value = values.get(i);
            value = value.trim();
            float fValue = Float.parseFloat(value);
            mw += fValue;
        }
        mw = (float)mw/values.size();
        }catch(Exception e){
            System.out.println(e);
        }
        return mw;
    }
    
}
