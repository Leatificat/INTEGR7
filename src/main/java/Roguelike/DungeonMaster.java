package Roguelike;

//DungeonMaster är för stunden bara en dummyklass för att möjliggöra testande i Character. Lägg till vadhelst som behövs
//i den så länge som det inte krockar med något annat.

//Testkommentar 2

import java.util.ArrayList;

public class DungeonMaster{
    
    private static DungeonMaster instance;
    private int[] currentAction;
    private int turn;
    private ArrayList<Action> actions = new ArrayList();
    private boolean running = true;
    private Character player;
    
    private DungeonMaster(){
        turn = 0;
        player = new Character(new Stats((byte)1,(byte)1,(byte)1,(byte)1),'P');
    }
    
    //Direction indikerar riktningen i vilken handlingen utförs, där 1 är norrut och sedan medsols till 4, som är
    //västerut. Action är en numerisk representation av typen av handling. Ska returnera void, returnerar nu en int[]
    //för testningens skull.
    
    public static DungeonMaster getInstance(){
        if(instance != null){
            return instance;
        }
        instance = new DungeonMaster();
        return instance;
    }
    
    public void performAction(GameObject gameObject, int action, int direction){
        currentAction = new int[]{action, direction};
    }
    
    
    
    public int[] getCurrentAction(){
        return currentAction;
    }
    
    public int getTurn(){
        return turn;
    }
    
    public void startNewTurn(){
        turn++;
    }
    
    public void performActions(){
        for(int i = 0 ; i < actions.size() ; i++){
            //Performs action
        }
    }
    
    public boolean playerIsAlive(){
        return player.isAlive();
    }
    
    public void endGameplayLoop(){
        running = false;
    }
    public void endGame(){
        //creates new game.
    }
    
    public void gameplayLoop(){
        while(running){
            startNewTurn();
            performActions();
            if(!playerIsAlive()){
                running = false;
                endGame();
            }
        }
    }
    
}