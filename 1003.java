class Solution {
    public boolean isValid(String s) {
        Stack<Character>stack = new Stack();
        for( char ch : s.toCharArray()){
            if(ch=='c'){
                if(stack.isEmpty() || stack.pop() !='b'){
                    return false;
                }
                if(stack.isEmpty() || stack.pop() !='a'){
                    return false;
                }
            }
            else{
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }
}
