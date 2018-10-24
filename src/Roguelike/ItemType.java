package Roguelike;

public class ItemType {
    private boolean isWeapon;
    private boolean isArmor;
    private boolean isHelmet;
    private boolean isConsumable;
    private boolean isTrinket;
    
    public ItemType(boolean isWeapon, boolean isArmor, boolean isHelmet, boolean isConsumable, boolean isTrinket){
        this.isWeapon = isWeapon;
        this.isArmor = isArmor;
        this.isHelmet = isHelmet;
        this.isConsumable = isConsumable;
        this.isTrinket = isTrinket;
    }
    
    public boolean isWeapon(){
        return isWeapon;
    }
    public boolean isArmor(){
        return isArmor;
    }
    public boolean isHelmet(){
        return isHelmet;
    }
    public boolean isConsumable(){
        return isConsumable;
    }
    public boolean isTrinket(){
        return isTrinket;
    }
}
