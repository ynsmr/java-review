package task;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class OrangeTest {
    public static void main(String[] args) {

        List<Orange> inventory = new ArrayList<>();
        inventory.add(new Orange(300, Color.GREEN));
        inventory.add(Orange.builder().weight(200).color(Color.GREEN).build());
        inventory.add(Orange.builder().weight(100).color(Color.RED).build());
        inventory.add(Orange.builder().weight(500).color(Color.RED).build());
        inventory.add(Orange.builder().weight(300).color(Color.GREEN).build());

        Function<Orange, String> simpleFormatter = orange -> "An orange of " + orange.getWeight() + "g";
        prettyPrintApple(inventory, simpleFormatter);


        prettyPrintApple(inventory, orange -> "An orange of " + orange.getWeight() + "g"); // With curly braces you have to use return

        System.out.println("**********************************");
        Function<Orange, String> fancyFormatter = orange -> {
            String characteristic = orange.getWeight()>150? "Heavy":"Light";
            return "A " + characteristic + " " + orange.getColor() + " orange";
        };

        prettyPrintApple(inventory, fancyFormatter);



    }

    public static void prettyPrintApple(List<Orange> inventory, Function<Orange, String> orangeFormatter){
        for (Orange orange:inventory){
            String output = orangeFormatter.apply(orange);
            System.out.println(output);
        }

    }
}
