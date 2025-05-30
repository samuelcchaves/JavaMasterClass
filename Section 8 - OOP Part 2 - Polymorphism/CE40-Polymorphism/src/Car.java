public class Car
{
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;


    public Car(int cylinders, String name){
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public String startEngine(){
        return this.getClass().getSimpleName() + " engine is starting";
    }

    public String accelerate(){
        return this.getClass().getSimpleName() + " is accelerating";
    }

    public String brake(){
        return this.getClass().getSimpleName() + " is braking";
    }

    public int getCylinders(){
        return cylinders;
    }

    public String getName(){
        return name;
    }
}

class Mitsubishi extends Car
{
    public Mitsubishi(int cylinders, String name){
        super(cylinders, name);
    }

    public String startEngine(){
        return this.getClass().getSimpleName() + " engine is starting";
    }

    public String accelerate(){
        return this.getClass().getSimpleName() + " is accelerating";
    }

    public String brake(){
        return this.getClass().getSimpleName() + " is braking";
    }
}

class Holden extends Car
{
    public Holden(int cylinders, String name){
        super(cylinders, name);
    }

    public String startEngine(){
        return this.getClass().getSimpleName() + " engine is starting";
    }

    public String accelerate(){
        return this.getClass().getSimpleName() + " is accelerating";
    }

    public String brake(){
        return this.getClass().getSimpleName() + " is braking";
    }
}

class Ford extends Car {
    public Ford(int cylinders, String name){
        super(cylinders, name);
    }

    public String startEngine(){
        return this.getClass().getSimpleName() + " engine is starting";
    }

    public String accelerate(){
        return this.getClass().getSimpleName() + " is accelerating";
    }

    public String brake(){
        return this.getClass().getSimpleName() + " is braking";
    }
}
