class Solution {
    public int signFunc(int x){
        int y=0;
            if(x>0){
                y=1;
            }
            if(x==0){
                y=0;
            }
            if(x<0){
                y=-1;
            }
            return y;
        }
    public int arraySign(int[] nums) {
        int product =1;
        for(int i=0;i<nums.length;i++){
            product *= signFunc(nums[i]);
        }
        return product;
    }
}