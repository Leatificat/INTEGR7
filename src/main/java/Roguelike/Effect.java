package Roguelike;



public class Effect {
    private int turn =3; //Aktiv turn i spelet,
    // ska egentligen refereras till en klocka utanför denna logik men behövs för test

    private String name;
    private int expire;
    private int strengthModifier;
    private int dexterityModifier;
    private int intelligenceModifier;
    private int enduranceModifier;


    public Effect(String name, int strength, int dexterity, int intelligence, int endurance) {
        this.name = name;
        this.expire = -1;
        this.strengthModifier = strength;
        this.dexterityModifier = dexterity;
        this.intelligenceModifier = intelligence;
        this.enduranceModifier = endurance;
    }

    public Effect(String name, int expire, int strength, int dexterity, int intelligence, int endurance){
        this.name = name;
        this.expire = expire + turn;
        this.strengthModifier=strength;
        this.dexterityModifier=dexterity;
        this.intelligenceModifier=intelligence;
        this.enduranceModifier=endurance;

        if(this.expire<turn){
            throw new IllegalArgumentException("Effect expires before it starts.");
        }
    }

    public String getName() {
        return name;
    }
    public int getExpire(){return expire;}
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
