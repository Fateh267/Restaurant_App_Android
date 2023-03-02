package com.example.tableappv1;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

// holds the dishes in the menu

public class Menu {
    static double bill = 0; //total bill
    static int waitingTime = 0; //total prep time which counts down wvery minute
    static boolean exit=false; // to exit the hotel
    static boolean payment=false; //to check if payment is done before leaving
    static Timer timer = new Timer();  //to do a countdiwn for watinig time for the order
    static TimerTask task = new Raw_Code.Stopper();
    static ArrayList<Raw_Code.Dishes> tableOrders= new ArrayList<>();

    static Raw_Code.Dishes fries= new Raw_Code.Dishes(50,20*60,"Fries");
    static Raw_Code.Dishes nachos= new Raw_Code.Dishes(20,25*60,"Nachos");
    static Raw_Code.Dishes onionRings= new Raw_Code.Dishes(50,30*60,"Onion+Rings"); // using + inplace of space, space is used to split string in managerapp
    static Raw_Code.Dishes ChickenWings= new Raw_Code.Dishes(20,30*60,"Chicken+wings");
    static Raw_Code.Dishes mojito = new Raw_Code.Dishes(50,10*60,"Mojito");
    static Raw_Code.Dishes coke = new Raw_Code.Dishes(50,2*60,"coke");
    static Raw_Code.Dishes gingerale = new Raw_Code.Dishes(20,2*60,"ginger+ale");
    static Raw_Code.Dishes ColdCoffee = new Raw_Code.Dishes(30,10*60,"Cold+Coffee");
    static Raw_Code.Dishes bakedVegetables = new Raw_Code.Dishes(70,25*60,"Baked+Vegetables");
    static Raw_Code.Dishes cheeseburger = new Raw_Code.Dishes(100,15*60,"Cheese+Burger");
    static Raw_Code.Dishes VegSandwich = new Raw_Code.Dishes(20,20*60,"Veg+Sandwich");
    static Raw_Code.Dishes chickenPasta = new Raw_Code.Dishes(150,30*60,"Chicken+Pasta");
    static Raw_Code.Dishes chickenLasagne = new Raw_Code.Dishes(100,45*60,"Chicken+Lasagne");
    static Raw_Code.Dishes hamburger = new Raw_Code.Dishes(200,15*60,"Ham+Burger");
    static Raw_Code.Dishes VegPasta = new Raw_Code.Dishes(150,20*60,"Veg+Pasta");
    static Raw_Code.Dishes chickenSandwich = new Raw_Code.Dishes(100,15*60,"Chicken+Sandwich");
    static Raw_Code.Dishes cheesecake = new Raw_Code.Dishes(150,15*60,"Cheese+Cake");
    static Raw_Code.Dishes icecream = new Raw_Code.Dishes(100,10*60,"Ice+Cream");
    static Raw_Code.Dishes chocolatebrownie = new Raw_Code.Dishes(150,25*60,"Chocolate+Brownie");
    static Raw_Code.Dishes custard = new Raw_Code.Dishes(100,25*60,"Custard");
}
