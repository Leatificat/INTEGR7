package Roguelike;



public class Effect {
    private String name;
    private int baseDuration;

    public Effect(String name, int baseDuration){
        this.name = name;
        this.baseDuration = baseDuration;

        if(baseDuration<0){
            throw new IllegalArgumentException("Base duration below 0");
        }
    }

    public String getName() {
        return name;
    }
}