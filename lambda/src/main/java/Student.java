import lombok.*;

import java.util.Objects;

//@NoArgsConstructor
@AllArgsConstructor
@Data
//@Getter
//@Setter
//@ToString
//@EqualsAndHashCode
//@RequiredArgsConstructor  // You can not have NoArgsConstructor with this
public class Student {

    private String firstName;
    private String lastName;
    private String userName;
    private String email;
    private String password;
    private String confirmPassword;
    private final int age;

}
