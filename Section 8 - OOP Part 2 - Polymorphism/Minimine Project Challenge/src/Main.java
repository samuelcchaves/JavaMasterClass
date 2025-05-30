;

public class Main
{
    public static void main(String[] args)
    {
        Block diamondBlock = new Block("Diamond Block", "Block",2000,true, true, true, 60, true, 0.00001  );

        Tool diamondPickaxe = new Tool("Diamond Pickaxe", "Tool", 50,false, true, 55,  2499);

        Inventory inventory = new Inventory();

        System.out.println(inventory.displayInfo());

        inventory.addItem(diamondBlock);
        inventory.addItem(diamondPickaxe);

        System.out.println(inventory.displayInfo());


    }
}