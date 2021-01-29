/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiproject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author khairinkasmadi
 */
public class UserOperation {
    
    ArrayList<Data> user = new ArrayList<Data>();
    
    String user1;
    private static Scanner x;
    
    private int date;        
    private int accnum;
    private String name;
    private String address;
    private double arrears;
    private double previous;
    private double current;
    private double totalunit;
    private double currentcharge;
    private double totalbill;

    
    public void addRecord(Data usr) throws IOException {
        //usr = user
        try{
        File fileName = new File("user.txt");
        FileWriter fw = new FileWriter(fileName, true);
        PrintWriter pw = new PrintWriter(fw);
        
        
        user1=usr.getDate()+","+String.valueOf(usr.getAccnum())+","+usr.getName()+","+usr.getAddress()+","+String.valueOf(usr.getArrears())+","
                +String.valueOf(usr.getPrevious())+","+String.valueOf(usr.getCurrent())+","+String.valueOf(usr.getTotalunit())+","+String.valueOf(usr.getCurrentcharge())
                +","+String.valueOf(usr.getTotalbill());
        
        /*
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
        */
        
        pw.println(user1);
                
        pw.close();
        pw.flush();
        fw.close(); 
        }catch(IOException e){
            
        }
    }
   
    public ArrayList<Data> getData() throws Exception{
        //Data oa=new Data();
        int i;
        String a;
	x=new Scanner(new File("user.txt"));
	x.useDelimiter("[,\n]");
        
	while(x.hasNext()) {
        a=x.next();
        date=Integer.parseInt(a); 
        a=x.next();
        accnum=Integer.parseInt(a);
        a=x.next();
        name=a;
        a=x.next();
        address=a;
        a=x.next();
        arrears=Double.parseDouble(a);
        a=x.next();
        previous=Double.parseDouble(a);
        a=x.next();
        current=Double.parseDouble(a);
        a=x.next();
        totalunit=Double.parseDouble(a);
        a=x.next();
        currentcharge=Double.parseDouble(a);
        a=x.next();
        totalbill=Double.parseDouble(a);
        
            Data oa=new Data(date,accnum,name,address,arrears,previous,current,totalunit,currentcharge, totalbill);
            
            user.add(oa);
            
        } 
        return user;
    }
        
    /*
    public String get1data(ArrayList<String> a,int b){
        String in;
        in=a.get(b);
    return in;
    }*/
    
    
    
    
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
    
      public Data findRecord(int id) throws FileNotFoundException, IOException, Exception
    {
        Data us = null;
        ArrayList <Data> UserList = getData();
        
        for (int i=0; i < UserList.size(); i++)
        {
            if(id == UserList.get(i).getAccnum())
            {
                us = UserList.get(i);
                System.out.println("Record Found");
            }
                
        }
        return us;
    } //findRecord
    
}
