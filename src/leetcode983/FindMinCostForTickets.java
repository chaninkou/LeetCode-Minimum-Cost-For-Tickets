package leetcode983;

public class FindMinCostForTickets {
	public int mincostTickets(int[] days, int[] costs) {
        int lastDay = days[days.length - 1];
        
        int[] dp = new int[lastDay + 1];
        
        boolean[] markedVisit = new boolean[lastDay + 1];
        
        // Mark any day as visited
        for(int day : days){
        	markedVisit[day] = true;
        }
        
        // No need to do 365 days
        for(int day = 1; day < dp.length; day++){
        	// Skip if not traveling that day
            if(!markedVisit[day]){
                dp[day] = dp[day - 1];
                continue;
            }
            
            // Three conditions
            // Check for 1 day...
            dp[day] = costs[0] + dp[day - 1];
            // Check for 7 day...
            dp[day] = Math.min(costs[1] + dp[Math.max(day - 7, 0)], dp[day]);
            // Check for 30 day..
            dp[day] = Math.min(costs[2] + dp[Math.max(day - 30, 0)],dp[day]);
        }
        
        
        return dp[lastDay];
    }
}
