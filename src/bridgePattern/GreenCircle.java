package bridgePattern;

// Concrete Implementor 02
public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(double radius, double x, double y) {
        System.out.println("Drawing Circle[ color: green, radius: " + radius + ", x: " + x + ", " + y + "]");
    }
}







