import java.util.Arrays;
import java.util.List;

public class TransactionData {

    public static List<Transaction> getAll(){
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        return Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 340),
                new Transaction(raoul, 2013, 560),
                new Transaction(mario, 2014, 260),
                new Transaction(mario, 2013, 3330),
                new Transaction(alan, 2011, 673)
        );
    }

}
