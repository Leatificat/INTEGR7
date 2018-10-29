//Tile representerar en position på kartan och innehåller en ArrayList med alla GameObjects på denna position.
//Detta inkluderar inte GameObject som finns i ett annat GameObject, utan bara den lägsta nivån i datastrukturen.

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
}