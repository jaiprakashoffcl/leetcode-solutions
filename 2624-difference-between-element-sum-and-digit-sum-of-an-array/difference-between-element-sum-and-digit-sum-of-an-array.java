class Solution {
    public int differenceOfSum(int[] nums) {
        int elementsum =0;
        int digitsum =0;

        for(int i=0;i<nums.length;i++){
            elementsum = elementsum+nums[i];
            
            int n = nums[i]; 

            while(n>0){
                int x = n%10;
                digitsum += x;
                n /= 10;
            }
        }
        return  Math.abs(elementsum - digitsum);
    }
}