class Solution {
    public int lengthOfLongestSubstring(String s) {
     if(s == null || s.length() == 0) return 0;

      char[] charA = s.toCharArray();
      String result = String.valueOf(charA[0]);
      
      List<Character> listC = new ArrayList<>();      
      int max = 1;
      for(char c : charA){                  
            if(listC.contains(c)){
                int idx = listC.indexOf(c);                
                 listC = new ArrayList<>(listC.subList(idx+1,listC.size()));                                                               
                                
            }
            listC.add(c);            
                        
            if(listC.size() > max){
                max = listC.size() ;
            }
      }
      return max;
    }
}
