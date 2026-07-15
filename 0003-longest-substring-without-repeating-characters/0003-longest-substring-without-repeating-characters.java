class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        Set<Character> cSet = new HashSet<>();
        int left = 0;
        
        for (int right = 0; right < n; right++) {
            if (!cSet.contains(s.charAt(right))) {
                cSet.add(s.charAt(right));
                maxLength = Math.max(maxLength, right - left + 1);
            } else {
                while (cSet.contains(s.charAt(right))) {
                    cSet.remove(s.charAt(left));
                    left++;
                }
                cSet.add(s.charAt(right));
            }
        }
        
        return maxLength;
    }
}