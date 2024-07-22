package task;

import java.util.ArrayList;
import java.util.List;

public class OrangeTest {
    public static void main(String[] args) {

        List<Orange> inventory = new ArrayList<>();
        inventory.add(new Orange(300, Color.GREEN));
        inventory.add(Orange.builder().weight(200).color(Color.RED).build());
        inventory.add(Orange.builder().weight(100).color(Color.GREEN).build());
        inventory.add(Orange.builder().weight(500).color(Color.RED).build());
        inventory.add(Orange.builder().weight(300).color(Color.GREEN).build());

        OrangeFormatter simpleFormatter = (Orange orange) -> "An orange of "+orange.getWeight()+" grams.";
        OrangeFormatter fancyFormatter = orange -> {                                  //Since we use more than one line, we should use {} and return keyword.
            String characteristic = orange.getWeight()<200 ? " Light":" Heavy";
            return "A" + characteristic + " "+ orange.getColor()+ " apple";
        };

        OrangeFormatter fancyFormatter2 = orange -> "A " + orange.getColor().toString().toLowerCase() + (orange.getWeight()<200 ? " Light" : " Heavy") + " orange";


        prettyPrintOrange(inventory, simpleFormatter);
        prettyPrintOrange(inventory, fancyFormatter);
        //prettyPrintOrange(inventory, orange -> "An orange of " + orange.getWeight() + " grams.");


    }

    private static void prettyPrintOrange(List<Orange> inventory, OrangeFormatter orangeFormatter){

        for (Orange orange : inventory){
            String output = orangeFormatter.accept(orange);
            System.out.println(output);
        }
    }
}
