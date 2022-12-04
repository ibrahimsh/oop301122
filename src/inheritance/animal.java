package inheritance;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor

public class animal {
   private @Setter @Getter String type ;

    public void animalType()
    {
        System.out.println("type");
    }
}
