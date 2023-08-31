# Leetcode_DS-ALGO_2023
Leetcode solutions with notes on optimization and logical solution for every problem. 

I use <b>Java</b> as primary language to solve the problems.

A daily update will be given on solved problems, please feel free to checkout soltuions and comeup with a better solution if possible. 

---
## Problems & solutions

| # | Title | Solution | Description | Problem Link |
|---| ----- | :--------: | :------------ | :------------ |
| 1 | Two Sum | [Java](https://github.com/anudeep-17/Leetcode_DS-ALGO_2023/blob/78bda0306e21f98dff5c28c479029acfee540d88/Two%20Sum.java) | Create a Map that stores the difference of each number from the target and the index of that number in the array. Then search for the target in the array, if it's there, then that key value pair is my two sum solution | [Two Sum on Leetcode](https://leetcode.com/problems/two-sum/) |
| 2 | Palindrome | [Java](https://github.com/anudeep-17/Leetcode_DS-ALGO_2023/tree/c3763a44729765b99906a53125c9bfa3710cfb47) | Copy the given integer to a temp and Modulus the temp variable and keep adding the digit obtained to the reversed integer and then divide the temp by 10. After the loop, compare given and reversed integer and if they are equal, it's a palindrome. | [Palindrome Number on Leetcode](https://leetcode.com/problems/palindrome-number/) |
| 3 | Roman to Integer | [Java](https://github.com/anudeep-17/Leetcode_DS-ALGO_2023/blob/65295277d773114b35c17590a08e251ccabc5c89/RomanToInteger) | Run a for loop and then convert the given string to a character array and then convert each index's value to an integer from roman and then check if the current element is greater than the previous element, if it is then subtract the previous from the current integer and then subtract the current integer again to remove previously added previous integer, else add the current element to the solution. | [Roman to Integer on Leetcode](https://leetcode.com/problems/roman-to-integer/) |

---
## Resources 
a full study checklist for code & whiteboard interview, please turn to [jwasham's coding-interview-university](https://github.com/jwasham/coding-interview-university).

Also, there are open source implementations for basic data structs and algorithms, such as [Algorithms in Python](https://github.com/TheAlgorithms/Python) and [Algorithms in Java](https://github.com/TheAlgorithms/Java).
