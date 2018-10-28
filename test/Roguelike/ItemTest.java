package Roguelike;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemTest {
    Item testItem;



    @Test
    void checkNameNotNull(){
        setup();
        assertNotNull(testItem.getName());
    }

    @Test
    void checkNameNotEmpty(){
        setup();
        assertTrue(testItem.getName().length()>0);
    }
    @Test
    void getGraphicalRepresentation(){
        setup();
        assertEquals('k', testItem.getGraphicalRepresentation());
    }
    @Test
    void testStrengthPotionEffect(){
        setupWithEffect("Strength + 5", 10, 5, 0,0,0);
        assertEquals(5,testItem.getEffect().getStrength());
    }




    void setup(){
        testItem = new Item("Hej", 'k');
    }
    void setupWithEffect(String effName, int exp, int str, int dex, int inte, int endu){
        testItem = new Item("Hej", 'k',effName,exp,str,dex,inte,endu);
    }

}