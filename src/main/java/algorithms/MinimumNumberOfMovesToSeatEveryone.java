package algorithms;

// 2037. Minimum Number of Moves to Seat Everyone: https://leetcode.com/problems/minimum-number-of-moves-to-seat-everyone
public class MinimumNumberOfMovesToSeatEveryone {
    public static int minMovesToSeat(int[] seats, int[] students) {
        var pos = new int[101];
        int n = seats.length;
        for (int i = 0; i < n; i++) {
            pos[seats[i]]++;
            pos[students[i]]--;
        }
        var ans = 0;
        int cur = 0;
        for (int num : pos) {
            ans += Math.abs(cur);
            cur += num;
        }
        return ans;
    }
}
