package Skill2;
import java.util.*;
public class multi_matrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of rows in first matrix: ");
	    int rowsA = sc.nextInt();
	    System.out.print("Enter number of columns in first matrix: ");
	    int colsA = sc.nextInt();
	    
	    System.out.print("Enter number of columns in second matrix: ");
	    int colsB = sc.nextInt();
	    
	    int[][] matrixA = new int[rowsA][colsA];
	    int[][] matrixB = new int[colsA][colsB];
	    int[][] product = new int[rowsA][colsB];
	        
	    System.out.println("Enter elements of first matrix:");
	    for (int i = 0; i < rowsA; i++) {
	    	for (int j = 0; j < colsA; j++) {
	    		matrixA[i][j] = sc.nextInt();
	    		}
	    	}
	    
	    System.out.println("Enter elements of second matrix:");
	    for (int i = 0; i < colsA; i++) {
	    	for (int j = 0; j < colsB; j++) {
	    		matrixB[i][j] = sc.nextInt();
	    		}
	        }
	    for (int i = 0; i < rowsA; i++) {
	    	for (int j = 0; j < colsB; j++) {
	    		for (int k = 0; k < colsA; k++) {
	    			product[i][j] += matrixA[i][k] * matrixB[k][j];
	    			}
	            }
	        }
	    
	    System.out.println("Product of the two matrices:");
	    for (int i = 0; i < rowsA; i++) {
	    	for (int j = 0; j < colsB; j++) {
	    		System.out.print(product[i][j] + " ");
	    		}
	    	System.out.println();
	    	}
	    
	}
}
