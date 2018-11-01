package roguelike;

public class Action {
    
    private GameObject actor;
    private GameObject subject;
    private char[] action;
    private int direction;
    
    public Action(GameObject actor, GameObject subject, char[] action){
        this.actor = actor;
        this.subject = subject;
        this.action = action;
    }
    
    public Action(GameObject actor, GameObject subject, char[] action, int direction){
        this.actor = actor;
        this.subject = subject;
        this.action = action;
        this.direction = direction;
    }
    
    public Action(GameObject actor, char[] action, int direction){
        this.actor = actor;
        this.action = action;
        this.direction = direction;
    }
    
    public GameObject getActor(){
        return actor;
    }
    
    public GameObject getSubject(){
        return subject;
    }
    public char[] getAction(){
        return action;
    }
    
    public int getDirection(){
        return direction;
    }
    
}
