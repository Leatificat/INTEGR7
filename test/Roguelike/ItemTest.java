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




    void setup(){
        testItem = new Item("Hej", 'k');
    }

}