/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package busbooking;
import java.util.*;

/**
 *
 * @author VIJAY KOUSHIK
 */
public class Busbooking {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception {
        ArrayList<booking>books=new ArrayList<>();
        ArrayList<bus>buses=new ArrayList<>();
        buses.add(new bus(1,true,5));
        buses.add(new bus(2,true,3));
        buses.add(new bus(3,false,2));
 
     int user=1;
     Scanner sc=new Scanner(System.in);
     for(bus b:buses){
         b.displayBusInfo();
     }
     while(user==1){
         System.out.println("-----------------------------");
         System.out.println("Enter 1 to Book and 2 to exit");
         user=sc.nextInt();
         if(user==1){
             System.out.println("Grab your tickets soon.....");
             booking book=new booking();
             if(book.isAvailable(buses, books)){
                   books.add(book);
                 System.out.println("Success");
                 
             }
             else{
                 System.out.println("failure");
             }
             
        }
         
     }
    }
}

    

