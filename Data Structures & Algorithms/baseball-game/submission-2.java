class Solution {
    public int calPoints(String[] op) {
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<op.length; i++){
            if(op[i].equals("C")){
                st.pop();
            }else if(op[i].equals("D")){
                st.push(st.peek() * 2);
            }else if(op[i].equals("+")){
                int val1 = st.pop();
                int val2 = st.pop();
                st.push(val2);
                st.push(val1);
                st.push(val1+val2);
            }
            else {
                st.push(Integer.parseInt(op[i]));
            }
        }
        int sum = 0;
        while(!st.isEmpty()){
            sum += st.pop();
        }
        return sum;
    }
}