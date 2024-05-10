class Solution {
    public String solution(String my_string, int k) {
        StringBuilder love = new StringBuilder ();
        
        for (int i = 0; i < k; i++) {
            love.append(my_string);
        }
        return love.toString();
    }
}