package dev.lpa.ArrayList_Part2;

import java.util.ArrayList;
import java.util.Arrays;

record GroceryItems(String name, String type, int count){
    //constructors
    public GroceryItems(String name){
        this(name, "DAIRY", 1);
    }

    @Override
    public String toString(){
       return String.format("%d %s in %s", count, name.toLowerCase(), type);
    }
}
public class Main {
    public static void main(String[] args) {

        GroceryItems[] groceryArray = new GroceryItems[3];
        groceryArray[0] = new GroceryItems("milk");
        groceryArray[2] = new GroceryItems("oranges", "PRODUCE", 5);
        groceryArray[1] = new GroceryItems("apples", "PRODUCE", 6);
        System.out.println(Arrays.toString(groceryArray));

        ArrayList objectList = new ArrayList();
        objectList.add(new GroceryItems("Butter"));
        objectList.add("Yogurt");

        ArrayList<GroceryItems> groceryList = new ArrayList<>();
        groceryList.add(new GroceryItems("Butter"));
        //Continuation ArrayList Section
        groceryList.add(new GroceryItems("milk"));
        groceryList.add(new GroceryItems("oranges", "Produce", 5));
        groceryList.set(0,
                new GroceryItems("apple", "PRODUCE", 6));
        groceryList.remove(1);
        System.out.println(groceryList);

    }
}
