class Solution {
    public boolean isPalindrome(int x) {
        if (x<0){
            return false;
        }
        int num = x;
        int remainder = 0;
        int pal_num=0;
        while(num!=0){
            remainder = num%10;
            pal_num = pal_num * 10 + remainder;
            num /= 10;
        }
        if (pal_num == x){
            return true;
        }
        else{
            return false;
        }
    }
}