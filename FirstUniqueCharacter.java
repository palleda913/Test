import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacter {
    public static int fUChar(String s) {
        int[] charCount = new int[26];
        
        
        for (char c : s.toCharArray()) {
            charCount[c - 'a']++;
        }
        
        
        for (int i = 0; i < s.length(); i++) {
            if (charCount[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        
        return -1;
    }
    
    public static void main(String[] args) {
        System.out.println(fUChar("leetcode"));    
        System.out.println(fUChar("loveleetcode"));    
        System.out.println(fUChar("aabb"));    
    }
}