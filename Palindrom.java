class Solution {
    public boolean isPalindrome(int x) {
      //optimal solution without converting the number into string
        int temp1 = x;
        int temp = 0; 
        
        if(temp1 < 0)
        {
            return false;
        }
        
        while(x!=0)
        {
            temp = x%10 + temp*10;
            x = x/10;
        }

        return (temp == temp1);

      /*
        Manipulating int as string and using it to compare.
        String ch = String.valueOf(x);
        String ch2 = new StringBuilder(new String(String.valueOf(x))).reverse().toString();
        return ch.equals(ch2);
      */
    }
}
