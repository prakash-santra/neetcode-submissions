class Solution {
    public static List<String>root;
    public List<String> generateParenthesis(int n) {
        root = new ArrayList<>();
        permutation(n, 0, "()");
        return root;

    }
    public static void permutation(int n, int count, String ans){
        if(count == n-1){
            if(!root.contains(ans))
            root.add(ans.toString());

            return;
        }

        for(int i=0; i<count * 2 + 2; i++){
            String add = "()";
            String val = ans.substring(0,i)+ add + ans.substring(i, ans.length());
            permutation(n, count+1, val);
        }
    }
}
