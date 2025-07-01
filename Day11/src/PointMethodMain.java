
public class PointMethodMain {
    public static void main(String[] args) {
        Point<Double, Double> p1 = new Point<Double, Double>(0.0, 0.0);
        Point<Double, Double> p2 = new Point<Double, Double>(10.0, 10.0);

        double area = (GenericMethod.<Double,Double> makeRectangle(p1, p2));
        System.out.println("면적 : " + area);
    }
}
