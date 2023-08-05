import java.util.HashSet;
import java.util.Set;

public class SetReview {
    public static void main(String[] args) {
        // 1. create a set
        Set<Student> mySet = new HashSet<>();
        mySet.add(new Student(7, "John"));
        mySet.add(new Student(8, "Ahmet"));
        mySet.add(new Student(9, "Steve"));
        mySet.add(new Student(9, "Steve")); // Another object with same field values, does nor compare content of objects

        System.out.println(mySet);

        Set<Integer> numSet = new HashSet<>();
        numSet.add(1);
        numSet.add(2);
        System.out.println(numSet);
        System.out.println(numSet.add(2));

        System.out.println("firstRepeatingChar(\"Java Developer\") = " + firstRepeatingChar("Java Developer"));
    }

    public static Character firstRepeatingChar(String str){
        //Create a hashmap
        Set<Character> chars = new HashSet<>();

        //Iteration returns ch if add returns false

        for (Character ch: str.toCharArray()){
            if(!chars.add(ch)){
               return ch;
            }
        }
        return null;
    }
}
