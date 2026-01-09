class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int n : nums) {
            if (set.contains(n)) {
                return n; // duplicate found
            }
            set.add(n);
        }
        return -1;
    }
}