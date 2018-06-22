public class Solution {
    public int solution(int[] T){
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

}
