package Roguelike;



public class Effect {
    private int turn; //Aktiv turn i spelet,
    // ska egentligen refereras till en klocka utanför denna logik men behövs för test

    private String name;
    private int expire;
    private int strengthModifier;
    private int dexterityModifier;
    private int intelligenceModifier;
    private int enduranceModifier;


    public Effect(String name, int expire, int strength, int dexterity, int intelligence, int endurance){
        this.name = name;
        this.expire = expire;
        this.strengthModifier=strength;
        this.dexterityModifier=dexterity;
        this.intelligenceModifier=intelligence;
        this.enduranceModifier=endurance;


        if(expire<turn){
            throw new IllegalArgumentException("Base duration below 0");
        }
    }

    public String getName() {
        return name;
    }

    public int getStrength(){
        return strengthModifier;
    }
    public int getDexterity(){
        return dexterityModifier;
    }
    public int getIntelligence(){
        return intelligenceModifier;
    }
    public int getEndurance(){
        return enduranceModifier;
    }

}
