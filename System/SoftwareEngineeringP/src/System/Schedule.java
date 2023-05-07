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
    ArrayList<String> timings = new ArrayList(10);
    //   String[] timings={"8:00am to 9:00am" ,"9:00am to 10:00am", "10:00am to 11:00am", "11:00am to 12:00pm", "12:00pm to 1:00pm", "1:00pm to 2:00pm", "2:00pm to 3:00pm", "3:00pm to 4:00pm", "4:00pm to 5:00pm ", "5:00pm to 6:00pm", "6:00pm to 7:00pm"};

    LeasingAgent Agent;
    
//    private ArrayList<ArrayList<Boolean>> isBooked;
//    String[][] schedule_timings=new String[7][11];
//    boolean[][] isBooked = new boolean[7][11];
//     String[] days={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
    public Schedule(){
        
        schedule_timings = new ArrayList<>(7);

        Random r = new Random();
        r.setSeed(999321);
        
        // initialize schedule timings for each day for each agent
        
        for (int i = 1; i <= 7; ++i) {
           ArrayList<Boolean> arrayBool = new ArrayList<>(10);
           
           for (int j = 0; j < 10; ++j){
               arrayBool.add(r.nextBoolean());
            }
//            System.out.println(arrayBool);
           
            schedule_timings.add(arrayBool);
        }
        timings.add("0800 - 0900");
        timings.add("0900 - 1000");
        timings.add("1000 - 1100");
        timings.add("1100 - 1200");
        timings.add("1200 - 1300");
        timings.add("1300 - 1400");
        timings.add("1400 - 1500");
        timings.add("1500 - 1600");
        timings.add("1600 - 1700");
        timings.add("1700 - 1800");  
    } 
    
    public  ArrayList<ArrayList<Boolean>> get_Sched(){
        return schedule_timings;
    }
    
    public void AdjustSchedule(Appointment app){
        int correctDayOfWeek = 0;
        
        for (int i = 1; i <= 7; ++i) {
            if (DayOfWeek.of(i).name().equals(app.day))
                correctDayOfWeek = i - 1;
        }
        
        for (String time : timings) {
            if (app.time.equals(time)) {
                schedule_timings.get(correctDayOfWeek).set(timings.indexOf(time), false);
            }
        }
        
   } 
    //implement and connect schedule
    
}
