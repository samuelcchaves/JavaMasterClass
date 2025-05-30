public class Car
{
    private String description;

    public Car(String description)
    {
        this.description = description;
    }

    public void startEngine(){
        System.out.println("Car -> startEngine");
    }

    protected void runEngine(){
        System.out.println("Car -> runEngine");
    }

    public void drive(){
        System.out.println("Car -> Driving, type is " + getClass().getSimpleName());
        runEngine();
    }
}

class GasPoweredCar extends Car
{
    private double avgKmPerLitre;
    private int cylinders;
    public GasPoweredCar(String description)
    {
        super(description);
    }


    public GasPoweredCar(String description, double avgKmPerLitre, int cylinders)
    {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    public void StartEngine(){
        runEngine();
        System.out.println("Gas powered car starting");
    }
    protected void runEngine(){
        System.out.println("Starting gas engine");
    }

}

class EletricCar extends Car {
    private double avgKmPerCharge;
    private int batterySize;


    public EletricCar(String description)
    {
        super(description);
    }

    public void StartEngine(){
        runEngine();
        System.out.println("Eletric car starting");
    }
    protected void runEngine(){
        System.out.println("Batteries turning on");
    }
}

class HybridCar extends Car {
    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;


    public HybridCar(String description)
    {
        super(description);
    }

    public void StartEngine(){
        runEngine();
        System.out.println("Hybrid car starting");
    }
    protected void runEngine(){
        System.out.println("Starting fueling system");
        System.out.println("Engine on");
        System.out.println("Batteries turning on");
    }
}







