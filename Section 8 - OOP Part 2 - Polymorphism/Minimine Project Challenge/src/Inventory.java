import java.util.ArrayList;

public class Inventory
{
    private ArrayList<Item> items;
    private int slots = 32;
    private int slotsCounter = 0;
    private int blocksPerSlot = 64;
    private int capacityCounter = 0;



    public Inventory(){
        items = new ArrayList<>();
    }

    public void addItem(Item item){


        System.out.println("-".repeat(30) + "\nInventory Max Capacity: " + getMaxBlocks() + "\nTrying to add: " + item.getQuantity());

        if(capacityCounter == getMaxBlocks()){
            System.out.println("Inventory full");
        } else if (capacityCounter + item.getQuantity() < getMaxBlocks()){
            capacityCounter += item.getQuantity();
            System.out.println("Capacity Counter Updated to " + getCapacityCounter() + "/" + getMaxBlocks());
        }else{
            int quantityToRemove = capacityCounter + item.getQuantity() - getMaxBlocks();
            System.out.println(quantityToRemove +  " from " + item.getQuantity());
            System.out.println("Inventory maxed out. Droping " + quantityToRemove + " items" );

            item.setQuantity(item.getQuantity() - quantityToRemove);
        }


        items.add(item);
    }

    private int getCapacityCounter(){
        return capacityCounter;
    }

    private int getMaxBlocks(){
        return slots * blocksPerSlot;
    }

    public String displayInfo(){
        if(items == null || items.isEmpty()){
            return "No items in inventory";

        }
        StringBuilder s = new StringBuilder();
        for (Item item : items) {
            s.append("-".repeat(25)).append("\n")
                    .append("Name: ").append(item.getName()).append(" ")
                    .append("Type: ").append(item.getType()).append(" ")
                    .append("Quantity: ").append(item.getQuantity()).append("\n");
            }
            return s.toString();
    }



}
