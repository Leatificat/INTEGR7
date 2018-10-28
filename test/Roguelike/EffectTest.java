package Roguelike;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EffectTest {
    Effect effect;

    @Test
    void checkNameNotNull(){
        setup("",10,0,0,0,0);
        assertNotNull(effect.getName());
    }

    @Test
    void checkNameNotEmpty(){
        setup("NameTest",10,0,0,0,0);
        assertTrue(effect.getName().length()>0);
    }

    @Test
    void checkExpireTurnNotPassed(){
        assertThrows(IllegalArgumentException.class, () ->{
            setup("ExpTest",-1,0,0,0,0);
        });
    }

    @Test
    void checkTimedEffect(){
        effect = new Effect("Timed Effect",10, 1, 1, 1, 1);
        assertEquals(13,effect.getExpire());
    }
    @Test
    void checkTimelessEffect(){
        effect = new Effect("Endless Effect", 1, 1, 1, 1);
        assertEquals(-1,effect.getExpire());
    }

    void setup(String name, int exp, int str, int dex, int inte, int end){
        effect = new Effect(name, exp, str, dex, inte, end);
    }

    @Test
    void testValidStrengthModifierNegative(){
        setup("StrTest",10,-5,0,0,0);
        assertEquals(-5,effect.getStrength());
    }
    @Test
    void testValidStrengthModifierZero(){
        setup("StrTest",10,0,0,0,0);
        assertEquals(0, effect.getStrength());
    }
    @Test
    void testValidDStrengthModifierPositive(){
        setup("StrTest",10,15,0,0,0);
        assertEquals(15, effect.getStrength());
    }

    @Test
    void testValidDexterityModifierNegative(){
        setup("DexTest",10,0,-5,0,0);
        assertEquals(-5,effect.getDexterity());
    }
    @Test
    void testValidDexterityModifierZero(){
        setup("DexTest",10,0,0,0,0);
        assertEquals(0, effect.getDexterity());
    }
    @Test
    void testValidDDexterityModifierPositive(){
        setup("DexTest",10,0,15,0,0);
        assertEquals(15, effect.getDexterity());
    }

    @Test
    void testValidIntelligenceModifierNegative(){
        setup("IntTest",10,0,0,-5,0);
        assertEquals(-5,effect.getIntelligence());
    }
    @Test
    void testValidIntelligenceModifierZero(){
        setup("IntTest",10,0,0,0,0);
        assertEquals(0, effect.getIntelligence());
    }
    @Test
    void testValidDIntelligenceModifierPositive(){
        setup("IntTest",10,0,0,15,0);
        assertEquals(15, effect.getIntelligence());
    }

    @Test
    void testValidEnduranceModifierNegative(){
        setup("EndTest",10,0,0,0,-5);
        assertEquals(-5,effect.getEndurance());
    }
    @Test
    void testValidEnduranceModifierZero(){
        setup("EndTest",10,0,0,0,0);
        assertEquals(0, effect.getEndurance());
    }
    @Test
    void testValidDEnduranceModifierPositive(){
        setup("EndTest",10,0,0,0,15);
        assertEquals(15, effect.getEndurance());
    }








}