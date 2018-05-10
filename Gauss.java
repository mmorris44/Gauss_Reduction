import java.util.*;

public class Gauss {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(); s.nextLine();
		double[][] matrix = new double[n][n + 1];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= n; j++) {
				matrix[i][j] = 0.0 + s.nextDouble();
			}
			s.nextLine();
		}
		print(matrix); System.out.println();

		for (int column = 0; column < n; column++) {
			// Set pivot to 1
			double fact = 1.0 / matrix[column][column];
			for (int i = 0; i < n + 1; i++) {
				matrix[column][i] = fact * matrix[column][i];
			}

			for (int row = 0; row < n; row++) {
				if (row == column) {
					continue;
				}

				double factor = (0.0 - matrix[row][column]);
				for (int i = 0; i < n + 1; i++) {
					matrix[row][i] = matrix[row][i] + factor * matrix[column][i];
				}
			}

			System.out.println(); print(matrix); System.out.println();
		}
	}
	
	public static void print (double[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length - 1; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.print("    " + matrix[i][matrix[i].length - 1]);
			System.out.println();
		}
	}

}
