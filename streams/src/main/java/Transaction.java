import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Data
@AllArgsConstructor
public class Transaction {

    private Trader trader;
    private int year;
    private int value;


}
