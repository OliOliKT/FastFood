import java.util.ArrayList;
import java.util.List;

public class Order {

    // The field ordered must be a List of Food, and it must be protected.
    protected List<Food> ordered;

    public Order() {
        // The constructor must leave the list of ordered food empty
        ordered = new ArrayList<Food>();
    }

    // The addFood(Food food) must add the given food to the list ordered
    public void addFood(Food food) {
        ordered.add(food);
    }

    // The total() method must return the sum of prices for all food items in the
    // order.
    

    public int total() {
        int totalPrice = 0;
        for (Food food : ordered) {
            totalPrice += food.price;
        }
        return totalPrice;
    }

    // The display() method must print out all the food ordered, followed by the
    // total for the order.
    public void display() {
        //System.out.println(display());
        for (Food food : ordered) {
            food.display();
        }
        System.out.println(total() + " kr " + "TOTAL");
    }

    public boolean payWith(CreditCard card) {
        boolean money = card.withdraw(total());
        if (!money) {
            System.out.println("ERROR: Payment failed");
        }
        return money;
    }


}