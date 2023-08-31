class Solution {
    public int romanToInt(String s) {

        char[] romanArray = s.toCharArray();
        int solution = 0;

        for (int i = 0; i< romanArray.length; i++){
            if(romanArray[i] == 'I')
                romanArray[i] = 1;
            if(romanArray[i] == 'V')
                romanArray[i] = 5;
            if(romanArray[i] == 'X')
                romanArray[i] = 10;    
            if(romanArray[i] == 'L')
                romanArray[i] = 50;
            if(romanArray[i] == 'C')
                romanArray[i] = 100;
            if(romanArray[i] == 'D')
                romanArray[i] = 500;
            if(romanArray[i] == 'M')
                romanArray[i] = 1000;  

            if(i - 1 >= 0 && romanArray[i] > romanArray[i - 1]){
                solution = solution + (romanArray[i] - 2*romanArray[i-1]);
            } else {
                solution = solution + romanArray[i];
            }

        }

        return solution;

    }
}
