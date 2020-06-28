package leetcode983;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] days = {1,4,6,7,8,9,20};
		
		int[] costs = {2,7,15};
		
		System.out.println("days: " + Arrays.toString(days));
		
		System.out.println("costs: " + Arrays.toString(costs));
		
		FindMinCostForTickets solution = new FindMinCostForTickets();
		
		System.out.println("Solution: " + solution.mincostTickets(days, costs));
	}
}
