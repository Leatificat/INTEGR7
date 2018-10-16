package Roguelike;

public class Character extends GameObject{
    
    private Stats stats;
    private char graphicalRepresentation;
    
    
    public Character(Stats stats, char graphicalRepresentation){
        this.stats = stats;
        this.graphicalRepresentation = graphicalRepresentation;
    }
    public Stats getStats(){
        return stats;
    }
    public char getGraphicalRepresentation(){
        return graphicalRepresentation;
    }
}