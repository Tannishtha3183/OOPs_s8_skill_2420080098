package Skill2;
import java.util.*;
public class Transpose_matrix {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of rows: ");
		int rows = sc.nextInt();
		System.out.print("Enter number of columns: ");
		int cols = sc.nextInt();
		
		int[][] matrix = new int[rows][cols];
		System.out.println("Enter matrix elements:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.printf("Element [%d][%d]: ", i, j);
				matrix[i][j] = sc.nextInt();
				}
			}

		int[][] transpose = new int[cols][rows];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				transpose[j][i] = matrix[i][j];
				}
			}

		System.out.println("\nOriginal Matrix:");
		printMatrix(matrix);

		System.out.println("\nTransposed Matrix:");
		printMatrix(transpose);

		        sc.close();
		    }

	private static void printMatrix(int[][] mat) {
		for (int[] row : mat) {
			for (int val : row) {
				System.out.printf("%4d", val);
				}
			System.out.println();
			}
		}
	}
		
	
	

