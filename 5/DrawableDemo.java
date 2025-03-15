interface Drawable {
    void draw();
}

class Circle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

class Rectangle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}

public class DrawableDemo {
    public static void main(String[] args) {
        Drawable[] shapes = new Drawable[2];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();

        for (Drawable shape : shapes) {
            shape.draw();  
        }
    }
}
