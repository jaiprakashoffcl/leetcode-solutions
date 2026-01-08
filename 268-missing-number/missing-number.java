class Solution {
    public int missingNumber(int[] nums) {
        int actualsum =0;
        for(int i=0;i<nums.length;i++){
            actualsum += nums[i];
        }
        int expectedsum=0;
        for(int i=1;i<nums.length+1;i++){   //[1,n]
            expectedsum += i;
        }
        return expectedsum-actualsum;
    }
}