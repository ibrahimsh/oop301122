package ex2;

import lombok.Getter;
import lombok.Setter;

public class vipRoomCelebration extends vipRoom {
    private @Setter @Getter float m_jacuzzi;

    public void swimInJacuzzi()
    {
        System.out.println("enjoy with the  jacuzzi hot  water ");
    }

}
