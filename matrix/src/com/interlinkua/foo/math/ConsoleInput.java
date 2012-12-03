package com.interlinkua.foo.math;

import java.util.Scanner;


public class ConsoleInput {

    private static Scanner in = new Scanner(System.in);

    public static Matrix read() {

        System.out.println("Type number of Rows and columns");
        Matrix result = new Matrix (in.nextInt(), in.nextInt());

        System.out.println("Please enter digits");
        for (int i = 0; i < result.matrix.length; i++) {
            for (int j = 0; j < result.matrix[i].length; j++)
                result.setValue(i, j, in.nextDouble());
            }

        return result;
    }
}
