class Solution {
    public int solution(int[] players, int m, int k) {
        int answer = 0;
        int T = players.length;
        int[] expire = new int[players.length+k];
        int active = 0;
        int required = 0;
        int add = 0;
        
        for (int t=0; t<T; t++) {
            active -= expire[t];

            required = players[t] / m;

            if (active < required) {
                add = required - active;
                active += add;
                answer += add;
                expire[t + k] += add;
            }
        }
        return answer;
    }
}