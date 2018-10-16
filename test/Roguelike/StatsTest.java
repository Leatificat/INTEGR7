package Roguelike;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsTest {
    Stats s;
    
    @Test
    void getStrength(){
        setup();
        assertEquals(1, s.getStrenght());
    }
    
    @Test
    void getDexterity(){
        setup();
        assertEquals(2, s.getDexterity());
    }
    private void setup(){
        s = new Stats((byte)1, (byte)2);
    }
}