public class Block extends Item
{


    private boolean isBreakable;
    private int harshness;
    private boolean isSolid;
    private double spawnRate;

    public Block(String name, String type, int quantity, boolean isStackable, boolean isUpgradable, boolean isBreakable, int harshness, boolean solid, double spawnRate)
    {
        super(name, type, quantity, isStackable, isUpgradable);
        this.isBreakable = isBreakable;
        this.harshness = harshness;
        this.isSolid = solid;
        this.spawnRate = spawnRate;
    }

    public boolean isBreakable(){
        return isBreakable;
    }

    public int getHarshness(){
        return harshness;
    }

    public boolean isSolid(){
        return isSolid;
    }
    public double getSpawnRate(){
        return spawnRate;
    }

    public String isBreakableString(){
        return (isBreakable) ? "Yes" : "No";
    }

    public String isSolidString(){
        return (isSolid) ? "Yes" : "No";
    }


    public String toString(){
        return super.toString() + "isBreakable" +  isBreakableString() + "\nHarshness: " + harshness + "\nisSolid: " +  isSolidString() + "\n SpawnRate: " + spawnRate;
    }

}
