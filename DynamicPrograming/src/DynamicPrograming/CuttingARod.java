package DynamicPrograming;

import java.util.Scanner;

public class CuttingARod {
	
	static int cutRod(int price[], int n) {
		if(n <= 0) {
			return 0;
		}
		
		int max_val = Integer.MIN_VALUE;
		
		for(int i = 0; i < n; i++) {
			max_val = Math.max(max_val, price[i] + cutRod(price, n - i - 1));
		}
		
		return max_val;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Maximum Obtainable Value is " + cutRod(a, n));
		
	}
}
