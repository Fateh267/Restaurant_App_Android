package com.example.managerappv1;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// a single order is kept as an instance of this class

public class Order {
    String name;
    String phno;
    String orderstring;
    String datetime;
    String tableno;
    // constructor to start a new order
    Order(String name, String phno, String tableno){
        this.name = name;
        this.phno = phno;
        this.tableno = tableno;
        this.orderstring = "";
    }
    // constructor to decode a order transferred over bluetooth
    Order(String orderstring){
        String[] orderinfo = orderstring.split("=");
        this.name = orderinfo[0];
        this.phno = orderinfo[1];
        this.orderstring = orderinfo[2];
        this.datetime = orderinfo[3];
        this.tableno = orderinfo[4];
    }
    // returns a string representation of the order to transfer over bluetooth
    public String toString(){
        return this.name + "=" + this.phno + "=" + this.orderstring + "=" + this.datetime + "=" + this.tableno;
    }
    @RequiresApi(api = Build.VERSION_CODES.O)
    // saves the date and time when the order was made
    void setDateTime(){
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        datetime = myDateObj.format(myFormatObj);
    }
    void addDish(String dishno){
        this.orderstring = this.orderstring + " " + dishno;
    }
    void removeDish(String dishno){
        this.orderstring = orderstring.replaceFirst(" " + dishno,"");
    }
    String getTableno(){
        return this.tableno;
    }
    String getName(){
        return this.name;
    }
    String getPhno(){
        return this.phno;
    }
    String getOrderstring(){
        return this.orderstring;
    }
    String getDatetime(){
        return this.datetime;
    }

}
