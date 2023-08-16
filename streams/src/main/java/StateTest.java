import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StateTest {
    public static void main(String[] args) {

        State myState = new State();
        State yourState = new State();

        myState.addCity("New York");
        myState.addCity("Washington DC");
        myState.addCity("New Bergen");
        myState.addCity("Buffalo");
        myState.addCity("Yankers");
        myState.addCity("Islip");

        yourState.addCity("Arlington");
        yourState.addCity("Tyson");
        yourState.addCity("Norfolk");
        yourState.addCity("Richmond");
        yourState.addCity("Alexandria");
        yourState.addCity("Hampton");




        List<State> stateList = Arrays.asList(myState,yourState);

        stateList.stream()
                .map(State::getCities)
                .flatMap(List::stream)
                .forEach(System.out::println);

        System.out.println("------------------------------");



    }
}
