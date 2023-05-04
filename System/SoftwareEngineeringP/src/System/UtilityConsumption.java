/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package System;

import java.util.Date;

/**
 *
 * @author Yo200
 */
public class UtilityConsumption {
    //@usmani
    
    //add attributes, connect with Store
    private double Water_Consumption;
    private double Electricity_Consumption;
    private double Waste_Consumption;
    private double Total_Utility_Price;
    private Date Start_Date;
    private Date End_Date;
    private Date Due_Date;
    private Store store;
    
    public UtilityConsumption (double water_c, double e_c, double waste_c, Date start, Date end, Date due, Store s ) {
        this.Water_Consumption = water_c;
        this.Electricity_Consumption = e_c;
        this.Waste_Consumption = waste_c;
        this.Start_Date = start;
        this.End_Date = end;
        this.Due_Date = due;
        this.store = s;
        this.Total_Utility_Price = Electricity_Consumption + Waste_Consumption + Water_Consumption;
    }
    //implement functions
    public double GetTotalUtilityPrice(Date d) {
        return this.Total_Utility_Price;
    }
}
