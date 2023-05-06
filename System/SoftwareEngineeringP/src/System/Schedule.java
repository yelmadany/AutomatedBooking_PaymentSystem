/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package System;
import java.util.*;
import java.util.Random;
import java.time.DayOfWeek;
/**
 *
 * @author Yo200
 */
public class Schedule {
    //@Usmani
    
    ArrayList<ArrayList<Boolean>> schedule_timings;
    LeasingAgent Agent;
//    private ArrayList<ArrayList<Boolean>> isBooked;
//    String[][] schedule_timings=new String[7][11];
//    boolean[][] isBooked = new boolean[7][11];
//     String[] days={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
//   String[] timings={"8:00am to 9:00am" ,"9:00am to 10:00am", "10:00am to 11:00am", "11:00am to 12:00pm", "12:00pm to 1:00pm", "1:00pm to 2:00pm", "2:00pm to 3:00pm", "3:00pm to 4:00pm", "4:00pm to 5:00pm ", "5:00pm to 6:00pm", "6:00pm to 7:00pm"};
    public Schedule(){
        
        schedule_timings = new ArrayList<>(7);

        Random r = new Random();
        r.setSeed(999321);
        // DayOfWeek day = DayOfWeek.of(r.nextInt(7));
        
        // initialize schedule timings for each day for each agent
        
        for (int i = 0; i < 7; ++i) {
           ArrayList<Boolean> arrayBool = new ArrayList<>(10);

           for (int j = 0; j < 10; ++i){

                arrayBool.add(r.nextBoolean());
            }

            schedule_timings.add(arrayBool);

        }      
    } 
    
    public  ArrayList<ArrayList<Boolean>> get_Sched(){
        return schedule_timings;
    }
    
    public void AdjustSchedule(Appointment app){

         for(int i = 0; i < 7; ++i)  {
             // enter if correct Day of Appointment
             if (app.Day.equals(DayOfWeek.of(i).name())){
                 for (int j = 0; j < 10; ++j) {
                     // enter if correct Time of Appointment
                     if (app.time.equals("YOLO")) {
                         // adjust if there is no booking made yet
                         // have to fix
                         if (schedule_timings.get(i).get(j) == false)
                            schedule_timings.get(i).set(j, true);
                         break;
                         // otherwise, do not adjust booking
                     }
                 }
             }
         }
     } 

    //implement and connect schedule
    
}


//public class Schedule {
//    //@Usmani
//    String[][] schedule_timings=new String[7][11];
//    boolean[][] isBooked = new boolean[7][11];
//     String[] days={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
//   String[] timings={"8:00am to 9:00am" ,"9:00am to 10:00am", "10:00am to 11:00am", "11:00am to 12:00pm", "12:00pm to 1:00pm", "1:00pm to 2:00pm", "2:00pm to 3:00pm", "3:00pm to 4:00pm", "4:00pm to 5:00pm ", "6:00pm to 7:00pm"};
//    public Schedule(){
//    //ArrayList<String> schedule_timings = new ArrayList();
//   
//  
//     for(int i = 0; i < 7; i++)  {
//         schedule_timings[i][0]=days[i];
//         for(int j = 0; j < 10; j++)  {
//         schedule_timings[i][j+1]=timings[j];
//     }
//     }
//     
//      for(int i = 0; i < 7; i++)  {
//         for(int j = 0; j < 10; j++)  {
//         isBooked[i][j+1]=false;
//     }
//     }
//   
//    }
//
//   
//    public String[][] Get_Sched(){
//        return schedule_timings;
//    }
//    
//    public void AdjustSchedule(Appointment app){
//        
//        int x=-1;
//        int y=-1;
//         for(int i = 0; i < 7; i++)  {
//             if(app.Day.equals( days[i])){
//                 x=i;
//                    for(int j = 0; j < 10; j++)  {
//                        if(app.time.equals( timings[j])){
//                            y=j+1;
//                        }
//                        }
//                    }
//           }
//         
//         if(x!=-1){
//         isBooked[x][y]=true;
//     }      
//        
//    } 
//    
//
//
//    //implement and connect schedule
//    
//}
