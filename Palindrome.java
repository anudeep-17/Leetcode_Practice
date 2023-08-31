class Solution {
    public boolean isPalindrome(int x) {
        char[] a = String.valueOf(x).toCharArray();
        char[] b = new char[a.length];
        for( int i= a.length - 1, j = 0; i >= 0 && j<b.length; i--, j++){
        b[j] = a[i];
        }
        if(Arrays.equals(a,b)){
            return true;
        }
        return false;
    }
}
