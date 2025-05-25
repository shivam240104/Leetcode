class Solution {
    public int longestPalindrome(String[] words) {
        int arr [][] = new int[26][26];
        int count =0, middle=0;
        for(String s : words){
            int x = s.charAt(0)-'a', y = s.charAt(1)-'a';
            if(arr[y][x]>0){
                arr[y][x]--;
                count +=4;
                if(x==y) middle--;
            }else{
                arr[x][y]++;
                if(x==y)middle++;
            }
        }
        if(middle>0) count +=2;
        return count;
    }
}
