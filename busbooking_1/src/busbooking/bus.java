/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package busbooking;


public class bus {
    private int no;
    private boolean ac;
    private int capacity;
    
    bus(int no,boolean ac,int capacity){
        this.no=no;
        this.ac=ac;
        this.capacity=capacity;
    }
    
    public int getNo(){
        return no;
    }
//    public void setBus(int no){
//        this.no=no;
//    }
     public boolean getType(){
        return ac;
    }
//    public void setType(boolean ac){
//        this.ac=ac;
//    }
     public int getCapacity(){
        return capacity;
    }
     public void displayBusInfo(){
         System.out.println("Bus No:"+no+"AC:"+ac+"Total Capacity:"+capacity);
     }
}
