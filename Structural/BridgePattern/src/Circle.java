public class Circle extends Shape {
    public Circle(Color color) {
        super(color);
    }

    @Override
    void draw() {
        System.out.print("Circle drawn in ");
        color.applyColor();
    }
}
