package functionalinterfaces;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
public class User {
    private String firstName;
    private String lastName;
    private int age;


}
