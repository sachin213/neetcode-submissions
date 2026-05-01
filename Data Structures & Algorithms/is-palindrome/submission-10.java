class Solution {
    public boolean isPalindrome(String s) {
        if(s == null || s.trim().length() == 0) return true;

        String s1= "";
        String s2= "";
        char[] charArray = s.toCharArray();
        for(char k : charArray){
            if(Character.isLetterOrDigit(k)){
                    s1 = s1+k;
            }
              
        }
                
        for(int i=charArray.length-1; i>=0 ;i--){    
            if(Character.isLetterOrDigit(charArray[i])){
                s2 = s2 + charArray[i];
            }                    
        }
       


         if(s1.trim().equalsIgnoreCase(s2.trim())){
            return true;
         }   
         return false;

        
    }
}
