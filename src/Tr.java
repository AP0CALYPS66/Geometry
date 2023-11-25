public class Tr extends GeometryObject{
    double a;
    double b;
    double c;

    public Tr(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.square = getSquare();
    }

    @Override
    public double getSquare() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
    public void setScale(double scale){
        a *= scale;
        b *= scale;
        c *= scale;
        this.square = getSquare();
    }

    @Override
    public String toString() {
        return "Tr{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", square=" + square +
                '}';
    }
}
