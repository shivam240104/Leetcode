class Solution {
    public String[] findWords(String[] words) {
        String first = "qwertyuiop";
        String second = "asdfghjkl";
        String third = "zxcvbnm";
        List<String> str = new ArrayList<>();
        for(String word : words){
            String lower = word.toLowerCase();
            if(check(lower,first)|| check(lower,second)|| check(lower,third)){
                str.add(word);
            }
        }
        return str.toArray(new String[str.size()]);
    }

    private boolean check(String word,String row){
        for(char ch :word.toCharArray()){
            if(row.indexOf(ch)==-1){
                return false;
            }
        }
        return true;
    }
}
