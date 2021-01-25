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

    public Data(int date, int accnum, String name, String address, int arrears, int previous, int current, int totalunit, int currentcharge, int totalbill) {
        this.date = date;     //constructor method
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

    Data(int date, int accnum, String name, String address, double arrears, double previous, double current, double totalunit, double currentcharge, double totalbill) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    public int getArrears() {
        return arrears;
    }

    public int getPrevious() {
        return previous;
    }

    public int getCurrent() {
        return current;
    }

    public int getTotalunit() {
        return totalunit;
    }

    public int getCurrentcharge() {
        return currentcharge;
    }

    public int getTotalbill() {
        return totalbill;
    }
    
    
    
    
              
}
