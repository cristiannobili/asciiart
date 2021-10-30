public class Circle extends Shape{

    public Circle(int rows) {
        this.rows = rows;
    }

    @Override
    protected Shape.Row generateRow(int row) {
        double angle = Math.asin(1-(row/(this.rows/2)));
        int stars = (int)(this.rows/2 * Math.cos(angle)) * 2;
        int spaces = this.rows/2-stars/2;
        return new Row(spaces, stars);
    }

    public static void main(String... args) {
        Circle shape = new Circle(20);
        shape.render();
    }
    
}
