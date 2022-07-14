package lesson11.Matrix_DZ;


import lesson5.MathOperations;

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
        } else {
            System.out.println("размеры матриц не совпадают");
        }
        return null;
    }

    @Override
    public IMatrix sub(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        if (this.getRows() == otherMatrix.getRows() && this.getColumns() == otherMatrix.getColumns()) {
            Matrix result = new Matrix(this.getRows(), this.getColumns());
            for (int i = 0; i < result.getRows(); i++) {
                for (int j = 0; j < result.getColumns(); j++) {
                    result.setValueAt(i, j, this.getValueAt(i, j) - otherMatrix.getValueAt(i, j));
                }
            }
            return result;
        } else {
            System.out.println("размеры матриц не совпадают");
        }
        return null;
    }

    @Override
    public IMatrix mul(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        if (this.getRows() == otherMatrix.getColumns() && this.getColumns() == otherMatrix.getRows()) {
            Matrix result = new Matrix(this.getRows(), this.getColumns());
            for (int i = 0; i < result.getRows(); i++) {
                for (int j = 0; j < result.getColumns(); j++) {
                    result.setValueAt(i, j, this.getValueAt(i, j) * otherMatrix.getValueAt(i, j));
                }
            }
            return result;
        } else {
            System.out.println("при умножении одной матрицы на другую, длина одной должна быть равна высоте другой");
        }
        return null;
    }

    @Override
    public IMatrix mul(double value) {
        Matrix result = new Matrix(this.getRows(), this.getColumns());
        for (int i = 0; i < result.getRows(); i++) {
            for (int j = 0; j < result.getColumns(); j++) {
                result.setValueAt(i, j, this.getValueAt(i, j) * value);
            }
        }
        return result;
    }

    @Override
    public IMatrix transpose() {
        Matrix result = new Matrix(this.getColumns(), this.getRows());
        for (int i = 0; i < result.getRows(); i++) {
            for (int j = 0; j < result.getColumns(); j++) {
                result.setValueAt(i, j, this.getValueAt(j, i));
            }
        }
        return result;
    }

    @Override
    public void fillMatrix(double value) {
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                this.setValueAt(i, j, value);
                System.out.print(this.matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public double[][] generateSubArray(double matrix[][], int columns, int j1) {
        double[][] m = new double[getColumns() - 1][];
        for (int i = 0; i < (getColumns() - 1); i++)
            m[i] = new double[getColumns() - 1];

        for (int i = 1; i < getColumns(); i++) {
            int j2 = 0;
            for (int j = 0; j < getColumns(); j++) {
                if (j == j1)
                    continue;
                m[i - 1][j2] = this.matrix[i][j];
                j2++;
            }
        }
        return m;
    }

    private Matrix minorMatrix(int colIndex, Matrix matrix) {
        int size = matrix.getRows();
        double[][] tmpArray = new double[size - 1][size - 1];
        for (int i = 1; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j < colIndex) {
                    tmpArray[i - 1][j] = matrix.getValueAt(i, j);
                } else if (j != colIndex) {
                    tmpArray[i - 1][j - 1] = matrix.getValueAt(i, j);
                }
            }
        }
        return new Matrix(tmpArray);
    }

    @Override
    public double determinant() {
        double determinant = 0;
        if (isSquareMatrix()) {
            if (this.getRows() == 1) {
                determinant = this.matrix[0][0];
            }
            if (this.getRows() == 2) {
                determinant = this.matrix[0][0] * this.matrix[1][1] - this.matrix[1][0] * this.matrix[0][1];
            } else {
                for (int i = 0; i < getColumns(); i++) {
                    double val = getValueAt(0, i);
                    Matrix minor = minorMatrix(i, this);
                    double det = minor.determinant();
                    if (i % 2 == 0) {
                        determinant += val * det;
                    } else {
                        determinant -= val * det;
                    }
                }
            }
        } else {
            System.out.println("матрица не квадратная");
        }
        return determinant;
    }

    @Override
    public boolean isNullMatrix() {
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                if (this.matrix[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public boolean isIdentityMatrix() {
        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                if ((i == j && this.matrix[i][j] != 1) || (i != j && this.matrix[i][j] != 0)) {
                    return false;
                } else {
                    return true;
                }
            }
        }
        return true;
    }

    @Override
    public boolean isSquareMatrix() {
        if (this.matrix.length == this.matrix[0].length) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void printToConsole() {
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}