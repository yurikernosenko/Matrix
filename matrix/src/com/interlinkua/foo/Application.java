package com.interlinkua.foo;

import com.interlinkua.foo.math.ConsoleInput;
import com.interlinkua.foo.math.Matrix;
import com.interlinkua.foo.math.MatrixOperation;


public class Application {

    public static void main(String[] args) {

        Matrix matrixA = ConsoleInput.read();
        Matrix matrixB = ConsoleInput.read();

        try {
            System.out.println(MatrixOperation.multiply(matrixA, matrixB));
        }
        catch (RuntimeException e) {
             System.out.println(e.getMessage());
        }
    }
}
