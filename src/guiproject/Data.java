/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiproject;

/**
 *
 * @author khairinkasmadi
 */
public class Data {
    /*
    private int date;     //2type of data int & string
    private int accnum;
    private String name;
    private String address;
    private int arrears;
    private int previous;   //
    private int current;    //
    private int totalunit;
    private int currentcharge;
    private int totalbill;
*/
    
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

    Data() {
        this.date = 0;
        this.accnum = 0;
        this.name = null;
        this.address = null;
        this.arrears = 0;
        this.previous = 0;
        this.current = 0;
        this.totalunit = 0;
        this.currentcharge = 0;
        this.totalbill = 0;
    }
    
    Data(int date, int accnum, String name, String address, double arrears, double previous, double current, double totalunit, double currentcharge, double totalbill) {
        this.date = date;
        this.accnum = accnum;
        this.name = name;
        this.address = address;
        this.arrears = arrears;
        this.previous = previous;
        this.current = current;
        this.totalunit = totalunit;
        this.currentcharge = currentcharge;
        this.totalbill = totalbill;
    }

    public int getDate() {
        return date;
    }

    public int getAccnum() {
        return accnum;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public double getArrears() {
        return arrears;
    }

    public double getPrevious() {
        return previous;
    }

    public double getCurrent() {
        return current;
    }

    public double getTotalunit() {
        return totalunit;
    }

    public double getCurrentcharge() {
        return currentcharge;
    }

    public double getTotalbill() {
        return totalbill;
    }

    public void setDATA(int aa,int a) {
        if(a==1){
        this.accnum = aa;
        }else if(a==0){
        this.date = aa;
        }
    }

    public void setDATA(String aa,int a) {
        switch (a) {
            case 2:
                this.name = aa;
                break;
            case 3:
                this.address = aa;
                break;
            default:
                break;
        }
    }
    
    public void setDATA(double aa,int a) {
        switch(a){
            case 4:
                this.arrears=aa;
                break;
            case 5:
                this.previous=aa;
                break;
            case 6:
                this.current=aa;
                break;
            case 7:
                this.totalunit=aa;
                break;
            case 8:
                this.currentcharge=aa;
                break;
            case 9:
                this.totalbill=aa;
                break;
        }
        }
    }

   
    
              

