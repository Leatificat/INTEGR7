package Roguelike;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TileTest {
    Tile tile;
    Terrain t;
    Character c;
    Item i;
    
    private void setup(){
        t = new Terrain(' ', true, 1);
        c = new Character(new Stats((byte)1,(byte)1,(byte)1,(byte)1), 'C');
        i = new Item("Sword", '|',new ItemType(true,false,false,false,false));
        tile = new Tile();
        tile.addGameObject(t, c, i);
    }
    
    @Test
    void getGameObjects(){
        setup();
        assertArrayEquals(new GameObject[]{t,c,i}, tile.getGameObjects());
    }
    
    
}
