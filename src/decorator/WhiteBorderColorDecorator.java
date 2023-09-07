package decorator;

public class WhiteBorderColorDecorator extends ShapeDecorator {
    public WhiteBorderColorDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        super.draw();
        setWhiteBorder(shape);
    }

    private void setWhiteBorder(Shape shape) {
        System.out.println("Border color: White");
    }

}
