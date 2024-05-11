class Solution {
    public int solution(int n) {
        // n홀수 n이하의 홀수 합
        // n짝수 n이하의 짝수 제곱의 합
        if(n % 2 == 0) {
            int evensum = 0;
            for (int j = 1; j <= n; j++) {
                if(j % 2 == 0){
                 evensum += (j*j);
                   
                }
            }
            return evensum;
        }
        else {
            int oddsum = 0;
            for(int i = 1; i <= n; i++)
            {
                if(i % 2 != 0) {
                  oddsum += i;
                }
            }  
            return oddsum;
        }
    }
}