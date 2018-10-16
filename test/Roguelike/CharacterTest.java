package Roguelike;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CharacterTest {
    Character c;
    Stats s;
    void setup(){
        Stats s = new Stats((byte)1, (byte)2, (byte)3);
        c = new Character(s);
    }
    
    @Test
    void getStats(){
        setup();
        assertEquals(s, c.getStats());
    }
    void getGraphicalRepresentation(){
        setup();
        assertEquals('P', c.getGraphicalRepresentation());
    }
    
}
