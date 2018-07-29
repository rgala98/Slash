/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack;

import java.io.*;

/**
 *
 * @author Nisarg
 */

public class Cred {
    public void reader() throws Exception {
	
        FileReader fr=new FileReader("C:\\Users\\Nisarg\\Documents\\NetBeansProjects\\Introduction\\Users.txt");
        BufferedReader br=new BufferedReader(fr);    
        
        int i;
        while((i=br.read())!=-1) {
            
            System.out.print((char)i);
        }
        br.close();
        fr.close();
       
	}
    public static void main(String[] args) throws Exception{
        Cred r = new Cred();
        r.reader();
    }
}
