package Skill2;
import java.util.*;
public class bubble_sort {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter number of elements: ");
	int n = sc.nextInt();

	int[] arr = new int[n];
	System.out.println("Enter elements:");
	for (int i = 0; i < n; i++) {
	arr[i] = sc.nextInt();
	}
	for (int i = 0; i < n-1; i++) {
		for (int j = 0; j < n-1-i; j++) {
			if (arr[j] > arr[j+1]) {
				int tmp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = tmp;
				}
	        }
	    }
	System.out.println("Sorted array:");
	for (int v : arr) {
		System.out.print(v + " ");
		}
	}
}