class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int l=nums.length;
        return Math.max(nums[l-1]*nums[l-2]*nums[l-3],nums[1]*nums[0]*nums[l-1]);
    }
}
