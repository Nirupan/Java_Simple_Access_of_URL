/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleaccesstourl;

import java.io.*;



/**
 *
 * @author dell
 */
public class SimpleAccesstoURL {
    
   
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
        // TODO code application logic here
        
        try
{ 
Process p=Runtime.getRuntime().exec("cmd /c start http://www.google.com"); 


 

} 
catch(IOException e1) {System.out.println(e1);} 
}
    }

