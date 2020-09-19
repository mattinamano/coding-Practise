class Solution {
    public boolean isValid(String str) {
        
		if(str == null || str.equals("") || str.length() == 1) {
            return false;
        }
		
        Stack<Character> s = new Stack<Character>();
		
		char[] chars = str.toCharArray();
        for(int i=0; i< chars.length; i++) {
            char c = chars[i];
			
            if(c == '(' || c == '[' || c == '{') {
                s.push(c);
                continue;
            }
            
            if(s.isEmpty()) {
                return false;
            }
            
            if(c == ')') {
                char top = s.peek();
				if(top == '[' || top == '{') {
                    return false;
                }
            } else if(c == ']') {
                char top = s.peek();
                if(top == '(' || top == '{') {
                    return false;
                }
            } else if(c == '}') {
                char top = s.peek();
                if(top == '(' || top == '[') {
                    return false;
                }
            }
            s.pop();
        }
		
        return s.isEmpty();
    }
}
