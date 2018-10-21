package Roguelike;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EffectTest {
    Effect effect;

    @Test
    void checkNameNotNull(){
        setup();
        assertNotNull(effect.getName());
    }

    @Test
    void checkNameNotEmpty(){
        setup();
        assertTrue(effect.getName().length()>0);
    }

    @Test
    void checkBaseDurationTooLow(){
        assertThrows(IllegalArgumentException.class, () ->{
            new Effect("TestName", -1);
        });
    }




    void setup(){
        effect = new Effect("TestName", 2);
    }
}