package com.sugi.test;

public class PrimeNumber {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			primeNumber(i);
		}

	}

	public static void primeNumber(int num) {
		int count = 0;

		if (num > 1) {
			for (int i = 1; i <= num; i++) {
				if (num % i == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println("Prime Number " + num);
			} else
				System.out.println("Not Prime Number "+num);
		}
		else
			System.out.println("Not Prime Number " + num);

	}
}
