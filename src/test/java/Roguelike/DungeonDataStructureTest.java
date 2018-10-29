package Roguelike;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DungeonDataStructureTest {
    
    DungeonDataStructure data;
    
    private void setup(){
        data = DungeonDataStructure.getInstance();
    }
    
    @Test
    void constructorTest(){
        setup();
        assertEquals(DungeonDataStructure.getInstance(), data);
    }
    
}
