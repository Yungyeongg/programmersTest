class Solution {
    public static String solution(String my_string, String overwrite_string, int s) {
        String before = my_string.substring(0, s);
        String after = my_string.substring(s + overwrite_string.length());
        String answer = before + overwrite_string + after;
        return answer;
    }
    
    
    public static void main(String [] args) {
        
        System.out.println(solution("He11oWor1d", "lloWorl", 2));
        System.out.println(solution("Program29b8UYP", "merS123", 7));
    }
}