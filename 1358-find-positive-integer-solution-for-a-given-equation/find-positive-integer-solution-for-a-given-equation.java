/*
 * // This is the custom function interface.
 * // You should not implement it, or speculate about its implementation
 * class CustomFunction {
 *     // Returns f(x, y) for any given positive integers x and y.
 *     // Note that f(x, y) is increasing with respect to both x and y.
 *     // i.e. f(x, y) < f(x + 1, y), f(x, y) < f(x, y + 1)
 *     public int f(int x, int y);
 * };
 */

class Solution {
    public List<List<Integer>> findSolution(CustomFunction customfunction, int z) 
    {
         List<List<Integer>> returner = new ArrayList<>();

          for (int i = 1; i <= 500; i++) {
            for (int j = 1; j <= 500; j++) {
                if (customfunction.f(i, j) == z) {
                    List<Integer> pair = new ArrayList<>();
                    pair.add(i);
                    pair.add(j);

                    returner.add(pair);
                }
            }
        }

         return returner;
    }
}