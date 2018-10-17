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
    
    public boolean isOverflow(byte old, byte toAdd){
        if((int)old+toAdd != old+toAdd){
            return false;
        }
        return true;
    }
    
    public byte getStrength(){
        return strength;
    }
    
    public void increaseStrength(byte amountToAdd){
        if(isOverflow(strength, amountToAdd)){
            new ArithmeticException();
        }
        strength = (byte)(strength + amountToAdd);
    }
    
    public byte getDexterity(){
        return dexterity;
    }
    public void increaseDexterity(byte amountToAdd){
        if(isOverflow(dexterity, amountToAdd)){
            new ArithmeticException();
        }
        dexterity = (byte)(dexterity + amountToAdd);
    }
    
    public byte getEndurance(){
        return endurance;
    }
    
    public void increaseEndurance(byte amountToAdd){
        if(isOverflow(endurance, amountToAdd)){
            new ArithmeticException();
        }
        endurance = (byte)(endurance + amountToAdd);
    }
    
    //Detta är sekundära stats, de räknas ut utifrån primära stats och sparas inte separat
    
    //HP är 2*endurance+strength.
    //Risk för overflow.
    public int getHP(){
        return (endurance*2)+strength;
    }
    
    public double getSpeed(){return (double)((endurance+dexterity))/2;}
    
    
}