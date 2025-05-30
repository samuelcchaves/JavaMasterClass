import java.util.*;

public class Main
{
   public static  Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        ArrayList<String> groceryList = new ArrayList<>();
        int option;

        do
        {
            printActions();

            option = scanner.nextInt();

            switch (option){
                case 0: break;
                case 1: addItemsToList(groceryList);break;
                case 2: removeItemsFromList(groceryList);break;
                case 3: printItemsList(groceryList);break;

            }
            groceryList.sort(Comparator.naturalOrder());
            System.out.println(groceryList);

        }while (option != 0);


    }

    private static void addItemsToList(ArrayList<String> groceryList)
    {
        System.out.println("Add items");
        String[] items = getUserInputArray();

        for(String i: items)
        {
            String trimmed = i.trim();
            if(!groceryList.contains(trimmed))
            {
                groceryList.add(trimmed);
                System.out.println(trimmed);
            }
        }


        System.out.println(groceryList);



    }

    public static void removeItemsFromList(ArrayList<String> list)
    {
        String[] userData = getUserInputArray();
        System.out.println("Removing " + userData.length + " elements");
        for(String element : userData ){
            System.out.println("    -> " + element);
            list.remove(element);
        }
    }
    private static void printItemsList(ArrayList<String> list)
    {
        System.out.println("Grocery Item List");
        for(String element : list ){
            System.out.println("    -> " + element);
        }
    }

    private static String[] getUserInputArray()
    {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        return string.split(",");
    }

    private static void printActions(){
        System.out.println("-".repeat(60));
        System.out.println(" 0 - to shut down");
        System.out.println(" 1 - to add item(s) to list (comma delimited list) ");
        System.out.println(" 2 - to remove any items(comma delimited list)");
        System.out.println(" 3 - to show the grocery item list");
        System.out.println("-".repeat(60));

        System.out.print("Enter a number for which action you want to do: ");
    }
    private static void checkForDuplicates(String[] array, ArrayList<String> list)
    {
        for(var i = 0; i < list.size(); i++){
            for(var j = 0; j < array.length ; j++){
                if(list.contains(array[j])){
                    list.remove(array[j]);
                }
                    list.add(array[j]);
                }
            }
        }



}