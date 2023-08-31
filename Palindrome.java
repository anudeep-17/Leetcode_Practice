// Optimized
class Solution {
    public boolean isPalindrome(int x) {
        if( x < 0){
            return false;
        }

        int reverse = 0;
        int temp = x;

        while (temp != 0){
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp /= 10;
        }

        return x == reverse;
    }
}


// Brute Force
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
