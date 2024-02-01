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
         List<List<Integer>> returner = new ArrayList<List<Integer>>();
         int x = 1;
         int y = 1000;

         while(x <= 1000  && y>0)
         {
             int temp = customfunction.f(x,y);
             if (temp < z)
             {
                 x++;
             }
             else if(temp > z)
             {
                 y--;
             }
             else
             {
                returner.add(List.of(x, y));
                x++;
                y--;
             }
         }

         return returner;
    }
}