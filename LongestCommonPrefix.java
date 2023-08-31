class Solution {
    public String longestCommonPrefix(String[] strs) 
    {
        String str = strs[0];

        for(int i = 1; i < strs.length; i++)
        {
            while(!strs[i].startsWith(str))
            {
                str = str.substring(0, str.length()-1);
                if(str.length() == 0)
                {
                    return "";
                }
            }
        }
        return str;
    }
}
