package roguelike;

public class Item extends GameObject{

    private final String name;
    private final char graphicalRepresentation;
    private final ItemType type;
    private Effect effect;

    public Item(String name, char graphicalRepresentation, ItemType type) {
        this.name = name;
        this.graphicalRepresentation = graphicalRepresentation;
        this.type=type;
    }
    public Item(String name, char graphicalRepresentation,ItemType type, Effect effect){
        this.name = name;
        this.graphicalRepresentation = graphicalRepresentation;
        this.type = type;
        this.effect = effect;
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