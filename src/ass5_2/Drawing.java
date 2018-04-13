package ass5_2;

import java.util.ArrayList;
import java.util.List;

//composite class
public class Drawing implements Shape {

    private List<Shape> shapes = new ArrayList<Shape>();

    public Drawing() {
    }

    @Override
    public void draw(String color) {
        for(Shape shape : shapes){
            shape.draw(color);
        }

    }

    public void add(Shape shape) {
        shapes.add(shape);
    }

    //ArrayList에서 맨 처음 발견되는 특정 개체를 제거합니다.
    public void remove(Shape shape) {
        shapes.remove(shape);

    }

    public void clear() {
        shapes.clear();
        System.out.println("Clearing all the shapes from drawing");
    }

}



