/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package busbooking;
import java.text.ParseException;
import java.util.*;
import java.text.SimpleDateFormat; 

public class booking {
    Scanner sc=new Scanner(System.in);
    String passengerName;
    int num;
    Date date;
    booking() throws ParseException{
        
        System.out.println("---fill details");
        System.out.println("Enter your name:");
        this.passengerName=sc.next();
        System.out.println("Enter bus no:");
        this.num=sc.nextInt();
        System.out.println("Enter date(dd-mm-yyyy):");
        String dates=sc.next();
        this.date=new SimpleDateFormat("dd-MM-yyyy").parse(dates); 
        
    }
    public boolean isAvailable(ArrayList<bus>buses,ArrayList<booking>books){
        int capacity=0;
        for(bus b:buses){
            if(b.getNo()==num){
                capacity=b.getCapacity();
            }
        }
        int booked=0;
        System.out.println(capacity);
        for(booking b:books){
            if(b.num==num && b.date.equals(date)){
                booked++;
            }
        }
        return booked<capacity?true:false;
    }
    
}
