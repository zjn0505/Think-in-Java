package ch03_Control;

import static java.lang.Math.*;

public class E04_FindPrimes2 {
	public static void main(String[] args){
		int max = 100;
		if(args.length != 0){
			max = Integer.parseInt(args[0]);
		}
		boolean[] sieve = new boolean[max + 1];//false by default
		int limit = (int)floor(sqrt(max));
		System.out.print(1 + " ");
		if (max > 1) {
			System.out.print(2 + " ");
		}
		for (int i = 3; i < limit; i += 2) {
			if (!sieve[i]) {
				for (int j = i * i; j < max; j += i) {
					sieve[j] = true;
				}
			}
		}
		for (int i = 3; i < max; i += 2) {
			if (!sieve[i]) {
				System.out.print(i + " ");
			}
		}
		
	}
}
