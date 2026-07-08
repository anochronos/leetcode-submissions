class Solution {
    public int[] twoSum(int[] nums, int target) {
       Map<Integer, Integer> sum = new HashMap<>();
       for (int i = 0; i < nums.length; i++) {
        if (sum.containsKey(target - nums[i])) {
            int [] arr = {sum.get(target - nums [i]), i};
            return arr;
        }
        sum.put(nums[i], i);
       }
       return new int[]{};
    }
}
