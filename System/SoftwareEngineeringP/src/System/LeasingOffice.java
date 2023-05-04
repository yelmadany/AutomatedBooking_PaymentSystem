/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package System;

import java.util.*;

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
    
    public void MakeAppointment(){
        ArrayList<Schedule> Temp = new ArrayList();
        for(int i = 0; i< Agents.size();i++){
            //Temp.add(Agents.get(i).GetAgentSchedule());
        }
        
        //Display Schedules
    }
    
    public void SelectAppDetails(LeasingAgent Ag, String Dat, String Time){
       // Appointment App = new Appointment(Ag, Dat, Time, Cart);

        //Ag.AddAppointment(App,Dat,Time);
        //Ag.SendNotif();
        //Display Confirmation Message
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
        
        //Menu
        (new MainMenu(Controller.Stores)).setVisible(true);
    }
    
}
