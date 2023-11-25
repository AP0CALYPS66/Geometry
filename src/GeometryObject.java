public abstract class GeometryObject implements Comparable<GeometryObject> {
    double square;
    public abstract double getSquare();

    @Override
    public int compareTo(GeometryObject o) {
        if (this.square > o.square) return 1;
        else if(this.square < o.square) return -1;
        return 0;
    }
}
