class Solution {
    public boolean Contain(String s,char x){
        for(Character ch : s.toCharArray()){
            if(ch.equals(x)){
                return true;
            
            }
        }
        return false;
    }
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<words.length;i++){
            boolean condition = Contain(words[i],x);
            if(condition) ans.add(i);
        }
        return ans;
    }
}
