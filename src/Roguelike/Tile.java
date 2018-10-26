//Tile representerar en position på kartan och innehåller en array med alla GameObjects på denna position.
//Detta inkluderar inte GameObject som finns i ett annat GameObject, utan bara den lägsta nivån i datastrukturen.
//Vi måste se till att inte fler objekt än arraystorleken kan finnas på samma ruta, vilket bör vara genomförbart då
//objekten som finns här huvudsakligen är terrain och character, varav bara en ska kunna finnas på respektive ruta.
//Kan arbetas om till att använda annan datastruktur om så inte skulle vara möjligt eller önskvärt längre fram.

package Roguelike;

import java.util.ArrayList;

public class Tile {
    
    private ArrayList<GameObject> gameObjects = new ArrayList();
    
    public GameObject[] getGameObjects(){
        GameObject[] objects = new GameObject[gameObjects.size()];
        for(int i = 0 ; i < objects.length ; i++){
            objects[i] = gameObjects.get(i);
        }
        return objects;
        
    }
    
    public void addGameObject(GameObject... o){
        for(GameObject object : o){
            gameObjects.add(object);
        }
    }
    public void removeGameObject(GameObject o){
    
    }
}
