package Skill2;
import java.util.*;
public class sum_avg_array {
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("enter no : ");
		int a=sc.nextInt();
        int[] arr=new int[a];
		int sum = 0;
        System.out.println("Enter elements:");
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        double avg = (double) sum / a;
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + avg);
	}

}
