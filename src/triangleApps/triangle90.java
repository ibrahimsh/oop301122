package triangleApps;

public class triangle90 extends triangle {
    private double a;
    private double b;
    private double c;

    public triangle90(double m_a, double m_b, double m_c, double m_h) {
        super(m_a, m_b, m_c, m_h);
        this.a = m_a;
        this.b = m_b;
        this.c = m_c;
    }

    @Override
    public double getArea() {
        return this.b * this.a * 0.5;
    }
}
