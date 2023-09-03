# Optimized - Dynamic Programming
class Solution {
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

    public int climbStairs(int n) {
          if(n == 1 || n == 2)
            return n;
         if(!this.map.containsKey(n)){
            int val = climbStairs(n-1) + climbStairs(n-2);
            this.map.put(n, val);
            return val;
         }

        return this.map.get(n);
    }
}
