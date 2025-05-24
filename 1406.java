class Solution {
    private int solve(int i,int []stoneValue,int[] arr){
        if(i==stoneValue.length) return 0;
        if(arr[i]!=-1)return arr[i];
        int a,b,c;
        b=c=Integer.MIN_VALUE;
        a = stoneValue[i]-solve(i+1,stoneValue,arr);
        if(i+1<stoneValue.length){
            b= stoneValue[i]+stoneValue[i+1]-solve(i+2,stoneValue,arr);
        }
        if(i+2<stoneValue.length){
            c= stoneValue[i]+stoneValue[i+1]+stoneValue[i+2]-solve(i+3,stoneValue,arr);
        }
        return arr[i]= Math.max(a,Math.max(b,c));
    }
    public String stoneGameIII(int[] stoneValue) {
        int [] arr = new int[stoneValue.length+1];
        Arrays.fill(arr,-1);
        int ans = solve(0,stoneValue,arr);

        if(ans==0){
            return "Tie";
        } else{
            return (ans>0&&ans !=0)?"Alice":"Bob";
        }
    }
}
