package pack;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Nisarg
 */
public class SplashScreen {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    @SuppressWarnings("SleepWhileInLoop")
    public static void main(String[] args) throws InterruptedException{
        // TODO code application logic here
        Splash splash = new Splash();
        LoginAndRegister lar = new LoginAndRegister();
        splash.setVisible(true);

            for(int i = 0; i < 100; i++) {
                Thread.sleep(100);
                splash.loadnum.setText(Integer.toString(i)+"%");
                splash.loadbar.setValue(i);
                if(i==99){
                    Thread.sleep(1000);
                    splash.setVisible(false);
                    splash.dispose();
                    lar.click1(0);
                    //System.exit(0);
                }   
            }
 
    }
    
}
