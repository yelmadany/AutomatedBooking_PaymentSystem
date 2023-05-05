/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package System;
import java.util.*;
/**
 *
 * @author Yo200
 */
public class Schedule {
    //@Usmani
    String[][] schedule_timings=new String[14][10];
    boolean[][] isBooked = new boolean[14][10];
     String[] days={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
   String[] timings={"8:00am to 9:00am" ,"9:00am to 10:00am", "10:00am to 11:00am", "11:00am to 12:00pm", "12:00pm to 1:00pm", "1:00pm to 2:00pm", "2:00pm to 3:00pm", "3:00pm to 4:00pm", "4:00pm to 5:00pm ", "6:00pm to 7:00pm"};
    public Schedule(){
    //ArrayList<String> schedule_timings = new ArrayList();
   
  
     for(int i = 0; i < 14; i++)  {
         schedule_timings[i][0]=days[i];
         for(int j = 0; j < 11; j++)  {
         schedule_timings[i][j+1]=timings[j];
     }
     }
     
      for(int i = 0; i < 14; i++)  {
         for(int j = 0; j < 11; j++)  {
         isBooked[i][j]=false;
     }
     }
   
    }

   
    public String[][] Get_Sched(){
        return schedule_timings;
    }
    
    public void AdjustSchedule(Appointment app){
        
        int x=-1;
        int y=-1;
         for(int i = 0; i < 14; i++)  {
             if(app.Day.equals( days[i])){
                 x=i;
                    for(int j = 0; j < 11; j++)  {
                        if(app.time.equals( timings[j])){
                            y=j;
                        }
                        }
                    }
           }
         
         if(x!=-1){
         isBooked[x][y]=true;
     }      
        
    } 
    


    //implement and connect schedule
    
}
