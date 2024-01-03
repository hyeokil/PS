class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int ab = Integer.parseInt(a+""+b);
        int ab2 = a*b*2;
        answer = ab>ab2 ? ab:ab2;
            
        return answer;
    }
}