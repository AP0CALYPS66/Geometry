public class Kv extends GeometryObject{
    double a;
    double b;

    public Kv(int a, int b) {
        this.a = a;
        this.b = b;
        this.square = getSquare();
    }

    @Override
    public double getSquare() {
        return a * b;
    }

    public void setScale(double scale){
        a *= scale;
        b *= scale;
        this.square = getSquare();
    }

    @Override
    public String toString() {
        return "Kv{" +
                "a=" + a +
                ", b=" + b +
                ", square=" + square +
                '}';
    }
}
