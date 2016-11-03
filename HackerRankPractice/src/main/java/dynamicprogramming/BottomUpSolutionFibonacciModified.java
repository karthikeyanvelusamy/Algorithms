package dynamicprogramming;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BottomUpSolutionFibonacciModified {

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		String[] data = reader.readLine().split(" ");
		int n = Integer.parseInt(data[2]);

		BigInteger[] pastSolutions = new BigInteger[n];

		pastSolutions[0] = new BigInteger(data[0]);
		pastSolutions[1] = new BigInteger(data[1]);

		for (int i = 2; i < n; i++) {
			pastSolutions[i] = pastSolutions[i - 2].add(pastSolutions[i - 1]
					.multiply(pastSolutions[i - 1]));
		}

		System.out.println(pastSolutions[n - 1]);

	}
}
