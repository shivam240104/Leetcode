class Solution {
    private int solve(int i, int[] nums,int[]arr){
        if(i>=nums.length) return 0;
        if(arr[i] !=-1) return arr[i];
        int choriKaro = nums[i]+solve(i+2,nums,arr);
        int choriMatKaro = solve(i+1,nums,arr);
        return arr[i]=Math.max(choriMatKaro,choriKaro);
    }
    public int rob(int[] nums) {
        int [] arr = new int[nums.length+1];
        Arrays.fill(arr,-1);
        return solve(0,nums,arr);
    }
}
