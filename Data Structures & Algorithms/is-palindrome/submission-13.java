class Solution {
    public boolean isPalindrome(String s) {
        if(s == null || s.trim().length() == 0) return true;
        char[] charArray = s.toCharArray();
        int left = 0;
        int right = charArray.length - 1 ;
        while(left < right){            
            if(!Character.isLetterOrDigit(charArray[left])){
                   left++; 
            }
            else if(!Character.isLetterOrDigit(charArray[right])){
                 right--;                    
            }
            else {
                    if(Character.toLowerCase(charArray[left]) != Character.toLowerCase(charArray[right])){  
                            return false;                
                }
                 left++;
                right--;  
            }             
           
        }
        return true;        
    }
}
