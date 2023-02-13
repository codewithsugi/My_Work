package com.sugi.leetcodeDSAGroup;

public class TwoFurthestHousesWithDifferentColors {

	public static void main(String[] args) {
		int[] a = {1,1,1,6,1,1,1};
		int[] a1 = {1,8,3,8,3};
		int[] a2 = {4,4,4,11,4,4,11,4,4,4,4,4};
		System.out.println(maxDistance(a2));

	}

	public static int maxDistance(int[] colors) {
		int i = 0, j = 0;
		int longest = 0;

		while (i < colors.length && j < colors.length) {
			if (colors[i] != colors[j]) {
				if (Math.abs(i - j) > longest) {
					longest = Math.abs(i - j);
				}
				
				j++;

			} else {
				j++;

			}
		}
		
		i= colors.length-1;
		j= colors.length-1;
		while(i >= 0 && j >= 0)
		{
			if (colors[i] != colors[j]) {
				if (Math.abs(i - j) > longest) {
					longest = Math.abs(i - j);
				}
				
				j--;

			} else {
				j--;

			}
		}

		return longest;

	}
	
	
	public static int maxDistanceTwo(int[] colors)
	{
		int longest = 0;

		
		for(int i=0;i<colors.length;i++)
		{
			for(int j=0;j<colors.length;j++)
			{
				if (colors[i] != colors[j]) {
					if (Math.abs(i - j) > longest) {
						longest = Math.abs(i - j);
					}
					
					j++;

				} else {
					j++;

				}
				
			}
		}
		
		return longest;
	}

}
