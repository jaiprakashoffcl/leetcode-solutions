class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        HashSet<Integer> sets = new HashSet<>();
        for(int num1:nums){
            if(sets.contains(num1)){
                return true;
            }
            sets.add(num1);
        }
        return false;
    }
}