package day38_JavaRecap;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Methods {
    public static void main(String[] args) {
        ArrayList<String>cars=new ArrayList<>();
        cars.addAll(Arrays.asList("BMW","MErcedes","Infinity","Tesla","WV","Lamborghini","Lexus","Tesla","Tesla"));
                                //    0      1         2         3     4     5             6
        //cars.remove(3);
        //cars.removeAll(Arrays.asList("Tesla"));

        //cars.removeIf(p->p.toLowerCase().contains("m"));

        //cars.retainAll(Arrays.asList("Tesla"));
        System.out.println(cars);

        System.out.println("==========================================================================");

        ArrayList<String> groceryList=new ArrayList<>();
        groceryList.addAll(Arrays.asList("Eggs","Milk","Paper Towels","Toilet paper","Mango","Orange","Avocado","Dragon fruit"));

        boolean r1=groceryList.contains("Cola");
        System.out.println(groceryList);
        System.out.println(r1);

        boolean r2=groceryList.containsAll(Arrays.asList("Eggs","Orange","Milk","Water"));
        System.out.println(r2);

        groceryList.set(groceryList.size()-1,"Apple");
        groceryList.set(groceryList.indexOf("Mango"),"Dish WASher");
        groceryList.clear();
        System.out.println(groceryList);


    }
}
