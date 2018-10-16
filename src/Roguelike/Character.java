package Roguelike;

public class Character extends GameObject{
    
    Stats stats;
    char graphicalRepresentation;
    
    
    public Character(Stats stats){
        this.stats = stats;
        graphicalRepresentation = 'P';
    }
    public Stats getStats(){
        return stats;
    }
    public char getGraphicalRepresentation(){
        return graphicalRepresentation;
    }
}