/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package System;

import java.util.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Yo200
 */
public class LeasingOffice {
    ArrayList<LeasingAgent> Agents = new ArrayList();
    ArrayList<Store> Stores;
    ArrayList<Appointment> Appointments;
    
    public LeasingOffice(){
     Stores = new ArrayList();
     Agents = new ArrayList();
    }
    
    public void MakeAppointment(ArrayList<Store> Cart, MainMenu M){ 
        //Display Schedules
            
            AgentSelect Agt = new AgentSelect(M,this, Cart);
            Agt.setVisible(true);
    }
    
    public void SelectAppDetails(LeasingAgent Ag, String Date, String Time, String Day, ArrayList<Store> Cart){
        
       Appointment App = new Appointment(Ag, Date, Time, Day, Cart.get(0).Location, Cart);
       
       Ag.AddAppointment(App);
       Ag.SendNotif();

        //Display Confirmation Message
        String strBuilder = "";
        
        for (Store store: Cart) {
            strBuilder += "\nThe location is at " + store.Location + " with space " + store.Space + " with Rank " + store.Rank + " with a purpose of " + store.Purpose + " at a price of " + store.Rental_rate + ".\n";
        }
        
        int input = JOptionPane.showConfirmDialog(null, "Email has been sent to confirm the booking at " + App.meetup_Location + " at " + App.time + " on " + App.day + " with " + App.agent.name +  " as your agent for\n" + strBuilder + "\nThank you!", "BOOKING CONFIRMED", JOptionPane.DEFAULT_OPTION);
                 
        
    }
    
    public void OpenPaymentMenu(Store S){
        S.GetUnifiedBill();
        
        //Display Price
        //Display Payment Option
        
        //EnterPayChoice(S,opt)
    }
    
    public void EnterPayChoice(int option, Store S){
        Card Temp;
        if(option == 0){ //new card
            //Ask for Details
            int CNum;
            String CDate;
            //Temp = EnterPaymentDetails(CNum,CDate,S);
        }
        else{ //existing card
            
        }
        //Ask for amount
        int num;
        //EnterAmounttoPay(C,num,S);
        
    }
    
    public void EnterAmounttoPay(Card C, double num, Store S){
        //S.RequestPay(C, num);
    }
    
    public void EnterPaymentDetails(int CN,String Dat, Store S){
        //Card C = new Card(CN, Dat);
        //return C
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        //Sample Data
        LeasingOffice Controller = new LeasingOffice();
        Store store1 = new Store("New York", "500 sqft", 1500.0, "Retail", "Clothing", 'A');;
        Controller.Stores.add(store1);

        Store store2 = new Store("Los Angeles", "700 sqft", 2000.0, "Retail", "Electronics", 'B');
        Controller.Stores.add(store2);

        Store store3 = new Store("Chicago", "900 sqft", 2500.0, "Retail", "Sporting Goods", 'C');
        Controller.Stores.add(store3);

        Store store4 = new Store("Houston", "1200 sqft", 3000.0, "Restaurant", "Mexican", 'A');
        Controller.Stores.add(store4);

        Store store5 = new Store("Miami", "1000 sqft", 2700.0, "Restaurant", "Seafood", 'B');
        Controller.Stores.add(store5);

        Store store6 = new Store("San Francisco", "800 sqft", 2200.0, "Retail", "Books", 'C');
        Controller.Stores.add(store6);

        Store store7 = new Store("Boston", "600 sqft", 1800.0, "Retail", "Jewelry", 'A');
        Controller.Stores.add(store7);

        Store store8 = new Store("Seattle", "1100 sqft", 2800.0, "Restaurant", "Italian", 'B');
        Controller.Stores.add(store8);

        Store store9 = new Store("Washington D.C.", "1500 sqft", 3500.0, "Retail", "Home Decor", 'C');
        Controller.Stores.add(store9);

        Store store10 = new Store("Las Vegas", "2000 sqft", 4000.0, "Retail", "Cosmetics", 'A');
        Controller.Stores.add(store10);
        
        LeasingAgent s1 = new LeasingAgent("Youssef Elmadany", "555-1234", "jsmith@email.com", 50000, "Residential", "001");
        Controller.Agents.add(s1);

        LeasingAgent s2 = new LeasingAgent("Abdullah Usmani", "555-5678", "jdoe@email.com", 60000, "Commercial", "002");
        Controller.Agents.add(s2);

        LeasingAgent s3 = new LeasingAgent("Ariel Panopio", "555-9876", "bjohnson@email.com", 55000, "Residential", "003");
        Controller.Agents.add(s3);

        LeasingAgent s4 = new LeasingAgent("Abdullah Zahid", "555-4321", "edavis@email.com", 65000, "Commercial", "004");
        Controller.Agents.add(s4);

        LeasingAgent s5 = new LeasingAgent("Muhammad Junaid", "555-2468", "twilson@email.com", 60000, "Residential", "005");
        Controller.Agents.add(s5); 
        //Menu
        (new MainMenu(Controller)).setVisible(true);
    }
    
}
