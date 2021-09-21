package com.company;

import static com.company.DrinkTypes.*;

public class VendingMachine extends Drink {

    private int totalMilk, totalSugar;
    DrinkTypes drinkType;

    /*
     * This Constructor will initialize the class variables.
     * It will also set the drink type.
     * */
    public VendingMachine(DrinkTypes drinkType) {
        this.totalMilk = 0;
        this.totalSugar = 0;
        this.drinkType = drinkType;
    }
    /*
     * This method will get the total milk units in the coffee and will determine if more could be added.
     * If more could be added then it will add it and update the total Condiments in the coffee.
     * */
    @Override
    public void addMilk() {
        super.addMilk();
        this.totalMilk = getTotalMilkUnit();
        if (totalMilk < 3) {
            this.totalMilk++;
            setTotalMilkUnit(this.totalMilk);
            setTotalNumberOfCondiments(1);
        }
    }
    /*
     * This method will get the total sugar units in the coffee and will determine if more could be added.
     * If more could be added then it will add it and update the total Condiments in the coffee.
     * */
    @Override
    public void addSugar() {
        super.addSugar();
        this.totalSugar = getTotalSugarUnit();
        if (totalSugar < 3) {
            this.totalSugar++;
            setTotalSugarUnit(this.totalSugar);
            setTotalNumberOfCondiments(1);
        }
    }
    public void brew(){

        if(this.drinkType == AMERICANO)
        {
            System.out.println("Brewing Process of Americano");
        }
        else if(this.drinkType == ESPRESSO){
            System.out.println("Brewing Process of Espresso");
        }
        else if(this.drinkType == LATTE_MACCHIATO){
            System.out.println("Brewing Process of Latte Macchiato");
        }
        else if(this.drinkType == GREEN_TEA){
            System.out.println("Brewing Process of Green tea");
        }
        else if(this.drinkType == YELLOW_TEA){
            System.out.println("Brewing Process of Yellow Tea");
        }
        else{
            System.out.println("Brewing Process of Black Tea");
        }

    }

}
