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
        if((int)((int)old+(int)toAdd) != (byte)(old+toAdd)){
            throw new ArithmeticException("Overflow in stat!");
        }
        if(old+toAdd < 1){
            throw new ArithmeticException("Stat below lower bound!");
        }
        return true;
    }
    
    public byte getStrength(){
        return strength;
    }
    
    public void addToStrength(byte amountToAdd){
        isOverflow(strength, amountToAdd);
        strength = (byte)(strength + amountToAdd);
    }
    
    public byte getDexterity(){
        return dexterity;
    }
    public void addToDexterity(byte amountToAdd){
        isOverflow(dexterity, amountToAdd);
        dexterity = (byte)(dexterity + amountToAdd);
    }
    
    public byte getEndurance(){
        return endurance;
    }
    
    public void addToEndurance(byte amountToAdd){
        isOverflow(endurance, amountToAdd);
        endurance = (byte)(endurance + amountToAdd);
    }
    
    //Detta är sekundära stats, de räknas ut utifrån primära stats och sparas inte separat
    
    //HP är 2*endurance+strength.
    //Risk för overflow.
    public int getHP(){
        return (endurance*2)+strength;
    }
    
    public double getSpeed(){
        return (double)((endurance+dexterity))/2;
    }
    
    
}