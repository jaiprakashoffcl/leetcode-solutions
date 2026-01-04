class Solution {
    public String defangIPaddr(String address) {
        String newaddress = address.replace(".","[.]");
        return newaddress;
    }
}