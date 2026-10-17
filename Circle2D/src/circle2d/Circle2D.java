
package circle2d;



public class Circle2D {
    private double x;
    private double y;
    private double radius;

    public Circle2D() {
        x = 0;
        y = 0;
        radius = 1;
    }

    public Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public boolean contains(double x, double y) {
        double uzaklik = Math.sqrt(
            Math.pow(this.x - x, 2) +
            Math.pow(this.y - y, 2)
        );

        return uzaklik <= radius;
    }

    public boolean contains(Circle2D circle) {
        double uzaklik = Math.sqrt(
            Math.pow(x - circle.x, 2) +
            Math.pow(y - circle.y, 2)
        );

        return uzaklik + circle.radius <= radius;
    }

    public boolean overlaps(Circle2D circle) {
        double uzaklik = Math.sqrt(
            Math.pow(x - circle.x, 2) +
            Math.pow(y - circle.y, 2)
        );

        return uzaklik <= radius + circle.radius
                && uzaklik + Math.min(radius, circle.radius)
                > Math.max(radius, circle.radius);
    }
}

