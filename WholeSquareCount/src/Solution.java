public class Solution {
    public int solution(int A, int B){
        if (A>B) return 0;
        int a = (int)Math.ceil(Math.sqrt(A));
        int b = (int)Math.floor(Math.sqrt(B));
        if (a>b) return 0;
        return b-a+1;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println("10 20:" +sol.solution(10, 20));
        System.out.println("20 10:" +sol.solution(20, 10));
        System.out.println("4 17:" +sol.solution(4, 17));
        System.out.println("4 4:" +sol.solution(4, 4));
        System.out.println("17 19:" +sol.solution(17, 19));
    }
}
