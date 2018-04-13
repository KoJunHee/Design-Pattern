package ass5_3;

public abstract class Shape {
    protected Color color;
    protected Shape(Color color) {
        this.color = color;
    }
    public abstract void applyColor();
}


