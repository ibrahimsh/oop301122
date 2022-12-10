package triangleApps;

public class triEqualTwoSide extends triangle {
    private double a;
    private double c ;
    private double h;

    public triEqualTwoSide(double a, double c, double h) {
        this.a = a;
        this.c = c;
        this.h = h;
    }

    public triEqualTwoSide(double m_a, double m_b, double m_c, double m_h) {
        super(m_a, m_b, m_c, m_h);
        this.a = m_a;
        this.c = m_c;
        this.h = m_h;
    }

    @Override
    public double getHekef() {
        return (a*2)+c;
    }
}
