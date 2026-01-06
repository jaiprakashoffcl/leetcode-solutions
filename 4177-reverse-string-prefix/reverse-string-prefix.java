class Solution {
    public String reversePrefix(String s, int k) {
        StringBuilder temp = new StringBuilder(s.substring(0,k));
        temp.reverse();
        temp.append(s.substring(k));
        return temp.toString();
    }
}