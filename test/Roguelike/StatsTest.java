package Roguelike;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StatsTest {
    Stats s;
    
    @Test
    void getStrength(){
        setup();
        assertEquals(1, s.getStrength());
    }
    @Test
    void increaseStrength(){
        setup();
        s.increaseStrength((byte)1);
        assertEquals(2, s.getStrength());
    }
    

    
    @Test
    void increaseStrengthOverflow() {
        setup();
        assertThrows(ArithmeticException.class, () -> {
            s.increaseStrength((byte) 127);
        });
    }
    
    @Test
    void getDexterity(){
        setup();
        assertEquals(2, s.getDexterity());
    }

    
    @Test
    void increaseDexterity(){
        setup();
        s.increaseDexterity((byte)1);
        assertEquals(3, s.getDexterity());
    }
    
    @Test
    void increaseDexterityOverflow(){
        setup();
        assertThrows(ArithmeticException.class, () -> {
            s.increaseDexterity((byte) 127);
        });
    }
    
    @Test
    void getEndurance(){
        setup();
        assertEquals(3, s.getEndurance());
    }
    
    @Test
    void increaseEndurance(){
        setup();
        s.increaseEndurance((byte)1);
        assertEquals(4, s.getEndurance());
    }
    
    @Test
    void increaseEnduranceOverflow(){
        setup();
        assertThrows(ArithmeticException.class, () -> {
            s.increaseEndurance((byte) 127);
        });
    }
    
    @Test
    void enduranceBelowLowerBound(){
        setup();
        assertThrows(ArithmeticException.class, () -> {
            s.increaseEndurance((byte) -4);
        });
    }
    
    @Test
    void getHP(){
        setup();
        assertEquals(7, s.getHP());
    }
    @Test
    void getSpeed(){
        setup();
        assertEquals(2.5, s.getSpeed());
    }
    
    private void setup(){
        s = new Stats((byte)1, (byte)2, (byte)3);
    }
}