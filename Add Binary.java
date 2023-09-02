# Bruteforce
class Solution {
    public String addBinary(String a, String b) {

        int length = Math.max(a.length(), b.length());
        char carry = '0';
        StringBuilder str = new StringBuilder();

        for(int i = a.length() - 1, j = b.length() - 1; length >= 0; i--, j--, length-- ){
            if(i >= 0 && j >= 0){ // if both strings are not exhausted yet
                if(a.charAt(i) == '1' && b.charAt(j) == '1'){ // if both characters at the same index are 1
                    if(carry == '0'){
                        str.append("0");
                        carry = '1';
                    }
                    else{
                        str.append("1");
                        carry = '1';
                    }
                } else if(a.charAt(i) == '0' && b.charAt(j) == '0'){ // if both characters at the same index are 0
                    if(carry == '0'){
                        str.append("0");
                    }
                    else {
                        str.append("1");
                        carry = '0';
                    }
                } else if( a.charAt(i) != b.charAt(j)){ // if both characters at the same index are different
                    if(carry == '0'){
                        str.append("1");                        
                    }
                    else{
                        str.append("0");
                        carry = '1';
                    }
                }
            } else if( i < 0 & j >= 0){ // if string 'a' got exhausted and 'b' still remains
                if(b.charAt(j) == '1'){
                    if(carry == '0'){
                        str.append('1');
                    } else {
                        str.append('0');
                    }
                } else{
                        str.append(carry);
                        carry = '0';
                }
            } else if( i >= 0 & j < 0){ // if string 'b' got exhausted and 'a' still remains
                if(a.charAt(i) == '1'){
                    if(carry == '0'){
                        str.append('1');
                    } else {
                        str.append('0');
                    }
                } else {
                    str.append(carry);
                    carry = '0';
                }
            }
            
        }

        if(carry == '1')
            str.append(carry); // if carry remains at the end, append it to the end of the string i.e the beginning of the string when we reverse it

        return str.reverse().toString(); // reverse the string because we have been appending at the end and then return it
    }
}
