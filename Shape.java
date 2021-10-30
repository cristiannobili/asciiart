public abstract class Shape {
    protected int rows;

    protected class Row {
        public int spaces;
        public int stars;

        public Row(int spaces, int stars) {
            this.spaces = spaces;
            this.stars = stars;
        }
    }

    protected abstract Row generateRow(int rowNumber);

    protected void renderRow(Row row) {
        for (int i=0; i<row.spaces; i++) {
            System.out.print(" ");
        }
        for (int i=0; i<row.stars; i++) {
            System.out.print("* ");
        }
        System.out.print("\n");
    }

    public void render() {
        for (int i = 0; i< this.rows; i++) {
            Row row = this.generateRow(i);
            this.renderRow(row);
        }
    }

}