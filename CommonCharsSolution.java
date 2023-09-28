class CommonCharsSolution {

/*The problemset can be found here: https://leetcode.com/problems/find-common-characters/ 

Recap: Given a string array words, return an array of all characters that show up in all strings within the words (including duplicates).
You may return the answer in any order.

Example 1:

Input: words = ["bella","label","roller"]
Output: ["e","l","l"]

Example 2:

Input: words = ["cool","lock","cook"]
Output: ["c","o"]

Constraints:

    1 <= words.length <= 100
    1 <= words[i].length <= 100
    words[i] consists of lowercase English letters.*/

    
    public List<String> commonChars(String[] words) {


        /*Algorithm - Approach 1:
        
        1. Retrieve the list of words
        2. Retrieve the total word count of the words array
        3. Set the current word to the word at the initial index (0) of the words array
        4. Iterate through each letter in the word via an "i" counter (i represents the index)
        5. Every time a letter is hit, increment that particular letter counter
        6. Once there are no more letters in the word, move to the next word (via incrementing the index "i"), and repeat steps 1-5
        7. Once the end of the words array is reached, perform a final calculation
            - Final calculation:
            - If the letter counters is greater than 2 and the letter counter appears in each word, add that to the final array
            - Return the final array*/

        //initial braindump    
        //create a string array
        //create a dictionary of lowercase characters maybe 
        //create a counter for each letter
        /* logic -> 
        - count the length of the words array
        - iterate through the list and record and add a counter for each letter
        - if the letter counter is is greater than 2, check to see if it is in each word
        - if a character is in all 3 words, print it
         */
    
     int aCount, bCount, cCount, dCount, eCount, fCount, gCount, hCount, iCount, jCount, kCount,
     lCount, mCount, nCount, oCount, pCount, qCount, rCount, sCount, tCount, uCount, vCount, wCount,
     xCount, yCount, zCount;
     int wordsCount= words.length;
     int index;
    char[] currentWord; 
 
     for (int i=0; i<=words.length -1; i++){
         currentWord =  words[i].toCharArray();
         char currentLetter = currentWord.charAt(i);
        while(i<currentWord.length-1){
        currentLetter = currentWord.charAt(i);
        switch (currentLetter){
         
         case 'a':
         aCount++;
         case 'b':
         bCount++;
         case'c':
         cCount++;
         case'd':
         dCount++;
         case 'e':
         eCount++;
         case'f':
         fCount++;
         case 'g':
         gCount++;
         case 'h':
         hCount++;
         case 'i':
         iCount++;
         case 'j':
         jCount++;
         case 'k':
         kCount++;
         case 'l':
         lCount++;
         case 'm':
         mCount++;
         case 'n':
         nCount++;
         case 'o':
         oCount++;
         case 'p':
         pCount++;
         case 'q':
         qCount++;
         case 'r':
         rCount++;
         case 's':
         sCount++;
         case 't':
         tCount++;
         case 'u':
         uCount++;
         case 'v':
         vCount++;
         case 'w':
         wCount++;
         case 'x':
         xCount++;
         case 'y':
         yCount++;
         case 'z':
         zCount++;

         i++;

     }

         }
 List<String> commonCharacters = new ArrayList<>();// dummy code
        // for (String letter: words){

   

        // }
     currentLetter = nextLetter;
     }
     
         System.out.print("Total Words: " + wordsCount); //dummy code
        
        
return commonCharacters; //dummy code

    }
}
