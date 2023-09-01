# Leetcode_DS-ALGO_2023
Leetcode solutions with notes on optimization and logical solution for every problem. 

I use <b>Java</b> as primary language to solve the problems.

A daily update will be given on solved problems, please feel free to checkout soltuions and comeup with a better solution if possible. 

---
## Problems & solutions

| # | Title | Solution | Description | Problem Link |
|---| ----- | :--------: | :------------ | :------------ |
| 1 | Two Sum | [Java](https://github.com/anudeep-17/Leetcode_DS-ALGO_2023/blob/78bda0306e21f98dff5c28c479029acfee540d88/Two%20Sum.java) | Create a Map that stores the difference of each number from the target and the index of that number in the array. Then search for the target in the array, if it's there, then that key-value pair is my two-sum solution | [Two Sum on Leetcode](https://leetcode.com/problems/two-sum/) |
| 2 | Palindrome | [Java](https://github.com/anudeep-17/Leetcode_DS-ALGO_2023/tree/c3763a44729765b99906a53125c9bfa3710cfb47) | Copy the given integer to a temp and Modulus the temp variable and keep adding the digit obtained to the reversed integer and then divide the temp by 10. After the loop, compare given and reversed integers and if they are equal, it's a palindrome. | [Palindrome Number on Leetcode](https://leetcode.com/problems/palindrome-number/) |
| 3 | Roman to Integer | [Java](https://github.com/anudeep-17/Leetcode_DS-ALGO_2023/blob/65295277d773114b35c17590a08e251ccabc5c89/RomanToInteger) | Run a for loop and then convert the given string to a character array and then convert each index's value to an integer from roman and then check if the current element is greater than the previous element, if it is, then subtract the previous from the current integer and then subtract the current integer again to remove previously added previous integer, else add the current element to the solution. | [Roman to Integer on Leetcode](https://leetcode.com/problems/roman-to-integer/) |
| 4 | Longest Common Prefix | [Java](https://github.com/anudeep-17/Leetcode_DS-ALGO_2023/blob/b95392128c4930a53649808813eace11502e768d/Longest%20Common%20Prefix) | Select the first string from the array of strings and call this the prefix. Then keep checking if the index of this prefix is 0 in a string out of the strings one by one. If in current string it turns out to be at index 0, then move to the next string. After the for loop, you'll have the prefix. | [Longest Common Prefix on Leetcode](https://leetcode.com/problems/longest-common-prefix/) |
| 5 | Valid Parenthesis | [Java](https://github.com/anudeep-17/Leetcode_DS-ALGO_2023/tree/894f63be9091aa75a880287a256e09caa23dccd3) | Keep adding each character to stack and then if the stack is not empty, check if it's a closing parenthesis. If it is, seek the stack's top element and check if it's the opening bracket of the same bracket and then if it is, pop the stack. At the end check if stack is empty, then it's valid otherwise it's not. | [Valid Parenthesis on Leetcode](https://leetcode.com/problems/valid-parentheses/) |
| 6 | Merge two sorted lists | [Java](https://github.com/anudeep-17/Leetcode_DS-ALGO_2023/blob/d62f1282abd29d863212ce81a2b849b823ba02d6/Merge%20Two%20Sorted%20Lists.java) | Create a new list node and then run a while loop which doesnt end until list1 & list2 are both not null. Now keep checking if list1's current val is greater or equal than list2's val in which case, in the newly created list, add list1's val and then increment the appropriate pointers and do the opposite if list2 is greater than list1. At the end add all the remaining list1 or list2 node's because one of the list got exhausted and the while loop didn't consider the rest of the values of the other list so just append them. | [Merge Two Sorted Lists on Leetcode](https://leetcode.com/problems/merge-two-sorted-lists/) |

---
## Resources 
a full study checklist for code & whiteboard interview, please turn to [jwasham's coding-interview-university](https://github.com/jwasham/coding-interview-university).

Also, there are open source implementations for basic data structs and algorithms, such as [Algorithms in Python](https://github.com/TheAlgorithms/Python) and [Algorithms in Java](https://github.com/TheAlgorithms/Java).
