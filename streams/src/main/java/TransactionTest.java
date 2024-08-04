import java.util.Comparator;
import java.util.Optional;

public class TransactionTest {

    public static void main(String[] args) {

        //Find all transactions in 2011 and sort by value
        System.out.println("**************************");

        TransactionData.getAll().stream()
                .filter(transaction -> transaction.getYear() == 2011)
                .sorted(Comparator.comparing(Transaction::getValue))
                .forEach(System.out::println);


        //What are all the unique cities where traders work?
        System.out.println("*********************************");

        TransactionData.getAll().stream()
                .map(Transaction::getTrader)
                .map(Trader::getCity)
                .distinct()
                .forEach(System.out::println);

        //Find all traders from Cambridge and sort them by name
        System.out.println("**********************************");

        TransactionData.getAll().stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equals("Cambridge"))
                .distinct()
                .sorted(Comparator.comparing(Trader::getName))
                .forEach(System.out::println);

        //Return a string of all traders' names sorted alphabetically
        System.out.println("************************************");

        System.out.println(TransactionData.getAll().stream()
                .map(Transaction::getTrader)
                .map(Trader::getName)
                .distinct()
                .sorted()
                .reduce((a, b) -> a + ", " + b).get());


        //Are any traders based in Milan
        System.out.println("*******************");

        boolean milan = TransactionData.getAll().stream()
                .anyMatch(transaction -> transaction.getTrader().getCity().equals("Milan"));

        System.out.println(milan);


        //Print the values of all transactions from the traders living in Cambridge
        System.out.println("***************************");
        TransactionData.getAll().stream()
                .filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
                .map(Transaction::getValue)
                .forEach(System.out::println);

        //What is the highest value of all the transactions
        System.out.println("*****************************************");

        Optional<Integer> maxValue = TransactionData.getAll().stream()
                .map(Transaction::getValue)
                .reduce(Integer::max);

        //Find the transaction with the smallest value
        System.out.println("***********************************");

        System.out.println(TransactionData.getAll().stream()
                .min(Comparator.comparing(Transaction::getValue)));

        Optional<Transaction> smallValue = TransactionData.getAll().stream()
                .reduce((t1, t2) -> t1.getValue() < t2.getValue() ? t1 : t2);

        System.out.println(smallValue);

        System.out.println(TransactionData.getAll().stream()
                .sorted(Comparator.comparing(Transaction::getValue)) //Ascending order
                .findFirst());

        //


    }
}
