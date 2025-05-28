class Solution {
    private boolean check(int left,int right,String s){
        int rgt=right-1;
        while(left<right){
            if(s.charAt(left) != s.charAt(rgt)){
                return false;
            }
                left++;
                rgt--;
            
        }
        return true;
    }
    public String longestPalindrome(String s) {
        int n = s.length();
        for(int i=n;i>0;i--){
            for(int j=0;j<=n-i;j++){
                if(check(j,j+i,s)){
                    return s.substring(j,j+i);
                }
            }
        }
        return "";
    }
}
