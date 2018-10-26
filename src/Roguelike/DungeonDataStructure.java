package Roguelike;

public class DungeonDataStructure {
    private static DungeonDataStructure data;
    private Tile[][][] tiles;
    
    private DungeonDataStructure(){
        tiles = new Tile[256][256][256];
    }
    
    public static  DungeonDataStructure getInstance(){
        if(data == null){
            data = new DungeonDataStructure();
        }
        return data;
    }
}