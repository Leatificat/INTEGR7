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
    
    @Test
    void getTileTest(){
        setup();
        Tile t = data.getTile(0,0,0);
        Terrain terrain = new Terrain(' ', true, 1);
        t.addGameObject(terrain);
        
        assertEquals(terrain, t.getGameObjects()[0]);
        
    }
    
}
