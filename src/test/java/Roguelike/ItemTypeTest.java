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
    
    @Test
    void truthTablesTest(){
        boolean[] bools = new boolean[]{true, true, true, true, true};
        for(int i1 = 0 ; i1 < bools.length ; i1++){
            for(int i2 = 0 ; i2 < bools.length ; i2++){
                for(int i3 = 0 ; i3 < bools.length ; i3++){
                    for(int i4 = 0  ; i4 < bools.length ; i4++){
                        for(int i5 = 0 ; i5 < bools.length ; i5++){
                            ItemType t = new ItemType(bools[0], bools[1], bools[2], bools[3], bools[4]);
                            assertEquals(bools[0], t.isWeapon());
                            assertEquals(bools[1], t.isArmor());
                            assertEquals(bools[2], t.isHelmet());
                            assertEquals(bools[3], t.isConsumable());
                            assertEquals(bools[4], t.isTrinket());
                        }
                    }
                }
            }
        }
        
    }
}