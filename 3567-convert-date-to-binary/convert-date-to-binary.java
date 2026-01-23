class Solution {
    public String convertDateToBinary(String date) {
        return  Arrays.stream(date.split("-"))
                    .map(str -> Integer.toBinaryString(Integer.parseInt(str)))  
                    .collect(Collectors.joining("-")); 

    }
}

//steps:
// string array ahh create pana like ["2020","1"]
// string - integer convert panrom and then integer eh binary string ahh convert panrom 
// [2024] -> ["11111101000",......]
// string thirumba join panrom using "-"
//"11111101000-....-....."