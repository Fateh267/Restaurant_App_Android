package com.example.tableappv1;

import android.os.Build;
import android.util.Log;

import androidx.annotation.RequiresApi;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
public class Raw_Code {

    @RequiresApi(api = Build.VERSION_CODES.N)
    public static String uniqueWords_byLetter(ArrayList<Dishes> input) {
        //so that arraylist uniqueWords contains all unique dishes

        ArrayList<Dishes> words = input;
        String sorted="";
        Map<String, Integer> map = new HashMap<>();
        List<String> outputArray = new ArrayList<>();
        List<Map<String, Integer>> trial = new ArrayList<>();
        for (Dishes current : words) {
            String s = current.dishName;
            int count = map.getOrDefault(s, 0);
            map.put(s, count + 1);
            outputArray.add(s);
            trial.add(map);
        }
        System.out.println(map);
        sorted= map.toString();
        Log.d("MAP",sorted);
        return sorted;
    }


    public static class Dishes {
        int price; //costprice of every meal
        int brewingTime; //prep time for every meal
        String dishName;

        Dishes(int price,int brewingTime,String dishName){
            //declare every meal
            this.price=price;
            this.brewingTime=brewingTime;
            this.dishName=dishName;
        }
        public int getPrice(){
            return price;
        }
        public int getBrewingTime(){
            return brewingTime;
        }
        public String toString(){
            return this.dishName;
        }

    }

    static class Stopper extends TimerTask{
        //defining task to be performed
        // ...waiting time decreases by 1 every minute until its 0
        public static int i = 0;
        public void run()
        {
            if(Menu.waitingTime>0){
                Menu.waitingTime--;

            }

            else System.out.println("no waiting time");

        }
    }
    public static void startWaitingTime(){
        //starts timer task and declares
        Menu.timer.schedule(Menu.task, 2000, 1000);
    }

    public static void  cancelWaitingTime(){
        Menu.timer.cancel();
    }


    // MAKE DISHES AS OBJECTS WITH UNIQUE PRICE AND WAITING TIME
    // BILL ADDS PRICE OF EACH OBJECT AS SOON AS THEY GET ADDED THEREFORE BILL= BILL + OBJECT.PRICE AND TIME = TIME + OBJECT.BREWTIME
    //STRING ARRAYLIST KEEPS TRAC OF ORDERS AND PRINTS WITH BILL

}
