package ex2;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Setter
@Getter
@ToString
public class Room {
    private  boolean m_isClean;
    private  boolean m_free;
    private int m_number;
    private float m_size;
    private int m_floor;
    private boolean m_smoking;

    public void cleanRoom()
    {
        System.out.println("cleaning room "+this.m_number);
        this.m_isClean=true;
    }
    public void evacuateRoom()
    {
        System.out.println("evacuating room"+this.m_number);
        this.m_free=true;
    }

}
