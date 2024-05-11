class Solution {
    public int solution(int a, int b) {
        String a1 = String.valueOf(a);
        String b1 = String.valueOf(b);
        int add = Integer.parseInt(a1+b1);
        int multiply = 2*a*b;
        if (add >= multiply) {
            return add; 
        }
        else {
            return multiply;
        }
    }
}