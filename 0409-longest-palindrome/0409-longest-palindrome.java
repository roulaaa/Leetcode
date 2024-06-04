class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> h = new HashMap<>();
        int pal_num = 0;
        boolean isOdd = false;
        for (int i = 0; i < s.length(); i++) {
            h.put(s.charAt(i), h.getOrDefault(s.charAt(i), 0) + 1);
        }
        
        for (int i = 0; i < h.size(); i++) {
            char key = (char) h.keySet().toArray()[i];
            int count = h.get(key);
    
            if (count % 2 == 0) {
                pal_num += count;
            } else {
                pal_num += count - 1; 
                isOdd = true;
            }
        }

        if (isOdd) {
            pal_num++;
        }
    
        return pal_num;
    }
}