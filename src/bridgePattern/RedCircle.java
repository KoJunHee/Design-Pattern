package bridgePattern;

// Concrete Implementor 01
public class RedCircle implements DrawAPI {

    @Override
    public void drawCircle(double x, double y, double radius) {
        System.out.println("Drawing Circle[ color: green, radius: " + radius + ", x: " + x + ", " + y + "]");
    }
}



