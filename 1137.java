class Solution {
    public int solve(int n, int [] arr){
        if(n==0)return 0;
        if(n==1||n==2)return 1;
        if(arr[n]!=-1){
            return arr[n];
        }
        arr[n] = solve(n-1,arr)+solve(n-2,arr)+solve(n-3,arr);
        return arr[n];
    }
    public int tribonacci(int n) {
        int arr[] = new int[n+1];
        Arrays.fill(arr,-1);
        return solve(n,arr);
    }
}
