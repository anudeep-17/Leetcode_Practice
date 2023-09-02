# Optimized
class Solution {
    public int mySqrt(int x) {

        if (x == 0 || x == 1)
            return x;

        int left  = 1;
        int right = x/2;
        
        while(left <= right){
            int mid = (left+right)/2;
            if(mid*mid == x){
                return mid;
            }
            else if( (long) mid*mid < (long) x){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return right;
    }
}
