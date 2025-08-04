package Skill2;
import java.util.*;
public class reverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of elements: ");
	    int n = sc.nextInt();

	    int[] arr = new int[n];
	    System.out.println("Enter elements:");
	    for (int i = 0; i < n; i++) {
	    	arr[i] = sc.nextInt();
	        }
	        for (int i = 0; i < n/2; i++) {
	            int tmp = arr[i];
	            arr[i] = arr[n - 1 - i];
	            arr[n - 1 - i] = tmp;
	        }
	        System.out.println("Reversed array:");
	        for (int v : arr) {
	            System.out.print(v + " ");
	        }
	    }
	}