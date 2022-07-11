package lesson11.Matrix_DZ;

import lesson11.Person;

public class Matrix implements IMatrix {
    private double[][] matrix;

    public Matrix() {
        matrix = new double[IMatrix.DEFAULT_MATRIX_SIZE][IMatrix.DEFAULT_MATRIX_SIZE];
    }

    public Matrix(int rows, int columns) {
        matrix = new double[rows][columns];
    }

    public Matrix(double[][] matrix) {
        this.matrix = matrix;
    }


    @Override
    public int getRows() {

        return matrix.length;
    }

    @Override
    public int getColumns() {

        return matrix[0].length;
    }

    @Override
    public double getValueAt(int rowIndex, int colIndex) throws IndexOutOfBoundsException {
        if (rowIndex < 0 || rowIndex >= matrix.length) {
            System.out.println("неверный индекс строки");
            return -1; // -1 просто потому, что нужно что-то вернуть
        }
        if (colIndex < 0 || colIndex >= matrix.length) {
            System.out.println("неверный индекс колонки");
            return -1; // -1 просто потому, что нужно что-то вернуть
        }
        return matrix[rowIndex][colIndex];
    }

    @Override
    public void setValueAt(int rowIndex, int colIndex, double value) throws IndexOutOfBoundsException {
        if (rowIndex < 0 || rowIndex >= matrix.length) {
            System.out.println("неверный индекс строки");
            return;
        }
        if (colIndex < 0 || colIndex >= matrix.length) {
            System.out.println("неверный индекс колонки");
            return;
        }
        matrix[rowIndex][colIndex] = value;
    }


    @Override
    public IMatrix add(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        //a - неявный параметр (внутри метода будет this)
        //b - явный - будет как otherMatrix
        if (this.getRows() == otherMatrix.getRows() && this.getColumns() == otherMatrix.getColumns()) {
            Matrix result = new Matrix(this.getRows(), this.getColumns());
            for (int i = 0; i < result.getRows(); i++) {
            for (int j = 0; j < result.getColumns(); j++) {
                result.setValueAt(i, j, this.getValueAt(i, j) + otherMatrix.getValueAt(i, j));
            }
        }
        return result;
    }
        else {
            System.out.println("размеры матриц не совпадают");
        }

    @Override
    public Matrix[][] sub(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        Matrix[][] m = new Matrix[this.rows - otherMatrix.getRows()][this.columns - otherMatrix.getColumns()];
        return m;
    }

    @Override
    public Matrix[][] mul(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        Matrix[][] m = new Matrix[this.rows * otherMatrix.getRows()][this.columns * otherMatrix.getColumns()];
        return m;
    }

    @Override
    public Matrix[][] mul(double value) {
        Matrix[][] m = new Matrix[(int) (this.rows * value)][(int) (this.columns * value)];
        return m;
    }

    @Override
    public double transpose() {
        return matrix[getRows() / this.getRows()][getColumns() / this.getColumns()];
    }

    @Override
    public void fillMatrix(double value) {
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[i].length; j++) {
                matrix[i][j] = value;
            }
        }
    }

    @Override
    public double determinant() {
        return 0;
    }

    @Override
    public boolean isNullMatrix() {
        boolean x = true;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] != 0) {
                    x = false;
                }
            }
        }
        return x;
    }

    @Override
    public boolean isIdentityMatrix() {
        boolean x = true;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if ((i == j && (matrix[i][j] != 1)) || (i != j && (matrix[i][j] != 0))) {
                    x = false;
                }
            }
        }
        return x;
    }

    @Override
    public boolean isSquareMatrix() {
        boolean x = false;
        if (getColumns() == getRows()) {
            x = true;
        }
        return x;
    }

    @Override
    public void printToConsole() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}