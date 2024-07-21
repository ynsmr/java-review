import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {

        ArrayList<Integer> items = new ArrayList<Integer>();

        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        items.add(5);
        //items.add("apple"); Type checking at compile time with generics

        printDouble(items);


    }

    private static void printDouble(ArrayList<Integer> items) {

//        for (Object each: items){
//
//            System.out.println((Integer)each*2);
//        }

        for (Integer i: items){

            System.out.println(i*2); //No need to cast thanks to generics
        }


    }
}
