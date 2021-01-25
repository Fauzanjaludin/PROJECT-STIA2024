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
    
    public double calctariff(double x){
       double sum=0;
       double[] a=new double[5];
       a[0]=200*0.218;
       a[1]=100*0.334;
       a[2]=300*0.516;
       a[3]=300*0.546;
       
      if(x<=200){
      sum=x*0.218;
      }else if(x>200&&x<=300){
      sum=a[0]+((x-200)*0.334);
      }else if(x>300&&x<=600){
      sum=a[0]+a[1]+((x-300)*0.516);
      }
      else if(x>600&&x<=900){
      sum=a[0]+a[1]+a[2]+((x-600)*0.546);
      } 
      else if(x>=901){
      sum=a[0]+a[1]+a[2]+a[3]+((x-900)*0.571);
      }
       
        return sum;
    }
    
}
