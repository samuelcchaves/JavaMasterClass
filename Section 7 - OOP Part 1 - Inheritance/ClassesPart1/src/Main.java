public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        car.setMake("Porsche");
        car.setModel("Carrera");
        car.setColor("Red");
        car.setDoors(2);
        car.setConvertible(true);


        System.out.println("Make = " + car.getMake());
        System.out.println("Model = " + car.getModel());

        car.describeCar();
    }
}