class Solution {
    public boolean isPalindrome(String str) {
        str = str.toLowerCase();
        int l =0, r = str.length()-1;
        
        while(l < r){
            char s = str.charAt(l), e = str.charAt(r);
            if(!isValid(s)){
                l++;
            }
            else if(!isValid(e)){
                r--;
            }
            else if(s!=e){
                return false;
            }
            else{
                l++;
                r--;
            }
        }
        return true;        
    }
    public boolean isValid(char ch){
            if((ch >= '0' && ch <='9')
             || (ch - 'a' >= 0 && ch-'a' < 26)){
                return true;
             }
             return false;
        }
}
