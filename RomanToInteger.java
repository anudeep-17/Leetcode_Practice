class Solution {
    public int romanToInt(String s) 
    {
        int result = 0; 

        char[] ch = s.toCharArray();

        for(int i = 0; i < ch.length; i++)
        {
            if(ch[i] == 'I')
            { 
                if( i+1<ch.length && ch[i+1] == 'V')
                {
                    result += 4;
                    i++;
                }
                else if(i+1<ch.length && ch[i+1] == 'X')
                {
                     result += 9;
                     i++;
                }
                else
                {
                    result += 1;
                }
            }
            else if (ch[i] == 'V')
            {
                result += 5;
            }
            else if(ch[i] == 'X')
            {
                    if( i+1<ch.length && ch[i+1] == 'C')
                    {
                        result += 90;
                        i++;
                    }
                    else if( i+1<ch.length && ch[i+1] == 'L')
                    {
                        result += 40;
                        i++;
                    }
                else
                {
                    result += 10;
                }
            }

            else if(ch[i] == 'L')
            {
                result += 50;
            }

            else if(ch[i] == 'C')
            {
                    if( i+1 <ch.length && ch[i+1] == 'M')
                    {
                        result += 900;
                        i++;
                    }
                    else if( i+1 <ch.length && ch[i+1] == 'D')
                    {
                        result += 400;
                        i++;
                    }
                
                else
                {
                    result += 100;
                }
            }
            else if (ch[i] == 'D')
            {
                result += 500;
            }
            else if (ch[i] == 'M')
            {
                result += 1000;
            }
        }
    return result;
    }
}
