package biWeeklyContest67.problem4;

class Solution {
    public long subArrayRanges(int[] nums) {
        long res = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j > i; j--) {
                int l = i, r = j;
                int mn = Integer.MAX_VALUE, mx = Integer.MIN_VALUE;
                for (int k = l; k <= r; k++) {
                    mn = Math.min(mn, nums[k]);
                    mx = Math.max(mx, nums[k]);
                }
                res += mx - mn;
            }
        }
        return res;
    }
}