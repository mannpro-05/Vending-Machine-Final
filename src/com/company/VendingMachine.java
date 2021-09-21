package com.company;

import static com.company.DrinkTypes.*;
import com.company.DrinkTypes;

public class VendingMachine extends Drink {

    private int totalMilk, totalSugar;
    DrinkTypes drinkType;

    /**
     * This Constructor will initialize the class variables.
     * It will also set the drink type.
     * @param drinkType DrinkType
     */
    public VendingMachine(DrinkTypes drinkType) {
        this.totalMilk = 0;
        this.totalSugar = 0;
        this.drinkType = drinkType;
    }

    /**
     * This method will get the total milk units for the drink and will determine if more could be added.
     * If more could be added then it will add it and update the total Condiments in the drink.
     */
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

    /**
     * This method will get the total sugar units in the drink and will determine if more could be added.
     * If more could be added then it will add it and update the total Condiments in the drink.
     */
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

    /*
     * This method contains the brewing process for all the drinks.
     * */
    public void brew() {
        switch (this.drinkType) {

            case AMERICANO:
                System.out.println("Brewing Process of Americano");
                break;
            case LATTE_MACCHIATO:
                System.out.println("Brewing Process of Latte Macchiato");
                break;
            case ESPRESSO:
                System.out.println("Brewing Process of Espresso");
                break;
            case BLACK_TEA:
                System.out.println("Brewing Process of Black Tea");
                break;
            case GREEN_TEA:
                System.out.println("Brewing Process of Green tea");
                break;
            case YELLOW_TEA:
                System.out.println("Brewing Process of Yellow Tea");
                break;
        }
    }
}
