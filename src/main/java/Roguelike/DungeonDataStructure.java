package Roguelike;

public class DungeonDataStructure {
    private static DungeonDataStructure data;
    private Tile[][][] tiles;
    
    private DungeonDataStructure(){
        tiles = new Tile[256][256][256];
        populateStructure();
    }
    
    public static  DungeonDataStructure getInstance(){
        if(data == null){
            data = new DungeonDataStructure();
        }
        return data;
    }
    
    //Den här verkar ta jävligt lång tid att köra, men den ska bara köras en gång per spel, så bör vara lugnt.
    public void populateStructure(){
        for(int z = 0; z < 256 ; z++){
            for(int y = 0 ; y < 256 ; y++ ){
                for(int x = 0 ; x < 256 ; x++){
                    tiles[z][y][x] = new Tile();
                }
            }
        }
    }
    public Tile getTile(int x, int y, int z){
        return tiles[z][y][x];
    }
    
}