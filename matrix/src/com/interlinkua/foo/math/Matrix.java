package com.interlinkua.foo.math;

public class Matrix {

    public double[][] matrix;

    public Matrix(int rows, int columns) {
        matrix = new double[rows][columns];
    }

    public int getRows() {

        return Matrix.this.matrix.length;
    }

    public int getColumns() {

        return Matrix.this.matrix[0].length;
    }

    public double getValue(int row, int column) {

        return matrix[row][column];
    }

    public void setValue(int row, int column, double value) {
        matrix[row][column] = value;
    }

    @Override
    public String toString() {
        String result = "";
        for(int i = 0; i < matrix.length; i++, System.out.println()) {
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%6.1f", matrix[i][j]);
            }
        }

        return result;
    }
}
