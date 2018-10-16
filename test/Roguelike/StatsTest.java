package Roguelike;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsTest {
    Stats stats;

    @Test
    void correctStrengthTest(){
        statSetup();
        assertFalse(stats.getStrength() < 0);
    }


    void statSetup(){
        Stats stats = new Stats((byte)1);
    }
}