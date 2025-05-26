class Solution {
    public String convert(String s, int numRows) {
        String [] str = new String[numRows];
        Arrays.fill(str,"");
        int i=0;
        while(i<s.length()){
            for( int j=0;j<numRows && i<s.length();j++){
                str[j]+=s.charAt(i++);
            }
            for(int j=numRows-2;j>0 &&i<s.length();j--){
                str[j]+=s.charAt(i++);
            }
        }
        String res ="";
        for(String c : str){
            res +=c;
        }
        return res;
    }
}
