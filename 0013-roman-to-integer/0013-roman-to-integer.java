class Solution {
    public int romanToInt(String s) {
        int I = 1;
        int V = 5;
        int X = 10;
        int L = 50;
        int C = 100;
        int D = 500;
        int M = 1000;
        int num = 0;
        for (int i = 0; i < s.length(); i++){
            switch(s.charAt(i)){
                case 'I':
                    if (i + 1 < s.length() && (s.charAt(i+1) == 'V' || s.charAt(i+1) == 'X')){
                        num -=I;
                    }
                    else{
                      num+=I;  
                    }
                    break;
                case 'V':
                    num+=V;
                    break;
                case 'X':
                    if (i + 1 < s.length() && (s.charAt(i+1) == 'L' || s.charAt(i+1) == 'C')){
                        num -=X;
                    }
                    else{
                        num+=X;
                    }
                    break;
                case 'L':
                    num+=L;
                    break;
                case 'C':
                    //C can be placed before D (500) and M (1000) to make 400 and 900.

                    if (i + 1 < s.length() && (s.charAt(i+1) == 'D' || s.charAt(i+1) == 'M')){
                        num -=C;
                    }
                    else{
                        num+=C;
                    }
                    break;

                case 'D':
                    num+=D;
                    break;
                case 'M':
                    num+=M;
                    break;
            }
        }
        return num;
    }
}