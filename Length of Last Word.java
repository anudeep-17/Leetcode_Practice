class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0;
        int flag = 0; // signifies wether the last word has started
        for( int i = s.length() - 1; i >= 0; i--){                
            if(flag == 1 && s.charAt(i) == ' '){
                return length;
            }
            if(s.charAt(i) != ' '){
                length++;
                flag = 1;
            }
        }
        return length;
    }
}
