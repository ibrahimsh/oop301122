package ex2;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@ToString
public class vipPresedentRoom extends vipRoom{
    private @Setter @Getter int m_guards;

    public void addGuard()
    {
        this.m_guards = this.m_guards+1;
    }
    public float getMiniBarSize()
    {
        return this.getM_mini_bar_size();
    }

}
