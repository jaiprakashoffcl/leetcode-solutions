class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] arr1 = new int[2];
        for(int i =0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                if(numbers[i]+numbers[j] == target){
                        arr1[0] = i+1;
                        arr1[1] = j+1;
                        return arr1;
                }
            }
        }
        return arr1;
    }
}