package Roguelike;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ItemTypeTest {
    ItemType t;
    
    private void setup(){
        t = new ItemType(false, false, false, false, false);
    }
    @Test
    void isWeapon(){
        setup();
        assertEquals(false, t.isWeapon());
    }
    @Test
    void isArmor(){
        setup();
        assertEquals(false, t.isArmor());
    }
    @Test
    void isHelmet(){
        setup();
        assertEquals(false, t.isHelmet());
    }
    @Test
    void isConsumable(){
        setup();
        assertEquals(false, t.isConsumable());
    }
    @Test
    void isTrinket(){
        setup();
        assertEquals(false, t.isTrinket());
    }
    
    
}
