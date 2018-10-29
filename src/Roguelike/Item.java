package Roguelike;

public class Item extends GameObject{

    private String name;
    private char graphicalRepresentation;
    private ItemType type;
    private Effect effect;

    public Item(String name, char graphicalRepresentation, ItemType type) {
        this.name = name;
        this.graphicalRepresentation = graphicalRepresentation;
        this.type=type;
    }
    public Item(String name, char graphicalRepresentation,ItemType type, String effName, int expire, int strength, int dexterity, int intelligence, int endurance){
        this.name = name;
        this.graphicalRepresentation = graphicalRepresentation;
        this.type = type;
        this.effect = new Effect(effName,expire,strength,dexterity,intelligence,endurance);
    }

    public String getName() {
        return name;
    }
    public Effect getEffect(){
        return effect;
    }
    public ItemType getType(){return type;}




    @Override
    public char getGraphicalRepresentation() {
        return graphicalRepresentation;
    }
}