package Roguelike;

public class Stats {
    
    //Detta är primära stats, de kan ändras men är inte tillfälliga.
    private byte strength;
    private byte dexterity;
    private byte endurance;
    
    
    
    
    public Stats(byte strength, byte dexterity, byte endurance){
        this.strength = strength;
        this.dexterity = dexterity;
        this.endurance = endurance;
    }
    
    public byte getStrength(){
        return strength;
    }
    
    public void increaseStrength(byte amountToAdd){
        byte newValue = (byte)(strength + amountToAdd);
        if(newValue != (int)(strength + amountToAdd)){
            new ArithmeticException();
        }
        strength = newValue;
    }
    
    public byte getDexterity(){
        return dexterity;
    }
    
    public byte getEndurance(){
        return endurance;
    }
    
    //Detta är sekundära stats, de räknas ut utifrån primära stats och sparas inte separat
    
    //HP är 2*endurance+strength.
    //Risk för overflow.
    public int getHP(){
        return (endurance*2)+strength;
    }
}
