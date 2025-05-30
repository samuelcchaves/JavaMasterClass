public class Tool extends Item
{

    private int damage;
    private int durability;
    private int durabilityLeft;


    public Tool(String name, String type, int quantity, boolean isStackable,  boolean isUpgradable, int damage, int durability){
        super(name, type, quantity, isStackable, isUpgradable);
        this.damage = damage;
        this.durability = durability;
        this.durabilityLeft = durability;
    }

    public int getDamage(){
        return damage;
    }
    public int getDurability(){
        return durability;
    }
    public int getDurabilityLeft(){
        return durabilityLeft;
    }





    public String toString(){
        return "*".repeat(20)+ "\n" + super.getName() + "\nType: " + super.getType() + "\nDamage: " + damage + "\nDurability Left: " + durabilityLeft + "/" + durability + "\nisStackable: " +  isStackableString();
    }
}
