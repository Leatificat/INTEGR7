package Roguelike;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TerrainTest {

    Terrain terrainTest;

    @Test
    public void getMoveCost() {
        setup();
        assertEquals(1, terrainTest.getMoveCost());
    }

    @Test
    public void isTraversible(){
        setup();
        assertEquals(true, terrainTest.isTraversible());

    }


    void setup() {
        terrainTest = new Terrain(' ', true, 1);
    }


}