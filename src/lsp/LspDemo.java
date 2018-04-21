package lsp;

public class LspDemo {

    private static Rectangle getRectangle(){
        //it can be an object returned by some factory
        return new Square();
    }
    public static void main(String[] args) {
        Rectangle rectangle = LspDemo.getRectangle();

        rectangle.setWidth(5);
        rectangle.setHeight(10);

        System.out.println(rectangle.getArea());
    }
}


