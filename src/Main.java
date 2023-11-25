import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    GeometryObject[] geometryObjects = new GeometryObject[]{new Circle(10), new Kv(10,30), new Tr(30,40,50)};
        Arrays.sort(geometryObjects);
        System.out.println(Arrays.toString(geometryObjects));
    }
}