public class Matrix {

    private Integer[][] matrix;
    private Integer sizeX;
    private Integer sizeY;

    public Matrix(Integer[][] matrix, Integer sizeX, Integer sizeY) {
        this.matrix = matrix;
        this.sizeX = sizeX;
        this.sizeY = sizeY;
    }

    public void print() {
        for (Integer[] row : matrix) {
            for (Integer element : row) {
                System.out.format("%6d ", element);
            }
            System.out.println();
        }
    }

    public Matrix add(final Matrix m2) {
        Integer[][] new_m = new Integer[this.getSizeX()][this.getSizeY()];

        for (int i = 0; i < this.getSizeY(); i++) {
            for (int j = 0; j < this.getSizeY(); j++) {
                new_m[i][j] = this.getValues()[i][j] + m2.getValues()[i][j];
            }
        }
        return new Matrix(new_m, this.getSizeX(), this.getSizeY());
    }

    public Matrix sub(final Matrix m2) {
        Integer[][] new_m = new Integer[this.getSizeX()][this.getSizeY()];

        for (int i = 0; i < this.getSizeY(); i++) {
            for (int j = 0; j < this.getSizeY(); j++) {
                new_m[i][j] = this.getValues()[i][j] - m2.getValues()[i][j];
            }
        }
        return new Matrix(new_m, this.getSizeX(), this.getSizeY());
    }

    public Matrix mul(final Matrix m2) {
        Integer[][] new_m = new Integer[this.getSizeX()][this.getSizeY()];

        int m = this.getSizeY();
        int n = m2.getSizeX();
        int o = m2.getSizeX();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < o; k++) {
                    if (k == 0) {
                        new_m[i][j] = this.getValues()[i][k] * m2.getValues()[k][j];
                    } else {
                        new_m[i][j] += this.getValues()[i][k] * m2.getValues()[k][j];
                    }
                }
            }
        }

        return new Matrix(new_m, this.getSizeX(), this.getSizeY());
    }

    public Matrix mul(final Integer num) {
        Integer[][] new_m = new Integer[this.getSizeX()][this.getSizeY()];

        for (int i = 0; i < this.getSizeY(); i++) {
            for (int j = 0; j < this.getSizeY(); j++) {
                new_m[i][j] = this.getValues()[i][j] * num;
            }
        }

        return new Matrix(new_m, this.getSizeX(), this.getSizeY());
    }

    public Matrix add(final Integer num) {
        Integer[][] new_m = new Integer[this.getSizeX()][this.getSizeY()];

        for (int i = 0; i < this.getSizeY(); i++) {
            for (int j = 0; j < this.getSizeY(); j++) {
                new_m[i][j] = this.getValues()[i][j] + num;
            }
        }

        return new Matrix(new_m, this.getSizeX(), this.getSizeY());
    }

    public Matrix sub(final Integer num) {
        Integer[][] new_m = new Integer[this.getSizeX()][this.getSizeY()];

        for (int i = 0; i < this.getSizeY(); i++) {
            for (int j = 0; j < this.getSizeY(); j++) {
                new_m[i][j] = this.getValues()[i][j] - num;
            }
        }

        return new Matrix(new_m, this.getSizeX(), this.getSizeY());
    }

    public Integer[][] getValues() {
        return this.matrix;
    }

    public Integer getSizeX() {
        return sizeX;
    }

    public Integer getSizeY() {
        return sizeY;
    }
}
