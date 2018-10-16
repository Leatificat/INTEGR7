package Roguelike;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharacterTest {

    Character character;



    @Test
    public void healthNegative(){
        assertFalse(character.health<0);
    }

    @Test
    public void hasStats(){
        assertNotNull(character.stats);
    }

    public void setup(){
        Character character = new Character();
    }
}