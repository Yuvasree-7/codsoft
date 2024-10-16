import java.util.Scanner;

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
            arr[t.charAt(i) - 'a']--;
        }
        for (int num : arr) {
            if (num != 0) {
                return false;
            }
        }
        return true;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        
        Solution solution = new Solution();
        boolean result = solution.isAnagram(s, t);
        System.out.println(result);
        sc.close(); 
    }
}