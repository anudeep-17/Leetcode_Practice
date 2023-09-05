class Solution {
    public int lengthOfLastWord(String s) 
    {
        int out = 0;

        for(int i = s.length()-1; i>=0; i--)
        {
            if(s.charAt(i) != ' ')
            {
                out++;
            }
            else if(s.charAt(i) == ' ' && out==0)
            {
                continue;
            }
            else
            {
                break;
            }
        }

        return out;
        
    }
}
