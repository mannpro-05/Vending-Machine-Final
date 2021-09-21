package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DrinkTest {

    @org.junit.jupiter.api.Test
    void getTotalNumberOfCondiments() {
        VendingMachine myCoffee = new VendingMachine(DrinkTypes.AMERICANO);
        myCoffee.addMilk();
        myCoffee.addSugar();
        myCoffee.addMilk();
        assertEquals(myCoffee.getTotalNumberOfCondiments(), 3);
    }

    @Test
    void testGetTotalNumberOfCondiments1() {
        VendingMachine myCoffee = new VendingMachine(DrinkTypes.AMERICANO);
        myCoffee.addMilk();
        myCoffee.addSugar();
        myCoffee.addMilk();
        assertEquals(myCoffee.getTotalNumberOfCondiments(), 3);
    }
}