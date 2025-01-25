class Solution {
    public String convertDateToBinary(String date) {
         String[] dt = date.split("-");
        return Integer.toBinaryString(Integer.parseInt(dt[0])) + "-" +
               Integer.toBinaryString(Integer.parseInt(dt[1])) + "-" +
               Integer.toBinaryString(Integer.parseInt(dt[2]));
    }
}