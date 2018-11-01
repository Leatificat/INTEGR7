package roguelike;

public class DummyProgram {
    public static void main(String[] args){
        DungeonDataStructure dungeonDataStructure = DungeonDataStructure.getInstance();
        Terrain emptyGround = new Terrain(' ', true, 1);
        while(true) {
    
            for (int x = 0; x < 160; x++) {
                for (int y = 0; y < 160; y++) {
                    for (int z = 0; z < 160; z++) {
                        dungeonDataStructure.getTile(x, y, z).addGameObject(emptyGround);
                    }
                }
            }
            System.out.println("Finished!");
        }
    }
}
