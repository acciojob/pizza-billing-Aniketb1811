package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill = "";
    private final int basePrice;

    private final int cheesePrice = 80;
    private final int toppingsPrice;
    private final int bagPrice = 20;

    private boolean isCheeseAdded  = false;

    private boolean isToppingsAdded = false;

    private boolean isTakeawayAdded = false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            basePrice = 300;
            toppingsPrice = 70;
            price = basePrice;
        }
        else {
            basePrice = 400;
            toppingsPrice = 120;
            price = basePrice;
        }

    }

    public int getPrice(){

        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if (!isCheeseAdded){
            price += cheesePrice;
            isCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if (!isToppingsAdded){
            price += toppingsPrice;
            isToppingsAdded = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeawayAdded){
            price += 20;
            isTakeawayAdded = true;
        }
    }

    public String getBill(){
        // your code goes here
        bill += "Base Price Of The Pizza: " + basePrice + "\n";

        if(isCheeseAdded){
            bill += "Extra Cheese Added: " + cheesePrice + "\n";
        }
        if(isToppingsAdded){
            bill += "Extra Toppings Added: " + toppingsPrice + "\n";
        }
        if(isTakeawayAdded){
            bill += "Paperbag Added: " + basePrice + "\n";
        }

        bill += "Total Price: " + getPrice();
        return this.bill;
    }
}
