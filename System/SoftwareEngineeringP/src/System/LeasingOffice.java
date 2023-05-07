/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package System;

import static System.LeaseContract.frequency.monthly;
import java.text.SimpleDateFormat;
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
    
    public void OpenPaymentMenu(Tenant t){
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd");
        double total_misuse=0;
        double Total_util=0;
        System.out.println("Select which store you want to pay the bill for: ");
        
        for(int i=0;i<t.Lease_Contract.size();i++){
            System.out.println("Store "+ i +" at "+t.Lease_Contract.get(i).S.Location + " with the ID = " + t.Lease_Contract.get(i).S.id);
                    
        }
        
        Scanner myObj = new Scanner(System.in);
        int option = myObj.nextInt();
        
        
        for(int i=0; i<t.Lease_Contract.get(option).frequency;i++){
            Total_util= Total_util+ t.Lease_Contract.get(option).S.Util_con.get(i).GetTotalUtilityPrice();
        }
        
        for(int j=0; j<t.Lease_Contract.get(option).S.Maint_req.size();j++){
                    total_misuse=total_misuse+t.Lease_Contract.get(option).S.Maint_req.get(option).GetMisuseCharges();
                }    
        
        System.out.println("Bill for property with id "+t.Lease_Contract.get(option).S.id+" is:");
        System.out.println("The total unpaid misuse charge is: " + total_misuse);
        System.out.println("The Utility cost is: " + Total_util);
        
          double rent=((t.Lease_Contract.get(option).S.GetUnifiedBill())-(total_misuse+Total_util));
          System.out.println("The rent due is: " +rent);
        System.out.println("The Unified bill is: " +t.Lease_Contract.get(option).S.GetUnifiedBill());
        System.out.println("Due Date : " + sdf.format(t.Lease_Contract.get(option).getDueDate().getTime()));
        
        System.out.println("Press 1 to pay, press 0 to exit  : ");
        int Card;
        Card = myObj.nextInt();
        if(Card>1){
            System.out.println("ERROR!!!");
            System.exit(0);
        }
        if(Card ==1){
        System.out.println("Press 0 to enter new card, press 1 to use an existing card: ");
        Card = myObj.nextInt();
        EnterPayChoice(Card, t.Lease_Contract.get(option),t.Lease_Contract.get(option).S, t);
        }
        else{
            System.exit(0);
        }
        //Display Price
        //Display Payment Option
        
        //EnterPayChoice(S,opt)
    }
    
    public void EnterPayChoice(int option,LeaseContract LC, Store S, Tenant t){
        Card Temp;
        int C_opt;
        Scanner card = new Scanner(System.in);

        
        if(option == 0){ //new card
            //Ask for Details
            int CNum;
            String CDate;
            System.out.println("Enter Card number: ");
            CNum=card.nextInt();
            
            card.nextLine();
            System.out.println("Enter Expiry Date: ");
            CDate=card.next();
            Temp = EnterPaymentDetails(CNum,CDate,S);
            
            t.Card.add(Temp);
        }
        else{ //existing card
            System.out.println("Select your card based on the card number: ");
             for(int j=0; j<t.Card.size();j++){
                 System.out.println("Press "+j+" for card numb: "+t.Card.get(j).Card_Numb);
                 
             }
             C_opt=card.nextInt();
             Temp=t.Card.get(C_opt);
        }
        //Ask for amount
        double num;
        System.out.println("Enter the amount you want to pay :");
        num=card.nextDouble();
        if(num>LC.S.GetUnifiedBill()){
        System.out.println("Amount entered greater than the amount due. Extra amount transfered back to your account");
        }
        
       
        EnterAmounttoPay(Temp,num,S);
        PaymentPaid PC=new PaymentPaid(num);
        LC.Payments.add(PC);
        System.out.println("Payment Complete. Thank you!");
        
     
        
        
    }
    
    public void EnterAmounttoPay(Card C, double num, Store S){
        S.RequestPay(C, num);
    }
    
    public Card EnterPaymentDetails(int CN,String Dat, Store S){
        Card C = new Card(CN, Dat);
        return C;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        //Sample Data
        LeasingOffice Controller = new LeasingOffice();
        Store store1 = new Store(1,"New York", "500 sqft", 1500.0, "Retail", "Clothing", 'A');;
        Controller.Stores.add(store1);

        Store store2 = new Store(2,"Los Angeles", "700 sqft", 2000.0, "Retail", "Electronics", 'B');
        Controller.Stores.add(store2);

        Store store3 = new Store(3,"Chicago", "900 sqft", 2500.0, "Retail", "Sporting Goods", 'C');
        Controller.Stores.add(store3);

        Store store4 = new Store(4,"Houston", "1200 sqft", 3000.0, "Restaurant", "Mexican", 'A');
        Controller.Stores.add(store4);

        Store store5 = new Store(5,"Miami", "1000 sqft", 2700.0, "Restaurant", "Seafood", 'B');
        Controller.Stores.add(store5);

        Store store6 = new Store(6,"San Francisco", "800 sqft", 2200.0, "Retail", "Books", 'C');
        Controller.Stores.add(store6);

        Store store7 = new Store(7,"Boston", "600 sqft", 1800.0, "Retail", "Jewelry", 'A');
        Controller.Stores.add(store7);

        Store store8 = new Store(8,"Seattle", "1100 sqft", 2800.0, "Restaurant", "Italian", 'B');
        Controller.Stores.add(store8);

        Store store9 = new Store(9,"Washington D.C.", "1500 sqft", 3500.0, "Retail", "Home Decor", 'C');
        Controller.Stores.add(store9);

        Store store10 = new Store(10,"Las Vegas", "2000 sqft", 4000.0, "Retail", "Cosmetics", 'A');
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
        
        // sdf = new SimpleDateFormat("yyyy MMM dd");	
    //Calendar S_Date = new GregorianCalendar(2013,10,28);
    //Calendar N_Date = new GregorianCalendar(2014,10,28);
      //     Store store11 = new Store("Dubai", "3000 sqft", 8000.0, "Retail", "Cosmetics", 'A');
        
        //Tenant t1=new Tenant("Zinnati", "555-4325", "Zinnati@aus.edu", "001");
        //LeaseContract LC1 = new LeaseContract(S_Date, N_Date, t1,  store11, 7000.0, 100.0, monthly);
        //t1.Lease_Contract.add(LC1);
        //Menu
        (new MainMenu(Controller)).setVisible(true);
    }
    
}
