class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> newarr = new ArrayList<>();
        Set<Integer> seen = new HashSet<>();

        for(int num: nums){
            if(seen.contains(num)){
                newarr.add(num);
            }
            else{
                seen.add(num);
            }
        }
        return newarr;
    }
}