package Roguelike;

public class Stats {
    private byte strength;
    private byte dexterity;
    
    public Stats(byte strength, byte dexterity){
        this.strength = strength;
        this.dexterity = dexterity;
    }
    
    public byte getStrenght(){
        return strength;
    }
    public byte getDexterity(){
        return dexterity;
    }
}
