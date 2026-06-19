class Solution {
    public boolean isPalindrome(String str) {
        String s = str.toLowerCase();
        String ans ="";
        for(int i=0; i<s.length(); i++){
            if((s.charAt(i)-'a' >=0 && s.charAt(i)-'a' < 26) ||
                 (s.charAt(i) >= '0' && s.charAt(i) <= '9' ) ){
                ans += s.charAt(i);
            }
        }
        for(int i=0; i<ans.length()/2; i++){
            if(ans.charAt(i) != ans.charAt(ans.length()-i-1))return false;
        }
        return true;
    }
}
