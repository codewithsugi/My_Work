package com.sugi.codesigna;

public class KillKthBit {

	public static void main(String[] args) {
		System.out.println(solutionTest(37, 3));
	}

	static int solutionTest(int n, int k) {
		StringBuilder binary = new StringBuilder();
		while (n > 0) {
			binary.append(n % 2);
			n = n / 2;
		}

		System.out.println(binary.reverse());
		
		binary.replace(k, k+1, "0");
		System.out.println(binary);
		int sum=0;
		int j=0;
		for (int i = binary.length() - 1; i >= 0; i--) {
			
			int got = Integer.parseInt(String.valueOf(binary.charAt(i))) * (int)Math.pow(2, j);
			System.out.println(got);
			sum = sum + got;
			j++;
		}
		return sum;
	}

}
