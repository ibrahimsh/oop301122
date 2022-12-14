package entities;

import lombok.*;
@AllArgsConstructor
@Getter
@Setter
@ToString
public class song {
    private String  name ;
    private String  singerName;
    private double duration;
    private int numLikes;


}
