class Solution {
    public void dfs(int[][] image, int sr, int sc, int color, int originalcolor)
    {
        if(sr < 0 || sr >= image.length || sc <0 || sc >= image[0].length || image[sr][sc] != originalcolor) 
        {
            return;
        }    
        image[sr][sc] = color;

        dfs(image, sr+1, sc, color, originalcolor);
        dfs(image, sr-1, sc, color, originalcolor);
        dfs(image, sr, sc+1, color, originalcolor);
        dfs(image, sr, sc-1, color, originalcolor);
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) 
    {
        int original = image[sr][sc];

        if(original != color)
        {
            dfs(image, sr,sc, color, original);
        }
        return image;
    }
}