package com.sugi.codesigna;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class IdentifyTheRadicalyoppisiteNumber {

	public static void main(String[] args) {

		System.out.println(solution(12, 10));
	}

	static int solution(int n, int firstNumber) {
		Map<Integer, Integer> map = new LinkedHashMap<>();

		for (int i = 0; i <= n / 2; i++) {
			int num = n / 2;
			map.put(i, num + i);
		}

		if (map.containsKey(firstNumber))
			return map.get(firstNumber);
		else {
			Set<Entry<Integer, Integer>> it = map.entrySet();
			for (Entry<Integer, Integer> entry : it) {
				if (entry.getValue() == firstNumber) {
					return entry.getKey();
				}
			}
		}

		return -1;

	}

}
