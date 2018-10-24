package Roguelike;

public class Item extends GameObject{

    private String name;
    private char graphicalRepresentation;

    public Item(String name, char graphicalRepresentation){//diskutera skapningen av effekter och liknande
        this.name = name;
        this.graphicalRepresentation = graphicalRepresentation;

    }

    public String getName() {
        return name;
    }




    @Override
    public char getGraphicalRepresentation() {
        return graphicalRepresentation;
    }
}