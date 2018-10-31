//Tile representerar en position på kartan och innehåller en ArrayList med alla GameObjects på denna position.
//Detta inkluderar inte GameObject som finns i ett annat GameObject, utan bara den lägsta nivån i datastrukturen.

package roguelike;

public class Tile {
    
    private GameObject[] gameObjects = new GameObject[3];
    
    public GameObject[] getGameObjects(){
        GameObject[] objects = new GameObject[gameObjects.length];
        for(int i = 0 ; i < objects.length ; i++){
            objects[i] = gameObjects[i];
        }
        return objects;
    }
    
    public void addGameObject(GameObject... o){
        for(int i = 0 ; i < o.length ; i++){
            if(o[i] instanceof Terrain){
                gameObjects[0] = o[i];
            }
            if(o[i] instanceof Character){
                gameObjects[1] = o[i];
            }
            if(o[i] instanceof Item){
                gameObjects[2] = o[i];
            }
        }
    }
}