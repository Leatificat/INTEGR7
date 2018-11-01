package roguelike;

public class ItemType {
    private final boolean isWeapon;
    private final boolean isArmor;
    private final boolean isHelmet;
    private final boolean isConsumable;
    private final boolean isTrinket;
    
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