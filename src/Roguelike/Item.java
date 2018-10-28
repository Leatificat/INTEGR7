package Roguelike;

public class Item extends GameObject{

    private String name;
    private char graphicalRepresentation;
    private Effect effect;

    public Item(String name, char graphicalRepresentation) {
        this.name = name;
        this.graphicalRepresentation = graphicalRepresentation;
    }
    public Item(String name, char graphicalRepresentation,String effName, int expire, int strength, int dexterity, int intelligence, int endurance){
        this.name = name;
        this.graphicalRepresentation = graphicalRepresentation;
        this.effect = new Effect(effName,expire,strength,dexterity,intelligence,endurance);
    }

    public String getName() {
        return name;
    }
    public Effect getEffect(){
        return effect;
    }




    @Override
    public char getGraphicalRepresentation() {
        return graphicalRepresentation;
    }
}