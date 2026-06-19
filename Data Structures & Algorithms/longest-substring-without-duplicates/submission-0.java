class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> window = new HashSet<>();
        int l=0, size = 0, ans=0;
        for(int r=0; r<s.length(); r++){
            if(!window.contains(s.charAt(r))){
                size ++;
                ans = Math.max(ans, size);
            }
                while (window.contains(s.charAt(r))) {
                    window.remove(s.charAt(l));
                    l++;
                }
                size = r - l + 1;
            window.add(s.charAt(r));
        }
        return ans;
    }
}
