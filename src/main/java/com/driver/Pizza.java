package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill = "";

    private boolean isCheeseAdded  = false;

    private boolean isToppingsAdded = false;

    private boolean isTakeawayAdded = false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            price += 300;
            bill += "Base Price Of The Pizza: 300\n";
        }
        else {
            price += 400;
            bill += "Base Price Of The Pizza: 400\n";
        }

    }

    public int getPrice(){

        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if (!isCheeseAdded){
            price += 80;
            isCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if (!isToppingsAdded){
            if (isVeg) {
                price += 70;
            } else {
                price += 120;
            }
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
        if(isCheeseAdded){
            bill += "Extra Cheese Added: 80\n";
        }
        if(isToppingsAdded){
            if(isVeg){
                bill += "Extra Toppings Added: 70\n";
            }
            else{
                bill += "Extra Toppings Added: 120\n";
            }
        }
        if(isTakeawayAdded){
            bill += "Paperbag Added: 20\n";
        }

        bill += "Total Price: " + getPrice() + "\n";
        return this.bill;
    }
}
