package roguelike;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class ItemTypeTest {
    ItemType t;
    
    private void setup(){
        t = new ItemType(false, false, false, false, false);
    }
    @Test
    void isWeapon(){
        setup();
        assertFalse(t.isWeapon());
    }
    @Test
    void isArmor(){
        setup();
        assertFalse(t.isArmor());
    }
    @Test
    void isHelmet(){
        setup();
        assertFalse(t.isHelmet());
    }
    @Test
    void isConsumable(){
        setup();
        assertFalse(t.isConsumable());
    }
    @Test
    void isTrinket(){
        setup();
        assertFalse(t.isTrinket());
    }
    
    
}
