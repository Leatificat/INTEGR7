package roguelike;

public class Character extends GameObject{
    
    private final Stats stats;
    private final char graphicalRepresentation;
    
    
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
    
    public void performAction(int action, int direction){
        DungeonMaster.getInstance().performAction(this, action, direction);
    }
    
}