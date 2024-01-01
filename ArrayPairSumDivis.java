class Solution {
    public boolean canPair(int[] nums, int k) {
        if (nums.length % 2 != 0)
            return false;
 
        int freq[] = new int[k];
        for (int num : nums) {
            int rem = num % k;
            if (freq[(k - rem) % k] != 0)
                freq[(k - rem) % k]--;
            else
                freq[rem]++;
        }
        for (int i : freq) {
            if (i != 0)
                return false;
        }
        return true;
    }
}
