package task;

import lombok.*;

//@Getter
//@Setter
//@ToString
@Builder
@Data

//@Builder generates and @AllArgConstructor unless there is another @XConstructor
public class Orange {

    private int weight;
    private Color color;

}
