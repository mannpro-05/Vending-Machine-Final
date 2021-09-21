package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        VendingMachine myDrink = new VendingMachine(DrinkTypes.AMERICANO);
        myDrink.addMilk();
        myDrink.addMilk();
        myDrink.addMilk();
        myDrink.addMilk();
        myDrink.addSugar();
        myDrink.addSugar();
        myDrink.addSugar();
        myDrink.addSugar();
        /*
         * The total Condiments in this case will be 6 instead of 8 as we have a limit of 3 Units.
         * */
        myDrink.brew();
        System.out.println("The drink "+myDrink.drinkType+" has "+myDrink.getTotalMilkUnit()+" Milk Units"
                +" and "+myDrink.getTotalSugarUnit()+" Sugar Units. Total "
                +myDrink.getTotalNumberOfCondiments() +" Condiments");
        VendingMachine mySecondDrink = new VendingMachine(DrinkTypes.AMERICANO);
        mySecondDrink.addMilk();
        mySecondDrink.addMilk();
        mySecondDrink.addSugar();
        mySecondDrink.addSugar();
        /*
         * The total Condiments in this case will be 4.
         * */
        mySecondDrink.brew();

        System.out.println("The drink "+mySecondDrink.drinkType+" has "+mySecondDrink.getTotalMilkUnit()+" Milk Units"
                +" and "+mySecondDrink.getTotalSugarUnit()+" Sugar Units. Total "
                +mySecondDrink.getTotalNumberOfCondiments() +" Condiments");

        VendingMachine myTea = new VendingMachine(DrinkTypes.GREEN_TEA);
        myTea.addMilk();
        myTea.addMilk();
        myTea.addMilk();
        myTea.addMilk();
        myTea.addMilk();
        myTea.addMilk();
        myTea.addSugar();
        myTea.addSugar();
        myTea.addSugar();
        myTea.addSugar();
        myTea.addSugar();
        /*
         * The total Condiments in this case will be 6 instead of 8 as we have a limit of 3 Units.
         * */
        myTea.brew();
        System.out.println("The drink "+myTea.drinkType+" has "+myTea.getTotalMilkUnit()+" Milk Units"
                +" and "+myTea.getTotalSugarUnit()+" Sugar Units. Total "
                +myTea.getTotalNumberOfCondiments() +" Condiments");

    }
}
