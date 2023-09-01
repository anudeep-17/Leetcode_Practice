# Further Optimized
class Solution {
    public boolean isValid(String s) {

        char[] tempArray = s.toCharArray();

        ArrayList<Character> list = new ArrayList<Character>();

        char curr = 'x';
        int counter = 0;
        for (int i = 0; i< tempArray.length; i++){
            curr = tempArray[i];
            if( curr == '{' || curr == '[' || curr == '(')
                    {counter++;
                    list.add(curr);}
            else if( curr == '}' || curr == ']' || curr == ')' ){
                if(counter == 0){
                    return false;
                }

                char temp = (curr == '}') ? '{' : (curr == ']' ? '[' : '(');


                if(list.get(list.size() - 1) != temp){
                    return false;
                } else{
                    list.remove(list.size() - 1);
                }

                counter--;

                }
        }


         return list.size() == 0;
}
}


# Optimized
class Solution {
    public boolean isValid(String s) {

        char[] tempArray = s.toCharArray();

        Stack<Character> stack = new Stack<Character>();

        for( int i = 0; i < tempArray.length; i++){
            if(!stack.isEmpty()){
                if((tempArray[i] == '}' && stack.peek() == '{') || 
                (tempArray[i] == ']' && stack.peek() == '[') ||
                (tempArray[i] == ')' && stack.peek() == '(')
                ){
                    stack.pop();
                } else {
                stack.push(tempArray[i]);
                } 
            } else {
                stack.push(tempArray[i]);
            } 
        }

        return stack.isEmpty();
}
}
