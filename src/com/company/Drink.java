package com.company;

public class Drink {

    private int totalNumberOfCondiments;
    private int totalMilkUnit, totalSugarUnit;
    /*
     * This method is to get the total number of condiments used.
     * */
    public int getTotalNumberOfCondiments() {
        return totalNumberOfCondiments;
    }
    /*
     * This method is to update/set the total number of condiments used.
     * */
    public void setTotalNumberOfCondiments(int totalNumberOfCondiments) {
        this.totalNumberOfCondiments += totalNumberOfCondiments;
    }
    /*
     * This method is to get the total number of Sugar units used.
     * */
    public int getTotalSugarUnit() {
        return totalSugarUnit;
    }
    /*
     * This method is to update/set the total number of Sugar units used.
     * */
    public void setTotalSugarUnit(int totalSugarUnit) {
        this.totalSugarUnit = totalSugarUnit;
    }

    /*
     * This method is to get the total number of Milk units used.
     * */
    public int getTotalMilkUnit() {
        return totalMilkUnit;
    }
    /*
     * This method is to update/set the total number of Milk units used.
     * */
    public void setTotalMilkUnit(int totalMilkUnit) {
        this.totalMilkUnit = totalMilkUnit;
    }
    /*
     * This method is to add the Milk unit in the drink.
     * This method will be overridden in the Coffee and Tea class which will contain the logic for adding milk to the drink.
     * */
    public void addMilk() {

    }
    /*
     * This method is to add the Milk unit in the drink.
     * This method will be overridden in the Coffee and Tea class which will contain the logic for adding sugar to the drink.
     * */
    public void addSugar() {

    }

}
