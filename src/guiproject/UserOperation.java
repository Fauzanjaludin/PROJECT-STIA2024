/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiproject;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author khairinkasmadi
 */
public class UserOperation {
    
    public void addRecord(Data usr) throws IOException {
        //usr = user
        try{
        File fileName = new File("user.txt");
        FileWriter fw = new FileWriter(fileName, true);
        PrintWriter pw = new PrintWriter(fw);
        
        pw.println(usr.getDate());
        pw.println(usr.getAccnum());
        pw.println(usr.getName());
        pw.println(usr.getAddress());
        pw.println(usr.getArrears());
        pw.println(usr.getPrevious());
        pw.println(usr.getCurrent());
        pw.println(usr.getTotalunit());
        pw.println(usr.getCurrentcharge());
        pw.println(usr.getTotalbill());
        
        pw.close();
        pw.flush();
        fw.close(); 
        }catch(IOException e){
            
        }
    }
    
    
    
}
