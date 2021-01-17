package DynamicPrograming;

/*Given three numbers n, r and p, compute value of nCr mod p.*/

import java.io.*;
import java.util.*;
import java.math.*;

public class Compute_nCr_modP {
	
	static int nCrModp(int n, int r, int p) {
		if(r > n - r) {
			r = n - r;
		}
		
		int C[] = new int[r + 1];
		
		C[0] = 1;
		
		for(int i = 1; i <= n; i++) {
			for(int j = Math.min(i, r); j > 0; j--) {
				C[j] = (C[j] + C[j - 1])%p;
			}
		}
		return C[r];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = sc.nextInt();
		int p = sc.nextInt();
		
		System.out.println(nCrModp(n, r, p));
	}

}
