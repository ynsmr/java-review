import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;

public class TransactionsTest {
    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );

        //TASK 1
        transactions.stream()
                .filter(t-> t.getYear()==2011)
                .sorted(comparing(Transaction::getValue))
                .forEach(System.out::println);

        System.out.println("---------------------------");
        //TASK 2
        transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getCity)
                .distinct()
                .forEach(System.out::println);

        System.out.println("--------------------------------");
        //TASK 3
        transactions.stream()
                .map(Transaction::getTrader)
                .filter(t-> t.getCity().equals("Cambridge"))
                .sorted(comparing(Trader::getName))
                .distinct()
                .forEach(System.out::println);

        System.out.println("------------------------------------");
        //TASK 4
        String names = transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getName)
                .sorted()
                .collect(Collectors.joining(", "));

        System.out.println(names);

        System.out.println("--------------------------------");
        //TASK 5
        boolean milan = transactions.stream()
                .map(Transaction::getTrader)
                .anyMatch(t -> t.getCity().equalsIgnoreCase("Milan"));

        boolean milan1 = transactions.stream().anyMatch(t -> t.getTrader().getCity().equalsIgnoreCase("Milan"));

        System.out.println(milan);
        System.out.println(milan1);

        System.out.println("--------------------------------------------");
        //TASK 6
        transactions.stream()
                .filter(t -> t.getTrader().getCity().equalsIgnoreCase("Cambridge"))
                .map(Transaction::getValue)
                .forEach(System.out::println);

        System.out.println("------------------------");
        //TASK 7
        Optional<Integer> max = transactions.stream()
                .map(Transaction::getValue)
                .reduce(Integer::max);

        System.out.println(max.get());

        System.out.println("-----------------------------");
        //TASK 8
        Optional<Integer> min = transactions.stream()
                .map(Transaction::getValue)
                .reduce(Integer::min);

        System.out.println(min.get());


    }
}
