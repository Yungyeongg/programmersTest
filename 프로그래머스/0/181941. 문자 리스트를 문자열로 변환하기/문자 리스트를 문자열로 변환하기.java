class Solution {
    public String solution(String[] arr) {
        
        StringBuilder result = new StringBuilder ();
        for (int i = 0; i < arr.length; i++) {
                result.append(arr[i]);   
        }
        return result.toString();
    }
}