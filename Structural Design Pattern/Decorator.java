interface Widget {
    void draw();
}

class TextField implements Widget {
    private int width, height;

    public TextField(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public void draw() {
        System.out.println("TextField: " + width + ", " + height);
    }
}

abstract class Decorator implements Widget {
    // Composition
    private Widget widget;

    public Decorator(Widget widget) {
        this.widget = widget;
    }

    // Delegation
    public void draw() {
        widget.draw();
    }
}

class BorderDecorator extends Decorator {
    public BorderDecorator(Widget widget) {
        super(widget);
    }
    public void draw() {
        // 7. Delegate to base class and add extra stuff
        super.draw();
        System.out.println("  BorderDecorator");
    }
}

class ScrollDecorator extends Decorator {
    public ScrollDecorator(Widget widget) {
        super(widget);
    }
    public void draw() {
        super.draw(); // 7. Delegate to base class and add extra stuff
        System.out.println("  ScrollDecorator");
    }
}

public class Client {
    public static void main(String[] args) {
        // 8. Client has the responsibility to compose desired configurations
        Widget widget = new BorderDecorator(new ScrollDecorator(new TextField(80, 24)));
        widget.draw();
    }
}