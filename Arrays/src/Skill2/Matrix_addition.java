package Skill2;
import java.util.*;
public class Matrix_addition {
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	       
	System.out.print("Enter the number of rows: ");
	int rows = sc.nextInt();
	System.out.print("Enter the number of columns: ");
	int cols = sc.nextInt();       
	int[][] matrixA = new int[rows][cols];
	int[][] matrixB = new int[rows][cols];
	int[][] sum = new int[rows][cols];       
	System.out.println("Enter elements of first matrix:");
	for (int i = 0; i < rows; i++) {
		
		for (int j = 0; j < cols; j++) {
			matrixA[i][j] = sc.nextInt();
			}
		}
	
	System.out.println("Enter elements of second matrix:");
	for (int i = 0; i < rows; i++) {
		for (int j = 0; j < cols; j++) {
			matrixB[i][j] = sc.nextInt();
			}
		}

	for (int i = 0; i < rows; i++) {
		for (int j = 0; j < cols; j++) {
			sum[i][j] = matrixA[i][j] + matrixB[i][j];
			}
		}
	
	System.out.println("Sum of the two matrices:");
	for (int i = 0; i < rows; i++) {
		for (int j = 0; j < cols; j++) {
			System.out.print(sum[i][j] + " ");
			}
		System.out.println();
		
		}

	}


}
