public class Rectangle extends Shape {
    public Rectangle(Color color) {
        super(color);
    }

    @Override
    void draw() {
        System.out.print("Rectangle drawn in ");
        color.applyColor();
    }
}
