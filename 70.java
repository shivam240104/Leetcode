class Solution {
    private int solve(int n,int [] arr){
        if(n<=1)return 1;
        if(arr[n] !=-1)return arr[n];
    
        arr[n] = solve(n-2,arr)+solve(n-1,arr);
        return arr[n];
    }
    public int climbStairs(int n) {
        int arr [] = new int[n+1];
        Arrays.fill(arr,-1);
        return solve(n, arr);
    }
}
