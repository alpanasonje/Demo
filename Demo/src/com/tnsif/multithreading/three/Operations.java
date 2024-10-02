package com.tnsif.multithreading.three;

public class Operations {
	public static int  getMaxAge(int[] ages)
	{
		int maxAge=ages[0];
		for(int i=1;i<ages.length;i++)
		{
			if (ages[i]>maxAge)
				maxAge=ages[i];
		}
		return maxAge;
	}
	
	public static int  getMinAge(int[] ages)
	{
		int minAge=ages[0];
		for(int i=1;i<ages.length;i++)
		{
			if (ages[i]<minAge)
				minAge=ages[i];
		}
		return minAge;
	}
}
