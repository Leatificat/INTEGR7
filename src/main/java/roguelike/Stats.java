package roguelike;

public class Stats {
    
    //Detta är primära stats, de kan ändras men är inte tillfälliga.
    private byte strength;
    private byte dexterity;
    private byte endurance;
    private byte intelligence;
    
    
    
    
    public Stats(byte strength, byte dexterity, byte endurance, byte intelligence){
        this.strength = strength;
        this.dexterity = dexterity;
        this.endurance = endurance;
        this.intelligence = intelligence;
    }
    
    private void isOverflow(byte old, byte toAdd){
        if(((int)old+(int)toAdd) != (byte)(old+toAdd)){
            throw new ArithmeticException("Overflow in stat!");
        }
        if(old+toAdd < 1){
            throw new ArithmeticException("Stat below lower bound!");
        }
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
    
    public byte getIntelligence(){
        return intelligence;
    }
    
    public void addToIntelligence(byte amountToAdd){
        isOverflow(endurance, amountToAdd);
        intelligence = (byte)(intelligence + amountToAdd);
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
    
    public int getBaseDamage(){
        return strength;
    }
    
    
}