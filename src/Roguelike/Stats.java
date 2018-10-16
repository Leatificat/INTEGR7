package Roguelike;

public class Stats {
    private byte strength;
    private byte dexterity;
    private byte endurance;
    
    public Stats(byte strength, byte dexterity, byte endurance){
        this.strength = strength;
        this.dexterity = dexterity;
        this.endurance = endurance;
    }
    
    public byte getStrenght(){
        return strength;
    }
    public byte getDexterity(){
        return dexterity;
    }
    
    public byte getEndurance(){
        return endurance;
    }
    //Risk för overflow
    public int getHP(){
        return (endurance*2)+strength;
    }
}
