# Optimized but memory can be further optimized by reducing the number of iterations
class Solution {
    public int strStr(String haystack, String needle) {

        int haystackLength = haystack.length();
        int needleLength = needle.length();

        for(int i = 0; i<haystackLength; i++){
            if(i + needleLength <= haystackLength && (haystack.substring(i, i + needleLength)).equals(needle)){
                return i;
            }
                
        }

        return -1;
    }
}

# Using Built-In Functions
class Solution {
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}
