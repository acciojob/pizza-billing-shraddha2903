package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int extraCheesePrice;
    private int extraToppingVeg;
    private int extraToppingNonVeg;
    private int takeWayPrice;
    private int basePrice;
    private boolean isPaperBagAdded;
    private boolean isToppingAdded;
    private boolean isExtraCheeseAdded;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.extraCheesePrice=80;
        this.extraToppingVeg=70;
        this.extraToppingNonVeg=120;
        this.takeWayPrice=20;
        this.basePrice = (isVeg ? 300: 400);
        this.price=0;
        this.bill="";
        // your code goes here
    }

    public int getPrice(){

//        this.bill="Base Price Of The Pizza: "+this.price+"\n";
        this.price = this.basePrice;
        if(isExtraCheeseAdded)
        {
            this.price+=extraCheesePrice;
        }
        if(isToppingAdded)
        {
            this.price+=(isVeg ? extraToppingVeg : extraToppingNonVeg);
        }
        if(isPaperBagAdded)
        {
           this.price+=takeWayPrice;
        }
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isExtraCheeseAdded)
        {
            isExtraCheeseAdded=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isToppingAdded){
            isToppingAdded=true;

        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isPaperBagAdded)
        {
               isPaperBagAdded=true;

        }

    }

    public String getBill()
    {
        // your code goes here
        String bill="";
        bill+="Base Price Of The Pizza: "+this.basePrice+"\n";
        if(isExtraCheeseAdded)
        {
            bill+="Extra Cheese Added: "+extraCheesePrice+"\n";
        }
        if(isToppingAdded)
        {
            bill+="Extra Toppings Added: "+ (isVeg ? extraToppingVeg : extraToppingNonVeg)+"\n";
        }
        if(isPaperBagAdded)
        {
            bill+="Paperbag Added: "+takeWayPrice+"\n";
        }

        bill+="Total Price: "+this.getPrice()+"\n";
        this.bill=bill;
        return this.bill;
    }
}
