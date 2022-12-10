package testingOverride;

public class cirlce extends shape{

    @Override
    public void draw() {
        System.out.println("iam  circle draw  me ");
    }

    public static void main(String[] args) {
        shape s  = new shape();
        shape s1 = new cirlce();
        s.draw();
        s1.draw();
    }
}
