# Data structure
  * Array,Linked List
  * Tree
  * Heap,Hashing,String,Trie
  * Graph Searching- BFS,DFS

# Algorithm
 * Sorting and Searching
 * String Algorithm
 * recursion and backtraking
 * Dynamic Programming
 * Devide and Conquer algo
 * Greedy algo
 * Bianry Exponention
 * Primality Testing
 * NUmber Theory and Math(Probability,Permutation,Combination)
 * Geometrical and Network flow diagram
 

 # Problem solving topic wise:
 
   ## Array
   * Find a pair with given sum- O(nlogn),O(n)/2SUM,3SUM,4SUM,3SUM closest
   * Minimum size sub array sum and maximum size sub array sum.
   *
   
   # String
   * Reverse a string using recursion.
   * Check if all the character in String is unique or not.
   * Reverse words of a Sentence.
   * Serialize a collection of string into one single string and deserialize the string into a collection of string.
   * Longest substring with non repeating characters.
   * Given a string with parentheses (round brackets) and letters, validate the parentheses:
        1. An opening parentheses '(' should have a closing matching parentheses ')'.
        2. Closing matching parentheses should not come before an opening parentheses.
        Note: Assume that the string has alphabets and numbers and round brackets only.
        
         For example:
         ((BCD)AE) - Valid
         )(PH)N(X) - Invalid
  * Check if a string is rotated palindrome or not.
  * Find the first non repeating character in string
  
          Example:
          Input : ADBCGHIEFKJLADTVDERFSWVGHQWCNOPENSMSJWIERTFB
          Output: K
  * Postfix Expression evaluation using stack.
  * Find all permutaion of a string.
     
         Input String: abc
         Output: {bca, acb, abc, cba, bac, cab}
  * Given a dictionary of words and a string of characters, find if the string of characters can be broken into individual valid words       from the dictionary.
        
        Dictionary: arrays, dynamic, heaps, IDeserve, learn, learning, linked, list, platform, programming, stacks, trees
        String    : IDeservelearningplatform
        Output   : true 
        Because the string can be broken into valid words: IDeserve learning platform
  * Detect if a subset from a given set of N non-negative integers sums upto a given value S.
     
         Set: {1, 3, 9, 2}, S = 5
         Output: true
         Hint: use DP
  * Given a string s, form a shortest palindrome by appending characters at the start of the string. 

        Example: abab => babab. abcd => dcbabcd. ananab    => bananab.
        
  * Minimum Edit distance between two strings str1 and str2 is defined as the minimum number of insert/delete/substitute operations   required to transform str1 into str2. For example if str1 = "ab", str2 = "abc" then making an insert operation of character 'c' on str1 transforms str1 into str2. Therefore, edit distance between str1 and str2 is 1. You can also calculate edit distance as number of operations required to transform str2 into str1. For above example, if we perform a delete operation of character 'c' on str2, it is transformed into str1 resulting in same edit distance of 1.
  

           Example: Looking at another example, if str1 = "INTENTION" and str2 = "EXECUTION", then the minimum edit distance between str1 and str2 turns out to be 5 as shown below. All operations are performed on str1.
 
 * Given a dictionary of words, find minimum number of trials to reach from source word to destination word. A valid trial on word 'w' is defined as either insert, delete or substitute operation of a single character in word 'w' which results in a word 'w1' which is also present in the given dictionary.
           
           For example, for dictionary {"BCCI","AICC","ICC","CCI","MCC","MCA", "ACC"}, minimum number of trials to reach from word "AICC" to "ICC" is 1. Only 1 opeartion of deleting character 'A' is required to reach from word "AICC" to word "ICC". Minimum number of trials to reach from "AICC" to "MCC" is 2(AICC->ICC->MCC) and minimum number of trials to reach from "AICC" to "MCA" is 3(AICC->ICC->MCC->MCA). 

* Given a string S, find the minimum number of cuts required to separate the string into a set of palindromes.
 
* Let us assume that we have a specially made keyboard which has following four keys:  
Key 1:  This key prints character 'A' on the output screen
Key 2: (Ctrl-A): This keys selects the complete contents of the screen - same function as (Ctrl + A) of PC
Key 3: (Ctrl-C): This key copies the seleceted content to buffer or clipboard - same function as (Ctrl + C) of PC  
Key 4: (Ctrl-V): This key appends saved contents of buffer/clipboard to the output screen.  
If you are allowed to press keys of this special keyboard N times, write a program which calculates maximum numbers of As possible.


     Example -   
     Input:  N = 3  
     Output: 3  
     Maximum number of As possible with 3 keystrokes is 3 which are obtained by using following key sequence - 
     A, A, A   

     Input:  N = 8  
     Output: 12 
     Maximum number of As possible with 8 keystrokes is 9 which are obtained by using  following key sequence -
     A, A, A, Ctrl A, Ctrl C, Ctrl V, Ctrl V, Ctrl V
     OR following keysequence also produces 12 As
     A, A, A, A, Ctrl A, Ctrl C, Ctrl V, Ctrl V
     
 * find longest palindromic substring.
 * find longest palindromic subsequence.
 * find longest common substring.
 * find longest common subsequence.
 * Find 10 letter DNA sequence.
 * Count all possible distinct binary strings of length n with no consecutive 1s.
 * Given two strings 'pattern' and 'text', find whether any anagram of string pattern is a substring of text.
 
         Example:
         Input:
         text = ideserve
        pattern = veer
        Output:
        true
        Substring which is an anagram of pattern: erve (ideserve)
        
* Given a string, print all palindromic partitions of the given string. 
Palindromic partitioning of a string is dividing the string into parts such that each part is a palindrome.

        Input:
        IDeserve
        Output:
        I-D-e-s-e-r-v-e
        I-D-ese-r-v-e
*      
   
      
