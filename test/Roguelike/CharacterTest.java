package Roguelike;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CharacterTest {
    
    Character c;
    Stats s;
    
    void setup(){
        s = new Stats((byte)1, (byte)2, (byte)3);
        c = new Character(s, 'P');
    }
    
    @Test
    void getStats(){
        setup();
        assertEquals(s, c.getStats());
    }
    @Test
    void getGraphicalRepresentation(){
        setup();
        assertEquals('P', c.getGraphicalRepresentation());
    }
    
}