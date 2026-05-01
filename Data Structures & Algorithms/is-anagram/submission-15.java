class Solution {
    public boolean isAnagram(String s, String t) {
          boolean anagram = true;
           if(s ==null || t ==null || (s.length() != t.length())) return false; 
            char[] str1 = s.toCharArray();
            char[] str2 = t.toCharArray();
            Map<Character,Integer> mapChar = new HashMap<>();
            Map<Character,Integer> mapChar1 = new HashMap<>();
            for(char str : str1){
                 if(mapChar.containsKey(str)){
                  int i = mapChar.get(str);
                  mapChar.put(str,i+1);    
                 }else{
                    mapChar.put(str,1);  
                 }                  
            }
             for(char str : str2){
                 if(mapChar1.containsKey(str)){
                    int j = mapChar1.get(str);
                  mapChar1.put(str,j+1);    
                 }else{
                    mapChar1.put(str,1);  
                 }                  
            }
            

         return mapChar.equals(mapChar1);
    }
}
