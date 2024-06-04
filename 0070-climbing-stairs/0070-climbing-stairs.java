class Solution {
    private HashMap<Integer, Integer> h = new HashMap<>();

    public int climbStairs(int n) {
        int result = 0;
        if (n < 4){            
            return n;
        }
        if (h.containsKey(n)) {           
            return h.get(n);
        }
        result = climbStairs(n - 1) + climbStairs(n - 2);
        h.put(n, result); 
        return result;
    }
}
