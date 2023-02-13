package com.sugi.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Leet1_Morse {

	public static void main(String[] args) {

		String[] test = { "gin", "zen", "gig", "msg" };

		//System.out.println(new LeetCodeTest1().uniqueMorseRepresentations(test));

		/*
		 * Set<String> newUnique = new HashSet<String>();
		 * 
		 * newUnique.add("a"); newUnique.add("b"); newUnique.add("a");
		 * 
		 * System.out.println(newUnique.size());
		 * 
		 * System.out.println(newUnique);
		 */
		
		System.out.println(new Leet1_Morse().anotherSol(test));
	}

	public int uniqueMorseRepresentations(String[] words) {

		List<String> newUniqueMorse = new ArrayList<String>();

		Set<String> finalUnique = new HashSet<String>();

		String[] alphabet = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
				"s", "t", "u", "v", "w", "x", "y", "z" };

		String[] morses = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
				"-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };

		Map<String, String> map = new HashMap();

		for (int i = 0; i < alphabet.length; i++)
			map.put(alphabet[i], morses[i]);

		for (String word : words) {
			String newWord = "";
			for (int i = 0; i < word.length(); i++) {
				for (Map.Entry mapEle : map.entrySet()) {
					if ((String.valueOf(word.charAt(i))).equalsIgnoreCase(mapEle.getKey().toString())) {
						System.out.println("current string :: " + (String.valueOf(word.charAt(i))));
						newWord = newWord + mapEle.getValue().toString();
						break;
					}
				}
			}

			newUniqueMorse.add(newWord);

		}
		System.out.println(newUniqueMorse);
		for (String a : newUniqueMorse)
			finalUnique.add(a);
		System.out.println("final :: "+finalUnique);
		return finalUnique.size();

	}
	
	public int anotherSol(String[] words)
	{
		if (words == null || words.length <= 1) {
            return words.length;
        }

        String[] morseCodes = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        Set<String> repSet = new HashSet();
        for (String word : words) {
            StringBuilder sb = new StringBuilder();
            for (char ch : word.toCharArray()) {
            	System.out.println(morseCodes[ch - 'a']);
            	System.out.println(morseCodes[ch - 'a']);
                sb.append(morseCodes[ch - 'a']);
            }

            repSet.add(sb.toString());
        }

        return repSet.size();
    }
}

