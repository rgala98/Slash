/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack;

import java.awt.Color;



/**
 *
 * @author Nisarg
 */
public class Psy_Logic {
    int num;
    
    
    
    public int fn(boolean flag, int n,int a){
        
        if(flag == true){
            a+=n;
        }
        return a;
        
      
    }
    
    public void print(int cx){
        System.out.println(cx);
    }
    
    public void output(int an) throws InterruptedException{

            Psy_Output po = new Psy_Output(); 
            po.setVisible(true);
            String sc = Integer.toString(an);
            po.jLabel4.setText(sc);

            
            

    }
}
