package Roguelike;

//DungeonMaster är för stunden bara en dummyklass för att möjliggöra testande i Character. Lägg till vadhelst som behövs
//i den så länge som det inte krockar med något annat.

//Testkommentar

public class DungeonMaster{
    
    //Direction indikerar riktningen i vilken handlingen utförs, där 1 är norrut och sedan medsols till 4, som är
    //västerut. Action är en numerisk representation av typen av handling. Ska returnera void, returnerar nu en int[]
    //för testningens skull.
    public int[] performAction(GameObject gameObject, int action, int direction){
        return new int[]{action, direction};
    }
}