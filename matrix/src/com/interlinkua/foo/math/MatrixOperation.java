package com.interlinkua.foo.math;

public class MatrixOperation {

    public static Matrix multiply(Matrix first, Matrix second) {

        Matrix result = new Matrix(first.getRows(), second.getColumns());

        if (first.matrix.length != second.matrix[0].length) {
            throw new RuntimeException("The number of rows in first " +
                    "matrix must be the same as a  number of columns in second matrix");
        }

        for (int i = 0; i < first.matrix.length; i++)
            for (int k = 0; k < second.matrix.length; k++)
                for (int j = 0; j < second.matrix[k].length; j++)
                    result.setValue(i, k, (result.getValue(i, k) + first.getValue(i, j) * second.getValue(k, j)));

        return result;
    }
}
