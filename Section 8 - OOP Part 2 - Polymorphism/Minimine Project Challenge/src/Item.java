public class Item
{
    private String name;
    private String type;
    private int quantity;
    private boolean isStackable;
    private boolean isUpgradable;
    private boolean texture;



    public Item(String name, String type, int quantity, boolean isStackable, boolean isUpgradable){
        this.name = name;
        this.type = type;
        this.quantity = quantity;
        this.isStackable = isStackable;
        this.isUpgradable = isUpgradable;
    }

    public String getName(){
        return name;
    };

    public String getType(){
        return name;
    };

    public int getQuantity(){
        return quantity;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public boolean isStackable(){
        return isStackable;
    }
    public boolean isUpgradable(){
        return isUpgradable;
    }

    public String isStackableString(){
        return (isStackable ? "Yes" :"No");
    }

    public String isUpgradableString(){
        return (isUpgradable ? "Yes" : "No");
    }

    public String displayInfo(){
        return "*".repeat(20)+ "\n" + name + "\nType: " + type + "\n Quantity: " + quantity + "isStackable: " +isStackableString() + "\nisUpgradable: " + isUpgradableString();
    }


}
