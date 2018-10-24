package Roguelike;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;

public class CharacterTest {
    
    Character c1;
    Character c2;
    Stats s;
    
    void setup(){
        s = new Stats((byte)1, (byte)2, (byte)3, (byte)4);
        c1 = new Character(s, 'P');
        c2 = new Character(s, 'E');
    }
    
    @Test
    void getStats(){
        setup();
        assertEquals(s, c1.getStats());
    }
    @Test
    void getGraphicalRepresentation(){
        setup();
        assertEquals('P', c1.getGraphicalRepresentation());
    }
    @Test
    void performActionValidActionAndDirection(){
        setup();
        c1.performAction(1,2);
        assertArrayEquals(new int[]{1,2}, DungeonMaster.getInstance().getCurrentAction());
    }
}