class Solution {
    static int[] track;

    public int tribonacci(int n) {
        track = new int[n+1];
        Arrays.fill(track, -1);
        return tribo(n);
    }
    public static int tribo(int n){
        if(n < 3){
            if(n == 2)return 1;
            else
            return n;
        }
        if(track[n] != -1)return track[n];

        track[n] = tribo(n-1) + tribo(n-2) + tribo(n-3);

        return track[n];
    }
}