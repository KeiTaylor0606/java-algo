package DynamicPrograming;

/*Given a fence with n posts and k colors, find out the number of ways of painting the fence such that at most 2 adjacent posts have the same color. Since answer can be large return it modulo 10^9 + 7.*/
//https://www.geeksforgeeks.org/painting-fence-algorithm/

import java.util.*;

public class PaintingFenceAlgorithm {
	
	static long countWays(int n, int k) {
		long dp[] = new long[n + 1];
		Arrays.fill(dp, 0);
		int mod = 1000000007;
		
		dp[1] = k;
		
		int same = 0, diff = k;
		
		for(int i = 2; i <= n; i++) {
			same = diff;
			
			diff = (int)(dp[i - 1]*(k - 1));
			diff = diff%mod;
			
			dp[i] = (same + diff)%mod;
		}
		
		return dp[n];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		System.out.println(countWays(n, k));
	}

}
