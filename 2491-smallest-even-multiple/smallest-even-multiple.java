class Solution {
    public int smallestEvenMultiple(int n) {
        //logic
        int x = n*2;
        if(n%2==0){
            if(x%2==0){
                if(x>n){
                    return n;
                }
                else{
                    return x;
                }
            }
            else return n;
        } else return x;
    }
}