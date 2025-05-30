public class Main
{
    public static void main(String[] args)
    {
        /*Item coke = new Item("DRINK", "COKE", 1.5);
        coke.printItem();
        coke.setSize("LARGE");
        coke.printItem();

        Item side = new Item("SIDE", "FRIES", 2.5);
        side.printItem();
        side.setSize("LARGE");
        side.printItem();*/

       /* Burger burger = new Burger("Regular", 4.00);
        burger.addToppings("BACON", "CHEESE", "MAYO");
        burger.printItem();*/

        /*MealOrder regularMeal = new MealOrder();
        regularMeal.addBurgerToppings("BACON", "CHEESE", "MAYO");
        regularMeal.setDrinkSize("LARGE");
        regularMeal.printItemizedList();*/

//        MealOrder secondMeal = new MealOrder("Turkey", "7-up", "chili");
//        secondMeal.setDrinkSize("SMALL");
//        secondMeal.printItemizedList();

        MealOrder deluxeMeal = new MealOrder("deluxe", "7-up", "chili");
        deluxeMeal.addBurgerToppings("AVOCADO", "BACON", "LETTUCE", "CHEESE", "MAYO");
        deluxeMeal.setDrinkSize("SMALL");
        deluxeMeal.printItemizedList();
        }
}