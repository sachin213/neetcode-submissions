class Solution {
    public int lengthOfLongestSubstring(String s) {
     if(s == null || s.length() == 0) return 0;

      char[] charA = s.toCharArray();
      String result = String.valueOf(charA[0]);
      
      List<Character> listC = new ArrayList<>();      
      int max = 1;
      for(char c : charA){                  
            if(listC.contains(c)){
                if(listC.get(0) == c){
                      listC.remove(0);
                }else{
                 listC = new ArrayList<>();                                             
                  
                }
                
            }listC.add(c);            
            //}else{                
                //listC.add(c);                
            //}
            
            if(listC.size() > max){
                max = listC.size() ;
            }
      }
      return max;
    }
}
