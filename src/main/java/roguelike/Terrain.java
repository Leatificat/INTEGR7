package roguelike;

public class Terrain extends GameObject{

private final char graphicalRepresentation;
private final boolean isTraversible;
private final int moveCost;


public Terrain(char graphicalRepresentation, boolean isTraversible, int moveCost){
      this.graphicalRepresentation = graphicalRepresentation;
      this.isTraversible = isTraversible;
      this.moveCost = moveCost;
}

public char getGraphicalRepresentation(){
    return graphicalRepresentation;
}


public boolean isTraversible(){
    return isTraversible;
    }



public int getMoveCost(){
    return moveCost;

}

}
