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
    @Test
    void getEndurance(){
        setup();
        assertEquals(3, s.getEndurance());
    }
    @Test
    void getHP(){
        setup();
        assertEquals(7, s.getHP());
    }
    
    private void setup(){
        s = new Stats((byte)1, (byte)2, (byte)3);
    }
}