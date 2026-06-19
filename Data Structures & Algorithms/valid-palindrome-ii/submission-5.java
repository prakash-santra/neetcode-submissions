class Solution {
    public boolean validPalindrome(String s) {
        if(isPalindrome(s, 0, s.length()-1))return true;

        int l=0, r=s.length()-1, count=1;
        while(l < r){
            if(s.charAt(l) == s.charAt(r)){
                l++;
                r--;
            }else{
            if(isPalindrome(s, l+1, r))return true;
            if(isPalindrome(s, l, r-1))return true;
            // else
            return false;
            }
        }
        return false;
    }
    public boolean isPalindrome(String s, int l, int r){
        while(l <= r){
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}