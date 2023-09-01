# Optimized
class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        String prefix = strs[0];

        for( int i = 0; i < strs.length; i++){
            while(strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length() - 1);
                if(prefix.length( ) == 0){
                    return "";
                }
            }
        }

    return prefix;
    }
}

# Brute Force
class Solution {
    public String longestCommonPrefix(String[] strs) {

        String example = strs[0];
        char[] solution_array = example.toCharArray();

        for( int i = 0; i < solution_array.length; i++){
            solution_array[i] = 1;
        }


        for( int i = 1; i < strs.length; i++){
            char[] current_str_array = strs[i].toCharArray(); 
            if(current_str_array.length < solution_array.length){
            for( int j = 0; j < current_str_array.length; j++){
                if(current_str_array[j] == example.charAt(j)){
                    solution_array[j]++;
                }
            }
            } else {
                for( int j = 0; j < solution_array.length; j++){
                if(current_str_array[j] == example.charAt(j)){
                    solution_array[j]++;
                }
            }
            }
        }

    int temp = 0;
    String substring = "";
    for ( int i = 0; i < solution_array.length; i++ ){
        if( solution_array[i] == strs.length ){
            substring = substring + example.charAt(i);
        }
        else{
            break;
        }
    }

    return substring;
    }
}
