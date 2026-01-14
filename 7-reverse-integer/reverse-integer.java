class Solution {
    public int reverse(int n) {
        long rev =0;
        while(n!=0){
            int digit = n%10;
            rev = (rev*10)+digit;
            n = n/10;
        }
        if(rev>Integer.MAX_VALUE || rev<Integer.MIN_VALUE) return 0;
        //Integer.MIN_VALUE is -2,147,483,648
        //Integer.MAX_VALUE is 2,147,483,647

        return (int)rev;
    }
}