public class Solution {
    public static int solution(int[] T){
        if (T.length<2) return 0;
        int maxWinterTemp = T[0];
        int maxSummerTemp = Math.max(T[0],T[1]);
        int winterLength = 1;
        int searchPeriod = T.length;
        for (int i = 1; i<searchPeriod; i++){
            if (T[i] <= maxWinterTemp) {
                winterLength = i + 1;
                maxWinterTemp = maxSummerTemp;
            }
            else
                maxSummerTemp = Math.max(maxSummerTemp, T[i]);
        }

        return Math.min(winterLength,T.length-1);
    }

    public static void main(String[] args) {
        System.out.println("[5, -2, 3, 8, 6] " + solution(new int[]{5, -2, 3, 8, 6}));
        System.out.println("[-5, -5, -5, -42, 6, 12] " + solution(new int[]{-5, -5, -5, -42, 6, 12}));
        System.out.println("[-5, -5, -5, -42, 6, 12, -4] " + solution(new int[]{-5, -5, -5, -42, 6, 12, -4}));
        System.out.println("[-5, -5, -5, -42, 6, 12, -5] " + solution(new int[]{-5, -5, -5, -42, 6, 12, -5}));
        System.out.println("[-5, -5, -5, -42, 6, 12, -6] " + solution(new int[]{-5, -5, -5, -42, 6, 12, -6}));
    }
}
