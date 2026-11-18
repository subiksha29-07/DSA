class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        int n = 0;
        int i = 0;
        while(n<s.length()){
            if(s.charAt(i) == '#'){
                if(!st1.isEmpty()){
                    st1.pop();
                }
            }
            else{
                st1.push(s.charAt(i));
            }
            
            i++;
            n++;
        }
        int n1 = 0;
        int j =0;
        while(n1<t.length()){
            if(t.charAt(j) == '#'){
                if(!st2.isEmpty()){
                    st2.pop();
                }
            }
            else{
                st2.push(t.charAt(j));
            }
            
            j++;
            n1++;
        }
        return st1.equals(st2);
        
    }
}