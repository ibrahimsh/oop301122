package ex2;

import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
public class vipRoom extends Room{
    private float m_mini_bar_size;
    public void party()
    {
        System.out.println("we have  today party  using minibar for free");
    }

}
