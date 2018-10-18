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
        s.addToStrength((byte)1);
        assertEquals(2, s.getStrength());
    }
    

    
    @Test
    void increaseStrengthOverflow() {
        setup();
        assertThrows(ArithmeticException.class, () -> {
            s.addToStrength((byte) 127);
        });
    }
    void strengthBelowLowerBound(){
        setup();
        assertThrows(ArithmeticException.class, () -> {
            s.addToStrength((byte) -4);
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
        s.addToDexterity((byte)1);
        assertEquals(3, s.getDexterity());
    }
    
    @Test
    void increaseDexterityOverflow(){
        setup();
        assertThrows(ArithmeticException.class, () -> {
            s.addToDexterity((byte) 127);
        });
    }
    void dexterityBelowLowerBound(){
        setup();
        assertThrows(ArithmeticException.class, () -> {
            s.addToDexterity((byte) -4);
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
        s.addToEndurance((byte)1);
        assertEquals(4, s.getEndurance());
    }
    
    @Test
    void increaseEnduranceOverflow(){
        setup();
        assertThrows(ArithmeticException.class, () -> {
            s.addToEndurance((byte) 127);
        });
    }
    
    @Test
    void enduranceBelowLowerBound(){
        setup();
        assertThrows(ArithmeticException.class, () -> {
            s.addToEndurance((byte) -4);
        });
    }
    
    @Test
    void getIntelligence(){
        setup();
        assertEquals(4, s.getIntelligence());
    }
    
    @Test
    void increaseIntelligence(){
        setup();
        s.addToIntelligence((byte)1);
        assertEquals(5, s.getIntelligence());
    }
    
    @Test
    void increaseIntelligendeOverflow(){
        setup();
        assertThrows(ArithmeticException.class, () -> {
            s.addToIntelligence((byte) 127);
        });
    }
    
    @Test
    void intelligenceBelowLowerBound(){
        setup();
        assertThrows(ArithmeticException.class, () -> {
            s.addToIntelligence((byte) -5);
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
        s = new Stats((byte)1, (byte)2, (byte)3, (byte)4);
    }
}