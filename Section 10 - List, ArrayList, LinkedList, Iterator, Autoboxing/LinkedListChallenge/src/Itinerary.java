import java.util.LinkedList;

public class Itinerary
{
    String origin;
    LinkedList<Town> itinerary;


    public Itinerary(String origin){
        this.origin = origin;
        this.itinerary = new LinkedList<Town>();
    }

    public void createItinerary(){
        itinerary.add(new Town(origin, 0));
        itinerary.add(new Town("Vila Real", 45));
        itinerary.add(new Town("Porto", 130));
        itinerary.add(new Town("Aveiro", 250));
        itinerary.add(new Town("Coimbra", 300));
        itinerary.add(new Town("Madrid", 500));
        itinerary.add(new Town("Algarve", 790));
        itinerary.add(new Town("Barcelona", 800));
    }

    public void moveForward(){
        var iterator = itinerary.listIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next().getName() + " GetDistance " + iterator.next().getDistance());

        }
    }
    public void moveBackwards(){
        var iterator = itinerary.listIterator();
        while(iterator.hasPrevious()){
            System.out.println(iterator.previous());

        }
    }

    public void listPlaces(){
        var iterator = itinerary.listIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.hasNext());

        }
    }
}