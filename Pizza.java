import java.util.ArrayList;
import java.util.List;

public class Pizza extends Food {

    protected List<String> toppings = new ArrayList<String>();

    public Pizza() {
        super("Pizza", 45);
    }

    // The addTopping(String topping) method adds to the list toppings, and
    // increases the price by 10 dkk.
    public void addTopping(String topping) {
        toppings.add(topping);
        price += 10;
    }

    public void display() {
        String list = toppings.toString();
        String strNew = list.replace("[", "");
        String strNew2 = strNew.replace("]", "");
        System.out.println(price + " kr " + name + " { " + strNew2 + " }");
    }

    // setName(String name) must set the name of the pizza through the name field of
    // Food.
    public void setName(String name) {
        this.name = name;
    }
}
