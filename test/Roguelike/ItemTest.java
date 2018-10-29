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
    @Test
    void testWeaponItem(){
        testItem = new Item("Weapon", 'w', new ItemType(true,false,false,false,false));
        assertTrue(testItem.getType().isWeapon());
    }
    @Test
    void testArmorItem(){
        testItem = new Item("Armor", 'w', new ItemType(false,true,false,false,false));
        assertTrue(testItem.getType().isArmor());
    }
    @Test
    void testHelmetItem(){
        testItem = new Item("Helmet", 'w', new ItemType(false,false,true,false,false));
        assertTrue(testItem.getType().isHelmet());
    }
    @Test
    void testConsumableItem(){
        testItem = new Item("Consumable", 'w', new ItemType(false,false,false,true,false));
        assertTrue(testItem.getType().isConsumable());
    }
    @Test
    void testTrinketItem(){
        testItem = new Item("Trinket", 'w', new ItemType(false,false,false,false,true));
        assertTrue(testItem.getType().isTrinket());
    }





    void setup(){
        testItem = new Item("Hej", 'k',createItemType());
    }
    void setupWithEffect(String effName, int exp, int str, int dex, int inte, int endu){
        testItem = new Item("Hej", 'k',createItemType(),effName,exp,str,dex,inte,endu);
    }
    ItemType createItemType() {
        return new ItemType(false, false, false, true, false);
    }
}