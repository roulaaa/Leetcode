class Solution {
    public int singleNumber(int[] nums) {
        if (nums.length == 1){
            return nums[0];
        }
        if (nums.length == 0){
            return 0;
        }
        Arrays.sort(nums);
        int x = 0; 
        while (x < nums.length-1){
            if (nums[x] != nums[x+1]){
                return nums[x];
            }
            x = x + 2;
        }
        return nums[x];
    }
}