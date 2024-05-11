class Solution {
    public int solution(int a, int b) {
         String a1 = String.valueOf(a);
         String b1 = String.valueOf(b);
      //문자열로 된 a b 를 합쳤을 때 숫자로 바꿔서 큰걸 리턴
         int num1 = Integer.parseInt(a1 + b1);
         int num2 = Integer.parseInt(b1 + a1); 
     //비교해서 큰거 리턴
     // a1 + b1 = b1 + a1 => a + b 리턴
         if (num1 >= num2) {
             return num1;
         }
        else {
            return num2;
        }
       
    }
}