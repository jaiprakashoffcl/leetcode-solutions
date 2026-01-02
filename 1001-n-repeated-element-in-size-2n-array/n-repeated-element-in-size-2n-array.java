class Solution {
    public int repeatedNTimes(int[] nums) {
        HashSet<Integer> num = new HashSet<>();

        for(int n:nums){
            if(!num.add(n)){
                return n;
            }
        }
        return -1;
    }
}