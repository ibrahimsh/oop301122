package triangleApps;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
public class triangle {
    protected double m_a , m_b , m_c , m_h;

    public triangle(double m_a, double m_b, double m_c, double m_h) {
        this.m_a = m_a;
        this.m_b = m_b;
        this.m_c = m_c;
        this.m_h = m_h;
    }
    public double getArea()
    {
        return this.m_c * m_h * 0.5;
    }
    public double getHekef()
    {
        return (m_a+m_b+m_c);
    }
}
