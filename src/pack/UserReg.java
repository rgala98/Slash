/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack;

import java.io.*;
import javax.swing.JOptionPane;

/**
 *
 * @author rgala98
 */
public class UserReg {
    
    public void registered(String u,String p){
        String line = null,line2 = null;
        
        try{
            FileReader freader = new FileReader("Users.txt");
            try(BufferedReader reader = new BufferedReader(freader))
            {
                while((line = reader.readLine())!= null){
                String [] parts = line.split("*");
                if(parts[0].equals("User"))
                    update_reg(u,p);
            }
            }
            
            
        }
        catch(Exception e){}
        
        /*try {
	        FileWriter writer = new FileWriter("Users.txt", true);
	        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        	bufferedWriter.write(u);
        	bufferedWriter.newLine();
        	bufferedWriter.write(p);
        	bufferedWriter.newLine();
        	bufferedWriter.newLine();
            	bufferedWriter.close();
            	//this.dispose();
                Login.main(null);
            
	        } catch (IOException e1) {
	        }
*/
    }
    
    public void update_reg(String u1,String p1){
        String prefix = "User";
        String oldfile = "Users.txt";
        String newfile = "tmp_Users.txt";
        String newline = prefix+"*"+u1+"*"+p1;
        BufferedReader br=null;
        BufferedWriter bw= null;
        
        
        try{
            br = new BufferedReader(new FileReader(new File(oldfile)));
            bw =  new BufferedWriter(new FileWriter(new File(newfile)));
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("*");
                if (parts[0].equals(prefix)){
                    line = line.replace(line,newline);
                    System.out.println(line);
                    System.out.println(newline);
                    JOptionPane.showMessageDialog(null,"Successfully Updated.","Info",JOptionPane.INFORMATION_MESSAGE);
                }
                bw.write(line+"\n");
            }
            
        }catch(Exception e){return;}
        finally{
            try {
                if(br != null)
                    br.close();
            } catch (IOException ioe) {}
            try {
                if(bw != null)
                    bw.close();
            } catch (IOException ioe) {}
        }
        
      File oldFile = new File(oldfile);
      oldFile.delete();
      File newFile = new File(newfile);
      System.out.println("hi");
      newFile.renameTo(oldFile);
        
    }

}
    
    
    
