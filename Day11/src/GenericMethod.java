
public class GenericMethod {
	
    public static <X,Y> double makeRectangle(Point<X,Y> point1, Point<X,Y> point2) {
    	double left = (double)point1.getX();
    	double right = (double)point2.getX();
    	
    	double width = Math.abs(left - right);
    	
    	double top = (double)point1.getY();
    	double bottom = (double)point2.getY();
    	
    	double height = Math.abs(top - bottom);
    	
    	return width * height;
    }
}
