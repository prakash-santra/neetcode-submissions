class Solution {
    public int numRescueBoats(int[] people, int limit) {
        // Arrays.sort(people);
        int max=Integer.MIN_VALUE;
        for(int ele : people){
            if(ele > max)max = ele;
        }
        int[]count = new int[max+1];
        for(int ele : people){
            count[ele]++;            
        }
        int tr = 0, i=0;
        while(tr < people.length){
            while(count[i] == 0){
                i++;
            }
            people[tr] = i;
            count[i]--;
            tr++;
        }
        

        int l=0, r=people.length-1, ct=0;
        while(l <= r){
            if(people[r]+people[l] <= limit){
                ct++;
                l++;
                r--;
            }else{
                r--;
                ct++;
            }
        }
        return ct;
    }
} 