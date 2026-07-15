class Solution {
    public int maxVowels(String s1, int k) {
       char[] s = s1.toCharArray();
        int count = 0;
          for (int i = 0; i < k; i++) {
            if(s[i] == 'a'||s[i] == 'e'||s[i] == 'i'||s[i] == 'o'||s[i] == 'u')
                count++;
          }
          int maxcount = count;
        for(int i = k ; i < s.length ; i++){
            if(s[i-k] == 'a'||s[i-k] == 'e'||s[i-k] == 'i'||s[i-k] == 'o'||s[i-k] == 'u')
            count--;
              if(s[i] == 'a'||s[i] == 'e'||s[i] == 'i'||s[i] == 'o'||s[i] == 'u')
              count++;
              if(count>maxcount)
              maxcount = count;
        }
        return maxcount;
    }
}