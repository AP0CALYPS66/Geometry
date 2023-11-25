public class Circle extends GeometryObject {

    double r;

    public Circle(int r) {
        this.r = r;
        this.square = getSquare();
    }

    @Override
    public double getSquare() {
        return Math.PI * r * r;
    }

    void setScale(double scale){
        r *= scale;
        this.square = getSquare();
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                ", square=" + square +
                '}';
    }
}
