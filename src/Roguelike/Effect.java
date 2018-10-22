package Roguelike;



public class Effect {
    private String name;
    private int expire;

    public Effect(String name, int expire){
        this.name = name;
        this.expire = expire;


        if(expire<0){
            throw new IllegalArgumentException("Base duration below 0");
        }
    }

    public String getName() {
        return name;
    }

    public int getBaseDuration(){return expire;}

}
