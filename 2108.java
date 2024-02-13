class Solution {
    public String firstPalindrome(String[] words) {

         for(String word: words){
            int n = word.length();
            boolean isPalindrome = true;
            for (int i = 0; i < n / 2; i++) {
                if (word.charAt(i) != word.charAt(n - i - 1)) {
                    isPalindrome = false;
                    break;
                }
            }
            if (isPalindrome) {
                return word;
            }
        }
        return ""; // If no palindrome found
    }
    }
