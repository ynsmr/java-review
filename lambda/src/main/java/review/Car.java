package review;

import lombok.*;

//@Getter
//@Setter
//@ToString
////@NoArgsConstructor
//@AllArgsConstructor
//@RequiredArgsConstructor
//@Data
@Builder
@ToString
public class Car {

    private String make;
    private int topSpeed;
    private final int year;


}
