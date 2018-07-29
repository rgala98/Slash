/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack;

/**
 *
 * @author Nisarg
 */
public class LoginAndRegister {

    /**
     * @param clk
     * @throws java.lang.InterruptedException
     */
    public void click1(int clk) throws InterruptedException {
        Login log = new Login();
        Register reg = new Register();
        log.setVisible(false);
        reg.setVisible(false);
        
        switch (clk) {
            case 0:
                Thread.sleep(100);
                log.setVisible(true);
                break;
            case -1:
                /*
                Thread.sleep(100);
                log.setVisible(false);
                
                //log.setVisible(false);
                */
                Thread.sleep(300);
                log.removeAll();
                reg.setVisible(true);
                
                break;
            case -2:
                /*
                Thread.sleep(100);
                reg.setVisible(false);
                */
                Thread.sleep(300);
                reg.removeAll();
                log.setVisible(true);
                break;
        }
    }
    
 /*   
    public static void main(String[] args) {
        // TODO code application logic here

        
        
    }*/
    
}
