class Solution {
    public int[] plusOne(int[] digits) 
    {
        int length= digits.length;
        int carry = 1;

         for(int i = length - 1;  i >= 0 ; i-- )
        {
            if( digits[i] + carry > 9 ) 
            {
                digits[i]=0;
            }
            else{
                digits[i] += carry;
                carry = 0 ;
                }
        }

        if(carry ==1)
        {
            int[] re = new int[digits.length+1];
            System.arraycopy(digits, 0, re, 1, digits.length);
            re[0] = carry;
            return re;
        }
        
        return digits;
    }
}
