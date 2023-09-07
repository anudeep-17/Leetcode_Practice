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
| 6 | Merge two sorted lists | [Java](https://github.com/anudeep-17/Leetcode_DS-ALGO_2023/blob/d62f1282abd29d863212ce81a2b849b823ba02d6/Merge%20Two%20Sorted%20Lists.java) | Create a new list node and then run a while loop which doesnt end until list1 & list2 are both null. Now keep checking if list1's current val is greater or equal than list2's val in which case, in the newly created list, add list1's val and then increment the appropriate pointers and do the opposite if list2 is greater than list1. At the end add all the remaining list1 or list2 node's because one of the list got exhausted and the while loop didn't consider the rest of the values of the other list so just append them. | [Merge Two Sorted Lists on Leetcode](https://leetcode.com/problems/merge-two-sorted-lists/) |
| 7 | Remove duplicates from sorted array | [Java](https://github.com/anudeep-17/Leetcode_DS-ALGO_2023/blob/3858ab2610823121af0222568ae05a11636b5f9b/Remove%20Duplicates%20from%20Sorted%20Array.java) | Initialize a pointer with value 0 and then run a for loop that checks each element of the array with the previous element, if they are not equal, then change the pointer numbered index in the array to the current element and then increment the pointer by 1. Basically, the pointer maintains the position where next unique element is to be entered. | [Remove Duplicates on Leetcode](https://leetcode.com/problems/remove-duplicates-from-sorted-array/) |
| 8 | Remove Element from Array | [Java](https://github.com/anudeep-17/Leetcode_DS-ALGO_2023/blob/55522d11e14bf99e790f31047cbbcbc650fb57dd/Remove%20Element.java) | Initialize an integer = 0 which will represent the new unique array's length. Let's call this integer newLength. Run the for loop, as soon as you find an element that is not equal to the given val, place that element in the array's new length index basically saying that we have found one more unique element for the new array. At the end return the newLength.| [Remove Element on Leetcode](https://leetcode.com/problems/remove-element/) |
| 9 | First Occurrence in a string | [Java](https://github.com/anudeep-17/Leetcode_DS-ALGO_2023/blob/d64772b89609680c0e7f74d2bbd94bf65f256daa/First%20Occurrence%20of%20a%20String.java) | Run a for loop for the size of the haystack string, at each index, compare the substring of haystack with needle and if it does not match then move to the next index in the string. if you find it, return the value of current index. Otherwise return -1. | [First Occurence in a string](https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/) |
| 10 | Search Insert Index | [Java](https://github.com/anudeep-17/Leetcode_DS-ALGO_2023/blob/2ec5d54a4aa7048a50622288757396b1c6001073/Search%20Insert%20Position.java) | An O(log n) solution is to perform a binary search on the given array and if the element is found, just return the index, if it's not, return the left index because that's where the element smaller to the target is. An O(n) solution is to check all the boundary cases in the for loop: 1) If it's a match, just return the current index. 2) If it's the first index & the value is greater than the target then return 0. 3) If it's in the middle of the array, check if it's greater than the current value and lower than the next value then return the next index. 4) If it's the last index, and you still haven't satisfied any of the above cases, return the last index + 1. | [Search Insert Index on Leetcode](https://leetcode.com/problems/search-insert-position/) |
| 11 | Length of the Last Word | [Java](https://github.com/anudeep-17/Leetcode_DS-ALGO_2023/blob/976a7e20faad4f93bec6994cc5ae1a80b4a2f9fc/Length%20of%20Last%20Word.java) | Initialize a flag to 0, Start from the end of the string and compare each character to an empty space. If it's not an empty space, it will mark the flag as 1(which means that the last word has started) and increment the length variable declared. Now check if the flag is 1 and if an empty space is encountered that means the last word has ended. so return the length. | [Length of the Last Word on Leetcode](https://leetcode.com/problems/length-of-last-word/submissions/) |
| 12 | Plus One | [Java](https://github.com/anudeep-17/Leetcode_DS-ALGO_2023/blob/e3c9ee3a310a2e83fa2defd60cb5b632f6eba6b3/Plus%20One.java) | Run a for loop that runs from the end of the array to the beginning of the array. If the current index is less than 9, then increment the current index's value and return the array. If it is equal to 9, then set it to 0, and then the loop runs again for index (length - 2). It keeps going on until the first digit if all the digits are 9. In the worst case, if all the digits are 9 in the given array, at the end of this for loop, all the digits would become 0. After that create another array that is a copy of the transformed array but has an extra index i.e. size + 1. Then set the first index as 1 and then return your newly obtained array. | [Plus One on Leetcode](https://leetcode.com/problems/plus-one/) |
| 13 | Add Binary | [Java](https://github.com/anudeep-17/Leetcode_DS-ALGO_2023/blob/ec39f02c70b9eaf171ec0b68409bd0572c53c6a5/Add%20Binary.java) | Initialize a carry bit, find the bigger of the two strings and run a for loop starting from that bigger length until 0. Run two variables, 1 from the end of string 'a' and one from string 'b'. Then check for 3 conditions: 1) If both bits are 1. 2) If both bits are 0. 3) If both bits are different. Keep manipulating the carry and the bits according to the conditions. | [Add Binary on Leetcode](https://leetcode.com/problems/add-binary/) |
| 14 | Sqrt(x) | [Java](https://github.com/anudeep-17/Leetcode_DS-ALGO_2023/blob/d090c5834a38b60a3582bbe7714ed37a07827062/Sqrt(x).java) | Perform Binary Search from 1 to x/2 and keep checking if the mid's square is >, <, or ==  to x. If there is no direct square after the while loop i.e. mid x mid == x then return right because right*right < x & left x left > x. | [Sqrt(x) on Leetcode](https://leetcode.com/problems/sqrtx/) |
| 15 | Climbing Stairs | [Java](https://github.com/anudeep-17/Leetcode_DS-ALGO_2023/blob/fcc74e424b0667cf59766f820ccbaee7ec2ebdee/Climbing%20Stairs.java) | Start from the n'th stair, and recursively call the same function, base case is that n == 1 or n == 2 i.e if 1 stair is left, there is 1 way and if there are 2 stairs, there are 2 ways. Keep storing the current n's value in a map so that it can be used again. At the end return the total sum obtained. | [Climbing Stairs on Leetcode](https://leetcode.com/problems/climbing-stairs/) |
| 16 | Remove duplicates from a Sorted List | [Java](https://github.com/anudeep-17/Leetcode_DS-ALGO_2023/blob/3c59f2e958fb2888909442f87da8d782fdb73e0c/Remove%20Duplicates%20from%20a%20Sorted%20List.java) | Keep checking if the current val and the next val is same. If they are, don't move forward but make the current's next point to the next's next. Otherwise move forward. | [Remove Duplicates from a Sorted List on Leetcode](https://leetcode.com/problems/remove-duplicates-from-sorted-list/) | 
| 17 | Merge Two Sorted Arrays | [Java](https://github.com/anudeep-17/Leetcode_DS-ALGO_2023/blob/f57690596cbf9ae88ecc135326752c56ae92c45c/Merge%20Two%20Sorted%20Arrays.java) | Maintain 3 pointers, one starts from the end of array 1's elements, second starts from the end of array 2's elements, third starts from the end of array 1's last index. Keep comparing the elements in both arrays, whichever is bigger place it at the end of the 1st array. | [Merge Two Sorted Arrays on Leetcode](https://leetcode.com/problems/merge-sorted-array/) |
| 18 | Binary Tree Inorder Traversal | [Java](https://github.com/anudeep-17/Leetcode_DS-ALGO_2023/blob/d718e740f771bd7c91376ecfad45ca5038a6d1f7/Binary%20Tree%20Inorder%20Traversal) | Initialize a list outside of the given method and then recursively call the same method to find the left child's element, then add the current node's element and then add the right child's element. If at a point the node becomes null, then return the current list. | [Binary Tree Inorder Traversal on Leetcode](https://leetcode.com/problems/binary-tree-inorder-traversal/) |
| 19 | Same Tree | [Java](https://github.com/anudeep-17/Leetcode_DS-ALGO_2023/blob/437bfd18493933790a9a29e402910e1f8e70ab52/Same%20Tree.java) | Recursively call the isSameTree() method and the base cases are: 1) If both trees are null, return true because they are same. 2) If only one tree is null, return false because they are not same. 3) If none of the trees are null, check if tree1 and tree2 value's are same and also if tree 1.left == tree2.left and also if tree1.right == tree2.right by recursively calling the isSameTree method as mentioned earlier. | [Same Tree on Leetcode](https://leetcode.com/problems/same-tree/) |
| 20 | Symmetric Tree | [Java](https://github.com/anudeep-17/Leetcode_DS-ALGO_2023/blob/d1b42654d640d827f974e6b2ea454710b41aa0f0/Symmetric%20Tree.java) | Create a new helper function, which takes the leftSubtree and the rightSubtree and then checks if both trees are null, if they are, returns true. if only one is null, returns false. Then if none is null, then compare leftSubtree & rightSubtree value's and then also if leftSubtree's left child == rightSubtree's right child and also if leftSubtree's right child == rightSubtree's left child. If all these conditions are true, return true otherwise return false. | [Symmetric Tree on Leetcode](https://leetcode.com/problems/symmetric-tree/) |



---
## Resources 
a full study checklist for code & whiteboard interview, please turn to [jwasham's coding-interview-university](https://github.com/jwasham/coding-interview-university).

Also, there are open source implementations for basic data structs and algorithms, such as [Algorithms in Python](https://github.com/TheAlgorithms/Python) and [Algorithms in Java](https://github.com/TheAlgorithms/Java).
