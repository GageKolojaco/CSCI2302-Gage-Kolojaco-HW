package Chapter08;

import java.util.Scanner;

public class Exercise8_2 {
    public static void main(String[] args) {
		double[][] matrix = getMatrix();

		System.out.println("Sum of the elements in the major diagonal is " + 
			sumMajorDiagonal(matrix));
	}
	public static double[][] getMatrix() {
		try (Scanner input = new Scanner(System.in)) {
            final int ROWS = 4;
            final int COLUMNS = 4;
            double[][] m = new double[ROWS][COLUMNS];

            System.out.println("Enter a 4-by-4 matrix row by row:");
            for (int row = 0; row < ROWS; row++) {
            	for (int col = 0; col < COLUMNS; col++) {
            		m[row][col] = input.nextDouble(); 
            	}
            }
            return m;
        }
	}
	public static double sumMajorDiagonal(double[][] m) {
		double sum = 0;
		for (int i = 0; i < m.length; i++) {
			sum += m[i][i];
		}
		return sum;
	}
}
