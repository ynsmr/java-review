import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class StateTest {

    public static void main(String[] args) {

        State va =new State();
        va.addCity("McLean");
        va.addCity("Arlington");
        va.addCity("Fairfax");
        va.addCity("FallsChurch");


        State tx = new State();
        tx.addCity("Dallas");
        tx.addCity("Plane");
        tx.addCity("Austin");
        tx.addCity("Houston");

        List<State> list = Arrays.asList(va, tx);

        list.stream().map(state -> state.getCity()).forEach(System.out::println);
        list.stream().flatMap(state -> state.getCity().stream()).forEach(System.out::println);
        list.stream()
                .map(State::getCity)
                .flatMap(List::stream)
                .forEach(System.out::println);



    }
}
